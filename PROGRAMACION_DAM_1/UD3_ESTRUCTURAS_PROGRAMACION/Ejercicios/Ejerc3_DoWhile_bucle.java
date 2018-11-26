package Ejercicios;
import java.util.Scanner;
public class Ejerc3_DoWhile_bucle {//Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		
		int i=0;
		
		System.out.println("Primos de 5 del 1 al 100 con Do While: ");

		do {
			System.out.println(i);
			i=i+5;
			
		}while(i<=100);
	}

}
