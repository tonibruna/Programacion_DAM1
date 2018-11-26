package PR11CL02_DibujandoEnElFrameGraphicsYGraphics2D;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EJ01_DibujandoEnElFrame {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoConDibujo m1= new MarcoConDibujo () ;
		
	}

}

class MarcoConDibujo extends JFrame {
	
	public MarcoConDibujo () {
		setSize (400,400);
		setVisible (true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaConFiguras miLamina = new LaminaConFiguras();
		add (miLamina);
	}
}

class LaminaConFiguras extends JPanel {
	
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawRect(100, 100, 100, 100);
		g.drawLine(100, 100, 200, 200);
		g.drawOval(100, 100, 100, 100);
	}
}
