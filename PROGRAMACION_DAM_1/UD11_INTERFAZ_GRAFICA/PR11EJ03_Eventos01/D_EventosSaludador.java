package PR11EJ03_Eventos01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class D_EventosSaludador {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
			MarcoSaludador m=new MarcoSaludador();
			m.setLayout(null);
	}

}

class MarcoSaludador extends JFrame implements ActionListener {
	//Atributos
	JTextField texto;
	JButton boton,boton1;
	JLabel etiqueta;
	
	//constructor
	public MarcoSaludador () {
		setTitle ("Ventana de eventos");			//cambia el titulo del marco
		setSize (700,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible (true);
		
		setLocationRelativeTo (null);			//evitar usar layouts		
		setLayout (null);						//evitar usar layouts. los creemos x dogma
		
		etiqueta = new JLabel ();			//creo la etiqueta 
		etiqueta.setText("Dame tu nombre, que te voy a saludar");// les doy valores
		etiqueta.setSize(300,25);
		etiqueta.setLocation(0, 0);
		add(etiqueta);			//añado la etiqueta al marco
		
		boton = new JButton ();
		boton.setText("Saludar");
		boton.setSize(100, 25);
		boton.setLocation (50,25);
		add(boton);
		
		texto = new JTextField ();
		texto.setText(" ");
		texto.setSize(100, 25);
		texto.setLocation (25,50);
		add(texto);
		
		boton.addActionListener(this);
	
		
		
		
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		String nombre=texto.getText();
		
		texto.setText("Hola "+nombre);
	}
	
	
	//metodos
}
