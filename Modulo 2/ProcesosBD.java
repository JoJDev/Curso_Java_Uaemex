import java.sql.*;

public class ProcesosBD extends ConexionBD{
	protected Alumno alumno;

	public void setAlumno(Alumno alumno){
		this.alumno = alumno;
	}

	public Alumno getAlumno(){
		return this.alumno;
	}

	public void insertarAlumno(){
		sql = "INSERT INTO alumno(cuenta, paterno, materno, nombre, direccion, telefono, licencitura, semestre) "
			+ "values(?, ?, ?, ?, ?, ?, ?, ?)";

		try{
			con = obtenerConexion();
			con.prepareStatement(sql);
			pstm.setInt(1,alumno.getCuenta());
			pstm.setString(2,alumno.getPaterno());
			pstm.setString(3,alumno.getMaterno());
			pstm.setString(4,alumno.getNombre());
			pstm.setString(5,alumno.getDireccion());
			pstm.setInt(6,alumno.getTelefono());
			pstm.setString(7,alumno.getLicenciatura());
			pstm.setInt(8,alumno.getSemestre());

			pstm.executeUpdate();
		}
		catch(SQLException ex){
			System.out.println("Error: error al insertar los datos: " + ex);
		}
		finally{
			try{
				con.close();
			}
			catch(SQLException ex){
				System.out.println("Error: error al cerrar la conexion: " + ex);		
			}
		}
	}
}