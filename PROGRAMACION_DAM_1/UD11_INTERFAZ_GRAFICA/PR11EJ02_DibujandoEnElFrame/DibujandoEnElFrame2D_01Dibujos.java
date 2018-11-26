package PR11EJ02_DibujandoEnElFrame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujandoEnElFrame2D_01Dibujos {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoConDibujo2D m=new MarcoConDibujo2D();
		
	}

}

class MarcoConDibujo2D extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoConDibujo2D () {
		
		setTitle ("preuba de dibujo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (400,400);
		LaminaConFiguras2D milamina =new LaminaConFiguras2D();
		add(milamina);
		setVisible(true);
	}
}

class LaminaConFiguras2D extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent (Graphics g) {
		super.paintComponent (g);

//creamos el objeto Graphics2D
		Graphics2D g2=(Graphics2D) g;
//instanciamos la clase Rectangle2D. Es abstractra, por lo que
//no podemos instanciarla directamente, sino a traves de las
//clases REctangle2d.Double. Principio herencia es un..
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
//vemos los constructores de Rentangle2d.Double, 
		
		//utilizamos nuestro objeto g2.
		
		g2.draw(rectangulo);
		
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		
		
		
}
}
