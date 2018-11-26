package Ejercicios;

import java.util.Scanner;

public class Ejerc12_Fibonacci {/*Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. 
El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, 
por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado*/

	public static void main(String[] args) {
	
		Scanner teclado=new Scanner (System.in);
		
		int numero, fibo1,fibo2,i;
		
		do {
			System.out.print("Introduce numero mayor que 1:");
			numero = teclado.nextInt();
		}while(numero<=1);
		
			System.out.println("Los " +numero+ " primeros terminos de Fibonacci son_:");
		
			fibo1=1;
			fibo2=2;
			
			System.out.print(fibo1 + " ");
	        for(i=2;i<=numero;i++){
	             System.out.print(fibo2 + " ");
	             fibo2 = fibo1 + fibo2;
	             fibo1 = fibo2 - fibo1;
	
		}
		System.out.println();
	}

}
