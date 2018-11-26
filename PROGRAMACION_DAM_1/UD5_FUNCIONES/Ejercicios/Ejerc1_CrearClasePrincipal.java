package Ejercicios;

import java.util.Scanner;

public class Ejerc1_CrearClasePrincipal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
	
		int a = 5;
		int b= 15;
		int suma, resta, multiplicar;
		double dividir;
		int factorial, n;
		
		int [] array= new int [4];
		array[0]=5;
		array[1]=4;
		array[2]=8;
		array[3]=6;
		
		
		sumaEnteros (a,b);
		
		suma=sumaEnteros2 (a,b);
		System.out.println("suma enteros es: "+suma);
		
		resta=restarEnteros (a,b);
		System.out.println("resta enteros es: "+resta);
		
		multiplicar=multiplicarEnteros (a,b);
		System.out.println("multiplicar enteros es: "+multiplicar);
		
		dividir=dividirDecimales (a,b);
		System.out.println("dividir decimales es: "+dividir);
		
		n=teclado.nextInt();
		factorial=calcularFactorial (n);
		System.out.println("el factorial de n es: "+factorial);
		
	    int Array=sumarArray (array);
		System.out.println("el array tiene valor de: "+Array);
		
		int lista=sumarLista (array);
		System.out.println("la suma de las listas es: "+lista);
	teclado.close();
	}

	//Para mostrar sin devolver 
	public static void sumaEnteros (int x, int y) {
		int resultado=x+y;
		System.out.println("suma enteros es (void): "+resultado);
	}
	
	//Para devolver resultado al main
	public static int sumaEnteros2 (int x, int y) {
		int resultado=x+y;
		return resultado;
	}
	
	public static int restarEnteros (int x, int y) {
		int resultado=x-y;
		return resultado;
	}
	
	public static int multiplicarEnteros (int x, int y) {
		int resultado=x*y;
		return resultado;
	}
	
	public static double dividirDecimales (int a, double y) {
		double resultado=a/y;
		return resultado; 
	}
	
	public static int calcularFactorial (int n) {
		int resultado=1;
		for (int i=1; i<n; i++) {
			resultado=resultado*i;
		}
		return resultado;
	}
	
	public static int sumarArray (int [] x) {
		int resultado=0;
		for(int i:x) {
			resultado=resultado+i;
		}
		return resultado;
	}
	
	public static int sumarLista (int [] z) {
		int resultado=0;
		for(int i:z) {
			resultado=resultado+i;
		}
		return resultado;
	}

}

