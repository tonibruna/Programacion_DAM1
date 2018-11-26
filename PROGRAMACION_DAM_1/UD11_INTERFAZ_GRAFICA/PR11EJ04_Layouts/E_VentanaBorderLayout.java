package PR11EJ04_Layouts;

import java.awt.*;

import javax.swing.*;

public class E_VentanaBorderLayout {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoBLayout m= new MarcoBLayout ();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBLayout extends JFrame {
		
	public MarcoBLayout () {
		setTitle ("BorderLAyout");
		setBounds (600, 350, 600, 300);
		
		setLayout (new BorderLayout ());
		
		JPanel Pnorte = new JPanel ();
		Pnorte=PanelNorte ();
		add (Pnorte, BorderLayout.NORTH);
		
		JPanel PSur = new JPanel ();
		PSur= PanelSur();
		add (PSur, BorderLayout.SOUTH);
		
		
		JButton b= new JButton ();
		b.setText("hola");
		add (b, BorderLayout.EAST);
		
	}
		
	
	private JPanel PanelNorte () {
			
			JPanel p= new JPanel();
			
			JButton boton= new JButton ();
			boton.setPreferredSize(new Dimension(200,24));
			boton.setText("hola");
			
			JButton boton2= new JButton ();
			boton2.setPreferredSize(new Dimension(200,24));
			boton2.setText("norte");
			
			p.add(boton);
			p.add(boton2);
			
			return p;
			
		}
		
		
private JPanel PanelSur () {
			
			JPanel p= new JPanel();
			
			JButton boton= new JButton ();
			boton.setPreferredSize(new Dimension(200,24));
			boton.setText("hola");
			
			JButton boton2= new JButton ();
			boton2.setPreferredSize(new Dimension(200,24));
			boton2.setText("sur");
			
			p.add(boton);
			p.add(boton2);
			
			return p;
			
		}
		
		
	}
	
	

