package PR11CL01_CrearUnaVentana;
import java.awt.Frame;

import javax.swing.*;  

/*
 * -  se pueden hacer de muchas maneras
 * - ver el paquete swing para ver que hay
 */
public class CreandoMarcos02 {

	public static void main(String[] args) {
		/* lo vamos a hacer en 2 clases diferentes*/
		
		miMarco2 marco1=new miMarco2(); //instanciamos el objeto
		marco1.setVisible (true);//lo hacemos visible
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//lo que queremos que haga cuando se cierre. Ver en la api de java. Hay más opciones. es una variable estatica
		//EJERCICIO 01: probar las otras opciones. ¿Que pasa si no ponemos setDefaultCloseOperation
		
		
	}	
}
		
	

 class miMarco2 extends JFrame {// como heredo puedo usar todas los metodos
	
	public miMarco2 () {//hago el constructor
		//setSize(500,300); //usamos este metodo. Podemos verlo en la API. Dependerá de la resolución, pero es más complicado (clase toolkit)
		
		//setLocation (500,300); //eje cartesiano, el centro es el 0,0. EJERCICIO 4: Que pasa si ponemos valores negativos.
		
				
		setBounds (500,300, 250,250);//podemos usar setBounds. comentamos setSize y setLocation
		
		setResizable (false);//no permite maximizar ni cambiar el tamñao
		
		//setExtendedState (Frame.MAXIMIZED_BOTH);//el marco se abre a pantalla completa. comentamos setResizable. EJERCICIO 05: Buscar en la API
		
		//-----poner un titulo
		
		setTitle ("Mi Ventana");
		
	}
}
