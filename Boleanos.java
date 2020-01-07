

public class Boleanos{
	public static void main(String[] args) {
		int x = 0;
		int y = 2;

		boolean b = (x != 0) && ((y/x) != 0);
		System.out.println("el valor resultante es: " + b);

		boolean c = (x != 0) & ((y/x) != 0);
		System.out.println("el valor resultante es: " + c);
	}
}