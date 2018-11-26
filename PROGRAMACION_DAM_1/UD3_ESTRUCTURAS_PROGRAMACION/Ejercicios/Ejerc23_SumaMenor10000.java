package Ejercicios;

import java.util.Scanner;

public class Ejerc23_SumaMenor10000 {
/*Escribe un programa que permita ir introduciendo una serie indeterminada 
de números mientras su suma no supere el valor 10000. 
Cuando esto último ocurra, se debe mostrar el total acumulado, 
el contador de los números introducidos y la media.*/

	public static void main(String[] args) {
		
		System.out.println("Introduce numeros: ");
		Scanner teclado=new Scanner (System.in);
		int numeroIntroducido = 0;
		int cuentaNumeros = 0; 
		int suma = 0;
		int division;
		while (suma <=10000) {
			numeroIntroducido = teclado.nextInt();
			suma=suma+numeroIntroducido;
			cuentaNumeros++;
		}
		division=(suma-numeroIntroducido)/(cuentaNumeros - 1);
		System.out.println("El total acumulado es: "+(suma-numeroIntroducido));
		System.out.println("Has introducido " + (cuentaNumeros - 1) + " números.");
		System.out.println("La media es " + (division));
		teclado.close();

	}

}
