//MostrarResultadosConsulta.java

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class MostrarResultadosConsulta extends JFrame {
	
	//controlador JDBC y URL de la base de datos
	
	static final String CONTROLADOR_JDBC = "com.mysql.jdbc.Driver";
	static final String URL_BASEDEDATOS = "jdbc:mysql://localhost/Biblio";
	static final String USR = "root";
	static final String PSWD = "9049514ChC";
	
	// la consulta predeterminada recupera todos los datos de la tabla autores
	static final String CONSULTA_PREDETERMINADA = "SELECT * FROM autores";
	
	private ResultSetTableModel modeloTabla;
	private JTextArea areaConsulta;
	
	// crear objeto ResulSetTableModel y la GUI
	public MostrarResultadosConsulta()
	{
		super( "Mostrando Resultados de la Consulta" );
	
		// crear objeto ResulSetTableModel y mostrar tabla de la base de datos
		
		try {
			
		// crear objeto TableModel para los resultados de la consulta SELECT * FROM Authors
		modeloTabla = new ResultSetTableModel( CONTROLADOR_JDBC, URL_BASEDEDATOS, USR, PSWD, CONSULTA_PREDETERMINADA );
		
		// establecer objeto JTextArea en el que el usuario escribe las consultas
		areaConsulta = new JTextArea( CONSULTA_PREDETERMINADA, 3, 100 );
		areaConsulta.setWrapStyleWord( true );
		areaConsulta.setLineWrap( true );
		
		JScrollPane panelDesplazable = new JScrollPane( areaConsulta, 
			ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER );
		
		// establecer objeto JButton para enviar las consultas
		JButton botonEnviar = new JButton( "Enviar consulta" );
		
		// crear objeto Box para manejar la colocación de areaConsulta y botonEnviar en la GUI
		Box cuadro = Box.createHorizontalBox();
		cuadro.add( panelDesplazable );
		cuadro.add( botonEnviar );
		
		// crear delegado de JTable para modeloTabla
		JTable tablaResultados = new JTable ( modeloTabla );
		
		// colocar componentes de la GUI en el panel de contenido
		Container c = getContentPane();
		c.add( cuadro, BorderLayout.NORTH );
		c.add( new JScrollPane( tablaResultados ), BorderLayout.CENTER );
		
		// crear componente de escucha de eventos para botonEnviar
		botonEnviar.addActionListener(new ActionListener(){
			
			// pasar consulta al modelo de la tabla
			public void actionPerformed( ActionEvent evento )
			{
				// realizar una nueva consulta
				try {
					modeloTabla.establecerConsulta( areaConsulta.getText() );
				}
					
				// atrapar posibles excepciones SQLException al realizar una nueva consulta 	
				catch ( SQLException excepcionSQL ){
					JOptionPane.showMessageDialog( null, excepcionSQL.getMessage(), "Error en la base de datos", JOptionPane.ERROR_MESSAGE );
					
					// tratar de recuperarse de una consulta invalida del usuario
					// ejecutando la consulta predeterminada
					try {
						modeloTabla.establecerConsulta( CONSULTA_PREDETERMINADA );
						areaConsulta.setText( CONSULTA_PREDETERMINADA );
					}
					
					// atrapar posible excepción SQLException al realizar consulta predeterminada
					
					catch (SQLException excepcionSQL2 ){
						JOptionPane.showMessageDialog( null, excepcionSQL2.getMessage(), "Error en la base de datos", JOptionPane.ERROR_MESSAGE );
						
						// asegurar que la conexión a la BD este cerrada
						modeloTabla.desconectarDeLaBaseDeDatos();
						
					System.exit( 1 ); // terminar la aplicación
					
					} // fin del bloque catch interno
					
				} // fin del bloque catch externo
				
			} // fin de actionPerformed	
			
		} //fin de la clase interna ActionListener
			
	); // fin de la llamada a addActionListener 
						
	// establecer tamaño de ventana  y mostrarla en pantalla
	setSize( 500, 250 );
	setVisible( true );

} // fin del bloque try

// atrapar la excepcion ClassNotFoundException lanzada por el objeto 
// ResultSetTableModel si no se encuentra el controlador de la BD
					
	catch ( ClassNotFoundException claseNoEncontrada ) {
		JOptionPane.showMessageDialog( null, "No se encontro el Puente JDBC-ODBC", "No se encontro el controlador", JOptionPane.ERROR_MESSAGE );
		
		System.exit( 1 ); // terminar la aplicación
		
	} // fin del bloque catch
					
	//atrapar la excepción SQLException lanzada por el objeto ResulSetTableModel
	// si ocurren problemas al establecer la conexión a la base de datos y realizar la consulta en la misma
	catch ( SQLException excepcionSQL ) {
		JOptionPane.showMessageDialog( null, excepcionSQL.getMessage(), "Error en la base de datos", JOptionPane.ERROR_MESSAGE );
		
		// asegurar que la conexion a la BD este cerrada
		modeloTabla.desconectarDeLaBaseDeDatos();
		
		System.exit( 1 );  // terminar la aplicación
		
	} 
					
	// desechar la ventana cuando el usuario salga de la aplicación
	// (esta opción sobreescribe a la opción predeterminada de HIDE_ON_CLOSE)
	setDefaultCloseOperation( DISPOSE_ON_CLOSE );
				
	// asegurar que la conexión a la BD esta cerrada cuando el usuario salga de la aplicación
	addWindowListener(
		
		
		new WindowAdapter() {
			
			// desconectarse de la BD y salir cuando se haya cerrado la ventana
			public void windowClosed( WindowEvent evento )
			{
				modeloTabla.desconectarDeLaBaseDeDatos();
				System.exit( 0 );
			}
		}
		
	);
	
} // fin del constructor de MostrarResultadosConsulta

// ejecutar la aplicación
public static void main (String args[] )
{
	new MostrarResultadosConsulta();
	
} 	
					
} // fin de la clase MostrarResultadosConsulta
					
					
					