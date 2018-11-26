package PR11EJ03_Eventos01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class B_Eventos {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		MarcoEvento02 m=new MarcoEvento02();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible (true);
	}

}

class MarcoEvento02 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7844935502097805539L;

	public MarcoEvento02 (){
		setTitle ("Mi Segundo Evento");
		
		setBounds (700,300, 500,300);
		
		LaminaBoton02 milamina =new LaminaBoton02();
		add(milamina);
		
	}
}

class LaminaBoton02 extends JPanel implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3038024525004868397L;

	//1. creamos el boton
	JButton botonAzul =new JButton ("azul");
	
	JButton botonAmarillo= new JButton ("Amarillo");
	
	JButton botonRojo= new JButton ("Rojo");
	
	
	
	//2.creamos el constructor
	public LaminaBoton02 () {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		//3. Ya tenmos identificados el objeto fuente: el boton, el objeto listener: la propia lamina. 
		botonAzul.addActionListener(this);//ojo!!! el oyente tieen que implementar  una interfaz
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Apéndice de método generado automáticamente
		
		//4. Ahora programamos lo que tiene que hacer
		Object botonPulsado = e.getSource();//tenemos que capturar el objeto quien es la fuente
		
		if(botonPulsado==botonAzul) {
			setBackground(Color.blue);
		}
		if(botonPulsado==botonAmarillo) {
			setBackground(Color.yellow);
		}
		if(botonPulsado==botonRojo) {
			setBackground(Color.red);
		}
	}
	
	
	
}

