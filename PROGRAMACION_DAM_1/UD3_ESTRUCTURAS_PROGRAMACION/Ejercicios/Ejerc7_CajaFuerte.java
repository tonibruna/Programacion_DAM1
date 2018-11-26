package Ejercicios;
import java.util.*;
public class Ejerc7_CajaFuerte {/*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. 
El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje 
“Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. 
Tendremos cuatro oportunidades para abrir la caja fuerte.*/

	public static void main(String[] args) {
	
		Scanner teclado =  new Scanner (System.in);
		
		int intentos=0;
		boolean acierto=false;
		
		
        do {
		     System.out.println("Dime la combinacion de la caja.");
		     System.out.println ("Introduce un número de 4 cifras:"); 
		     int n = teclado.nextInt();
		     intentos=intentos+1;
		     if ( n == 2010) {
		    		System.out.println("¡Enhorabuena!, ¡has acertado!");
		    		acierto=true;
		       } else {
		    	    System.out.println("Lo siento, tienes otro intento.");
		       }
		    }while((acierto==false)&&(intentos<4)); 
        teclado.close();
	}
}
		     
      
