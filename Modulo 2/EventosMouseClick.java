import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class EventosMouseClick extends JFrame{
	public EventosMouseClick(){
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
				if(!evento.isMetaDown() & evento.isAltDown()){
					lblSaludo.setText("click + alt");
					System.out.println("click + alt");
				}
				else if (!evento.isMetaDown() & evento.isControlDown()) {
					lblSaludo.setText("click + Control");
					System.out.println("click + Control");					
				}
				else if (!evento.isMetaDown() & evento.isShiftDown()) {
					lblSaludo.setText("click + Shift");
					System.out.println("click + Shift");					
				}
				else if (evento.isMetaDown()) {
					lblSaludo.setText("click Derecho ");
					System.out.println("click Derecho ");					
				}
				else{
					lblSaludo.setText("click Izquierdo");
					System.out.println("click Izquierdo");	
				}
				
				if(evento.getClickCount() == 2){
					lblSaludo.setText("Doble click Izquierdo");
					System.out.println("Doble click Izquierdo");
				}
				if(evento.getClickCount() == 3){
					lblSaludo.setText("Triple click Izquierdo");
					System.out.println("Triple click Izquierdo");
				}	
			}

			@Override
			public void mouseExited(MouseEvent evento){
			}

			@Override
			public void mouseEntered(MouseEvent evento){
			}
			

			@Override
			public void mouseReleased(MouseEvent evento){
			}
			

			@Override
			public void mousePressed(MouseEvent evento){		
			}
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
		EventosMouseClick init = new EventosMouseClick();
	}

}