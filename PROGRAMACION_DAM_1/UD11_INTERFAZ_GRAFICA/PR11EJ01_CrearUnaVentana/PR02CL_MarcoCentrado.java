package PR11EJ01_CrearUnaVentana;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

//------------VAMOS A COLOCAR LA VENTANA EN EL CENTRO DEL MONITOR

public class PR02CL_MarcoCentrado {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
			MarcoCentrado3 m2=new MarcoCentrado3 ();
			m2.setVisible(true);
			m2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}

}


//--------------MARCO CENTRADO

class MarcoCentrado3 extends JFrame {
	public MarcoCentrado3() {
		setSize(300,500);
//Para saber información de nuestra pantalla usamos la clase toolkit
		Toolkit miPantalla = Toolkit.getDefaultToolkit();

//de toda esa información, obtenemos el tamaño de la pantalla	
		Dimension tamanyoP =miPantalla.getScreenSize();

// metemos en una variable int los valores de width y hight
		int anchuraPantalla =tamanyoP.width;
		int alturaPantalla= tamanyoP.height;

//Configuramos el tamaño del marco en 
		setSize (anchuraPantalla/2, alturaPantalla/2);
		
//Colocamos el frame en 2 cuartos de la pantalla
		setLocation (anchuraPantalla/4, alturaPantalla/4);

		//cambiamos el titulo
		setTitle ("Marco Centrado");
		

//Cambiamos el icono de la ventana 
		Image miIcono=miPantalla.getImage("src/PR11EJ01_CrearUnaVentana/graficos/icono.gif");
		setIconImage (miIcono); 
		
		
		

		
		
		
	}
}