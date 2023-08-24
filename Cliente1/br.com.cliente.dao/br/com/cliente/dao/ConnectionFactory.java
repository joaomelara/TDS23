package br.com.cliente.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConexao() {
	Connection conexao = null;
	
		try {
			Class.forName("org.sqlserver.Driver");
			conexao = DriverManager.getConnection(
					"jdbc:sqlserver://D9995NE071:1433;database=db_Bibliotecas;user=sa;password=TecInfo;encrypt=true;trustServerCertificate=true"
					);
		}catch(Exception e) {
			e.printStackTrace();
				System.err.println("SQLException: "+e.getMessage());
		}
	return conexao;
	}
}
