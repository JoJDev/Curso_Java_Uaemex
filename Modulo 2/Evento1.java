import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Evento1 extends JFrame{
	public Evento1(){
		JLabel lblSaludo = new JLabel();
		lblSaludo.setBounds(25, 10, 200, 30);

		JLabel lblInstruccion = new JLabel("Ingresa tu nombre: ");
		lblInstruccion.setBounds(25, 165, 200, 30);

		JTextField tfSaludo = new JTextField(200);
		tfSaludo.setBounds(25, 200, 200, 30);

		JButton bBoton = new JButton("Saludar!");
		bBoton.setBounds(25, 235, 150, 30);

		ActionListener listener = new ActionListener(){
			// sobre escritura del metodo actionPerformed de la interfaz ActionListener
			@Override
			public void actionPerformed(ActionEvent e){
				lblSaludo.setText("Hola " + tfSaludo.getText());
			}
		};

		bBoton.addActionListener(listener);

		add(lblSaludo);
		add(lblInstruccion);
		add(tfSaludo);
		add(bBoton);

		setSize(400, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		Evento1 even = new Evento1();
	}
}