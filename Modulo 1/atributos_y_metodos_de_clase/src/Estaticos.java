// los mienbros de clase: son atributos y metodos que son declarados en la clase y pertenecen a ella
// los atributos de instancia son atributos o metodos que se declaran en la clase 
// pero pertenecen a los objetos que derivan de ella

public class Estaticos {
    static String atrib = "Atributos";
    
    public static int suma(int x, int y){
        int suma = x + y;
        return suma;        
    }
        
    public static void main(String args[]){
        Estaticos est1 = new Estaticos();
        Estaticos est2 = new Estaticos();
        
        System.out.println("El valor de atrib para est1 es: " + est1.atrib);
        System.out.println("El valor de atrib para est2 es: " + est2.atrib);
        
        est1.atrib = "Atributo cambiado";
        
        System.out.println("El valor de atrib para est1 es: " + est1.atrib);
        System.out.println("El valor de atrib para est2 es: " + est2.atrib);
        
        est2.atrib = "Valor estatico";
        
        System.out.println("El valor de atrib para est1 es: " + est1.atrib);
        System.out.println("El valor de atrib para est2 es: " + est2.atrib);
        
        int a = Estaticos.suma(1, 5);
        
        System.out.println("El resultado de la suma: " + a);
   
    }
    
}
