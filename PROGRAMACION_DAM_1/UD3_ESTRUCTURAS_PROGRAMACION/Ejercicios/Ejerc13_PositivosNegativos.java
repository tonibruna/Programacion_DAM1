package Ejercicios;

import java.util.Scanner;

public class Ejerc13_PositivosNegativos { /*Escribe un programa que lea una lista de diez números y determine cuántos son positivos, 
	y cuántos son negativos.*/

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int positivos, negativos;
		
		positivos=0;
		negativos=0;
	
		for (int i=1;i<=10;i++) {
			System.out.println("Introduce diez numeros:");
			int n = teclado.nextInt();
			
				if(n>0){
					positivos=positivos+1;
				}else {
					negativos=negativos+1;
			}
		}
		System.out.println("Has metido " + positivos + " numeros positivos.");
		System.out.println("Has metido " + negativos + " numeros negativos.");
	}
}
