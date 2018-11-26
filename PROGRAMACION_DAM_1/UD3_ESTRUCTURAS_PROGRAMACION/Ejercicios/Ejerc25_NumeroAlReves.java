package Ejercicios;

import java.util.Scanner;

public class Ejerc25_NumeroAlReves {
/*Realiza un programa que pida un número por teclado 
y que luego muestre ese número al revés.*/

	public static void main(String[] args) {
		System.out.print("Introduzca numero: ");
		Scanner teclado=new Scanner (System.in);
		int numeroIntroducido=teclado.nextInt();
		int numero = numeroIntroducido;
		int volteado=0;		
		while (numero>0) {
			volteado=(volteado*10)+(numero%10);
			numero=numero/10;
		}		
		System.out.println("El número es: "+volteado);		
		teclado.close();
		

	}

}
