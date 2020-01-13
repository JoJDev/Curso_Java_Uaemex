public class TryAnidado{
	public static void main(String[] args) {
		try{
			int c = args.length;
			int a = 10 / c;
			System.out.println("El valor de \" a \" es :" + a);
			
			try{
				if (c == 1)
					a = a / (c - 1);
				if (c == 2) {
					int[] b = {100, 5};
					b[3] = 0;
				}
								
			}
			catch(ArrayIndexOutOfBoundsException e){
					System.out.println("Error: " + e);
			}
			catch(Exception e){
				System.out.println("Error Generico: " + e);
			}						
		}
		catch(ArithmeticException e){
				System.out.println("Error: " + e);
		}
	}
}