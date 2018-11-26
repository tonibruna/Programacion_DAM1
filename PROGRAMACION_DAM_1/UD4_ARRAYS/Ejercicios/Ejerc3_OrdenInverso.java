package Ejercicios;

import java.util.Scanner;

public class Ejerc3_OrdenInverso {/*Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso,
	es decir, el primero que se introduce es el último en mostrarse y viceversa*/

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int [] num= new int [10];
		System.out.println("Introduce 10 numero por teclado: ");
		for (int i=0;i<10;i++) {
		System.out.println("Introduce valor de la posicion "+i+" del array :");
		num[i]=teclado.nextInt();
		}
		System.out.println("Mostramos los numeros del array a la inversa: ");
		for (int i=9;i>=0;i--) {
			System.out.println("Posicion ["+i+"]:"+num[i]);
			
		}teclado.close();
	}

}
