package Ejercicios_Funciones;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner (System.in);
		sumarEnteros(6,7);
		
		int resultado=sumarEnteros(6,7,9);
		System.out.println("La suma de los 3 valores es: "+resultado);
		
		resultado=restarEnteros(10,7);
		System.out.println("La resta de los 2 valores es: "+resultado);
		
		double resultado2=dividirDecimales(18,7);
		System.out.println("La divison es: "+resultado2);
		
		System.out.println("Introduce n�mero para calcular factorial: ");
		int navidad=teclado.nextInt();
		resultado=calcularFactorial(navidad);
		System.out.println("El factorial es: "+resultado);	
		System.out.println("Introduce 10 numeros por teclado: ");
		int[] num=new int[10];	
		for (int i=0;i<10;i++) {
			num[i]=teclado.nextInt();
		}
		resultado=sumarArray(num);
		System.out.println("La suma del array es: "+resultado);
		sumarLista(num);
		teclado.close();
	}
	
	//*************PROCEDIMIENTOS Y FUNCIONES*************************

	//SUMAR ENTEROS VOID
	public static void sumarEnteros (int x, int y) {
		
		int resultado=x+y;		
		System.out.println("La suma de los 2 valores es: "+resultado);
		
	}
	
	//SUMAR ENTEROS INT
	public static int sumarEnteros (int x, int y, int z) {
		
		int resultado=x+y+z;
		return resultado;
	}
	//RESTAR ESNTEROS
	public static int restarEnteros (int x, int y) {
		
		int resultado=x-y;	
		System.out.println("La resta de los 2 valores es: "+resultado);
		return resultado;		
	}
	//DIVIDIR DECIMALES 
	public static double dividirDecimales (double x, double y) {
		
		double resultado=x/y;
		return resultado;		
	}
	//CALCULAR FACTORIAL
	public static int calcularFactorial (int x) {
		
		int factorial=1;
		while ( x!=0) {
			  factorial=factorial*x;
			  x--;
		}
		return factorial;	
	}
	//SUMAR ARRAY
	public static int sumarArray (int[] x) {
			
		int suma=0;
		for (int n:x) {
			suma=suma+n;
		}
		return suma;	
	}
	//SUMAR LISTA
	public static void sumarLista (int[] x) {
		
		int suma=0;
		for (int n:x) {
			suma=suma+n;
		}	
		System.out.println("La suma de la lista es: "+suma);
	}

}
