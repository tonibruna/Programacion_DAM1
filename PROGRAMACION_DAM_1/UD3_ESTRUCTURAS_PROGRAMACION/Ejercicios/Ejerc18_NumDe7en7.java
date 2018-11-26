package Ejercicios;

import java.util.Scanner;

public class Ejerc18_NumDe7en7 { /*Escribe un programa que obtenga los números enteros comprendidos entre dos números 
introducidos por teclado y validados como distintos, el programa debe empezar por el menor de los enteros introducidos 
e ir incrementando de 7 en 7.*/

	public static void main(String[] args) {
		
		
		int PrimerNumero, SegundoNumero, mayor=0,menor=0;
		
		Scanner teclado= new Scanner(System.in);
		
			System.out.println("Introduzca un numero entero:");
			PrimerNumero=teclado.nextInt();
			System.out.println("Introduzca otro numero entero:");
			SegundoNumero=teclado.nextInt();
			
			if(PrimerNumero==SegundoNumero){
				System.out.println("Los numeros introducidos son identicos");
			   }
			if(PrimerNumero<SegundoNumero) {
				menor=PrimerNumero;
				mayor=SegundoNumero;
			}else {
				mayor=PrimerNumero;
				menor=SegundoNumero;
			}
		do { 
			System.out.println(menor);
			menor=menor+7;
			
			}while(menor<=mayor);
            
	}
		   
}
