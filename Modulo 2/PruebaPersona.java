
import java.util.Scanner;

public class PruebaPersona{
	public static void main(String[] args) {
		Persona a = new Persona();
		String datoN, datoD;
		int datoE;

		System.out.println("Ingrese los datos de la persona: ");
		Scanner input = new Scanner(System.in);
		System.out.println("Nombre: ");
		datoN = input.nextLine();

		Scanner inputInt = new Scanner(System.in);
		System.out.println("Edad: ");
		datoE = inputInt.nextInt();

		System.out.println("Direccion: ");
		datoD = input.nextLine();

		a.datos(datoN,datoE,datoD);
		a.descripcion();
	}
}