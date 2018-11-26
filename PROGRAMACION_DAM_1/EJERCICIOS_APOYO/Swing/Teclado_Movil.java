package Swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Teclado_Movil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MiVentana2 m= new MiVentana2();
        
	}

}

class MiVentana2 extends JFrame {
	
	public MiVentana2() {
		super("Titulo de la ventana");
		setVisible(true);
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp =getContentPane();
		GridLayout gl= new GridLayout(4,3);
		gl.setHgap(5); gl.setVgap(5);
		cp.setLayout(gl);
		for(int i=1; i<=9;i++) {
			cp.add(new JButton(String.valueOf(i)));
			
		}
		cp.add(new JButton("*"));
		cp.add(new JButton("0"));
		cp.add(new JButton("#"));
		
	}
}
