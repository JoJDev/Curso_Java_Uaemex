//PruebaLibroCalificaciones2.java
// crea un objeto LibroCalificaciones y pasa un objeto String a su método mostrarMensaje
import java.util.Scanner; //el programa usa la clase Scanner
public class PruebaLibroCalificaciones2
{
// el método main empieza la ejecución del programa
public static void main( String args[] )
{
// crea un objeto Scanner para obtener la entrada de la ventana de comandos
Scanner entrada = new Scanner( System.in );
// crea un objeto LibroCalificaciones2 y lo asigna a MiLibroCalificaciones2
LibroCalificaciones2 miLibroCalificaciones2 = new LibroCalificaciones2();

// pide y recibe el nombre del curso como entrada
System.out.println( "Escriba el nombre del curso:" );
String nombreDelCurso = entrada.nextLine(); // lee una línea de texto
System.out.println(); // imprime una línea en blanco
// llama al método mostrarMensaje de miLibroCalificaciones2
// y pasa nombreDelCurso como argumento
miLibroCalificaciones2.mostrarMensaje( nombreDelCurso );
} // fin de main
} // fin de la clase PruebaLibroCalificaciones2