package Ejemplos;
import java.util.*;


public class numerosPrimosSinFunciones_01 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduce un numero entero positivo: ");
		int n = teclado.nextInt();
		
		boolean esPrimo = true;
		
		for (int i = 2; i < n; i++) {
		if ((n % i) == 0) {
		esPrimo = false;
		}
		}
		if (esPrimo) {
		System.out.println("El " + n + " es primo.");
		} else {
		System.out.println("El " + n + " no es primo.");
		}
		teclado.close();
	}

}
