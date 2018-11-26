package PR11EJ03_Eventos01;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Clase2Botones {

	public static void main(String[] args) {
	
		Marco2Botones_ m=new Marco2Botones_ ();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
	}

}

class Marco2Botones_ extends JFrame {
	JTextField texto;
	JButton botonHola;
	JButton botonAdios;
	
	public Marco2Botones_ () {
		setTitle ("prueba");
		setBounds (600, 350, 600, 300);
		Lamina2Botones_ lamina=new  Lamina2Botones_ ();
		FlowLayout disposicion =new FlowLayout (FlowLayout.CENTER,5,5);
		lamina.setLayout(disposicion);
		add(lamina);
		
	}
}

class Lamina2Botones_ extends JPanel  {
	JButton botonHola;
	JButton botonAdios;
	JTextField texto; 
	
		public Lamina2Botones_ () {//constructor 
			botonHola = new JButton ();
			botonHola.setText("Saludar");
			botonHola.setSize(100, 25);
			botonHola.setLocation (50,25);
			add(botonHola);
			
			botonAdios = new JButton ();
			botonAdios.setText("Adios");
			botonAdios.setSize(100, 25);
			botonAdios.setLocation (50,25);
			add(botonAdios);
			
			texto = new JTextField ();
			texto.setPreferredSize( new Dimension( 200, 24 ) );
			texto.setSize(100, 250);
			texto.setLocation (25,50);
			add (texto);
			
			EventoBotonHola h=new EventoBotonHola (); //instanciamos la clase 
			botonHola.addActionListener(h);//la pasamos como objeto listener
			
			EventoBotonAdios a=new EventoBotonAdios();
			botonAdios.addActionListener(a);
			
			
		}

			
		//clase interna asociada al boton Hola para la gestion de eventos
	 class EventoBotonHola implements ActionListener {
		
			public void actionPerformed(ActionEvent e) {
				texto.setText ("HolaCaracola");
			}
	 }
	 
	 class EventoBotonAdios implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			texto.setText("Adios CAmaleon");
		}
		 
	 }
	
	
	

}


