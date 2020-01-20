// MostrarAlumnos.java
// mostrar el contenido de la tabla alumnos.

import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;


public class MostrarAlumnos extends JFrame 
{
	
	//nombre del controlador JDBC y URL de la base de datos
	static final String controladorJDBC = "com.mysql.jdbc.Driver";
	static final String urlBD = "jdbc:mysql://localhost/prueba";
	static final String usr="root";
	static final String psswd="localhost";
	
	// declarar objetos Connection y Statement para acceder a
	// la bd y realizar consultas
	private Connection conexion;
	private Statement instruccion;
	
	// el constructor se conecta a la bd, realiza la consulta, 
	// procesa los resultados y los muestra en la ventana
	
	public MostrarAlumnos()
	{
		super( "Tabla Alumno de la base de datos Alumnos");
		
		
		// conectarse a la base de datos Biblio y consultar la base de datos
		try 
		{
			//cargar clase de controlador de base de datos
			Class.forName( controladorJDBC );
			
			// establecer conexión a la bd
			conexion = DriverManager.getConnection( urlBD, usr, psswd );
			
			// crear objeto Statement para consultar la base de datos
			instruccion = conexion.createStatement();
			
			// consultar la base de datos
			ResultSet conjuntoResultados = instruccion.executeQuery(  "SELECT * FROM alumno" );
			
			// procesar los resultados de la consulta
			StringBuffer resultados = new StringBuffer();
			ResultSetMetaData metaDatos = conjuntoResultados.getMetaData();
			int numeroDeColumnas = metaDatos.getColumnCount();
			
			for (int i = 1; i<= numeroDeColumnas; i++)
			
				resultados.append( metaDatos.getColumnName( i ) + "\t");
				
			resultados.append( "\n" );
			
			while ( conjuntoResultados.next() ){
				
				for ( int i = 1; i <= numeroDeColumnas; i++)
					resultados.append( conjuntoResultados.getObject(i) + "\t");
					
				resultados.append( "\n" );
			}
			
			// configurar la GUI y ventana para mostrar el resultado
			JTextArea areaTexto = new JTextArea( resultados.toString()  );
			Container contenedor = getContentPane();
			
			contenedor.add( new JScrollPane( areaTexto ) );
			
		
			
			
			setSize( 700, 130 ); // establecer el tamaño de la ventana
			setVisible( true ); // mostrar la ventana
			
		}  // fin del bloque try
		
		// detectar posibles problemas al interactuar con la base de datos
		
		catch ( SQLException excepcionSql )
		{
			JOptionPane.showMessageDialog( null, excepcionSql.getMessage(), "Error en base de datos", JOptionPane.ERROR_MESSAGE );
			
			System.exit( 1 );
		}
			
		// detectar posibles problemas al cargar el controlador de la base de datos
		
		catch ( ClassNotFoundException claseNoEncontrada ) 
		{
			JOptionPane.showMessageDialog(null, claseNoEncontrada.getMessage(), "No se encontró el controlador", JOptionPane.ERROR_MESSAGE );
			System.exit( 1 );
		}
		
		//asegurar que instruccion y conexion se cierren correctamente
		finally 
		{
			try {
			instruccion.close();
			conexion.close();
			}
			
			// manejar posibles excepciones al cerrar instruccion y conexion 
			catch ( SQLException excepcionSql ) 
			{
				JOptionPane.showMessageDialog( null, excepcionSql.getMessage(), "Error en base de datos", JOptionPane.ERROR_MESSAGE );
				System.exit( 1 );
			}
		}
		
	} // fin del constructor de MostrarAlumnos
	
	
	
		
		// iniciar la aplicación
	public static void main(String args[]) 
	{
		MostrarAlumnos ventana = new MostrarAlumnos();
		ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
	
} //fin de la clase MostrarAlumnos