//

public class PrecedenciaDeOperadores{
	public static void main(String[] args) {
		int a = 30;

		System.out.println("El resultado de 12 / 3 + 2 * 2 - 1 es: " 
			+ (12 / 3 + 2 * 2 - 1));
		System.out.println("El resultado de 12 / (3+2) * 2 - 1 es: " 
			+ ((float)12 / (3+2) * 2 - 1));
		System.out.println("El resultado de (12 / 3 / (3 + 2 * (2 - 1))) es: " 
			+ ((float)12 / 3 / (3 + 2 * (2 - 1))));
		System.out.println("El resultado de 4 * 2  < 5 * 4 / 2 es: " 
			+ (4 * 2  < 5 * 4 / 2));
		System.out.println("El resultado de !((a > 10) && ( a < 20)) es: " 
			+ (!((a > 10) && (a < 20))));
		System.out.println("El resultado de (3 >= 3 || 5 != 5) && (15 / 5 + 2 != 5) es: " 
			+ ((3 >= 3 || 5 != 5) && (15 / 5 + 2 != 5)));
	}
}