package PR11EJ02_DibujandoEnElFrame;

import java.awt.GraphicsEnvironment;
import javax.swing.*;
public class pruebas {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
//usamos la clase environment para crear un array de strings 
//de todas las fuentes que tenemos instaladas en nuestro ordenador,
		boolean estalafuente;
		String fuente=JOptionPane.showInputDialog("Introduce fuente");
		String[] nombreDeFuentes= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (String nombredelafuente: nombreDeFuentes) {
			System.out.println (nombredelafuente);
			if(nombredelafuente.equals(fuente)) {
				System.out.println("fuente instalada");
			}
		}
	}

}
