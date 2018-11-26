package Ejercicios;

import java.util.Scanner;

public class Ejerc11_PrimosPrimero {/*Realiza  un  programa  que  pida  10  números  por  teclado  y  que  los  almacene  en  un array.
	A continuación se mostrará el contenido de ese array junto al índice (0 -9) utilizando para ello una tabla. 
	Seguidamente el programa pasará los primos a las primeras posiciones, desplazando el 
	resto de números (los que no son primos) de tal forma que no se pierda ninguno. 
	Al final se debe mostrar el array resultante.*/

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int [] numero=new int [10];
		int [] primos=new int[10];
		
		System.out.println("Introduce 10 numeros por teclado: ");
		for (int i=0;i<10;i++) {
			System.out.println("Introduce valor de la posicion "+i+" del array :");
			numero[i]=teclado.nextInt();
		}
		int cont=0; //contador filas
		
		int num=0; //variable para dividir los numeros
		int cont2=0; //contador para numeros primos
		int contarray=0; //contador para las posiciones del array
		
		for (int i=0;i<10;i++) {
			
			for (num=numero[i];num>1;num--) {
			if (numero[i]%num==0 ){
				cont2=cont2+1;
			}
		}
			if (cont2==1) {
				primos[contarray]=numero[i];
				contarray++;
				cont2=0;
			}else {
				cont2=0;
		}
	}
		
		for (int i=0;i<10;i++) {
			
			
			for (num=numero[i];num>1;num--) {
			if (numero[i]%num==0 ){
				cont2=cont2+1;
			}
		}
			if (cont2>1) {
				primos[contarray]=numero[i];
				contarray++;
				cont2=0;
			}else {
				cont2=0;
		}
			
	}
		for (int i=0;i<10;i++) {
			System.out.print(cont+"|");
			System.out.print(primos[i]+"        "+ cont+"|"+ numero[i]);
			System.out.println();
			cont++;
		}
		teclado.close();
	}
}
