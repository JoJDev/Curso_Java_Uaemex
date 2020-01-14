
import javax.swing.JFrame;
import javax.swing.JComboBox;

public class ComboBox extends JFrame{
	public ComboBox(){
		String paises[] = {"Mexico","EUA", "Peru", "Japon", "Venezuela"};
		JComboBox cb = new JComboBox(paises);
		cb.setBounds(50, 50, 90, 20);

		cb.addItem("Argentina");
		cb.addItem("Brazil");
		cb.setSelectedItem("Japon");
		cb.setEditable(true);

		//cb.item[1].setMnemonic('c');
		add(cb);
		setSize(400,500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		ComboBox objGUI = new ComboBox();

	}
}

