
package javaapplicationmuestra;

import java.awt.*;
import java.awt.event.*;

public class OperacionesAritmeticas {
    private Frame f;
    private Label li, la, lb, ls;
    private TextField ta, tb, ts;
    private Button bsuma, bresta, bmult, bdiv, bsalir;
    private Panel pan, pac, pas;
    
    public  OperacionesAritmeticas(){
        f = new Frame("Operaciones con dos numeros");
        li = new Label("Escriba dos numeros enteros sobre los que desee realizar operciones aritmeticas");
        la = new Label("Numero A: ");
        lb = new Label("Numero B: ");
        ls = new Label("Resultado: ");
        
        ta = new TextField(3);
        tb = new TextField(5);
        ts = new TextField(8);
        
        bsuma = new  Button("Sumar");
        bresta = new Button("Restar");
        bmult = new Button("Multiplicar");
        bdiv = new Button("Dividir");
        bsalir = new Button("Salir");
        
        pan = new Panel();
        pac = new Panel();
        pas = new Panel();
        
    }
    
    public void acomodarEnFrame(){
        bsuma.addActionListener(new ManejadorBotonSumar());
        bsalir.addActionListener(new ManejadorBotonSalir());
        
        pan.add(li);
        f.add(pan,BorderLayout.NORTH);
        
        pac.setLayout(new GridLayout(3,2));
        pac.add(la);
        pac.add(ta);
        pac.add(lb);
        pac.add(tb);
        pac.add(ls);
        pac.add(ts);
        f.add(pac,BorderLayout.CENTER);
        
        pas.setLayout(new GridLayout(1,5));
        pas.add(bsuma);
        pas.add(bresta);
        pas.add(bmult);
        pas.add(bdiv);
        pas.add(bsalir);
        
        f.add(pas,BorderLayout.SOUTH);
        
        f.setSize(300, 300);
        f.setVisible(true);
    }
    
    class ManejadorBotonSumar implements ActionListener{
        public void actionPerformed(java.awt.event.ActionEvent eventobotonSumar){
            int na, nb, sab;
            String res;
            
            na = Integer.parseInt(ta.getText());
            nb = Integer.parseInt(tb.getText());
            
            sab = na + nb;
            
            res = Integer.toString(sab);
            ts.setText(res);
        }
    }
    
    class ManejadorBotonSalir implements ActionListener{
        public void actionPerformed(java.awt.event.ActionEvent eventobotonSalir){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        OperacionesAritmeticas igu0A = new OperacionesAritmeticas();
        igu0A.acomodarEnFrame();
    }
}
