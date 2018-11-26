package Ejercicios;

import java.util.Scanner;

public class Ejerc25_VoltearNumero { //Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.

	public static void main(String[] args) { 
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introducir un numero entero: ");
		int numeroIntroducido=teclado.nextInt();
		int numero = numeroIntroducido;
		int volteado=0;
		
		while (numero>0) {
			volteado = (volteado*10) + (numero %10);
			numero/=10; //igual a numero=numero/10
		} //while
		
		System.out.println("Si le damos la vuelta al "+numeroIntroducido+ " tenemos el "+volteado);

	}

}
