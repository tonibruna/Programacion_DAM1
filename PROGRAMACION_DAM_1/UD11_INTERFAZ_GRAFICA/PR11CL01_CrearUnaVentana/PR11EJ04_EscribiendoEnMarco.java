package PR11CL01_CrearUnaVentana;
import javax.swing.*;
import java.awt.*;

public class PR11EJ04_EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		MarcoConTexto2 mimarco=new MarcoConTexto2 ();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
//-----------clase para hacer el marco
class MarcoConTexto2 extends JFrame {
	
	public MarcoConTexto2 () {
		
		setVisible(true);
		
		setSize (600,450);
		
		setLocation(400,200);
		
		setTitle ("primer TExto");
		
		//añadir una lamina
		Lamina2 miLamina=new Lamina2 ();//la creamos
		add(miLamina); //la agregamos.
	}
}
//para añadir la lamina tenemos que crear una nueva clase
//-----------------CLASE PARA LAS LAMINAS-----------------------
class Lamina2 extends JPanel{
	//ver la clase de api. Tiene 4 constructores. Es una clase abstracta
	
	
	public void paintComponent (Graphics g) {//sobreescribimos el método paintComponent JComponent.
		//al sobreescribir le decimos que ademas de hacer su trabajo tiene que hacer lo que le digamos
		
		super.paintComponent(g);//invocar a paintcomponent de la clase Component
		
		g.drawString("Estamos bailando swing",100, 100);	
		
	}
}

