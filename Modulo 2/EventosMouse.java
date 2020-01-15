import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class EventosMouse extends JFrame{
	public EventosMouse(){
		JLabel lblSaludo = new JLabel();
		lblSaludo.setBounds(25, 10, 300, 30);

		JLabel lblInstruccion = new JLabel("Ingresa tu nombre: ");
		lblInstruccion.setBounds(25, 165, 300, 30);

		JTextField tfSaludo = new JTextField(200);
		tfSaludo.setBounds(25, 200, 300, 30);

		JButton bBoton = new JButton("Saludar!");
		bBoton.setBounds(25, 235, 250, 30);

		MouseListener listener = new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent evento){
				if(evento.getSource() == tfSaludo)
					lblSaludo.setText("Ocurrio un evento de MouseClicked desde tfSaludo");
				else
					lblSaludo.setText("Ocurrio un evento de MouseClicked desde boton");
			}

			@Override
			public void mouseExited(MouseEvent evento){
				if(evento.getSource() == tfSaludo)
					tfSaludo.setText("Ocurrio un evento de mouseExited desde tfSaludo");
				else
					tfSaludo.setText("Ocurrio un evento de mouseExited desde boton");
			}

			@Override
			public void mouseEntered(MouseEvent evento){
				if(evento.getSource() == tfSaludo)
					tfSaludo.setText("Ocurrio un evento de mouseEntered desde tfSaludo");
				else
					tfSaludo.setText("Ocurrio un evento de mouseEntered desde boton");
			}
			

			@Override
			public void mouseReleased(MouseEvent evento){
				if(evento.getSource() == tfSaludo)
					lblSaludo.setText("Ocurrio un evento de mouseReleased desde tfSaludo");
				else
					lblSaludo.setText("Ocurrio un evento de mouseReleased desde boton");
			}
			

			@Override
			public void mousePressed(MouseEvent evento){
				if(evento.getSource() == tfSaludo)
					lblSaludo.setText("Ocurrio un evento de mousePressed desde tfSaludo");
				else
					lblSaludo.setText("Ocurrio un evento de mousePressed desde boton");			}
		};



		bBoton.addMouseListener(listener);

		tfSaludo.addMouseListener(listener);

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
		EventosMouse init = new EventosMouse();
	}

}