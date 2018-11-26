package PR11EJ02_DibujandoEnElFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujandoEnElFrame2D_03Fuentes {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoConFuentes m=new MarcoConFuentes();
		
	}

}

class MarcoConFuentes extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoConFuentes () {
		
		setTitle ("preuba de fuentes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (400,400);
		LaminaConFuentes milamina =new LaminaConFuentes();
		add(milamina);
		setVisible(true);
		//como establecemos el color de tods los elelmentos dentro de una lamina

		milamina.setForeground(Color.blue);
	}
}

class LaminaConFuentes extends JPanel {
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
		
		Font mifuente=new Font("Courier", Font.BOLD, 26);
		
		g2.setFont(mifuente);
		
		g2.setColor(Color.blue);
		
		g2.drawString("dam", 100, 100);
		
			
//vamos a crear otra fuente pero instanciando directamente en setFont
		g2.setFont(new Font("Arial", Font.ITALIC, 14));
		g2.setColor(new Color(128,90,50));
		g2.drawString("Curso", 100, 200);
		
		
		
		
		
		
		
		
}
}
