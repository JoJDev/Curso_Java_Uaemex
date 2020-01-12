


public class OperacionesString{
	public static void main(String[] args) {
		String cadena1 = "Hola";
		String cadena2 = "Mundo";

		int enteroAUnir = 20;
		double decimal = 15.32;

		// Concatenar
		/*String concatenacion = cadena1 + " " + cadena2;
		System.out.println("La concatenacion es: " + concatenacion);

		String concatenacion2 = cadena1 + " " + enteroAUnir;
		System.out.println("La concatenacion 2 es: " + concatenacion2);

		String concatenacion3 = cadena1.concat(cadena2);
		System.out.println("La concatenacion 3 es: " + concatenacion3);
*/
		String cadena3 = new String("JavaSE");
		int contarCadena = cadena3.length();
		System.out.println("La dimension de la cadena3 es: " + cadena3.length());
		System.out.println("La demension es: " + "Java".length());

		//Extraer una pocion de la cadena

		String cadena4 = "mi lenguaje favorito es java";
		String extraer = cadena4.substring(24,28);
		System.out.println("La subcadena es: " + extraer);

		// Comparar cadenas

		boolean comparacion1 = "Hola".equals("Hola");
		System.out.println("El resultado de la comparacion1 es: " + comparacion1 );

	}
}