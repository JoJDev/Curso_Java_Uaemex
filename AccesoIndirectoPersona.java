//

public class AccesoIndirectoPersona{
	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Jesus");
		p1.setEdad((byte)24);
		p1.setPeso(75);
		p1.setAltura(175);

		System.out.println("El nombre de la persona es: " + p1.getNombre());
		System.out.println("La edad de la persona es: " + p1.getEdad());
		System.out.println("El peso de la persona es: " + p1.getPeso());
		System.out.println("La altura de la persona es: " + p1.getAltura());

		Persona p2 = new Persona();
		p2.setNombre("Rosy");
		p2.setEdad((byte)22);
		p2.setPeso(50);
		p2.setAltura(151);


		System.out.println("El nombre de la persona es: " + p2.getNombre());
		System.out.println("La edad de la persona es: " + p2.getEdad());
		System.out.println("El peso de la persona es: " + p2.getPeso());
		System.out.println("La altura de la persona es: " + p2.getAltura());
		
	}
}