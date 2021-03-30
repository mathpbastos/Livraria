/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Cliente;
import model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Giuliano
 */
public class EnderecoDAO {
    
   private Connection conn = null;
   
    public EnderecoDAO(Connection conect) throws Exception {
        try {
            this.conn = conect;
        } catch (Exception e) {
            throw new Exception("Erro: \n" + e.getMessage());
        }
    }
    
    public boolean salvar(Cliente cliente) throws Exception {
        PreparedStatement ps = null;

        if (cliente == null) {
            throw new Exception("O valor passado não pode ser nulo");
        }
        try {
            String SQL = "INSERT INTO endereco (Endereco_id, Logradouro, Complemento, Cidade, Estado, Cep) values( ?,  ?,  ?,  ?, ?, ?)";
                                 
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, cliente.getId());
            ps.setString(2, cliente.getEndereco().getLogradouro());
            ps.setString(3, cliente.getEndereco().getComplemento());
            ps.setString(4, cliente.getEndereco().getCidade());
            ps.setString(5, cliente.getEndereco().getEstado());
            ps.setString(6, cliente.getEndereco().getCep());
            ps.executeUpdate();  
            return true;
        } catch (SQLException sqle) {
            throw new Exception("Erro ao inserir dados " + sqle);
        } finally {
            ps.close();
        }
    }
    
    public void atualizar(Cliente cliente) throws Exception {
        PreparedStatement ps = null;
        
        if (cliente == null) {
            throw new Exception("O valor passado não pode ser nulo");
        }
        try {
            String SQL = "UPDATE endereco SET Logradouro=?, "
                    + " Complemento=?, Cidade=?, Estado=?, Cep=? "
                    + "where Endereco_id = ?";
            
            ps = conn.prepareStatement(SQL);
            
            ps.setString(1, cliente.getEndereco().getLogradouro());
            ps.setString(2, cliente.getEndereco().getComplemento());
            ps.setString(3, cliente.getEndereco().getCidade());
            ps.setString(4, cliente.getEndereco().getEstado());
            ps.setString(5, cliente.getEndereco().getCep());
            ps.setInt(6, cliente.getId());
            
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados: " + sqle);
        } finally {
            ps.close();
        }
    }
    
        public Endereco procurarEndereco(int id) throws Exception {
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        try {            
            ps = conn.prepareStatement("select * from endereco where Endereco_id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (!rs.next()) {
                throw new Exception("Não foi encontrado nenhum registro com o ID: " + id );
            }
            
            String logradouro = rs.getString(2);
            String complemento = rs.getString(3);
            String cidade = rs.getString(4);
            String estado = rs.getString(5);
            String cep = rs.getString(6);
            
            return new Endereco(logradouro, complemento, cidade, estado, cep);
            
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            rs.close();
            ps.close();            
        }
    }
    
    public void excluir(Cliente cliente) throws Exception {
        PreparedStatement ps = null;
        
        if (cliente == null) {
            throw new Exception("O valor passado não pode ser nulo");
        }
        try {            
            ps = conn.prepareStatement("delete from endereco where Endereco_id = ?");
            ps.setInt(1, cliente.getId());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados:" + sqle);
        } finally {
            ps.close();
        }
    }
}
