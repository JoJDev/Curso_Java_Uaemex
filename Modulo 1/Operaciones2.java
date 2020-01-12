//

import java.util.Scanner;

public class Operaciones2{
	int sumar, restar, multiplicar;
	float dividir;

	public void sumar(int numero1, int numero2){
		this.sumar = numero1 + numero2;
	}

	public void restar(int numero1, int numero2){
		this.restar = numero1 - numero2;
	}	

	public void dividir(int numero1, int numero2){
		if (numero2 != 0)
			this.dividir = (float)numero1 / numero2;
		else
			this.dividir = 0;
	}

	public void multiplicar(int numero1, int numero2){
		this.multiplicar = numero1 * numero2;
	}	

	public void imprimirResultados(){
		System.out.println("Los resultados son:");
		System.out.println("sumar: " + sumar);
		System.out.println("restar: " + restar);
		System.out.println("dividir: " + dividir);
		System.out.println("multiplicar: " + multiplicar);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Operaciones2 op = new Operaciones2();

		System.out.println("Escribe el primer numero: ");
		int n1 = input.nextInt();
		System.out.println("Escribe el segundo numero: ");
		int n2 = input.nextInt();

		op.sumar(n1, n2);
		op.restar(n1, n2);
		op.dividir(n1, n2);
		op.multiplicar(n1, n2);

		op.imprimirResultados();
		
	}
}