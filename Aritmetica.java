//Aritmetica.java
//Programa que muestras algunas de las operaiones aritmeticas

import java.util.Scanner;

public class Aritmetica{
	public static void main(String[] args) {
		int i, j, suma, resta, mult, div, mod;
		Scanner input = new Scanner(System.in);

		System.out.println("Ingresa el primer numero: ");
		i = input.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		j = input.nextInt();

		suma = i + j;
		resta = i - j;
		mult = i * j;
		div = i / j;
		mod = i % j; 

		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El resultado de la resta es: " + resta);
		System.out.println("El resultado de la multiplicacion es: " + mult);
		System.out.println("El resultado de la divicion es: " + div);
		System.out.println("El residuo de la divicion es: " + mod);

	}
}