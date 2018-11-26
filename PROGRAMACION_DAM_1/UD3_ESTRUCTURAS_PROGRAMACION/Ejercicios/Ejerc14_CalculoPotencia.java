package Ejercicios;

import java.util.Scanner;

public class Ejerc14_CalculoPotencia { /*Escribe  un  programa  que  pida  una  base  y  un  exponente  (entero  positivo)  y  
que  calcule la  potencia.(usar  pow  de Math)*/

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Vamos a calcular la potencia");
		
		System.out.println("Dame la base:");
		int base=teclado.nextInt(); 
		System.out.println("Dame el exponente:");
		int exponente=teclado.nextInt();
		int potencia;
		potencia= (int) Math.pow (base,exponente);
		System.out.println("El resultado de la potencia es: "+potencia);
		
		

	}

}
