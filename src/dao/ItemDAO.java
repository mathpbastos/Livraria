/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Item;
import model.Produto;
import model.Venda;

/**
 *
 * @author Giuliano
 */
public class ItemDAO {

    private Connection conn = null;
    
    public ItemDAO(Connection conect) throws Exception {
        try {
            this.conn = conect;
        } catch (Exception e) {
            throw new Exception("Erro: \n" + e.getMessage());
        }
    }

    public void salvar(Venda venda) throws SQLException, Exception {
        PreparedStatement ps = null;

        if (venda == null) {
            throw new Exception("O valor passado não pode ser nulo");
        }
        try {
            ArrayList<Item> itens = venda.getItens();
            int id = 1;
            for (Item iten : itens) {
                String SQL = "INSERT INTO itens (id_item, codigoProduto, quantidade, valorTotal, id_venda) values ( ?,  ?,  ?,  ?, ?)";
                                 
                ps = conn.prepareStatement(SQL);
                ps.setInt(1, id);
                id++;
                ps.setString(2, iten.getProduto().getCodigo());
                ps.setInt(3, iten.getQuantidade());
                ps.setFloat(4, iten.getVlTotal());
                ps.setInt(5, venda.getId());                
                ps.executeUpdate();            
            }
        } catch (SQLException sqle) {
            throw new Exception("Erro ao inserir dados " + sqle);
        } finally {
            ps.close();
        }        
    }

    public ArrayList<Item> todosItens(int id_venda) throws SQLException, Exception {
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        try {
            
            ps = conn.prepareStatement("select * from itens where id_venda = ?");
            ps.setInt(1, id_venda);
            rs = ps.executeQuery();
            if (!rs.next()) {
                throw new Exception("Não foi encontrado nenhum registro com o ID: " + id_venda);
            }
            
            ArrayList<Item> list = new ArrayList<Item>();
            
            while (rs.next()) {
                int id_item = rs.getInt(1);
                String codigoProduto = rs.getString(2);
                int quantidade = rs.getInt(3);
                float valorTotal = rs.getFloat(4);
                
                ProdutoDAO dao = new ProdutoDAO(this.conn);
                Produto produto = dao.procurarProduto(codigoProduto);
                
                list.add(new Item(id_item, produto, valorTotal, quantidade));
            }
            return list;
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            rs.close();
            ps.close();
        }
        
    }
    
}
