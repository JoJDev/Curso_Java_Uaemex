
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tablas extends JFrame{
    public Tablas(){
        super("Tablas");
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Edad");
        modelo.addColumn("Telefono");
        
        String p1[] = {"Jose Perez", "Petunias, San Cristobal", "20","5522114477"};
        String p2[] = {"Maria Rosas", "Claveles, San Cristobal", "25","4488995741"};
        String p3[] = {"Elizabet Bolaños", "Petunias, San Cristobal", "30","5577884411"};
        String p4[] = {"Pedro Jirafales", "Petunias, San Cristobal", "25","9874563210"};
        String p5[] = {"Ramon Olvera", "Petunias, San Cristobal", "18","4563210789"};
        String p6[] = {"Arturo Jimenez", "Petunias, San Cristobal", "26","5522114477"};
        String p7[] = {"Cesar Augusto", "Petunias, San Cristobal", "40","5522114477"};
        String p8[] = {"Jesica matasanos", "Petunias, San Cristobal", "38","5522114477"};
        String p9[] = {"Pepe Perez", "Petunias, San Cristobal", "29","5522114477"};
        String p10[] = {"Jazmin Padilla", "Petunias, San Cristobal", "30","5522114477"};
        
        modelo.addRow(p1);
        modelo.addRow(p2);
        modelo.addRow(p3);
        modelo.addRow(p4);
        modelo.addRow(p5);
        modelo.addRow(p6);
        modelo.addRow(p7);
        modelo.addRow(p8);
        modelo.addRow(p9);
        modelo.addRow(p10);
        
        JTable tabla = new JTable(modelo);
        //tabla.setBounds(10, 20, 500, 180);
        
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(10, 20, 500, 180);
        
        add(scroll);
       // add(tabla);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Tablas t = new Tablas();
    }
    
    
}

