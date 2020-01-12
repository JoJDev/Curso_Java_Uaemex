import javax.swing.JOptionPane;

public class Graficos{
	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Introdusca el 1er numero");
		String n2 = JOptionPane.showInputDialog("Introdusca el 2do numero");

		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);

		OperacionesGUI op = new OperacionesGUI();
		double sum = op.sumar(num1, num2);
		double res = op.restar(num1,num2);
		double div = op.dividir(num1,num2);
		double mul = op.multiplicar(num1,num2);

		JOptionPane.showMessageDialog(null,"suma: " + sum + "\nresta: " + res + "\ndivicion: " + div + "\nmultiplicacion: " + mul);
	}
}