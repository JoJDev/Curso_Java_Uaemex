// Teclado.java
// programa que permite leer datos desde el teclado

import java.util.Scanner;

public class Teclado{
	public static void main(String[] args) {
		Scanner entrada;
		entrada = new Scanner(System.in);

		System.out.println("Escribe tu edad: ");
		byte edad = entrada.nextByte(); 

		System.out.println("la edad que nos proporcionaste es: " + edad);
		System.out.println("Gracias por su participacion");

	}
}
 

 /*class persona{
	byte edad;
 	String nombre;
 	float altura;
 	float peso;

 	public 
 }*/