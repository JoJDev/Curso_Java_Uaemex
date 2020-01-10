
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class DibujoArcoiris extends JPanel{

	private final static Color VIOLETA = new Color(128, 0, 128);
	private final static Color INDIGO = new Color(75, 0, 130);

	private Color colores[] = {Color.WHITE, Color.WHITE,
	 VIOLETA, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW,
	 Color.ORANGE, Color.RED};

	public DibujoArcoiris(){
		setBackground(Color.WHITE);
		this.setSize(1000,750);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		int radio = 50, centroX = getWidth()/2, 
		centroY = getHeight() - 10;

		for(int contador = colores.length; contador > 0; contador--){
			g.setColor(colores[contador - 1]);
			
			int valorX = centroX - contador * radio;
			int valorY = centroY - contador * radio;
			int ancho = contador * radio * 2;
			int alto = contador * radio * 2;

			g.fillArc(valorX, valorY, ancho, alto, 0, 180);
		}
	}
}