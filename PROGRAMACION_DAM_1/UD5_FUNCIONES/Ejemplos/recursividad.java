package Ejemplos;

import java.util.Scanner;

public class recursividad {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce n�mero para calcular factorial: ");
		int resultado;
		int numero=teclado.nextInt();
		resultado=calcularFactorial(numero);
		System.out.println("El factorial es: "+resultado);	
		teclado.close();
	}
	
	public static int calcularFactorial (int x) {
		
		if (x==0) {	
			return 1;
		}else {
			return x=x*calcularFactorial(x-1);
		}	
	}
}