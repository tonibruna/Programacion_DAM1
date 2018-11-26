package Ejemplos;

import java.util.Scanner;

public class CondicionalesLogicos {

	public static void main(String[] args) {
		
		System.out.println("Adivina el número que estoy pensando.");
		System.out.println ("Introduce un número entre el 1 y el 10: "); 
		
		
		Scanner teclado =  new Scanner (System.in);
		int n = teclado.nextInt();
		
		if ((n < 1) || (n > 10)) { 
			System.out.println("El número introducido debe estar en el intervalo 1 - 10."); 
			System.out.println ("Tienes otra oportunidad, introduce un número: "); 
			//Si queremos volver a usar la variable no tenemos que volver a declararla
			n = teclado.nextInt();	
		}
		
		if (n == 2) {
			System.out.println("¡Enhorabuena!, ¡has acertado!");
		} else {
			System.out.println("Lo siento, ese no es el número que estoy pensando.");
		}

	}

}
