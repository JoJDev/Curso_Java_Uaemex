
public class Gato extends Mamifero {

    public static void main(String[] args) {
        // upcasting
        /*Gato g = new Gato();
         System.out.println("El Gato es: " + g);
        
         Mamifero m = g;
         Mamifero m2 = new Gato();
         System.out.println("El mamifero es:" + m);
        
         System.out.println("el mamifero2 es: " + m2);
         */
        // downcasting
        Gato g1 = new Gato();
        Animal a = g1;

        /*if (a instanceof Gato) {
            System.out.println("Se puede realizar la conversion hacia abajo (downcasting)");
            
            Gato g2 = (Gato) a;
        }*/
        Perro p = (Perro) a;
        System.out.println(p);

    }

}
