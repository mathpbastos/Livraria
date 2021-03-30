/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;

/**
 *
 * @author Giuliano
 */
public class Conexao
{
    public static Connection getConexao( ){
    Connection con = null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "123456"); // adapte para a senha de seu MySql
    }
    catch (Exception e)
    {
        System.out.println("falha na conexão");
    }
    return con;
}

public static void fecharConexao(Connection conn, Statement stmt, ResultSet rs){
    try {
        if (rs != null) rs.close( );
        if (stmt != null) stmt.close( );
        if (conn != null) conn.close( );
    } catch (Exception e) { }
 }

public static void fecharConexao(Connection conn){
    try {
        if (conn != null) conn.close( );
    } catch (Exception e) { }
}
public static void fecharConexao(Connection conn,PreparedStatement ps)
{
    try {
        if (ps != null) ps.close( );
        if (conn != null) conn.close( );
    } catch (Exception e) { }
}

}

