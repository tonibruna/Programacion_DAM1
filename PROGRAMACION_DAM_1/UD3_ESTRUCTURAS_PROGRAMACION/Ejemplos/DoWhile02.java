package Ejemplos;

import java.util.Scanner;

public class DoWhile02 { //programa pares o impares

	public static void main(String[] args) {
		
		int i;
		int numero;
		Scanner teclado=new Scanner (System.in);
		do { 
			System.out.print("Dime un n�mero: ");
			numero = teclado.nextInt();
			
			if (numero % 2 == 0) {// comprueba si el n�mero introducido es par 
				System.out.println("Qu� bonito es el " + numero);
			} else {
				System.out.println("No me gustan los n�meros impares, adi�s.");
			}
		} while (numero % 2 == 0);
	}

}
