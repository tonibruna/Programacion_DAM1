package Ejercicios;

import java.util.Scanner;

public class Ejerc6_Dowhile_de20 {//Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int i=320;
		
		System.out.println("Del 320 al 160 con Do While: ");

		do {
			System.out.println(i);
			i=i-20;
			
		}while(i>=160);

	}

}
