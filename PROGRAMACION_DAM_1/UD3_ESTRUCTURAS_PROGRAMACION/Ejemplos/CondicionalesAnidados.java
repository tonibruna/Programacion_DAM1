package Ejemplos;
import java.util.*;

public class CondicionalesAnidados { /*El mayor de los numeros introducidos*/

	public static void main(String[] args) {
		
		System.out.println("Introduzca 3 numeros separados por espacios");
		Scanner teclado = new Scanner (System.in);
		int a=teclado.nextInt();
		int b=teclado.nextInt();
		int c=teclado.nextInt();
		int M;
		
		if (a>b) {
			if (a>c) {
				 M = a;				
			}else {
				 M = c;
			}
		}else {
			if (b>c) {
				 M = b;
			}else {
				 M = c;
			}
		}
		System.out.println ("El mayor es "+ M);
		
	}

}
