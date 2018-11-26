package Ejercicios;

import java.util.Scanner;

public class Ejerc3_EspaciosEnFrase {

	public static void main(String[] args) {
	
		Scanner teclado= new Scanner(System.in);
		
		String frase;
		int contEspacios=0; 
		char c;
		
		System.out.println("Escribe una frase: ");
		frase=teclado.nextLine();
		
		for (int i=0;i<frase.length();i++) {  //frase.length te muestra la longitud de la frase
			c=frase.charAt(i);           //devuelve el caracter que tiene la posicion i
			if(Character.isSpaceChar(c)) {  //devuelve true si el caracter usado es un espacio
				contEspacios++;
			}
		}
	
		System.out.println("La frase tiene " +contEspacios+ " espacios en blanco.");
		teclado.close();
	}

}
