package Ejercicios;

import java.util.Scanner;

public class Ejerc1_PalabraConEspacios {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
        String palabra; 
        String frase=" ";
		
		do {
			System.out.println("Escribe una palabra: ");
			palabra = teclado.nextLine();
			if (!palabra.equals("fin"))
				frase = frase +" "+palabra;
		}while (!palabra.equals("fin"));
		
		System.out.println(frase);
		
		teclado.close();
	}  
}
