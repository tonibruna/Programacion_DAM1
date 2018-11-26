package PR11EJ03_Eventos01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class A_Eventos {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		MarcoEvento01 m=new MarcoEvento01();
		
	}

}

class MarcoEvento01 extends JFrame {
	
	public MarcoEvento01 (){
		setTitle ("Mi Primer Evento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible (true);
		setBounds (700,300, 500,300);
		
		LaminaBoton milamina =new LaminaBoton();
		add(milamina);
		
	}
}

class LaminaBoton extends JPanel implements ActionListener {
	
	//1. creamos el boton
	JButton botonAzul =new JButton ("azul");
	
	//2.creamos el constructor
	public LaminaBoton () {
		add(botonAzul);
		
		//3. Ya tenmos identificados el objeto fuente: el boton, el objeto listener: la propia lamina. 
		botonAzul.addActionListener(this);//ojo!!! el oyente tieen que implementar  una interfaz
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Apéndice de método generado automáticamente
		
		//4. Ahora programamos lo que tiene que hacer
		
		setBackground(Color.blue);
	}
	
	
	
}

