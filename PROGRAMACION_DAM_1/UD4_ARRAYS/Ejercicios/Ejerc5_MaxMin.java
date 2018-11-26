package Ejercicios;

import java.util.Scanner;

public class Ejerc5_MaxMin {/*Escribe un programa que pida 10 números por teclado y que luego muestre los números
	introducidos junto con las palabras "máximo" y "mínimo" al lado del máximo y del mínimo
	respectivamente.*/

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int [] numero= new int [10];
		int maximo=0;
		int minimo=0;
		
		System.out.println("Introduce 10 numero por teclado: ");
		for (int i=0;i<10;i++) {
			System.out.println("El "+(i + 1)+ " numero es ");
			numero[i]=teclado.nextInt();
			
			if ( i == 0){
		        maximo=numero[i];
		        minimo=numero[i];
		      }
			if (numero[i] < minimo){
				minimo=numero[i];
		      }
		      if (numero[i] > maximo){
		        maximo=numero[i];
		      }
           }
		      for(int i = 0; i <10; i++){
		          if (numero[i] == minimo){
		            System.out.println(numero[i] + "\tMINIMO");
		          }
		          if (numero[i] == maximo){
		            System.out.println(numero[i] + "\tMAXIMO");
		          }else{
		            System.out.println(numero[i]);
		          }
		}
		teclado.close();
	}

}
