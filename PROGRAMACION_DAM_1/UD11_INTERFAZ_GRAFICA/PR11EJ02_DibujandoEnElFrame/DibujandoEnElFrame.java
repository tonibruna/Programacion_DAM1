package PR11EJ02_DibujandoEnElFrame;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujandoEnElFrame {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		
	}

}

class MarcoConDibujo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoConDibujo () {
		setTitle ("preuba de dibujo");
		setSize (400,400);
		LaminaConFiguras milamina =new LaminaConFiguras();
		add(milamina);
	}
}

class LaminaConFiguras extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent (Graphics g) {
		super.paintComponent (g);
		g.drawRect(50, 50, 200, 200);
}
}
