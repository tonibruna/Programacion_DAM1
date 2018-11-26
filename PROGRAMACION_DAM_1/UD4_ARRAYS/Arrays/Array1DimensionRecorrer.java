package Arrays;

import java.util.Scanner;

public class Array1DimensionRecorrer {

	public static void main(String[] args) {
		
		 Scanner teclado=new Scanner(System.in);
		
		int[] n; //definimos n como un array de enteros
		  n = new int[4];//reservamos espacio en memoria
		
		//otra opcion es hacerlo todo en una linea
		int [] num = new int [10];
		
		System.out.println("Introduce 10 numero por teclado: ");
		for (int i=0;i<10;i++) {
			System.out.println("Introduce valor de la posicion "+i+" del array :");
			num[i]=teclado.nextInt();
		}
		//mostramos los valores del array
		System.out.println("Mostramos los numeros del array: ");
		for (int i=0;i<10;i++) {
			System.out.println("Posicion ["+i+"]:"+num[i]);
		}
		//Podemos hacer operacion con los valores de array
		num[5]=num[1]+num[9];
		num[9]=num[2]/10;
		num[3]=num[0]*5;
		
		//tambien podemos controlar el indice
		int r=5;
		num [(r+3)/2]=num[(r*2)-3];
		
		//mostramos los valores nuevos
		System.out.println("Mostramos los numeros del array: ");
		int suma=0;
		int contador=0;
		for (int i=0;i<10;i++) {
			System.out.println("Posicion ["+i+"]:"+num[i]);
			suma=suma+num[i];
			contador=contador+1;
		}
		int media=suma/contador;
		
	}
	
}
