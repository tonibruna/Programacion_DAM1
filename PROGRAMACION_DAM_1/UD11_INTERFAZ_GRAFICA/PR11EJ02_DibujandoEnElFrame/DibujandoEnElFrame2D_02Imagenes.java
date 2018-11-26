package PR11EJ02_DibujandoEnElFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujandoEnElFrame2D_02Imagenes {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
			MarcoImagen m=new MarcoImagen ();
	}

}

class MarcoImagen extends JFrame {
	public MarcoImagen () {
		setVisible(true);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setBounds (750,300,300,200);
		LaminaConImagen miLamina = new LaminaConImagen();
		add (miLamina);
		LaminaConFuentes miLamina2 = new LaminaConFuentes ();
	
	}
}

class LaminaConImagen extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent (g);
		File fichero=new File ("src/graficos/persona.jpg");
		
		Image miImagen=null;
		
		try {
			miImagen=ImageIO.read(fichero);
		}catch (IOException e) {
			System.out.println("no se encuentra la imagen");
		}
		
		g.drawImage (miImagen,5,5,null);
		

		//--------añadimos texto
		Graphics2D g2=(Graphics2D) g;
		//instanciamos la clase Rectangle2D. Es abstractra, por lo que
		//no podemos instanciarla directamente, sino a traves de las
		//clases REctangle2d.Double. Principio herencia es un..
				
				Font mifuente=new Font("Courier", Font.BOLD, 26);
				
				g2.setFont(mifuente);
				
				g2.setColor(Color.blue);
				
				g2.drawString("dam", 100, 100);
	}
}

