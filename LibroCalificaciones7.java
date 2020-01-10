
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lab Redes
 */
public class LibroCalificaciones7 {

    private String nombreDelCurso;

    public LibroCalificaciones7(String nombre) {
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
        float total, calificacion, promedio;
        int contadorCalif;

        total = 0;
        contadorCalif = 0;

        System.out.println("Escriba la calificacion o -1 para terminar");
        calificacion = input.nextInt();

        while (calificacion != -1) {
            total += calificacion;
            contadorCalif++;
            System.out.println("Escriba la calificacion o -1 para terminar");
            calificacion = input.nextInt();
        }

        if (contadorCalif != 0) {
            promedio = (float)total / contadorCalif;
            System.out.printf("\nEl total de las %d calificaciones es %.0f", contadorCalif, total);
            System.out.printf("\nEl promedio de la clase es %.2f", promedio);
        }
        else{
            System.out.println("No se introdujeron calificaciones");
        }
    }
}
