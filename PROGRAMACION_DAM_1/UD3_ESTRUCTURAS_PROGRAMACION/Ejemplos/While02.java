package Ejemplos;

import java.util.Scanner;

public class While02 {
	/*En el siguiente ejemplo se cuentan y se suman los n�meros que se
	 *  van introduciendo por teclado. Para indicarle al programa que 
	 *  debe dejar de pedir n�meros, el usuario debe introducir un
	 *   n�mero negativo; esa ser� la condici�n de salida del bucle. 
	 *    Observa que el bucle se repite mientras el n�mero introducido 
	 *    sea mayor o igual que cero. */

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner (System.in);
		int numeroIntroducido = 0;
		int cuentaNumeros = 0; 
		int suma = 0;
		while (numeroIntroducido >= 0) {
			suma=suma+numeroIntroducido;
			System.out.println("Introduce un numero entero: ");
			numeroIntroducido = teclado.nextInt();
			cuentaNumeros++; // Incrementa en uno la variable suma += numeroIntroducido;
			// Equivale a suma = suma + NumeroIntroducido
			
			
		}
		System.out.println("Has introducido " + (cuentaNumeros - 1) + " n�meros positivos.");
		System.out.println("La suma total de ellos es " + (suma));

	}

}
