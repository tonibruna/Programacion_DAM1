package Ejercicios02;

import java.util.Scanner;

public class Ejerc12_PrecioPorPersona {
	/*"La langosta ahumada” es una empresa dedicada a ofrecer banquetes; sus tarifas son las siguientes: 
	  el costo de platillo por persona es de $95.00, pero si el número de personas es mayor a 200 
	  pero menor o igual a 300, el costo es de $85.00. Para más de 300 personas el costo 
	  por platillo es de $75.00. Se requiere un algoritmo que ayude a determinar el presupuesto que 
	  se debe presentar a los clientes que deseen realizar un evento.*/

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int personas;
		
		System.out.println("Vamos a determinar el precio/persona de esta celebracion: ");
		System.out.println("¿Cuantos comensales habra en este evento?");
		personas=teclado.nextInt();
		
			if ( personas<=200 ) {
				System.out.println("El precio por persona es de 95$");
			}
			if (( personas>200 ) && ( personas<=300 )) {
				System.out.println("El precio por persona es de 85$");
			}
			if ( personas>300 ) { //tambien serviria con else 
				System.out.println("El precio por persona es de 75$");
			}
	}
}