//PruebaLibroCalificaciones4.java
// El constructor de LibroCalificaciones4 se utiliza para especificar el
// nombre del curso cada vez que se crea cada objeto LibroCalificaciones4

import java.util.Scanner;
public class PruebaLibroCalificaciones4
{

	// el metodo main empieza la ejecución del programa
	public static void main( String args[] )
	{
		Scanner input = new Scanner(System.in);		

		// crea objeto LibroCalificaciones4
		LibroCalificaciones4 libroCalificaciones4A = new LibroCalificaciones4( "Programación Orientada a Objetos");
		LibroCalificaciones4 libroCalificaciones4B = new LibroCalificaciones4( "Lenguaje de Programación Orientada a Objetos" );

		// muestra el valor inicial de nombreDelCurso para cada LibroCalificaciones
		System.out.printf( "El nombre del curso de libroCalificaciones4A es: %s\n",
		libroCalificaciones4A.obtenerNombreDelCurso() );
		System.out.printf( "El nombre del curso de libroCalificaciones4B es: %s\n",
		libroCalificaciones4B.obtenerNombreDelCurso() );

		System.out.printf("Ingresa un nuevo nombre para el curso 4A: ");
		String nuevoNombre = input.nextLine();
		libroCalificaciones4A.establecerNombreDelCurso(nuevoNombre);

		System.out.printf("El nuevo nombre del curso 4A es : %s",libroCalificaciones4A.obtenerNombreDelCurso());



	} // fin de main
} // fin de la clase PruebaLibroCalificaciones4