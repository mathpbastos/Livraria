/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Giuliano
 */
public class ProdutoDAO {
    
    private Connection conn;
    
    public ProdutoDAO() throws Exception {
        try {
            this.conn = Conexao.getConexao();
        } catch (Exception e) {
            throw new Exception("Erro: \n" + e.getMessage());
        }
    }
    
    public ProdutoDAO(Connection con) throws Exception {
        try {
            this.conn = con;
        } catch (Exception e) {
            throw new Exception("Erro: \n" + e.getMessage());
        }
    }
    
    public void salvar(Produto produto) throws Exception {
        PreparedStatement ps = null;

        if (produto == null) {
            throw new Exception("O valor passado não pode ser nulo");
        }
        try {
            String SQL = "INSERT INTO produtos (codigo, nome, fornecedor, dataFabricacao, descricao, valorUnitario, estoque) "
                    + "values (?, ?, ?, ?, ?, ?, ?);";

            Date data = new Date(produto.getDataFabricacao().getTime());
            
            ps = conn.prepareStatement(SQL);
            ps.setString(1, produto.getCodigo());
            ps.setString(2, produto.getNome());
            ps.setString(3, produto.getFornecedor());
            ps.setDate(4, data);
            ps.setString(5, produto.getDescricao());
            ps.setFloat(6, produto.getVlUnitario());
            ps.setInt(7, produto.getEstoque());
            ps.executeUpdate();                        
                       
        } catch (SQLException sqle) {
            throw new Exception("Erro ao inserir dados " + sqle);
        } finally {
            Conexao.fecharConexao(conn, ps);
        }
    }

    public void atualizar(Produto produto) throws Exception {
        PreparedStatement ps = null;
        
        if (produto == null) {
            throw new Exception("O valor passado não pode ser nulo");
        }
        try {
            String SQL = "UPDATE produtos SET nome=?, fornecedor=?, "
                    + " dataFabricacao=?, descricao=?, valorUnitario=?, estoque=? "
                    + "where codigo= ?";
            
            ps = conn.prepareStatement(SQL);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getFornecedor());
            ps.setDate(3, new java.sql.Date(produto.getDataFabricacao().getTime()));
            ps.setString(4, produto.getDescricao());
            ps.setFloat(5, produto.getVlUnitario());
            ps.setInt(6, produto.getEstoque());
            ps.setString(7, produto.getCodigo());
                       
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados: " + sqle);
        } finally {
            Conexao.fecharConexao(conn, ps);
        }
    }

    public List todosProdutos() throws Exception {
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        try {
            
            ps = conn.prepareStatement("select * from produtos");
            rs = ps.executeQuery();
            
            List<Produto> list = new ArrayList<>();
            
            while (rs.next()) {
                String codigo = rs.getString(1);
                String nome = rs.getString(2);
                String fornecedor = rs.getString(3);
                Date dataFabricacao = rs.getDate(4);                
                String descricao = rs.getString(5);
                float vlUnitario = rs.getFloat(6);
                int estoque = rs.getInt(7);
                
                list.add(new Produto(codigo, nome, fornecedor, estoque, vlUnitario, dataFabricacao, descricao));
            }
            return list;
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            Conexao.fecharConexao(conn, ps, rs);
        }
    }
    
    public Produto procurarProduto(String codigo) throws Exception {
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        try {            
            ps = conn.prepareStatement("select * from produtos where codigo = ?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            if (!rs.next()) {
                throw new Exception("Não foi encontrado nenhum registro com o codigo: " + codigo );
            }
                            
                String nome = rs.getString(2);
                String fornecedor = rs.getString(3);
                Date dataFabricacao = rs.getDate(4);                
                String descricao = rs.getString(5);
                float vlUnitario = rs.getFloat(6);
                int estoque = rs.getInt(7);
            
                        
            return new Produto(codigo, nome, fornecedor, estoque, vlUnitario, dataFabricacao, descricao);
            
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            Conexao.fecharConexao(conn, ps, rs);
        }
    }
    
    public void excluir(Produto produto) throws Exception {
        PreparedStatement ps = null;
        
        if (produto == null) {
            throw new Exception("O valor passado não pode ser nulo");
        }
        try {            
            ps = conn.prepareStatement("delete from produtos where codigo = ?");
            ps.setString(1, produto.getCodigo());
            ps.executeUpdate();
                        
        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados:" + sqle);
        } finally {
            Conexao.fecharConexao(conn, ps);
        }
    }
        
    
}
