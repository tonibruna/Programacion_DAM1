package Ejerc_If_Switch;

import java.util.Scanner;

public class Ejerc1_CifrasNumero {/*Escribir una aplicacion que indique cuantas cifras
tiene un numero introducido por teclado, que estara entre 0 y 99.999*/

	public static void main(String[] args) {
		
System.out.println("Introduce un numero mas bajo que 100.000: ");
		
		Scanner teclado = new Scanner (System.in);
		int numero= teclado.nextInt();
		
		if (numero<10) {
			System.out.println("Es un numero de 1 cifra");
		}
		if ((numero>=10)&&(numero<100)) {
			System.out.println("Es un numero de 2 cifras");
		}
		if ((numero>=100)&&(numero<1000)) {
			System.out.println("Es un numero de 3 cifras");
		}
		if ((numero>=1000)&&(numero<10000)) {
			System.out.println("Es un numero de 4 cifras");
		}
		if ((numero>=10000)&&(numero<100000)) {
			System.out.println("Es un numero de 5 cifras");
			
		}else{ 
			System.out.println("El numero es mayor que 99.999");
		
			teclado.close();
		}
	}
}
