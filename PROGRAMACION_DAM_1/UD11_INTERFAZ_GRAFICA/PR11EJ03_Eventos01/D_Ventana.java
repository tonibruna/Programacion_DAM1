package PR11EJ03_Eventos01;

import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//https://gist.github.com/alvareztech/9022849
public class D_Ventana {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoSaludador_ m=new MarcoSaludador_();
		m.setVisible(true);
		m.setLayout(null);
	}

}

class MarcoSaludador_ extends JFrame implements ActionListener {
	JLabel texto;
	JTextField caja;
	JButton boton;
	
	public MarcoSaludador_() {
		setTitle("Esta Es Una Ventana");                   // colocamos titulo a la ventana
		setSize(700, 400);   
		 setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
	     setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
	     setResizable(false); // colocamos tamanio a la ventana (ancho, alto)
		                           // hacemos que la ventana no sea redimiensionable
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // hacemos que cuando se cierre la ventana termina todo proceso
		texto = new JLabel();
		boton = new JButton();
		
			caja = new JTextField();
		
		texto.setText("Inserte Nombre");    // colocamos un texto a la etiqueta
        texto.setSize(100, 25);
        texto.setLocation(0, 0);
		
        boton.setText("Mostrar Mensaje");   // colocamos un texto al boton
        boton.setBounds(0, 25, 100, 25);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        
        caja.setBounds(0, 50, 200, 50);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        
        
        
        boton.addActionListener(this); 
        add (texto);
        add (boton);
      	add (caja);
		
	}
	
	public void actionPerformed (ActionEvent e) {
		String nombre=caja.getText();
		nombre="Hola"+nombre;
		caja.setText(nombre);
	}



}
