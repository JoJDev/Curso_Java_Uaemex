
public class ForEach {

    public static void main(String[] args) {
        int arreglo1[] = {87, 64, 94, 100, 83, 78, 85, 81, 76, 87};
        int totalFor = 0, totalForeach = 0;
        String s = "hola";

        for (int i = 0; i < arreglo1.length; i++) {
            totalFor += arreglo1[i];//  System.out.println("Valor arreglo1 en indice[" + i + "]: " + arreglo1[i]);
        }
        System.out.println("Esta es la suma de los valores contenidos en el arreglo, recorrido por ciclo for: "
                + totalFor);

        //For each: for(<tipoDato> <nombreDato> : <elementoAContar(lista,arreglo,etc)>){}
        for (int numero : arreglo1) {
            totalForeach += numero;
        }
        System.out.println("\nEsta es la suma de los valores contenidos en el arreglo1, recorrido por ciclo foreach: "
                + totalForeach);
    }
}
