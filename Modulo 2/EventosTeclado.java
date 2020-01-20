import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class EventosTeclado extends JFrame{
	public EventosTeclado(){
		JLabel lblSaludo = new JLabel();
		lblSaludo.setBounds(25, 10, 200, 30);

		JLabel lblInstruccion = new JLabel("Ingresa tu nombre: ");
		lblInstruccion.setBounds(25, 165, 200, 30);

		JTextField tfSaludo = new JTextField(200);
		tfSaludo.setBounds(25, 200, 200, 30);

		JButton bBoton = new JButton("Saludar!");
		bBoton.setBounds(25, 235, 150, 30);

		/*ActionListener listener = new ActionListener(){
			// sobre escritura del metodo actionPerformed de la interfaz ActionListener
			@Override
			public void actionPerformed(ActionEvent e){
				lblSaludo.setText("Hola " + tfSaludo.getText());
			}
		};

		bBoton.addActionListener(listener);*/

		KeyListener keyL = new KeyListener(){
			@Override
			public void keyTyped(KeyEvent eventoT){
				System.out.println("Se presiono y solto una tecla");
				if(eventoT.getKeyCode() == KeyEvent.VK_A)
					System.out.println("Se presiono y solto la tecla A-----------------");

			}

			@Override
			public void keyPressed(KeyEvent eventP){
				System.out.println("Se presiono la tecla " + eventP.getKeyChar());
				if(eventP.getKeyCode() == KeyEvent.VK_ENTER)
					System.out.println("Se presiono la tecla enter-----------------");
				if(eventP.getKeyCode() == KeyEvent.VK_F1)
					System.out.println("Se presiono la tecla F1-----------------");
				if(eventP.getKeyCode() == KeyEvent.VK_A)
					System.out.println("Se presiono  la tecla A-----------------");

				if(eventP.getKeyCode() == KeyEvent.VK_4)
					System.out.println("Se presiono la tecla 4-----------------");
			}

			@Override
			public void keyReleased(KeyEvent eventoR){
				System.out.println("Se solto una tecla");
			}
		};
		tfSaludo.addKeyListener(keyL);

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
		EventosTeclado init = new EventosTeclado();
	}

}