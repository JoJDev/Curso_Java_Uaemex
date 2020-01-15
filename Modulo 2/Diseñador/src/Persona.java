
public class Persona {
    private String nombre;
    private String Apellidos;
    private String direccion;
    private String email;
    private String telefono;

    public Persona(String nombre, String Apellidos, String direccion, String email, String telefono) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
     @Override
    public String toString() {
        return getNombre();
    }

}
