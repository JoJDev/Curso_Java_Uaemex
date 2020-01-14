
import java.awt.HeadlessException;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;


public class Listas extends JFrame{

    public Listas() throws HeadlessException {
        super("Listas");
        DefaultListModel modelo = new DefaultListModel();
        JList lista = new JList(modelo);
        lista.setBounds(10, 10, 200, 100);
        
        modelo.addElement(new Persona("Jose Ramirez", "Cerrada 22", "4155778899"));
        modelo.addElement(new Persona("Abigail Chino", "Jose Cierra 55, San critobal", "778844112233"));
        modelo.addElement(new Persona("Miguel Cerrada", "Sierra negra, Coacalco", "78995448874"));
        modelo.addElement(new Persona("Rosa Rosales", "Capricornio Ecatepec", "1789432501"));
        modelo.addElement(new Persona("Perla Palacios", "Cerrada 552", "10784596320"));
        modelo.addElement(new Persona("Jose Ramirez", "Cerrada 22", "4155778899"));
        modelo.addElement(new Persona("Abigail Chino", "Jose Cierra 55, San critobal", "778844112233"));
        modelo.addElement(new Persona("Miguel Cerrada", "Sierra negra, Coacalco", "78995448874"));
        modelo.addElement(new Persona("Rosa Rosales", "Capricornio Ecatepec", "1789432501"));
        modelo.addElement(new Persona("Perla Palacios", "Cerrada 552", "10784596320"));
        modelo.addElement(new Persona("Jose Ramirez", "Cerrada 22", "4155778899"));
        modelo.addElement(new Persona("Abigail Chino", "Jose Cierra 55, San critobal", "778844112233"));
        modelo.addElement(new Persona("Miguel Cerrada", "Sierra negra, Coacalco", "78995448874"));
        modelo.addElement(new Persona("Rosa Rosales", "Capricornio Ecatepec", "1789432501"));
        modelo.addElement(new Persona("Perla Palacios", "Cerrada 552", "10784596320"));
        
        JScrollPane scroll = new JScrollPane(lista);
        scroll.setBounds(10, 10, 200, 100);
        
        add(scroll);
        setLayout(null);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Listas();
    }
    
    
}
