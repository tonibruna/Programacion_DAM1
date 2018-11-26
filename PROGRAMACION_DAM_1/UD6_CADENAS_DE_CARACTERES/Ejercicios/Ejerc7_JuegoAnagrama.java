package Ejercicios;

import java.util.Scanner;

public class Ejerc7_JuegoAnagrama {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner (System.in);
		String frase;
		System.out.println("Escribe una frase: ");
		frase = teclado.nextLine();
		char fraseArray[]=frase.toCharArray();	
		int longitud=frase.length();int aleatorio1, aleatorio2; char aux;
		
		do {
			for (int i=0;i<longitud;i++) {
				aleatorio1=(int)(Math.random()*longitud);
				aleatorio2=(int)(Math.random()*longitud);
				aux=fraseArray[aleatorio1];
				fraseArray[aleatorio1]=fraseArray[aleatorio2];
				fraseArray[aleatorio2]=aux;					
			}
		} while (frase.isEmpty());
		for (int i=0;i<longitud;i++) {
			System.out.print(fraseArray[i]);
		}
		teclado.close();
	}

}
