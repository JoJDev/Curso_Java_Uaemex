public class MultiplesCatch{
	public static void main(String[] args) {
		int a, b[], c = args.length;

		try{
			a = 10 / c;
			System.out.println("El valor de a es: " + a);
			b = new int[5];

			for(int i = 0 ; i < a ; i++){
				b[i] = i;
				System.out.printf("\tel valor de b[%d] es: %d \n",i,b[i]);
			}

		}
		
		catch(ArithmeticException e){
			System.out.println("Error: " + e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error: " + e);
		}/* Exception generica: para manejar cualquier tipo de excepcion
		catch(Exception e){
			System.out.println("Error general: " + e);
		}*/

	}
}