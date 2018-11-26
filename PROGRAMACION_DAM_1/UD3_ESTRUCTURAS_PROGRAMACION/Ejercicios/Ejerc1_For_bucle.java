package Ejercicios;
import java.util.Scanner;

public class Ejerc1_For_bucle {//Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Primos de 5 del 1 al 100 con for:");
		
		for (int i=0;i<=100;i=i+5) {  
			System.out.println(i);
		}
	}
	
}