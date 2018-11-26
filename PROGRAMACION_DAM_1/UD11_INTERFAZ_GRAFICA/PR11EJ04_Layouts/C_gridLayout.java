package PR11EJ04_Layouts;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_gridLayout {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoGridLayout m = new MarcoGridLayout ();
		m.setSize (700,400);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible (true);
		
	}
}
	 class MarcoGridLayout extends JFrame{
		 JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
		
		
		 public MarcoGridLayout () {
			setTitle ("Calculadora");			//cambia el titulo del marco
			setLayout (new GridLayout(3,3));
			b1=new JButton("1");
			add(b1);
			b2=new JButton("2");
			add(b2);
			b3=new JButton("3");
			add(b3);
			b4=new JButton("4");
			add(b4);
			b5=new JButton("5");
			add(b5);
			b6=new JButton("6");
			add(b6);
			b7=new JButton("7");
			add(b7);
			b8=new JButton("8");
			add(b8);
			b9=new JButton("9");
			add(b9);
			
		}
	}


