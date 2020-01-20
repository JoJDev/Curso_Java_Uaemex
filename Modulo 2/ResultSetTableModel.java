// ResultSetTablemodel.java
//Objeto TableModel que proporciona los datos de un objeto ResultSet a un objeto JTable

import java.sql.*;
import java.util.*;
import javax.swing.table.*;

// Las filas y las columnas del objeto ResulSet se cuentan desde 1 y las filas
//y las columnas del objeto JTable se cuentan desde 0. Al procesar filas
//o columnas del objeto ResultSet para usarlas en un objeto JTable, es 
//necesario sumar 1 al número de la fila o columnas para manipular la 
//columna apropiada del objeto ResulSet (es decir, la columna 0 del objeto JTable
//es la columna 1 del objeto ResulSet y la fila 0 del objeto JTable es la fila 1 del objeto ResultSet).
public class ResultSetTableModel extends AbstractTableModel {
	private Connection conexion;
	private Statement instruccion;
	private ResultSet conjuntoResultados;
	private ResultSetMetaData metaDatos;
	private int numeroDeFilas;
	
	//mantener el registro del estado de la conexión a la base de datos
	private boolean conectadoALaBaseDeDatos = false;
	
	//inicializar conjuntoResultados y obtener su objeto de meta datos;
	//determinar el número de filas
	public ResultSetTableModel( String controlador, String url, String usr, String pswd, String consulta) throws SQLException, ClassNotFoundException
	{
		// cargar clase de controlador de base de datos
		Class.forName( controlador );
		
		// conectarse a la base de datos
		conexion = DriverManager.getConnection( url, usr, pswd );
		
		// crear objeto Statement para consultar la base de datos
		instruccion = conexion.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,
												ResultSet.CONCUR_READ_ONLY );
		
		// actualizar estado de conexión a la base de datos
		conectadoALaBaseDeDatos = true;
		
		// establecer consulta y ejecutarla
		establecerConsulta( consulta );
	} // termina el constructor
	

	// obtener la clase que representa al tipo de columna
	public Class getColumnClass( int columna ) throws IllegalStateException
	{
		// asegurar que la conexion a la BD este disponible
		if( !conectadoALaBaseDeDatos )
		throw new IllegalStateException ( "No hay conexión a la Base de Datos" );
		
		//determinar la clase de Java de columna
		try {
			String nombreClase = metaDatos.getColumnClassName( columna + 1 );
			
			// devolver objeto Class que representa a nombreClase
			return Class.forName( nombreClase ); 
		}
		
		// atrapar excepciones SQLException y ClassNotFoundException
		catch( Exception excepcion ) {
			excepcion.printStackTrace();
		}
		
		// si ocurren problemas arriba, suponer que es tipo Object
		return Object.class;
		
	}
	
	// obtener el número de columnas en el objeto ResulSet
	public int getColumnCount() throws IllegalStateException
	{
		// asegurar que la conecxión a la bd este disponible
		if( !conectadoALaBaseDeDatos )
			throw new IllegalStateException( "No hay conexion a la Base de Datos" );
			
		// determinar el número de columnas
		try {
			return metaDatos.getColumnCount();
		}
		// atrapar excepciones SQLException e imprimir mensaje de error
		catch (SQLException excepcionSQL ) {
			excepcionSQL.printStackTrace();
		}
		
		// si ocurren problemas arriba, devolver 0 para el numero de columnas
		return 0;
	}
	
	//obtener el nombre de una columna específica en el objeto ResulSet
	public String getColumnName( int columna ) throws IllegalStateException 
	{
		// asegurar que la conexión a la base de datos esté disponible
		if( !conectadoALaBaseDeDatos )
			throw new IllegalStateException( "No hay conexion a la Base de Datos" );
			
		// determinar el nombre de la columna
		try {
			return metaDatos.getColumnName( columna + 1 );
		}
		
		// atrapar excepciones SQLException e imprimir mensaje de error
		catch (SQLException excepcionSQL) {
			excepcionSQL.printStackTrace();
		}
		
		// si hay problemas, devolver la cadena vacia para el nombre de la columna
		return "";
		
	}
	
	
	//devolver el número de filas en el objeto ResultSet
	public int getRowCount() throws IllegalStateException
	{
		// asegurar que la base de datos esté disponible
		if ( !conectadoALaBaseDeDatos )
			throw new IllegalStateException( "No hay conexión a la Base de Datos" );
		
		return numeroDeFilas;			
	}
	
	//obtener el valor en una fila y columna específicas
	public Object getValueAt( int fila, int columna ) throws IllegalStateException
	{
		// asegurar que la conexión a la base de datos esté disponible
		if( !conectadoALaBaseDeDatos )
			throw new IllegalStateException( "No hay conexion a la Base de Datos" );
		
		// obtener un valor en una fila y columna específicas del objeto ResultSet
		try {
			conjuntoResultados.absolute(fila + 1);
			
			return conjuntoResultados.getObject( columna + 1 );
		}
		
		//atrapar excepciones SQLException e imprimir mensaje de error
		catch ( SQLException excepcionSQL ) {
			excepcionSQL.printStackTrace();
		}
		
		// si hay problemas, devolver objeto cadena vacía
		return "";
	}
	
	// establecer nueva cadena de consola para la base de datos
	public void establecerConsulta( String consulta ) throws SQLException, IllegalStateException
	{
		// asegurar que la conexion a la base de datos este disponible
		if( !conectadoALaBaseDeDatos )
			throw new IllegalStateException( "No hay conexion a la base de datos" );
			
		// especificar consulta y ejecutarla
		conjuntoResultados = instruccion.executeQuery( consulta );
		
		//obtener meta datos para el objeto ResultSet
		metaDatos = conjuntoResultados.getMetaData();
		
		//determinar el número de filas en el objeto ResulSet
		conjuntoResultados.last(); 				// mover a la última fila
		numeroDeFilas = conjuntoResultados.getRow();	//obtener número de fila
		
		// notificar al objeto JTable que el modelo ha cambiado
		fireTableStructureChanged();
		
	}
	
	// cerrar objetos Statement y Connection
	public void desconectarDeLaBaseDeDatos()
	{
		// cerrar objetos Statement y Connection
		try {
			instruccion.close();
			conexion.close();
		}
		
		//atrapar excepciones SQLException e imprimir mensaje de error
		catch ( SQLException excepcionSQL ){
			excepcionSQL.printStackTrace();
		}
		
		// actualizar estado de conexión a la Base de datos
		finally {
			conectadoALaBaseDeDatos = false;
		}
	}
}