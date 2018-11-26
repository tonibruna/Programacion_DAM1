package Ejemplos;
import java.util.*;
public class numerosPrimosConFunciones_02 {

	public static void main(String[] args) {
		
		Scanner teclado =new Scanner (System.in);
		
		System.out.print("Introduzca un numero entero positivo: ");
		int n = teclado.nextInt();
		if (esPrimo(n)) {
			System.out.println("El " + n + " es primo.");
		} else {
			System.out.println("El " + n + " no es primo.");
		}
	
	teclado.close();
}
	
	public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;
	}
}