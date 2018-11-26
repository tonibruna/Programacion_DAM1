package Ejercicios;

import java.util.Scanner;

public class Ejerc11_Columnas {/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros 
a partir de uno que se introduce por teclado.*/

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		
			int numeroIntroducido;
			numeroIntroducido=teclado.nextInt();
			
			for (int i=numeroIntroducido; i<numeroIntroducido+5; i++) {
				
				System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
			}
	}

}
