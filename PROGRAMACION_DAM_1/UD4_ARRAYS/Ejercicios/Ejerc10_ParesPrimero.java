package Ejercicios;

import java.util.Scanner;

public class Ejerc10_ParesPrimero {/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 
    y que los almacene en un array. El programa debe ser capaz de pasar todos los números pares a las primeras
	posiciones del array (del 0 en adelante) y todos los números impares a las celdas restantes.
	Utiliza arrays auxiliares si es necesario.*/

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int [] array=new int [20];
		int [] par=new int [20];
		int [] impar=new int [20];
		
		int pares=0;
		int impares=0;
		
		for(int i=0;i<20;i++) {
			array[i]=((int)(Math.random()*100+1));
			
			if(array[i] % 2 == 0) {
			par [pares++]=array[i];
		}else {
			impar [impares++]=array[i];
		}
	}
		System.out.println("Valores iniciales:");
		for(int i=0;i<20;i++) {
			System.out.print(" "+array[i]);
		}
		
		for (int i=0;i<pares;i++) {
			array[i]=par[i];
		}
		
		 for (int i=pares;i<20;i++) {
		      array[i] = impar[i - pares];
		    }
		 
		 System.out.println();
		 System.out.println("\nValores con pares al inicio:");
			for(int i=0;i<20;i++) {
				System.out.print(" "+array[i]);
			}
	teclado.close();
  }
}
