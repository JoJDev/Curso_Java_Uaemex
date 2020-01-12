
import java.util.Scanner;


public class Analisis {
    public void procesarResultadosExamen(){
        Scanner input = new Scanner(System.in);
        
        int aprobados = 0, reprobados = 0, contadorEstudiantes = 1, resultado = 0;
        
        while(contadorEstudiantes <= 10){
            System.out.println("Escriba el resultado (1 = aprobado, 2 = reprobado): ");
            
            resultado = input.nextInt();
            
            if(resultado == 1)
                aprobados++;
            else
                reprobados++;
            
        contadorEstudiantes++;            
        }
        
        System.out.printf("Aprobados: %d\nReprobados: %d\n", aprobados, reprobados);
        
        if (aprobados > 8)
            System.out.println("Aumentar la colegiatura");
    }
    
}
