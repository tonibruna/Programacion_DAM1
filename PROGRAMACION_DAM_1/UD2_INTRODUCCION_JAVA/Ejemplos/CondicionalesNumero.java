package Ejemplos;
import java.util.*;
public class CondicionalesNumero {

	public static void main(String[] args) {
		
		System.out.println("Introduce un numero entero: ");
		
		Scanner teclado= new Scanner (System.in);
		int x=teclado.nextInt();
		
		if(x<0) {
			System.out.println("El numero es negativo");
		}
		else {
			System.out.println("El numero es positivo");
		}
	}

}
