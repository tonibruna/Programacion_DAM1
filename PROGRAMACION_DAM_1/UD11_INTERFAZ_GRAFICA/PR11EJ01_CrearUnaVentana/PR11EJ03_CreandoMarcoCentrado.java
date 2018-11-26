package PR11EJ01_CrearUnaVentana;
import java.awt.*;
import javax.swing.*;
public class PR11EJ03_CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoCentrado marco1=new MarcoCentrado ();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoCentrado extends JFrame {
	
	public MarcoCentrado () {
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit(); // esta clase nos devuelve un objeto de tipo Toolkit, por lo que tenemos que crearlo.Este metodo saca la resolucion de pantalla
		
		//Ahora tenemos que averiguar el tamapo de la pantalla, con el getScreenSize(); EJERCICIO 6: Ver estas clases en la apil
		Dimension tamanyoPantalla=miPantalla.getScreenSize();// dimension tiene 2 campos higt y widt;
		//obtengo laresolucion demi pantalla
		int anchuraPantalla=tamanyoPantalla.width;
		int alturaPantalla=tamanyoPantalla.height;
		
		//vamos a calcular la mitad de mi pantalla, y cambio el tamaño de la pantalla
		setSize (anchuraPantalla/2,alturaPantalla/2);
		
		//Ahora coloco mi marco en 1/4 de mi pantalla
		setLocation(anchuraPantalla/4, alturaPantalla/4);
		
		//cambiamos el titulo
		setTitle("Marco Centrado");
		
		//cambiamos el icono
		Image miIcono=miPantalla.getImage("src/PR11EJ01_CrearUnaVentana/graficos/icono.gif");//de la raiz de la carpeta del documento. Obtengo el icono
		setIconImage(miIcono);//lo sustituyo.
		
		
		
		
		
		
	}
}