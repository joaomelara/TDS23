
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectaBanco {
	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		String query = "Select * from Livro";
		
		try {
			Class.forName("jdbc:sqlserver://D9995NE071:1433;database=db_Bibliotecas;user=sa;password=TecInfo;encrypt=true;trustServerCertificate=true");
		}catch(java.lang.ClassNotFoundException e) {
			System.err.println("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}
		try {
			con = DriverManager.getConnection(
					"jdbc:sqlserver://D9995NE071:1433;database=db_Bibliotecas;user=sa;password=TecInfo;encrypt=true;trustServerCertificate=true"
					);
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("Lista de linhas da tabela: ");
			
			while(rs.next()) {
				String s = rs.getString("titulo");
				System.out.println(s+"");
			}
		}catch(SQLException ex){
			System.out.println("SQLException "+ex.getMessage());
		}
		
	}
}

