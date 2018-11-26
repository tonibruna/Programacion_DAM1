package PR11EJ01_CrearUnaVentana;

import java.awt.*;
import javax.swing.*;

import javax.swing.JPanel;

public class PR03CL_EscribiendoEnFrame {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoConTexto2 m3=new MarcoConTexto2();
		
	}

}

//---------------clase que me crea el marco

class MarcoConTexto2 extends JFrame {
	
	public MarcoConTexto2 () {
		setVisible(true);
	
		setSize (500,300);
	
		setLocation (400, 200);
	
		setTitle ("escribir texto en un frame");
	
		Lamina2 miLamina = new Lamina2 ();
	
		add(miLamina);	
	}
}

//--------------------- clase de los cristales transparentes

class Lamina2 extends JPanel {
	
//sobreescribo el metodo paintComponent de la clase Jcomponent
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
//añadimos la funcion que trae por defecto este mentodo y
		//añadimos un texto
		g.drawString("estamos bailando Swing", 150, 150);
		
	}
	
	
	
	
	
}


