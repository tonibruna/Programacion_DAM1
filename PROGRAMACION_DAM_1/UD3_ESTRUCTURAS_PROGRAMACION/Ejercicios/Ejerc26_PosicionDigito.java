package Ejercicios;

import java.util.Scanner;

public class Ejerc26_PosicionDigito {
/*Realiza un programa que pida primero un n�mero y a continuaci�n un d�gito. 
El programa nos debe dar la posici�n (o posiciones) 
contando de izquierda a derecha que ocupa ese d�gito en el n�mero introducido.*/
	
	public static void main(String[] args) {
		
		System.out.println("Introduce numero y a continuacion un digito: ");
		Scanner teclado = new Scanner (System.in);
		String numero = teclado.nextLine();		
		System.out.println ("El digito esta "+numero.length()+" posiciones a la derecha");
		teclado.close();

	}

}
