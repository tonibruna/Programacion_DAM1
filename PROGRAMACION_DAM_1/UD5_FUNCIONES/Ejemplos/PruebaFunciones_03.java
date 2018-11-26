package Ejemplos;

import EjemploMatematicas_03.*;

import java.util.*;

public class PruebaFunciones_03 {

	public static void main(String[] args) {
		
		Scanner teclado =new Scanner (System.in);
		int n;
		
		// Prueba esPrimo()
		System.out.print("Introduzca un numero entero positivo: ");
		n = teclado.nextInt();
		
		if (EjemploMatematicas_03.Varias.esPrimo(n)) {
			System.out.println("El " + n + " es primo.");
		} else {
			System.out.println("El " + n + " no es primo.");
		}
		
		// Prueba digitos()
		System.out.print("Introduzca un numero entero positivo: ");
			n = teclado.nextInt();
		System.out.println(n + " tiene " + Varias.digitos(n) + " digitos.");
		
		// Prueba volumenCilindro()
		double r, h;
		System.out.println("C�lculo del volumen de un cilindro");
		System.out.print("Introduzca el radio en metros: ");
		r = teclado.nextInt();
		System.out.print("Introduzca la altura en metros: ");
		h = teclado.nextDouble();
		System.out.println("El volumen del cilindro es " + Matematicas.volumenCilindro(r, h) + " m3");
		teclado.close();
	}
	
}
