package Ejercicios;

import java.util.Scanner;

public class Ejerc6_RotarElementos { /*Escribe un programa que lea 15 n�meros por teclado y que los almacene en un array.
Rota los elementos de ese array,es decir, el elemento de la posici�n 0 debe pasar a la posici�n 1, el de la  1  a  la  2,  etc.
El  n�mero  que  se  encuentra  en  la  �ltima  posici�n  debe  pasara  la  posici�n  0. 
Finalmente, muestra el contenido del array.*/

	public static void main(String[] args) {
	
		Scanner teclado=new Scanner(System.in);
		
		int [] numero= new int [15];
		int aux=0;
		
		System.out.println("Introduce 15 numeros por teclado: ");
		for(int i=0;i<15;i++) {
			System.out.println("El "+(i + 1)+ " numero es ");
			numero [i]=teclado.nextInt();
		}
			aux=numero[14];
			for(int i=14;i>0;i--) {
				numero[i]=numero[i]-1;
			}
			numero[0]=aux;
			for(int i=0;i<15;i++) {
				System.out.println("El "+(i + 1)+ " numero es "+numero[i]);
				}
			teclado.close();
	}
}
