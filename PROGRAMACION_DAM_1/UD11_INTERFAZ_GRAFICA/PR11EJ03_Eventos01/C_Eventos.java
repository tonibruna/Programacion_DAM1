package PR11EJ03_Eventos01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class C_Eventos {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoEvento03 m=new MarcoEvento03();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible (true);
	}

}

class MarcoEvento03 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7844935502097805539L;

	public MarcoEvento03 (){
		setTitle ("Mi Tercer Evento");
		
		setBounds (700,300, 500,300);
		
		LaminaBoton03 milamina =new LaminaBoton03();
		add(milamina);
		
	}
}

class LaminaBoton03 extends JPanel implements ActionListener {
	
	

	//1. creamos el boton
	JButton boton =new JButton ("foto");
	
	
	
	
	//2.creamos el constructor
	public LaminaBoton03 () {
		add(boton);
		
		//3. Ya tenmos identificados el objeto fuente: el boton, el objeto listener: la propia lamina. 
		boton.addActionListener(this);//ojo!!! el oyente tieen que implementar  una interfaz
		
						

	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Apéndice de método generado automáticamente
		
		//4. Ahora programamos lo que tiene que hacer
				//Object botonPulsado = e.getSource();//tenemos que capturar el objeto quien es la fuente
				
				
	}
			
	
	
	
}




