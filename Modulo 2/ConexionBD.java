import java.sql.Connection;
import java.sql.*;

public class ConexionBD{
	final String DRIVER = "com.mysql.jdbc.driver";
	final String DB_URL = "jdbc.mysql://localhost/practica";
	final String USR = "root";
	final String PWD = "localhost";

	protected Connection con = null;
	protected PreparedStatement pstm = null;
	protected ResultSet rst = null;
	protected String sql = "";

	public Connection obtenerConexion(){
		try{
			Class.forName(DRIVER);
			con = DriverManager.getConnection(DB_URL, USR, PWD);
		}
		catch(ClassNotFoundException ex){
			con = null;
			System.out.println("Error: No se pudo cargar la clase SQL: " + ex);
		}
		catch(SQLException ex){
			con = null;
			System.out.println("Error: error al conectarse a la base de datos: " + ex);
		}

		return con;
	}

		
}