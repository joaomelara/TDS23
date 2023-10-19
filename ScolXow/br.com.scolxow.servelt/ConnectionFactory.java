
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;


public class ConnectionFactory {


	public static void main(String[] args) {

		Connection con;

		Statement stmt;

		String query = "select * from Bebida";

		

		

		

		try {

			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");

		

		

		} catch (java.lang.ClassNotFoundException e) {

		

		System.err.print("ClassFoundException: ");

		System.err.println(e.getMessage());	

		}


		

	try {

		con = DriverManager.getConnection("jdbc:sqlserver://D9995NE071:1433;database=db_ScolXow;user=sa;password="

							+ "TecInfo;encrypt=true;trustServerCertificate=true");

		stmt= con.createStatement();

		ResultSet rs = stmt.executeQuery(query);	

		

		System.out.println("Lista de linhas da tabela do banco: ");

		

		while(rs.next()) {

			String s = rs.getNString("Nome");

			

			System.out.println(s+" ");

		}

		

		stmt.close();

		con.close();

		

	}catch(SQLException ex) {

		System.out.println("SQLException: "+ex.getMessage());

	}

	

	}


}