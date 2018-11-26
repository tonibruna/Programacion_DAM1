package Ejercicios;

import java.util.Scanner;

public class Ejerc9_ParImpar {/*Realiza un programa que pida 8 números enteros y que luego muestre esos números junto con
la palabra "par" o "impar" según proceda*/

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int [] numero=new int [8];
		
		System.out.println("Introduce 8 numeros por teclado: ");
		for (int i=0;i<8;i++) {
			System.out.println("El "+(i + 1)+ " numero es ");
			numero[i]=teclado.nextInt();
		}
		
		for (int i=0;i<8;i++) {
			if (numero[i] %2 == 0) {
				System.out.println(numero[i]+" PAR");
			} else {
				System.out.println(numero[i]+" IMPAR");
			}
		}
		teclado.close();
	}

}
