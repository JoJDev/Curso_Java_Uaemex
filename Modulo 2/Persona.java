public class Persona{
	protected String nombre;
	protected int edad;
	protected String direccion;

	public void datos(String nombre, int edad, String direccion){
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	public void descripcion(){
		System.out.printf("Este es el metodo de la superclase Persona\n");
		System.out.printf("Hola %s, tienes %d de edad y vives en %s", this.nombre, this.edad, this.direccion);
	}
}