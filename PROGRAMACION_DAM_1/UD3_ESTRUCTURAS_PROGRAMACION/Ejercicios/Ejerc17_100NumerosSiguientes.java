package Ejercicios;

import java.util.Scanner;

public class Ejerc17_100NumerosSiguientes { /*Realiza un programa que sume los 100 números siguientes a un número entero y 
positivo introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un número positivo).*/

	public static void main(String[] args) {
		
		int numeroIntroducido=0;
		int suma=0;
		
		Scanner teclado= new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un numero entero positivo:");
			numeroIntroducido=teclado.nextInt();
			
			if(numeroIntroducido<0) {
			System.out.println("El numero introducido es negativo");
            }
		  } while (numeroIntroducido < 0);
		
			for(int i=numeroIntroducido;i<numeroIntroducido+100;i=i+1) {
				suma+=i;
			}
		
		
			
		System.out.println("La suma de los 100 numeros siguientes de " +numeroIntroducido+ " son "+suma);

	
	}
}
