package PR11EJ03_Eventos01;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import PR11EJ03_Eventos01.LaminaLayout.Adios;
import PR11EJ03_Eventos01.LaminaLayout.Hola;

public class E_VentanaFlowLayout {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoFlowLayout m=new MarcoFlowLayout ();
		
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
	}

}


class MarcoFlowLayout extends JFrame {
	 
	public MarcoFlowLayout () {
		setTitle ("prueba");
		setBounds (600,350,600,300);
		
		LaminaFlowLayout lamina=new  LaminaFlowLayout ();
		FlowLayout disposicion =new FlowLayout (FlowLayout.CENTER,5,5);
		//puede usar el setLayout pq setLayout pertenece a container y JPanel hereda de container por lo que tiene heredado ese metodo
		lamina.setLayout(disposicion);
		add(lamina);
		
		//ejercicio: hacer el ejercicio anterior haciendo que la separación sea de mas de 5 pixeles, probar todas las opciones
		
	}
}

class LaminaFlowLayout extends JPanel implements ActionListener{
	 JButton botonHola;
	 JButton botonAdios;
	 JTextField texto;
	
	public LaminaFlowLayout () {
		
		botonHola = new JButton ();
		botonHola.setText("Saludar");
		botonHola.setSize(100, 25);
		botonHola.setLocation (50,25);
		add(botonHola);
		
		botonAdios = new JButton ();
		botonAdios.setText("Saludar");
		botonAdios.setSize(100, 25);
		botonAdios.setLocation (50,25);
		add(botonAdios);
		
		texto = new JTextField ();
		texto.setPreferredSize( new Dimension( 200, 24 ) );

		texto.setSize(100, 250);
		texto.setLocation (25,50);
		add (texto);
		
		botonHola.addActionListener(this);
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Apéndice de método generado automáticamente
			String nombre=texto.getText();
			texto.setText("Hola "+nombre);
	}
}