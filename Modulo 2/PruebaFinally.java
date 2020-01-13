public class PruebaFinally{
	static void metodo1(){
		try{
			System.out.println("En el metodo1");
			throw new RuntimeException("hola");
		}
		finally{
			System.out.println("Finally del metodo1");
		}
	}

	static void metodo2(){
		try{
			System.out.println("En el metodo2");
			return;
		}
		finally{
			System.out.println("Finally del metodo2");
		}
	}

	static void metodo3(){
		try{
			System.out.println("En el metodo3");
		}
		finally{
			System.out.println("finally del metodo3");
		}
	}

	public static void main(String[] args) {
		try{
			metodo1();
		}
		catch(Exception e){
			System.out.println("Excepcion capturada: " + e);
		}

		metodo2();
		metodo3();
	}

}