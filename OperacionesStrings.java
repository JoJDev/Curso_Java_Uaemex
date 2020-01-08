/**
 * Esta clase muestra las operaciones que se pueden realizar con los Strings
 */
public class OperacionesStrings {
    
    public static void main(String [] args ){
        
        //Variables String
        String cadena1 = "Hola";
        String cadena2 = "Mundo!";
        
        //Variables numéricas.
        int enteroAUnir = 20;
        double decimal = 15.32;
        
        //concatenar
        /*String concatenacion = cadena1 + " " + cadena2;
        String concatenacion2 = cadena1 + enteroAUnir;
        String concatenacion3 = cadena1.concat(cadena2);
        System.out.println("La concatenacion es: " + concatenacion);
        System.out.println("La concatenacion es: " + concatenacion2);
        System.out.println("La concatenacion es: " + concatenacion3);*/
        
        //contar caracteres
        /*String cadena3 = "Java";
        int contarCadena = cadena3.length();
        System.out.println("La dimension es: " + contarCadena);
        System.out.println("La dimension es: " + "Java".length()  );*/
        
        //extraer una porción de una cadena
        String cadena4 = "Mi lenguaje favorito es Java";
        String extraer = cadena4.substring(24, 28);
        System.out.println("La extracción es: " + extraer);

        //comparar cadenas
        boolean comparacion1 = "Hola".equals("Hola");
        System.out.println("La comparación es: " + comparacion1);
        String cadena5 = "Hello";
        boolean comparacion2 = cadena5.equals("Hello");
        System.out.println("La comparación es: " + comparacion2);
        boolean comparacion3 = "Hello".equals(cadena5);
        System.out.println("La comparación es: " + comparacion3);

        //quitar espacios en blanco
        String cadena6 = "    Estoy aprendiendo a programar    ";
        System.out.println("La cadena sin espacios en blanco es: " + cadena6.trim());

        //cambiar a mayúsculas y minusculas
        System.out.println("Cambiar a minúsculas:    " + "LENGUAJE JAVA".toLowerCase());
        System.out.println("Cambiar a MAYÚSCULAS:    " + "Lenguaje Java".toUpperCase());

        //remplazar caracteres
        String cadenaReemplazar = "Cambiaremos la a por la o";
        String cadenaReemplazada = cadenaReemplazar.replace('a', 'o');
        System.out.println("El resultado es: " + cadenaReemplazada);

        //reemplazar un conjunto de caracteres
        String cadenaReemplazada2 = cadenaReemplazar.replace("Cambiaremos", "Cambiarás");
        System.out.println("El resultado es: " + cadenaReemplazada2);     
        

    }
    
}
