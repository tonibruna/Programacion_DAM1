package Ejercicios;

import java.util.Scanner;

public class Ejerc7_CambiarValor {/*Escribe  un  programa  que  genere  100  números  aleatorios  del  0  al  20  
y  que  los  muestre  por pantalla  separados  por  espacios. El  programa  pedirá  entonces  por  teclado  dos  valores  y  
a continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente. 
Los números que se han cambiado deben aparecer entrecomillados.*/

	public static void main(String[] args) {
	
		Scanner teclado=new Scanner(System.in);
		
		int [] array=new int [100];
		
		for(int i=0;i<100;i++) {
			array[i]=((int)(Math.random()*20+1));
		}
		for(int i=0;i<100;i++) {
			System.out.print(" "+array[i]);
		}
		System.out.println("\nIntroduzca el valor que quiere cambiar: ");
		int valor1=teclado.nextInt();
		System.out.println("\nIntroduce el valor que lo sustituye ");
		int valor2=teclado.nextInt();
		
		for(int i=0;i<100;i++) {
			if (array[i]==valor1) {
				array [i]=valor2;
				System.out.print("\""+array[i]+"\"");
			}else{
				System.out.print(" "+array[i]+" ");
			}
		
		}
		
teclado.close();
	}

}
