package Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Anadir_Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MiVentana3 m3= new MiVentana3();
	}

}

class MiVentana3 extends JFrame {
    
	public MiVentana3() {
		super("A�adir Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400,300);
		
		//Panel de fecha
		JPanel panelFecha =new JPanel();
		panelFecha.setLayout(new FlowLayout());
		panelFecha.add(new JTextField(2));
		panelFecha.add(new JLabel("/"));
		panelFecha.add(new JTextField(2));
		panelFecha.add(new JLabel("/"));
		panelFecha.add(new JTextField(2));
		
		//Panel de datos
		JPanel panelDatos = new JPanel();
		GridLayout gl=new GridLayout (3,2,0,5);
		panelDatos.setLayout(gl);
		panelDatos.add(new JLabel("Nombre:"));
		panelDatos.add(new JTextField(10));
		panelDatos.add(new JLabel("DNI:"));
		panelDatos.add(new JTextField(10));
		panelDatos.add(new JLabel("Fecha de nacimiento:"));
		panelDatos.add(panelFecha);
		
		//Panel de botones 
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout());
		panelBotones.add(new JButton("Aceptar"));
		panelBotones.add(new JButton("Cancelar"));
		
		Container cp=getContentPane();
		cp.add(panelDatos, BorderLayout.CENTER);
		cp.add(panelBotones, BorderLayout.SOUTH);
		
	}
}