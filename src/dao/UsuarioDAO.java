/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Giuliano
 */
public class UsuarioDAO {
    
    private Connection conn;
    
    public UsuarioDAO() throws Exception {
        try {
            this.conn = Conexao.getConexao();
        } catch (Exception e) {
            throw new Exception("Erro: \n" + e.getMessage());
        }
    }
    
    public boolean procurarUsuario(Usuario usuario) throws Exception {
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        try {            
            ps = conn.prepareStatement("select * from usuarios where id = ? and senha = ?");
            ps.setString(1, usuario.getId());
            ps.setString(2, usuario.getSenha());
            rs = ps.executeQuery();
            if (!rs.next()) {                                
                return false;                
            }
            else
            {
                return true;            
            }
        } catch (SQLException sqle) {
            throw new Exception(sqle);
            
        } finally {
            Conexao.fecharConexao(conn, ps, rs);
        }
    }
    
    public void salvar(Usuario usuario) throws Exception {
        PreparedStatement ps = null;

        if (usuario == null) {
            throw new Exception("Usuario passado está nulo");
        }
        try {
            String SQL = "INSERT INTO usuarios (id, nome, tipo, senha) values (?, ?, ?, ?);";
                               
            ps = conn.prepareStatement(SQL);
            ps.setString(1, usuario.getId());
            ps.setString(2, usuario.getNome());
            ps.setString(3, usuario.getTipo());
            ps.setString(4, usuario.getSenha());            
            ps.executeUpdate();
                                  
        } catch (SQLException sqle) {
            throw new Exception("Erro ao inserir dados " + sqle);
        } finally {
            Conexao.fecharConexao(conn, ps);
        }
    }

    public void atualizar(Usuario usuario) throws Exception {
        PreparedStatement ps = null;
        
        if (usuario == null) {
            throw new Exception("Usuario passado está nulo");
        }
        try {
            String SQL = "UPDATE usuarios SET nome=?, tipo=?, senha=? "
                    + "where id = ?";
            
            ps = conn.prepareStatement(SQL);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getTipo());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getId());
            ps.executeUpdate();
            
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados: " + sqle);
        } finally {
            Conexao.fecharConexao(conn, ps);
        }
    }
        
        
    public void excluir(Usuario usuario) throws Exception {
        PreparedStatement ps = null;
        
        if (usuario == null) {
            throw new Exception("O Usuario passado está nulo");
        }
        try {            
            ps = conn.prepareStatement("delete from usuarios where id = ?");
            ps.setString(1, usuario.getId());
            ps.executeUpdate();
                        
        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados:" + sqle);
        } finally {
            Conexao.fecharConexao(conn, ps);
        }
    }
    
}
