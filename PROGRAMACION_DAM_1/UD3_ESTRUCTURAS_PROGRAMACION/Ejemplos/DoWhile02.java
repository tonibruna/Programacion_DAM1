package Ejemplos;

import java.util.Scanner;

public class DoWhile02 { //programa pares o impares

	public static void main(String[] args) {
		
		int i;
		int numero;
		Scanner teclado=new Scanner (System.in);
		do { 
			System.out.print("Dime un número: ");
			numero = teclado.nextInt();
			
			if (numero % 2 == 0) {// comprueba si el número introducido es par 
				System.out.println("Qué bonito es el " + numero);
			} else {
				System.out.println("No me gustan los números impares, adiós.");
			}
		} while (numero % 2 == 0);
	}

}
