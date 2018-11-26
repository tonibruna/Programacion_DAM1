package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Boton_Ventana_Pulsame implements ActionListener{

	public void actionPerformed(ActionEvent e){
		
        BotonVentana bt= new BotonVentana();
	}

}

class BotonVentana extends JFrame{
	
	public BotonVentana() {
		super("Boton");
		setSize(200,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp= getContentPane();
		cp.setLayout (new FlowLayout());
		JButton boton = new JButton("¡Pulsame!");
		boton.addActionListener(new EventoBotonPulsado());
		cp.add(boton);
	}
}

public class EventoBotonPulsado implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		boton.setText("Gracias");
	}
}