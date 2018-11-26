package PR11EJ01_CrearUnaVentana;
import javax.swing.*;  

/*
 * -  se pueden hacer de muchas maneras
 * - ver el paquete swing para ver que hay
 */
public class CreandoMarcos {

	public static void main(String[] args) {
		/* lo vamos a hacer en 2 clases diferentes*/
		
		miMarco marco1=new miMarco(); //instanciamos el objeto
		marco1.setVisible (true);//lo hacemos visible
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//lo que queremos que haga cuando se cierre. Ver en la api de java. Hay más opciones. es una variable estatica
		//EJERCICIO 01: probar las otras opciones. ¿Que pasa si no ponemos setDefaultCloseOperation
		
		
	}	
}
		
	

 class miMarco extends JFrame {// como heredo puedo usar todas los metodos
	
	public miMarco () {//hago el constructor
		setSize(500,300); //usamos este metodo. Podemos verlo en la API. Dependerá de la resolución, pero es más complicado (clase toolkit)
	}
}
