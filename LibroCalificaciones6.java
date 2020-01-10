
import java.util.Scanner;

public class LibroCalificaciones6 {

    private String nombreDelCurso;

    public LibroCalificaciones6(String nombre) {
        this.nombreDelCurso = nombre;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public void mostrarMensaje() {
        System.out.printf("Bienvenido al libro de caloficaciones para \n%s\n\n", getNombreDelCurso());
    }

    public void determinarPromedioClase() {
        Scanner input = new Scanner(System.in);
        float total, contadorCalif, calificacion, promedio;

        total = 0;
        contadorCalif = 1;

        while (contadorCalif <= 10) {
            System.out.print("Escriba la calificacion: ");
            calificacion = input.nextInt();
            total += calificacion;
            contadorCalif++; 
        }
        promedio = total / 10;
        System.out.printf("\nEl total de las 10 calificaciones es %f", total);
        System.out.printf("\nEl promedio de la clase es %f", promedio);
    }
}
