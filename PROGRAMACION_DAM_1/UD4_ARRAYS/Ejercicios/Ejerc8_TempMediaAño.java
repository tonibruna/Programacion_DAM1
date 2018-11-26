package Ejercicios;

import java.util.Scanner;

public class Ejerc8_TempMediaAño {
	
	/*Realiza  un  programa  que  pida  la  temperatura  media  que  ha  hecho  en  cada  mes  de  un 
	determinado  a�o  y  que  muestre  a  continuaci�n  un  diagrama  de  barras  horizontales  con  esos datos. 
	Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro car�cter.*/

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		  String[] mes = {
			      "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
			      "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
			    
			    int[] temperatura = new int[12];
			
		for(int i=0;i<12;i++) {
			System.out.println("Introduce la temperatura media de " + mes[i] +" : ");
			temperatura[i]=teclado.nextInt();
		}
		
		
			teclado.close();
	}

}
