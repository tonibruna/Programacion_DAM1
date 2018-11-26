package Ejercicios;

import java.util.Scanner;

public class Ejerc10_Media_numPositivo {
	/*Escribe un programa que calcule la media de un conjunto de números positivos introducidos por 
 teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha
 terminado de introducir los datos cuando meta un número negativo.*/

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
	    
	    System.out.println("Has introducido " +(contador-1) + " números positivos.");
		System.out.println("La media total de ellos es " + (suma/(contador-1)));
	}
}