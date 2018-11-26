package PR11CL03_Eventos01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class A_Ejemplo_Eventos {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoEvento_01 m=new MarcoEvento_01 ();
		
	}

}


class MarcoEvento_01 extends JFrame {
	public MarcoEvento_01 (){
		setTitle ("Mi Primer Evento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible (true);
		setBounds (700,300, 500,300);
		
		LaminaBoton_01 milamina =new LaminaBoton_01();
		add(milamina);
		
	}
}

class LaminaBoton_01 extends JPanel implements ActionListener {
	
	//1. Creamos el boton. es un miembro de la clase 	
	JButton botonAzul = new JButton ("Azul");
	
	//2. crear el constructor de Lamina
	public LaminaBoton_01 () {
		add(botonAzul);// el boton azul es el objeto fuente
		
		botonAzul.addActionListener(this);
			
	}
	
	
	public void actionPerformed (ActionEvent e) {
		
		Object botonPulsado = e.getSource();
		System.out.println(e.getActionCommand()+e.getModifiers()
		);
		
		setBackground(Color.blue);
		
	}
	
	
	
}


