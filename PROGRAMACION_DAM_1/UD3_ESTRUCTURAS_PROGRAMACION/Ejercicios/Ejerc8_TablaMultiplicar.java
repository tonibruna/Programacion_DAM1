package Ejercicios;
import java.util.Scanner;
public class Ejerc8_TablaMultiplicar {//Muestra la tabla de multiplicar de un número introducido por teclado.

	public static void main(String[] args) {
	 
		Scanner teclado= new Scanner(System.in);
		
		int n;
		
		System.out.println("Introduce un numero entero y toca intro");
		n=teclado.nextInt();
		
		System.out.println("Tabla del "+n);
		
		for (int i=0;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}

	}

}
