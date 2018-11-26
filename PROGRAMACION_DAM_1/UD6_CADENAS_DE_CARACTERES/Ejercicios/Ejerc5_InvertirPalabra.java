package Ejercicios;

import java.util.Scanner;

public class Ejerc5_InvertirPalabra {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner (System.in);
		String frase;
		System.out.println("Escribe una frase: ");
		frase = teclado.nextLine();
		int numPosiciones=frase.length();
		char invertida[]=frase.toCharArray();	
		for (int i=numPosiciones-1;i>=0;i--) {
			System.out.print(invertida[i]);			
		}
		teclado.close();
	}

}
