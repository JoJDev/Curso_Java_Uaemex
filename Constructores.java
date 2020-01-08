//

public class Constructores{
	

	public static void main(String[] args) {
		Constructores c1 = new Constructores();
		Constructores c2 = new Constructores(3,4);
		Constructores c3 = new Constructores("Jesus", 20);
		Constructores c4 = new Constructores("Jose", 40);
	}

	public Constructores(){
		System.out.println("Hola, soy el constructor 1");
		System.out.println("Hola mundo");
	}	

	public Constructores(int a, int b){
		int suma = a + b;
		System.out.println("Hola, soy el constructor 2");
		System.out.println("El valor de tu suma es: " + suma);
	}

	public Constructores(String nombre, int edad){
		System.out.println("Hola, soy el constructor 3");
		System.out.println("tu nombre es: " + nombre + "\ntu edad es: " + edad);
	} 
}