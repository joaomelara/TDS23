/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.conexao;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author 3113.343
 */
public class ConnectionFactory {
    public Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;banco=db_Bibliotecas;usuario=sa;senha=TecInfo");
            
            
        }catch(SQLException e){
           System.out.println(e.getMessage());
        }
        return con;
        
    }
    
}