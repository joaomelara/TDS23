package conexaoBD;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectionFactory {

	public static void main(String[] args) {
		
		 Connection conn = null;
		 
	        try {
	 
	            String dbURL = "jdbc:sqlserver://localhost\\db_Bliotecas";
	            String user = "sa";
	            String pass = "TecInfo";
	            conn = DriverManager.getConnection(dbURL, user, pass);
	            if (conn != null) {
	                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
	                System.out.println("Driver name: " + dm.getDriverName());
	                System.out.println("Driver version: " + dm.getDriverVersion());
	                System.out.println("Product name: " + dm.getDatabaseProductName());
	                System.out.println("Product version: " + dm.getDatabaseProductVersion());
	            }
	 
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        } finally {
	            try {
	                if (conn != null && !conn.isClosed()) {
	                    conn.close();
	                }
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }
		
		// TODO Auto-generated method stub

	}


