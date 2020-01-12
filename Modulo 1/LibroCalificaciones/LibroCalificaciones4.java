//LibroCalificaciones4.java
// La Clase LibroCalificaciones4 con un constructor para inicializar el nombre del curso
public class LibroCalificaciones4
{
	private String nombreDelCurso; //nombre del curso para este LibroCalificaciones4
	
	// el constructor inicializa nombreDelCurso con el objeto String que se provee como argumento
	public LibroCalificaciones4( String nombre )
	{
		nombreDelCurso = nombre; // inicializa nombreDelCurso
	} // fin del constructor
	
	// metodo para establecer el nombre del curso
	public void establecerNombreDelCurso( String nombre )
	{
		nombreDelCurso = nombre; // almacena el nombre del curso
	} // fin del metodo establecerNombreDelCurso
	
	// metodo para obtener el nombre del curso
	public String obtenerNombreDelCurso()
	{
		return nombreDelCurso;
	} // fin del metodo obtenerNombreDelCurso
	
	// muestra un mensaje de bienvenida al usuario de LibroCalificaciones4
	public void mostrarMensaje()
	{
		// esta instruccion llama a obtenerNombreDelCurso para obtener
		//el nombre del curso que este LibroCalificaciones4 representa
		System.out.printf("Bienvenido al libro calificaciones para\n%s!\n", obtenerNombreDelCurso() );
	} // fin del método mostrarMensaje
} // Fin de la Clase LibroCalificaciones4