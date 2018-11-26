package Ejercicios02;

import java.util.Scanner;

public class Ejerc1_SumaNum {
	//Escribe un programa en el que se obtengan la suma de dos números enteros cualesquiera. 

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("dame el primer numero: ");
		int numero1= teclado.nextInt();
		System.out.println("dame el primer numero: ");
		int numero2= teclado.nextInt();
	
		System.out.println("la suma de los dos enteros es: "+(numero1+numero2));

		teclado.close();
	}

}
