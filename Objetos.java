//

public class Objetos{
	// Atributos; se declaran despues de la clase 
	String nombre;
	String color;

	public static void main(String[] args) {
		
		Objetos objeto1;
		objeto1 = new Objetos();
		Objetos objeto2 = new Objetos();

		objeto1.nombre = "Pedro (objeto1)";
		objeto2.nombre = "Pablo (objeto2)";

		objeto1.color = "Azul";
		objeto2.color = "Rojo";

		System.out.println("hola, soy " + objeto1.nombre);
		System.out.println("y soy de color " + objeto1.color);

		System.out.println("hola, soy " + objeto2.nombre);
		System.out.println("y soy de color " + objeto2.color);

		// Declarar un metodo
		/* TipoAcceso + valorRetorno + nombreMetodo + ( parametro + nombreParametro, par2 nomPar2, ...)
		*  {
		*	 Cuerpo del metodo
		*	}
		*
		*	public void mostrarMensaj(String mensaje, int color) {
		*
		*	}
		*/
	}

} 
