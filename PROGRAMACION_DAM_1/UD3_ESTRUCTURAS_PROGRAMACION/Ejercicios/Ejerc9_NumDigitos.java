package Ejercicios;

import java.util.Scanner;

public class Ejerc9_NumDigitos {
	//Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.

	public static void main(String[] args) {
		
		Scanner teclado =  new Scanner (System.in);
		
		int n;
		int digitos=0;
		int contador=0;
		
		System.out.println("Introduce un numero: ");
		n=teclado.nextInt();
		
		while (n!=0){
			n=n/10;
			contador=contador+1;
			
		}
		
		System.out.println("El numero tiene estos digitos:"+contador);
		teclado.close();
	}

}
