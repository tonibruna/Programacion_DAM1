package PR11EJ03_Eventos01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class E_VentanaLayout {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoLayout m=new MarcoLayout ();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoLayout extends JFrame {
	 
	public MarcoLayout () {
		setTitle ("prueba");
		setBounds (600,350,600,300);
		
		LaminaLayout lamina=new  LaminaLayout ();
		FlowLayout disposicion =new FlowLayout (FlowLayout.CENTER);
		//puede usar el setLayout pq setLayout pertenece a container y JPanel hereda de container por lo que tiene heredado ese metodo
		lamina.setLayout(disposicion);
		add(lamina);
		
	}
}



class LaminaLayout extends JPanel{
	 JButton botonHola;
	 JButton botonAdios;
	 JTextField texto;
	
	public LaminaLayout () {
		
		botonHola = new JButton ();
		botonHola.setText("Saludar");
		botonHola.setSize(100, 25);
		botonHola.setLocation (50,25);
		add(botonHola);
		
		botonAdios = new JButton ();
		botonAdios.setText("Despedir");
		botonAdios.setSize(100, 25);
		botonAdios.setLocation (50,25);
		add(botonAdios);
		
		texto = new JTextField ();
		texto.setText("                     ");
		texto.setSize(100, 250);
		texto.setLocation (25,50);
		add (texto);
		
		botonHola.addActionListener(new Hola());
		botonAdios.addActionListener(new Adios());
		
	}
	class Hola implements ActionListener {
	@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Apéndice de método generado automáticamente
			String nombre=texto.getText();
			texto.setText("Hola "+nombre);
		}
	}
	
	class Adios implements ActionListener {
		@Override
			public void actionPerformed(ActionEvent e) {
			// TODO Apéndice de método generado automáticamente
				String nombre=texto.getText();
				texto.setText("Adios "+nombre);
			}
		}
	
}



