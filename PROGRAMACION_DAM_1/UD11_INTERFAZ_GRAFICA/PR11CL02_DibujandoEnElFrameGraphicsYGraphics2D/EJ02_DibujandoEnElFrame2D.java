package PR11CL02_DibujandoEnElFrameGraphicsYGraphics2D;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EJ02_DibujandoEnElFrame2D {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoConDibujo2D m= new MarcoConDibujo2D();
	}

}

class MarcoConDibujo2D extends JFrame {
	
	public MarcoConDibujo2D () {
		setSize (400,400);
		setVisible (true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaConFiguras2D miLamina = new LaminaConFiguras2D();
		add (miLamina);
	}
}

class LaminaConFiguras2D extends JPanel {
	
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
//hacemos un cast para obtener el objeto Graphics2D que me 
		//permite usar el metodo draw, que es el que dibuja
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 100,100);
		g2.draw (rectangulo);

		Ellipse2D elipse = new Ellipse2D.Double();
	
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100, 100, 300, 250));
				
	}
}

