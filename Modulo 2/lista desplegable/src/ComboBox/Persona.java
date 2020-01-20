package ComboBox;

public class Persona {
    String nombre;
    String direccion;
    String nacionalidad;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String[] elementos(){
        String[] s = {this.nombre, this.direccion, this.nacionalidad, Integer.toString(edad)};
        return s;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    

}
