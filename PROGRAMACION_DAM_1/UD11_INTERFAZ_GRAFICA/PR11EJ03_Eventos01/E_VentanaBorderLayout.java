package PR11EJ03_Eventos01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import PR11EJ03_Eventos01.LaminaLayout.Adios;
import PR11EJ03_Eventos01.LaminaLayout.Hola;

public class E_VentanaBorderLayout {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoBorderLayout m=new MarcoBorderLayout ();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoBorderLayout extends JFrame {
	 
	public MarcoBorderLayout () {
		setTitle ("prueba");
		setBounds (600,350,600,300);
		
		LaminaBorderLayout lamina=new  LaminaBorderLayout ();
		
		
		//puede usar el setLayout pq setLayout pertenece a container y JPanel hereda de container por lo que tiene heredado ese metodo
		
		add(lamina);
		
		//ejercicio: hacer el ejercicio anterior haciendo que la separación sea de mas de 5 pixeles, probar todas las opciones
		
	}
}

class LaminaBorderLayout extends JPanel implements ActionListener{
	 JButton botonHola;
	 JButton botonAdios;
	 JTextField texto;
	
	public LaminaBorderLayout () {
		
		setLayout (new BorderLayout());
		botonHola = new JButton ();
		botonHola.setText("Saludar");
		botonHola.setSize(100, 25);
		botonHola.setLocation (50,25);
		add(botonHola, BorderLayout.NORTH);
		
			
		texto = new JTextField ();
		texto.setText("");
		texto.setSize(100, 250);
		texto.setLocation (25,50);
		add (texto, BorderLayout.SOUTH);
		
		botonHola.addActionListener(this);
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Apéndice de método generado automáticamente
			String nombre=texto.getText();
			texto.setText("Hola "+nombre);
	}
}