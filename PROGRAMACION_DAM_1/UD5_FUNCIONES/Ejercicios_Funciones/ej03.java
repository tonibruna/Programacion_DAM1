package Ejercicios_Funciones;

import java.util.Scanner;

import Ejercicios_Funciones.Biblioteca_Ejercicio_3;

public class ej03 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner (System.in);
		int[] array=new int[10];
		int x=0, y=11, z=10;
				
		array=Biblioteca_Ejercicio_3.generaArrayInt(x,y,z);//x,y,z representan a los atributos de (limiteinferior,limitesuperior,tamanoarray)
		for (int i=0;i<10;i++) {
			System.out.print(" |"+array[i]+"| ");			
		}
		int minimo=Biblioteca_Ejercicio_3.minimoArrayInt(array);//Este array es el resultado de arriba
		System.out.println("\nEl minimo es: "+minimo);
		
		int maximo=Biblioteca_Ejercicio_3.maximoArrayInt(array);
		System.out.println("El maximo es: "+maximo);
		
		double media=Biblioteca_Ejercicio_3.mediaArrayInt(array);
		System.out.println("El media es: "+media);
		
		System.out.println("Veamos si tu numero esta en el array");
		System.out.println("Introduce numero: ");
		int numero=teclado.nextInt();
		if (Biblioteca_Ejercicio_3.estaEnArrayInt(array,numero)) {
			System.out.println("El " + numero + " esta en el array");
		} else {
			System.out.println("El " + numero + " no esta en el array");
		}
		System.out.println("¿En que posicion esta el numero que metes?");
		System.out.println("Introduce numero: ");
		numero=teclado.nextInt();
		int[] iguales=new int[10];
		iguales=Biblioteca_Ejercicio_3.posicionEnArray(array,numero);
		System.out.println("El numero se encuentra en la posicion: ");
		for (int i=0;i<10;i++) {
			if (iguales[i]!=0) {
				System.out.print(" "+iguales[i]);	
			}
		}		
		System.out.println(" ");
		
		System.out.println("Ordenamos los numeros del array al reves");
		Biblioteca_Ejercicio_3.volteaArrayInt(array);
		teclado.close();
	}
}