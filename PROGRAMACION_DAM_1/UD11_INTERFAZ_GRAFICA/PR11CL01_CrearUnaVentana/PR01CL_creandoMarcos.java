package PR11CL01_CrearUnaVentana;

import java.awt.Frame;

import javax.swing.JFrame;

public class PR01CL_creandoMarcos {
	public static void main(String[] args) {
		Marco m1= new Marco(); //instanciamos el objeto
	
//las ventanas nacen invisibles x defecto	
		m1.setVisible(true);
		
//le decimos lo que tiene que hacer al pulsar la x
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}

//---------------------------------
class Marco extends JFrame {//heredo para usar sus metodos
	
	public Marco () {
		//setSize (500,300);//esta ventana tendra un tamaño fijo
							//independiente de la resolucion
		//setLocation (-500,300);//coloca el frame en la posicion indicada
		
//metodo para configurar Tamaño y posicion en un mismo metodo
		setBounds(10,10,500,300);
		
//metodo para evitar que podamos cambiar el tamaño de una ventana
		//setResizable (false);
		
//metodo para que una ventana se abra maximizada. hay que quitar 
	//	setExtendedState(Frame.MAXIMIZED_BOTH);

//metodo para quitar barra de herramientas a la ventana. 
	//	setUndecorated (true);
	
//ponerle titulo a la ventana
		setTitle ("mi primera ventana");


		
		
	}
	
}



