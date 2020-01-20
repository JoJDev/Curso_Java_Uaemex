public class ExcepcionCapturada{
	public static void main(String[] args) {
		int a,b;
		

		try{
		a = 0;
		b = 10 / a ;

		System.out.printf("¡Esto ya no se imprimirá!");	
		}
		catch (ArithmeticException ariExc){
			System.out.println("Error: Intento de dividir por 0 " + ariExc);
		}

		System.out.println("Continua el programa");
		// System.out.println(" b es: " + b);
	}
}