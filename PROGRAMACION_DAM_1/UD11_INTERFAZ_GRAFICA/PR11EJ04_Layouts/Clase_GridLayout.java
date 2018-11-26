package PR11EJ04_Layouts;

import java.awt.*;

import javax.swing.*;

public class Clase_GridLayout {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoGridLayout_ m=new MarcoGridLayout_();
		m.setSize (700,400);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible (true);
	}

}

class MarcoGridLayout_ extends JFrame {
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	
	//constructor 
	
	public MarcoGridLayout_() {
		
		setTitle ("Botones en rejilla");
		
		setLayout (new GridLayout (2,4,10,10));
		
		b1= new JButton ("1");
		b2= new JButton ("2");
		b3= new JButton ("3");
		b4= new JButton ("4");
		b5= new JButton ("5");
		b6= new JButton ("6");
		b7= new JButton ("7");
		b8= new JButton ("8");

		
	
		add(b8);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		
		
		
	}
	
}
