package Ejercicios;

import java.util.Scanner;

public class Ejerc7_CajaFuerte_2 {/*Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un n�mero de 4 cifras. 
El programa nos pedir� la combinaci�n para abrirla. Si no acertamos, se nos mostrar� el mensaje 
�Lo siento, esa no es la combinaci�n� y si acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�. 
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
					System.out.println("Lo siento, esa no es la combinaci�n");
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
