//

import java.util.Scanner;

public class Operaciones3{

	public int sumar(int numero1, int numero2){
		int sumar = numero1 + numero2;
		return sumar;
	}

	public int restar(int numero1, int numero2){
		int restar = numero1 - numero2;
		return restar;
	}	

	public float dividir(int numero1, int numero2){
		float dividir;

		if (numero2 != 0)
			dividir = (float)numero1 / numero2;
		else
			dividir = 0;

		return dividir;
	}

	public int multiplicar(int numero1, int numero2){
		int multiplicar = numero1 * numero2;
		return multiplicar;
	}	

	public void imprimirResultados(int sumar, int restar, float dividir, int multiplicar){
		System.out.println("Los resultados son:");
		System.out.println("sumar: " + sumar);
		System.out.println("restar: " + restar);
		System.out.println("dividir: " + dividir);
		System.out.println("multiplicar: " + multiplicar);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Operaciones3 op = new Operaciones3();

		/*System.out.println("Escribe el primer numero: ");
		int n1 = input.nextInt();
		System.out.println("Escribe el segundo numero: ");
		int n2 = input.nextInt();*/

		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);

		op.imprimirResultados(
		op.sumar(n1, n2),
		op.restar(n1, n2),
		op.dividir(n1, n2),
		op.multiplicar(n1, n2));
		
	}
}