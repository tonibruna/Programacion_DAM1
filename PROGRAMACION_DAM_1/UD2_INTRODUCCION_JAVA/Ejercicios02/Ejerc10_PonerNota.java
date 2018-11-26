package Ejercicios02;

import java.util.Scanner;

public class Ejerc10_PonerNota {
	/*Programa para el ejercicio 2 que diga la nota del boletín 
	(insuficiente, suficiente, bien, notable o sobresaliente)*/

	public static void main(String[] args) {
        
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce las 6 notas entre espacios:");
		float nota1=teclado.nextFloat();
		float nota2=teclado.nextFloat();
		float nota3=teclado.nextFloat();
		float nota4=teclado.nextFloat();
		float nota5=teclado.nextFloat();
		float nota6=teclado.nextFloat();
		
		float media=(nota1+nota2+nota3+nota4+nota5+nota6)/6;
		
		System.out.println("La nota media es: "+media);
		
		if ( media < 5 ) {
			System.out.print ("INSUFICIENTE");
		}
		
		if (( media >= 5 ) && ( media <6 )) {
			System.out.println ("SUFICIENTE");
		}
		
		if (( media >=6 ) && ( media <7 )) {
			System.out.println("BIEN");
		}
		
		if (( media >=7 ) && ( media <9 )) {
			System.out.println("NOTABLE");
		}
		
		if ( media >=9 ) {
			System.out.println("SOBRESALIENTE");
		}
		
		teclado.close();
	}

}