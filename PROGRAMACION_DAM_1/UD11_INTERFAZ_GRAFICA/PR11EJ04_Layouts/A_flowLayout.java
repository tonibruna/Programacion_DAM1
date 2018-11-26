package PR11EJ04_Layouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_flowLayout {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		MarcofLayout m= new MarcofLayout();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcofLayout extends JFrame {
	JButton b1, b2, b3;
	
	public MarcofLayout () {
		setTitle ("flow layout");
		setBounds (600,350,600,300);
		
		//creamos el objeto disposicion
		FlowLayout disposicion = new FlowLayout (FlowLayout.CENTER,50,50);
		//cargar el layout en el marco
		setLayout (disposicion);
		
		
		b1= new JButton();
		b1.setText("boton1");
		b2=new JButton();
		b2.setText("boton2");
		b3= new JButton();
		b3.setText("boton3");
		JButton b4 = new JButton ("boton4");
		JButton b5 = new JButton ("boton4");
		JButton b6 = new JButton ("boton4");
		JButton b7 = new JButton ("boton4");
		JButton b8 = new JButton ("boton4");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
		add(b7);
		add(b8);
	}
	
	
}