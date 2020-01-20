
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButton extends JFrame{
	public RadioButton(){
		JRadioButton radio = new JRadioButton("Opcion 1",true);
		JRadioButton radio2 = new JRadioButton("Opcion 2",false);
		radio.setBounds(50,100,100,30);
		radio2.setBounds(50,150,100,30);

		ButtonGroup bg = new ButtonGroup();
		bg.add(radio);
		bg.add(radio2);

		radio.setText("Guardar");
		radio2.setText("Borrar");
		radio.setMnemonic('g');	// setMnemonic permite accesos rapidos con teclas (alt + <teclaSel>)
		radio2.setMnemonic('b');

		System.out.println("La opcion que seleccionado es: " + radio.isSelected());

		add(radio);
		add(radio2);
		setSize(300,300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		RadioButton objGUI = new RadioButton();

	}
}
