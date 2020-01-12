
public class Arreglos {

    public static void main(String[] args) {
        String arreglo1[] = new String[5];

        int arreglo2[] = {72, 43, 24, 5, 36, 1, 7};

        arreglo1[0] = "uno";
        arreglo1[1] = "dos";
        arreglo1[2] = "tres";
        arreglo1[3] = "cuatro";
        arreglo1[4] = "cinco";

        System.out.println("Estos son los valores que contiene el arreglo1: ");
        System.out.println(arreglo1[0]);
        System.out.println(arreglo1[1]);
        System.out.println(arreglo1[2]);
        System.out.println(arreglo1[3]);
        System.out.println(arreglo1[4]);
        System.out.println("");

        System.out.println("Estos son los valores que contiene el arreglo2: ");
        System.out.println(arreglo2[0]);
        System.out.println(arreglo2[1]);
        System.out.println(arreglo2[2]);
        System.out.println(arreglo2[3]);
        System.out.println(arreglo2[4]);
        System.out.println(arreglo2[5]);
        System.out.println("");

        System.out.println("Tamaño del arreglo1: " + arreglo1.length);
        System.out.println("Tamaño del arreglo2: " + arreglo2.length);
        System.out.println("");

        for (int i = 0; i < arreglo1.length; i++) 
            System.out.println("Valor arreglo1 en indice[" + i + "]: " + arreglo1[i]);
        System.out.println("");

        for (int i = 0; i < arreglo2.length; i++) 
            System.out.println("Valor arreglo1 en indice[" + i + "]: " + arreglo2[i]);
        System.out.println("");

    }

}
