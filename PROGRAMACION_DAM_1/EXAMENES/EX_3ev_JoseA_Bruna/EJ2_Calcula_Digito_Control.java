package EX_3ev_JoseA_Bruna;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EJ2_Calcula_Digito_Control {

	public static void main(String[] args) {
		
		Digito_control dg = new Digito_control ();
		//metemos esto aqui para que no de problemas de visibilidad
		dg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dg.setVisible (true);

	}

}

class Digito_control extends JFrame implements ActionListener {
	
	//Atributos
	JLabel etiqueta,etiqueta2;
	JTextField tEntidad,tSucursal,tDigito,tCuenta;
	JButton boton;
	JButton bBorrar;
	
	public Digito_control() { //Constructor
		setTitle("Comprueba digito control de tu banco");
		setBounds (600,300,600,300);
		setLayout (new BorderLayout ());
		
		//Creamos los paneles para meterlos en el layout
		JPanel Pcentro = new JPanel();
		Pcentro = PanelCentro();
		add(Pcentro,BorderLayout.CENTER);
		
		JPanel Pnorte = new JPanel();
		Pnorte = PanelNorte();
		add (Pnorte, BorderLayout.NORTH);
		
		JPanel Psur = new JPanel ();
		Psur= PanelSur();
		add (Psur, BorderLayout.SOUTH);
		
		boton.addActionListener(this); //Asociamos el Listener al boton
		
		//bBorrar.addActionListener(cbBorrar);
	}
		//metodos para borderlayout
		
		private JPanel PanelCentro() {
			JPanel p= new JPanel();
			
			tEntidad = new JTextField ();
			tEntidad.setText("");
			tEntidad.setPreferredSize(new Dimension(50,30));
			Font fuente=new Font("Dialog", Font.ITALIC, 15);
			tEntidad. setFont ( fuente ) ;
			p.add(tEntidad);
			
			tSucursal = new JTextField ();
			tSucursal.setText("");
			tSucursal.setPreferredSize(new Dimension(50,30));
			Font fuente1=new Font("Dialog", Font.ITALIC, 15);
			tSucursal. setFont ( fuente1 ) ;
			p.add(tSucursal);
			
			tDigito = new JTextField ();
			tDigito.setText("");
			tDigito.setPreferredSize(new Dimension(30,30));
			Font fuente2=new Font("Dialog", Font.ITALIC, 15);
			tDigito. setFont ( fuente2 ) ;
			p.add(tDigito);
			
			tCuenta = new JTextField ();
			tCuenta.setText("");
			tCuenta.setPreferredSize(new Dimension(110,30));
			Font fuente3=new Font("Dialog", Font.ITALIC, 15);
			tCuenta. setFont ( fuente3 ) ;
			p.add(tCuenta);
			
			boton = new JButton();
			boton.setText("Comprueba Digito Control");
			boton.setPreferredSize(new Dimension(200,30));
			boton.setBackground(Color.CYAN);
			p.add(boton);
			
			bBorrar = new JButton();
			bBorrar.setText("Limpiar");
			bBorrar.setPreferredSize(new Dimension(200,30));
			bBorrar.setBackground(Color.CYAN);
			p.add(bBorrar);
			
			return p;
		
		}
		
		private JPanel PanelNorte() {
			JPanel p= new JPanel();
			etiqueta2 = new JLabel();
			etiqueta2.setText("IBERCAJA - ARAGON");
			etiqueta2.setForeground(Color.blue);
			p.add(etiqueta2);
	
			return p;
		}
		
		private JPanel PanelSur() {
			JPanel p= new JPanel();
			etiqueta = new JLabel();
			etiqueta.setText("JOSE ANTONIO BRUNA");
			p.add(etiqueta);
	
			return p;
			
		}
		
		public void actionPerformed(ActionEvent arg0) {//aqui ponemos la accion que debe hacer el boton 
			
			//Creamos los arrays
			int[] nEntidad=new int[4];
			int[] nSucursal=new int[4];
			int[] nCuenta=new int[10];
			
			//Variables para los digitos de control
			int control_1=0;
			int control_2=0;
			
			String cadena = tEntidad.getText();//metemos los caracteres que pongas en el TextField en una variable
			char [] cad= cadena.toCharArray(); //transformar los caracteres de un string en array
			
			for(int i=0;i<4;i++) {//en cada posicion del array
				String c= Character.toString(cad[i]);
				nEntidad[i]=Integer.parseInt(c);//pasamos del array a entero
			}
			
			String cadena1 = tSucursal.getText();
			char [] cad1 = cadena1.toCharArray();
			
			for(int i=0;i<4;i++) {
				String c= Character.toString(cad1[i]);
				nSucursal[i]=Integer.parseInt(c);
			}
			
			String cadena2 = tCuenta.getText();
			char [] cad2 = cadena2.toCharArray();
			
			for(int i=0;i<10;i++) {
				String c= Character.toString(cad2[i]);
				nCuenta[i]=Integer.parseInt(c);
				
				//con esto sacamos el primer digito de control
				nEntidad[0]=nEntidad[0]*4;
				nEntidad[1]=nEntidad[1]*8;
				nEntidad[2]=nEntidad[2]*5;
				nEntidad[3]=nEntidad[3]*10;
				
				nSucursal[0]=nSucursal[0]*9;
				nSucursal[1]=nSucursal[1]*7;
				nSucursal[2]=nSucursal[2]*3;
				nSucursal[3]=nSucursal[3]*6;
				for(i=0;i<4;i++) {
					control_1=control_1+nEntidad[i]+nSucursal[i];
				}
				control_1=control_1%11;
				control_1=11-control_1;
				if (control_1==10){
					control_1=1;
				}
				
				//con esto sacamos el segundo digito de control
				nCuenta[0]=nCuenta[0]*1;
				nCuenta[1]=nCuenta[1]*2;
				nCuenta[2]=nCuenta[2]*4;
				nCuenta[3]=nCuenta[3]*8;
				nCuenta[4]=nCuenta[4]*5;
				nCuenta[5]=nCuenta[5]*10;
				nCuenta[6]=nCuenta[6]*9;
				nCuenta[7]=nCuenta[7]*7;
				nCuenta[8]=nCuenta[8]*3;
				nCuenta[9]=nCuenta[9]*6;
				for(i=0;i<10;i++) {
					control_2=control_2+nCuenta[i];
				}
				control_2=control_2%11;
				control_2=11-control_2;
				if (control_2==10){
					control_2=1;
				}
				
				//Pasamos los enteros a cadena de caracteres
				String dg1 =Integer.toString(control_1); 
				String dg2 = Integer.toString(control_2);
				
				//Devolvemos TextField de digito los valores obtenidos
				tDigito.setText(dg1+dg2);
				
			}	
      }	
}
	
