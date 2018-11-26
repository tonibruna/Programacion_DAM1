package Ejercicios;

import java.util.Scanner;

public class Ejerc19_Piramide {

	public static void main(String[] args) {/*Realiza un programa que pinte una pirámide por pantalla. 
	La altura se debe pedir por teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.*/
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Escribe la altura:");
		int altura=teclado.nextInt();
		System.out.println("Escribe un caracter:");
		String caracter=teclado.next();
		int altura2=altura;
		int piramide=altura;
		
		for(int i=1;i<altura;i++) {
			
			for(int j=1;j<altura2;j++) {
				System.out.print(" ");
			}
			altura2=altura2-1;
			for(int k=1;k<=(i*2-1);k++){
				System.out.print(caracter);
			}
			piramide=piramide*2-1;
			System.out.println(" ");
		}

	}

}
