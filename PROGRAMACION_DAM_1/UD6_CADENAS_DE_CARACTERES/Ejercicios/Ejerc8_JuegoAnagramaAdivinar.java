package Ejercicios;

import java.util.Scanner;

public class Ejerc8_JuegoAnagramaAdivinar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		String original;
		System.out.println("Escribe una frase: ");
		original = teclado.nextLine();
		char fraseOriginal[]=original.toCharArray();
		char fraseOriginal2[]=original.toCharArray();
		int longitud=original.length();int aleatorio1, aleatorio2; char aux;
		
		do {
			for (int i=0;i<longitud;i++) {
				aleatorio1=(int)(Math.random()*longitud);
				aleatorio2=(int)(Math.random()*longitud);
				aux=fraseOriginal[aleatorio1];
				fraseOriginal[aleatorio1]=fraseOriginal[aleatorio2];
				fraseOriginal[aleatorio2]=aux;					
			}
		} while (original.isEmpty());
		for (int i=0;i<longitud;i++) {
			System.out.print(fraseOriginal[i]);
		}
		String introducida="";
		boolean coincide=false;
		do {
			System.out.println("");
			introducida = teclado.nextLine();				
			for (int i=0;i<longitud;i++) {
				coincide=original.regionMatches(i, introducida, i, 1);	
				if (coincide==true) {							
					System.out.print(fraseOriginal2[i]+" ");
				}else {
					System.out.print("_ ");
				}
			}			
		} while (!introducida.equals(original));
		teclado.close();
	}

}
