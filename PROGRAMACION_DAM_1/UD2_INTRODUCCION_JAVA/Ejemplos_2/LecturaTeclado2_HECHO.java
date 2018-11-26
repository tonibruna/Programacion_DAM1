package Ejemplos_2;
import java.util.*;


public class LecturaTeclado2_HECHO {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		 
		Scanner teclado = new Scanner(System.in); 
		// definimos un objeto teclado para lectura de datos 
		int entero; 
		float decimales; 
		String mitexto,mitexto2; 
		// vamos a leer diferentes tipos de datos 
		System.out.println("dame un entero;"); 
		entero=teclado.nextInt(); 
		System.out.println("dame un numero con decimales"); 
		decimales=teclado.nextFloat(); 
		/* mitexto=teclado.nextLine(); */
		/* si se leen texto despues de otros datos hay que quitar el /n mediante nextLine*/ 
		System.out.println("dame un texto"); 
		mitexto=teclado.nextLine();
		System.out.println("el entero fue:"+entero); 
		System.out.println("el decimal fue:"+decimales); 
		System.out.println("el texto fue:"+mitexto); 
		} 
	} 


	