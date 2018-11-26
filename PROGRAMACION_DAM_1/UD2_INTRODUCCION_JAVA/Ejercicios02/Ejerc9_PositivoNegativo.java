package Ejercicios02;

import java.util.Scanner;

public class Ejerc9_PositivoNegativo {
	//Realice un algoritmo para determinar si un número es positivo o negativo

	public static void main(String[] args) {
		
		      Scanner teclado=new Scanner(System.in);
       
		      System.out.println("Ingresa un numero");
		      int n= teclado.nextInt();
		      
		      if(n==0){
		      System.out.println("El numero "+n+" es 0");
		      
		      } else{
		          if(n>0){
		              System.out.println("El numero "+n+" es positivo");
		              
		          }else{
		          System.out.println("El numero "+n+" es negativo");
		          
		          }
		      }   
		      teclado.close();
	}
}