// Relacionales.java
// Programa que utiliza los operadores relacionales

public class Relacionales{
	public static void main(String[] args) {
		int i = -3;
		byte b = 5;
		short s = 16;
		double d = 3.14;

		boolean b1 = i > i;
		boolean b2 = i < b ;
		boolean b3 = b <= s;
		boolean b4 = s >= d;
		boolean	b5 = d != 0;
		boolean b6 = 1 == s;

		System.out.println(" i = " + i + " b = " + b + " s = " + s + " d = " + d );
		System.out.println(" i > i: " + b1);
		System.out.println(" i < b: " + b2);
		System.out.println(" b <= s: " + b3);
		System.out.println(" s >= d: " + b4);
		System.out.println(" d != 0: " + b5);
		System.out.println(" 1 == s: " + b6);

	}
}