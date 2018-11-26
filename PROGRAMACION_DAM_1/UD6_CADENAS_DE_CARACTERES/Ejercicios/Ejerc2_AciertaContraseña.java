package Ejercicios;

import java.util.Scanner;

public class Ejerc2_AciertaContraseña {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		String palabra,passwoord;
		
		System.out.println("Jugador 1, meta la contraseña: ");
		passwoord=teclado.nextLine();
		
		do {
			System.out.println("Prueba tu palabra, jugador 2: ");
			palabra=teclado.nextLine();
			
			int numero=passwoord.compareTo(palabra);
			if (numero>0) {
				System.out.println("La contraseña es mayor que "+palabra);
			}else if(numero<0){
				System.out.println("La contraseña es menor que "+palabra);
			}else {
				System.out.println("Has acertado la contraseña");
			}
			
		}while (!passwoord.equals(palabra));
		teclado.close();
	}

}
