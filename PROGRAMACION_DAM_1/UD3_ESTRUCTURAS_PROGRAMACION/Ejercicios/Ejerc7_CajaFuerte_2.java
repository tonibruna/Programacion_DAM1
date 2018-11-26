package Ejercicios;

import java.util.Scanner;

public class Ejerc7_CajaFuerte_2 {/*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. 
El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje 
“Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. 
Tendremos cuatro oportunidades para abrir la caja fuerte.*/

	public static void main(String[] args) {
		
       System.out.println("Introduce clave: ");
		
       System.out.println("Introduce clave: ");
		Scanner teclado = new Scanner (System.in);
		String clave;
		boolean clavecorrecta=false;
		int i=4;
		do {
			System.out.println("Te quedan "+i+" intentos");
			clave = teclado.nextLine();
			if (clave.length()==4){
				 
				if (clave.equals("1234")) {
					System.out.println("La caja fuerte se ha abierto satisfactoriamente");
					clavecorrecta=true;
				}else {
					System.out.println("Lo siento, esa no es la combinación");
				}		 
			}else {
				System.out.println("El numero tiene que tener 4 digitos");
			}			
			i--;
		} while ((clavecorrecta==false)&&(i!=0));
		if (i==0) {
			System.out.println("Te has quedado sin intentos");
		}
		teclado.close();
	}

}
