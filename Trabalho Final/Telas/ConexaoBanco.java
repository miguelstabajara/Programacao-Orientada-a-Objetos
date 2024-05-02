package Telas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
	
	public Connection conexao() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/postgres"; 
		String senha = "mirama77";
		String user = "postgres";
		Connection conexao = DriverManager.getConnection(url,user,senha);
		return conexao;
	}	
}
