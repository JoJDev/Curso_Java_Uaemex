public class Alumno extends Persona{
	private String nombre;
	private String licenciatura;
	private String direccion;

	public void estudios(){
		this.licenciatura = "Programacion";
		System.out.println("Este metodo estudios es de la subclase Alumno");
		System.out.println("Estas estudiando la carrera de " + licenciatura);
	}

	@Override
	public void descripcion(){
		nombre = "Otra Persona";
		direccion = "direccion de otra Persona";
		System.out.printf("Este es el metodo de la subclase Alumno\n");
		System.out.printf("Hola %s, tienes %d de edad y vives en %s\n", super.nombre, this.edad, super.direccion);
		System.out.println("Este nombre lo obtenemos de la variable nombre de la clase Alumno " + nombre);
		System.out.println("Esta es la direccion que se obtiene de la variable direccion de la subclase Alumno " + direccion);
	}
}