public class ClaseA{
	public void m1(){

	}
}

class ClaseB extends ClaseA{
	public void m2(){

	}

	public static void main(String[] args) {
		
		//upcasting
		ClaseA obj = new ClaseB();

		ClaseA objA = new ClaseA();
		ClaseB objB = new ClaseB();
		objA = objB;

		//downcasting
		ClaseB objReB = (ClaseB)obj; // obj era de la Clase padre ClaseA

	}
}