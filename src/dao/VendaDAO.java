/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Item;
import model.Venda;

/**
 *
 * @author Giuliano
 */
public class VendaDAO {
        private Connection conn;
    
    public VendaDAO() throws Exception {
        try {
            this.conn = Conexao.getConexao();
        } catch (Exception e) {
            throw new Exception("Erro: \n" + e.getMessage());
        }
    }
    
    public void salvar(Venda venda) throws Exception {
        PreparedStatement ps = null;

        if (venda == null) {
            throw new Exception("O valor passado não pode ser nulo");
        }
        try {
            String SQL = "INSERT INTO vendas (id_cliente, dataVenda, valorTotal) "
                    + "values (?, ?, ?);";

            Date data = new Date(venda.getDataVenda().getTime());
            
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, venda.getCliente().getId());
            ps.setDate(2, data);
            ps.setFloat(3, venda.getVlTotal());
            ps.executeUpdate();
            
            ItemDAO itemDao = new ItemDAO(this.conn);
            itemDao.salvar(venda);
                       
        } catch (SQLException sqle) {
            throw new Exception("Erro ao inserir dados " + sqle);
        } finally {
            Conexao.fecharConexao(conn, ps);
        }
    }
   
    public List todasVendas() throws Exception {
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        try {
            
            ps = conn.prepareStatement("select * from vendas");
            rs = ps.executeQuery();
            
            List<Venda> list = new ArrayList<Venda>();
            
            while (rs.next()) {
                int id_venda = rs.getInt(1);
                int id_cliente = rs.getInt(2);
                
                Cliente cliente = new ClienteDAO(this.conn).procurarCliente(id_cliente);
                ArrayList<Item> itens = new ItemDAO(this.conn).todosItens(id_venda); 
                
                Date dataVenda = rs.getDate(3);                
                float valorTotal = rs.getFloat(4);
                
                list.add(new Venda(id_venda, cliente, itens, valorTotal, dataVenda));
            }
            return list;
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            Conexao.fecharConexao(conn, ps, rs);
        }
    }
    
    public Venda procurarVenda(int id) throws Exception {
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        try {            
            ps = conn.prepareStatement("select * from vendas where id_venda = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (!rs.next()) {
                throw new Exception("Não foi encontrado nenhum registro com o ID: " + id );
            }
                            
                int id_venda = rs.getInt(1);
                int id_cliente = rs.getInt(2);
                
                Cliente cliente = new ClienteDAO(this.conn).procurarCliente(id_cliente);
                ArrayList<Item> itens = new ItemDAO(this.conn).todosItens(id_venda); 
                
                Date dataVenda = rs.getDate(3);                
                float valorTotal = rs.getFloat(4);                                
                        
            return new Venda(id_venda, cliente, itens, valorTotal, dataVenda);
            
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            Conexao.fecharConexao(conn, ps, rs);
        }
    }
    
    public int proximaVenda() throws Exception
    {
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        try {
            
            ps = conn.prepareStatement("select MAX(id_venda) from vendas");
            rs = ps.executeQuery();
            if(!rs.next())
                return 0;
            else
                return (rs.getInt(1) + 1);
            
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            Conexao.fecharConexao(conn, ps, rs);
        }
        
    }
    
    
}
