
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;

public class ToggleButton extends JFrame{
	public ToggleButton(){
		JToggleButton tb = new JToggleButton("ToggleButton", true);
		tb.setBounds(190,200,120,30);
		JToggleButton tb2 = new JToggleButton("ToggleButton2", false);
		tb2.setBounds(190,250,120,30);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(tb);
		bg.add(tb2);

		tb.setMnemonic('t');
		add(tb);
		add(tb2);
		


		setSize(500,500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		ToggleButton objGUI = new ToggleButton();

	}
}