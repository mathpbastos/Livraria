/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Cliente;
import model.Endereco;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Giuliano
 */
public class ClienteDAO {
    
    private Connection conn;
    
    public ClienteDAO() throws Exception {
        try {
            this.conn = Conexao.getConexao();
        } catch (Exception e) {
            throw new Exception("Erro: \n" + e.getMessage());
        }
    }

    public ClienteDAO(Connection conn) {
        this.conn = conn;
    }
    
    
    
    public void salvar(Cliente cliente) throws Exception {
        PreparedStatement ps = null;

        if (cliente == null) {
            throw new Exception("O valor passado não pode ser nulo");
        }
        try {
            String SQL = "INSERT INTO clientes (Nome, Cpf, Telefone, Estado_civil, Email) values (?, ?, ?, ?, ?);";

            ps = conn.prepareStatement(SQL);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getTelefone());
            ps.setString(4, cliente.getEstCivil());
            ps.setString(5, cliente.getEmail());
            ps.executeUpdate();
            
            cliente.setId(getCodigoCliente());//setando o codigo do cliente da tabela para o cliente passado
            
            EnderecoDAO endDao = new EnderecoDAO(conn);
            endDao.salvar(cliente);
                       
        } catch (SQLException sqle) {
            throw new Exception("Erro ao inserir dados " + sqle);
        } finally {
            Conexao.fecharConexao(conn, ps);
        }
    }

    public void atualizar(Cliente cliente) throws Exception {
        PreparedStatement ps = null;
        
        if (cliente == null) {
            throw new Exception("O valor passado não pode ser nulo");
        }
        try {
            String SQL = "UPDATE clientes SET Nome=?, "
                    + " Cpf=?, Telefone=?, Estado_civil=?, Email=? "
                    + "where Cliente_id = ?";
            
            ps = conn.prepareStatement(SQL);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getTelefone());
            ps.setString(4, cliente.getEstCivil());
            ps.setString(5, cliente.getEmail());
            ps.setInt(6, cliente.getId());
            
            EnderecoDAO endDao = new EnderecoDAO(conn);
            endDao.atualizar(cliente);
            
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados: " + sqle);
        } finally {
            Conexao.fecharConexao(conn, ps);
        }
    }

    public List todosClientes() throws Exception {
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        try {
            
            ps = conn.prepareStatement("select * from clientes");
            rs = ps.executeQuery();
            
            List<Cliente> list = new ArrayList<Cliente>();
            
            while (rs.next()) {
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                String cpf = rs.getString(3);
                String telefone = rs.getString(4);                
                String estcivil = rs.getString(5);
                String email = rs.getString(6);
                
                EnderecoDAO endDao = new EnderecoDAO(conn);
                Endereco end = endDao.procurarEndereco(id);

                list.add(new Cliente(id, nome, cpf, estcivil, telefone, email, end));
            }
            return list;
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            Conexao.fecharConexao(conn, ps, rs);
        }
    }
    
    public Cliente procurarCliente(String cpf) throws Exception {
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        try {            
            ps = conn.prepareStatement("select * from clientes where Cpf = ?");
            ps.setString(1, cpf);
            rs = ps.executeQuery();
            if (!rs.next()) {
                throw new Exception("Não foi encontrado nenhum registro com o CPF: " + cpf );
            }
            
            int cliente_id = rs.getInt(1);
            String nome = rs.getString(2);
            String telefone = rs.getString(4);                                    
            String estcivil = rs.getString(5);
            String email = rs.getString(6);
            
            EnderecoDAO endDao = new EnderecoDAO(conn);
            Endereco end = endDao.procurarEndereco(cliente_id);

            return new Cliente(cliente_id, nome, cpf, estcivil, telefone, email, end);
            
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            Conexao.fecharConexao(conn, ps, rs);
        }
    }
    
    public Cliente procurarCliente(int id_cliente) throws Exception {
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        try {            
            ps = conn.prepareStatement("select * from clientes where cpf = ?");
            ps.setInt(1, id_cliente);
            rs = ps.executeQuery();
            if (!rs.next()) {
                throw new Exception("Não foi encontrado nenhum registro com o ID: " + id_cliente );
            }
                        
            String nome = rs.getString(2);            
            String cpf = rs.getString(3);
            String telefone = rs.getString(4);                                    
            String estcivil = rs.getString(5);
            String email = rs.getString(6);
            
            EnderecoDAO endDao = new EnderecoDAO(conn);
            Endereco end = endDao.procurarEndereco(id_cliente);

            return new Cliente(id_cliente, nome, cpf, telefone, estcivil, email, end);
            
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
            EnderecoDAO endDao = new EnderecoDAO(conn);
            endDao.excluir(cliente);
            
            ps = conn.prepareStatement("delete from clientes where Cpf = ?");
            ps.setString(1, cliente.getCpf());
            ps.executeUpdate();
            
            

        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados:" + sqle);
        } finally {
            Conexao.fecharConexao(conn, ps);
        }
    }
    
    private int getCodigoCliente() throws Exception
    {
        int codigo = 0;
        Statement st = null;
        ResultSet rs = null;
        try {        
            
            st = conn.createStatement();
            rs = st.executeQuery("select Max(cliente_id) from clientes");                        
            if (!rs.next()) {
                throw new Exception("Não foi encontrado nenhum registro que tenha codigo");
            }
            else
                codigo = rs.getInt(1);
       } catch (SQLException sqle) {
            throw new Exception("Erro ao procurar codigo:" + sqle);
       } finally {
            st.close();
       }
       
       return codigo;
    }
    
    
}
