//LibroCalificaciones3.java
// Clase LibroCalificaciones3 que contiene una variable de instancia nombreDelCurso
// y métodos para establecer y obtener su valor
public class LibroCalificaciones3
{
private String nombreDelCurso;
//método para establecer el nombre del curso
public void establecerNombreDelCurso( String nombre )
{
nombreDelCurso = nombre; // almacena el nombre del curso
} // fin del método establecer nombre del curso
//método para obtener el nombre del curso
public String obtenerNombreDelCurso()
{
return nombreDelCurso;
} //fin del método obtenerNombreDelCurso
//muestra un mensaje de bienvenida al usuario de LibroCalificaciones3
public void mostrarMensaje()
{
//esta instruccion llama a obtenerNombreDelCurso para obtener el
//nombre del curso que representa este LibroCalificaciones3
System.out.printf( "Bienvenido al libro de calificaciones para\n%s!\n", obtenerNombreDelCurso());
} //fin del método mostrarMensaje
} //fin de la clase LibroCalificaciones3