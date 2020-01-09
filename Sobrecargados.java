public class Sobrecargados{
	public void sumar(){
		System.out.println("Este metodo no recibe parametros");
	}

	public void sumar(int x, int y){
		System.out.println("Este metodo recibe dos enteros");
	}

	public void sumar(int x){
		System.out.println("Este metodo recibe solo un entero");
	}

/*	public void sumar(float y, float x){
		System.out.println("Este es otro metodo recibe solo un entero");
	}
*/
	public void sumar (double x){
		System.out.println("Este metodo recibe un decimal");
	}

	public static void main(String[] args) {
		Sobrecargados sobreC = new Sobrecargados();

		sobreC.sumar(1.0);
	}
}