package Ejercicios;

import java.util.Scanner;

public class Ejerc26_PosicionDigito {
/*Realiza un programa que pida primero un número y a continuación un dígito. 
El programa nos debe dar la posición (o posiciones) 
contando de izquierda a derecha que ocupa ese dígito en el número introducido.*/
	
	public static void main(String[] args) {
		
		System.out.println("Introduce numero y a continuacion un digito: ");
		Scanner teclado = new Scanner (System.in);
		String numero = teclado.nextLine();		
		System.out.println ("El digito esta "+numero.length()+" posiciones a la derecha");
		teclado.close();

	}

}
