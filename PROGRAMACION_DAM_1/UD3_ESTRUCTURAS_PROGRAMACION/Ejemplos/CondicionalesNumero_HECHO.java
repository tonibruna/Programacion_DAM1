package Ejemplos;
import java.util.*;

public class CondicionalesNumero_HECHO {

	public static void main(String[] args) {
		
		System.out.print("Por favor, introduce un n�mero entero: "); 
		
		Scanner teclado =  new Scanner (System.in);
		int x = teclado.nextInt();
		
		//con una sola linea no es obligatorio poner los {}
		
		if (x < 0) { 
			System.out.println("El n�mero introducido es negativo.");

		} else {
			System.out.println("El n�mero introducido es positivo.");
		} 
	}

}
