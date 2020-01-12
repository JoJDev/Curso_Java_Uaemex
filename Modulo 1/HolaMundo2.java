public class HolaMundo2{

	public static void main(String[] args) {
		System.out.println("hola mundo!");

		OtraClase miOtraClase = new OtraClase();

		miOtraClase.mensaje();
	}
}

class OtraClase{
	private byte num;

	public void mensaje(){
		System.out.println("mi num es: " + num);
	}
}