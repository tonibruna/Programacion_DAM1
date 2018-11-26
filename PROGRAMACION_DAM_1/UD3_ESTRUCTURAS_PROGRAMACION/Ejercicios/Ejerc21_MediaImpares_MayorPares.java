package Ejercicios;

import java.util.Scanner;

public class Ejerc21_MediaImpares_MayorPares {/*Realiza un programa que vaya pidiendo 
n�meros hasta que se introduzca un numero negativo y nos diga cuantos 
n�meros se han introducido, la media de los impares y el mayor de los pares. 
El n�mero negativo s�lo se utiliza para indicar el final 
de la introducci�n de datos pero no se incluye en el c�mputo.*/

	public static void main(String[] args) {
		
		System.out.println("Introduce numeros para calcular la media de los impares y el mayor de los pares: ");
		Scanner teclado=new Scanner (System.in);
		int numeroIntroducido = 0;
		int cuentaNumeros = 0; 
		int mediaImpar;
		int numeroImpar=0;
		int sumaImpar=0;
		int mayorPar=0;
		int mod;
		
		while (numeroIntroducido >= 0) {
			numeroIntroducido = teclado.nextInt();
			cuentaNumeros++;
			mod=numeroIntroducido%2;
			if(mod==0){
				
		        if (numeroIntroducido>mayorPar){
	        		  mayorPar=numeroIntroducido;
	        	}
			}
		        if(mod==1){
		         
		        	  sumaImpar=sumaImpar+numeroIntroducido;
				      numeroImpar=numeroImpar+1;
		        }			
		}
		mediaImpar=sumaImpar/(numeroImpar);
		System.out.println("Has introducido " + (cuentaNumeros - 1) + " n�meros positivos.");
		System.out.println("La media de los impares es " + (mediaImpar));
		System.out.println("El mayor numero par es: "+mayorPar);
		teclado.close();
	}

}
