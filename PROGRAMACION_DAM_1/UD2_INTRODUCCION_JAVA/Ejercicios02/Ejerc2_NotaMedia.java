package Ejercicios02;

import java.util.*;

public class Ejerc2_NotaMedia {
	/*Un estudiante realiza 6 exámenes durante curso, los cuales tienen la misma ponderación. 
	 * Realice el programa que calcule la media de las calificaciones obtenidas.*/
	
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce las 6 notas entre espacios:");
		float nota1=teclado.nextFloat();
		float nota2=teclado.nextFloat();
		float nota3=teclado.nextFloat();
		float nota4=teclado.nextFloat();
		float nota5=teclado.nextFloat();
		float nota6=teclado.nextFloat();
		
		System.out.println("La media es: "+((nota1+nota2+nota3+nota4+nota5+nota6)/6));
	}

}
