package Ejercicios;

import java.util.Scanner;

public class Ejerc4_For_de20 {
	//Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Del 320 al 160 con for:");
		
		for (int i=320;i>=160;i=i-20) {  
			System.out.println(i);
		}

	}

}
