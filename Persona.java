public class Persona{
	private String nombre;
	private byte edad;
	private int peso;
	private int altura;

	// Setter: permiten establecer valores a los atributos

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setEdad(byte edad){
		this.edad = edad;
	}

	public void setPeso(int peso){
		this.peso = peso;
	}

	public void setAltura(int altura){
		this.altura = altura;
	}
	
	// Getter: permiten extraer/obtener los valores de los atributos

	public String getNombre(){
		return this.nombre;
	}

	public byte getEdad(){
		return this.edad;
	}

	public int getPeso(){
		return this.peso;
	}

	public int getAltura(){
		return this.altura;
	}



}