package Ejercicios;

import java.util.Scanner;

public class Ejerc10_Media_numPositivo {
	/*Escribe un programa que calcule la media de un conjunto de n�meros positivos introducidos por 
 teclado. A priori, el programa no sabe cu�ntos n�meros se introducir�n. El usuario indicar� que ha
 terminado de introducir los datos cuando meta un n�mero negativo.*/

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner (System.in);
		
	    double contador = 0;
	    double numeroIntroducido = 0;
	    double suma = 0;

	    System.out.println("Este programa calcula la media de los numeros positivos introducidos");
	    System.out.println("Vaya introduciendo numeros (parar introduciendo un numero negativo):");
	    
	    while (numeroIntroducido>=0) {
	    	suma= suma+numeroIntroducido;
	    	numeroIntroducido = teclado.nextInt();
	    	contador++;
	    	
	    	
	    }
	    
	    System.out.println("Has introducido " +(contador-1) + " n�meros positivos.");
		System.out.println("La media total de ellos es " + (suma/(contador-1)));
	}
}