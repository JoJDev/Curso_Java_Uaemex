
import java.util.Scanner;

public class PruebaAlumno{
	public static void main(String[] args) {
		Alumno a = new Alumno();
		String datoN, datoD ;//, datoL;
		int datoE;

		System.out.println("Ingrese los datos del Alumno: ");
		Scanner input = new Scanner(System.in);
		System.out.println("Nombre: ");
		datoN = input.nextLine();

		Scanner inputInt = new Scanner(System.in);
		System.out.println("Edad: ");
		datoE = inputInt.nextInt();

		System.out.println("Direccion: ");
		datoD = input.nextLine();

		a.datos(datoN,datoE,datoD);
		a.estudios();
		a.descripcion();
	}
}