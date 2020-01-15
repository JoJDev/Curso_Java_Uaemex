import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseMotionListener;
//import java.awt.event.MouseMotionEvent;

public class EventosMouseRueda extends JFrame{
	public EventosMouseRueda(){

		JLabel lMovedX = new JLabel("Moved x: ");
		lMovedX.setBounds(25,10,100,30);
		JLabel lMovedY = new JLabel("Moved y: ");
		lMovedY.setBounds(230,10,100,30);

		JLabel lDraggedX = new JLabel("Dragged x: ");
		lDraggedX.setBounds(25,40,100,30);
		JLabel lDraggedY = new JLabel("Dragged Y: ");
		lDraggedY.setBounds(230,40,100,30);


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

		MouseWheelListener rueda = new MouseWheelListener(){
			@Override
			public void mouseWheelMoved(MouseWheelEvent eventoRueda){
				if(eventoRueda.getPreciseWheelRotation() == -1)
					System.out.println("MouseWheelMoved hacia arriba");
				if(eventoRueda.getPreciseWheelRotation() == 1)
					System.out.println("MouseWheelMoved hacia Abajo");
			}
			
		};

		MouseMotionListener moviListener = new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent eventoArrastrar){
				//System.out.println("Arrastrar");
				lDraggedX.setText("Dragged x: " + eventoArrastrar.getX());
				lDraggedY.setText("Dragged y: " + eventoArrastrar.getY());
			}

			@Override
			public void mouseMoved(MouseEvent eventoMovimiento){
				//System.out.println("Mover");
				lMovedX.setText("Moved x: " + eventoMovimiento.getX());
				lMovedY.setText("Moved y: " + eventoMovimiento.getY());
			}

		};



		bBoton.addMouseListener(listener);
		bBoton.addMouseWheelListener(rueda);

		tfSaludo.addMouseListener(listener);
		tfSaludo.addMouseWheelListener(rueda);

		this.addMouseMotionListener(moviListener);

		add(lMovedX);
		add(lMovedY);
		add(lDraggedX);
		add(lDraggedY);
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
		EventosMouseRueda init = new EventosMouseRueda();
	}

}