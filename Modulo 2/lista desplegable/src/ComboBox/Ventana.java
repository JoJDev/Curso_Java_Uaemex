package ComboBox;

import java.awt.HeadlessException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Ventana extends JFrame{

    public Ventana() throws HeadlessException {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox cb = new JComboBox(modelo);
        cb.setBounds(100, 100, 300, 40);
        //
        Persona p = new Persona();
        p.setNombre("Raul");
        p.setDireccion("Av. Guillermo Toreo, Los Angeles");
        p.setNacionalidad("EUA");
        p.setEdad(30);
        
        Persona perA = new Persona();
        perA.setNombre("Jesus");
        perA.setDireccion("Girasoles, Potrero del rey");
        perA.setNacionalidad("Mexico");
        perA.setEdad(24);
        
        Persona perB = new Persona();
        perB.setNombre("Rosy");
        perB.setDireccion("Coacalco");
        perB.setNacionalidad("Mexico");
        perB.setEdad(22);
        
        modelo.addElement(p);
        modelo.addElement(perA);
        modelo.addElement(perB);
        
        add(cb);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Ventana objGUI = new Ventana();
    }
    
}
