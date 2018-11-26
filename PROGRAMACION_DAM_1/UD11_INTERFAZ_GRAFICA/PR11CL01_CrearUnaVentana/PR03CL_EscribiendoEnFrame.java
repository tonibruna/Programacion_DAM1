package PR11CL01_CrearUnaVentana;

import java.awt.*;
import javax.swing.*;

import javax.swing.JPanel;

public class PR03CL_EscribiendoEnFrame {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoConTexto m3=new MarcoConTexto();
		
	}

}

//---------------clase que me crea el marco

class MarcoConTexto extends JFrame {
	
	public MarcoConTexto () {
		setVisible(true);
	
		setSize (500,300);
	
		setLocation (400, 200);
	
		setTitle ("escribir texto en un frame");
	
		Lamina miLamina = new Lamina ();
	
		add(miLamina);	
	}
}

//--------------------- clase de los cristales transparentes

class Lamina extends JPanel {
	
//sobreescribo el metodo paintComponent de la clase Jcomponent
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
//añadimos la funcion que trae por defecto este mentodo y
		//añadimos un texto
		g.drawString("estamos bailando Swing", 150, 150);
		
	}
	
	
	
	
	
}


