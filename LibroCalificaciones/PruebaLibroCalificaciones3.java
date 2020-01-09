//PruebaLibroCalificaciones3.java
//Crea y manipula un objeto LibroCalificaciones
import java.util.Scanner; //el programa usa la Clase Scanner
public class PruebaLibroCalificaciones3
{
//el método main empieza la ejecución del programa
public static void main( String args[] )
{
// crea un objeto Scanner para obtener la entrada de la ventana de comandos
Scanner entrada = new Scanner( System.in );
// crea un objeto LibroCalificaciones3 y lo asigna a miLibroCalificaciones3
LibroCalificaciones3 miLibroCalificaciones3 = new LibroCalificaciones3();

miLibroCalificaciones3.obtenerNombreDelCurso();
// pide y lee el nombre del curso
System.out.println( "Escriba el nombre del curso:" );
String elNombre = entrada.nextLine(); // lee una linea de texto
miLibroCalificaciones3.establecerNombreDelCurso( elNombre ); // establece el nombre del curso
System.out.println();// impreme una linea en blanco
// muestra el mensaje de bienvenida despues de especificar el nombre del curso
miLibroCalificaciones3.mostrarMensaje();
} // fin de main
} //fin de la clase PruebaLibroCalificaciones3
