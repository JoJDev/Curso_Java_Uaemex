//PruebaLibroCalificaciones4.java
// El constructor de LibroCalificaciones4 se utiliza para especificar el
// nombre del curso cada vez que se crea cada objeto LibroCalificaciones4
public class PruebaLibroCalificaciones4
{

// el metodo main empieza la ejecución del programa
public static void main( String args[] )
{
// crea objeto LibroCalificaciones4
LibroCalificaciones4 libroCalificaciones4A = new LibroCalificaciones4( "Programación Orientada a Objetos");
LibroCalificaciones4 libroCalificaciones4B = new LibroCalificaciones4( "Lenguaje de Programación Orientada a Objetos" );
// muestra el valor inicial de nombreDelCurso para cada LibroCalificaciones
System.out.printf( "El nombre del curso de libroCalificaciones4A es: %s\n",
libroCalificaciones4A.obtenerNombreDelCurso() );
System.out.printf( "El nombre del curso de libroCalificaciones4B es: %s\n",
libroCalificaciones4B.obtenerNombreDelCurso() );
} // fin de main
} // fin de la clase PruebaLibroCalificaciones4