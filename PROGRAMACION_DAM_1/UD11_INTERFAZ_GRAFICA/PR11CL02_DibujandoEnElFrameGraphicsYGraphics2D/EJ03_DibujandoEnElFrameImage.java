package PR11CL02_DibujandoEnElFrameGraphicsYGraphics2D;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EJ03_DibujandoEnElFrameImage {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		MarcoConImagen m = new MarcoConImagen (); 
	}

}

class MarcoConImagen extends JFrame {
	
	public MarcoConImagen () {
		setSize (720,400);
		setVisible (true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaConImagen miLamina = new LaminaConImagen();
		add (miLamina);
	}
}

class LaminaConImagen extends JPanel {
	
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
//PASO 1: Crear el objeto fichero que contiene la direccion
		File fichero = new File ("src/graficos/persona.jpg");

//PASO 2: Obtengo la imagen con el metodo read 
		Image miImagen = null;
		try {
			miImagen=ImageIO.read(fichero);
		}catch (IOException e) {
			System.out.println("no se encuentra la imagen");
		}
		
//PASO 3: Dibujo
		g.drawImage(miImagen, 5, 5, null);
		
				
	}
}