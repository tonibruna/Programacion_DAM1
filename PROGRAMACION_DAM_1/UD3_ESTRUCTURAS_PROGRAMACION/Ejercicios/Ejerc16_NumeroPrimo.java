package Ejercicios;

import java.util.Scanner;

public class Ejerc16_NumeroPrimo { /*Escribe un programa que diga si un n�mero introducido por teclado es o no primo. 
Un n�mero primo es aquel que s�lo es divisible entre �l mismo y la unidad.*/

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int contador=0,i,n;
		
		System.out.println("Introduzca un numero:");
		n=teclado.nextInt();
		
		for (i=1;i<(n+1);i++) {
			if(n%1==0) {
				contador++;
			}
		}
		if(contador!=2) {
			System.out.println("No es primo");
		}else {
			System.out.println("Es primo");
		}
		
	}
}
