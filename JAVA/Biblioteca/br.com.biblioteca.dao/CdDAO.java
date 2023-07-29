import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CdDAO {
	private Connection con;
	public CdDAO() {
		ConnectionFactory cf = new ConnectionFactory();
		con = cf.getConnection();
	}
	public void inserirCd(CD cd) {
		String scriptSql = "INSERT INTO CD(titulo,artista,numeroFaixas,gravadora)"
				+ "VALUES(?,?,?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(scriptSql);
			stmt.setString(1, cd.getTitulo());
			stmt.setString(2, cd.getArtista());
			stmt.setInt(3, cd.getNumeroFaixa());
			stmt.setString(4, cd.getGravadora());
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}

