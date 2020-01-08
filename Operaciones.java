//

import java.util.Scanner;

public class Operaciones{

	int numero1, numero2, sumar, restar,  multiplicar;
	float dividir;

	public void leerNumero(){
		Scanner input = new Scanner(System.in);

		System.out.println("Escribe el primer numero: ");
		this.numero1 = input.nextInt();
		System.out.println("Escribe el segundo numero: ");
		this.numero2 = input.nextInt();
	}

	public void sumar(){
		this.sumar = numero1 + numero2;
	}

	public void restar(){
		this.restar = numero1 - numero2;
	}	

	public void dividir(){
		if (numero2 != 0)
			this.dividir = (float)numero1 / numero2;
		else
			this.dividir = 0;
	}

	public void multiplicar(){
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

		Operaciones op = new Operaciones();

		op.leerNumero();

		op.sumar();
		op.restar();
		op.dividir();
		op.multiplicar();

		op.imprimirResultados();
		
	}
}