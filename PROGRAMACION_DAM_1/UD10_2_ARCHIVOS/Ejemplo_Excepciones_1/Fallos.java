package Ejemplo_Excepciones_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int matriz[]= new int [5];
		
		//----------------Exception array----------
		try {
			matriz[0]=8;
			matriz[1]=6;
			matriz[2]=4;
			matriz[3]=3;
			matriz[4]=9;
			matriz[5]=1;
		}
		catch (Exception e) {
			System.out.println("Te sales del array");
		}
		for (int i=0; i<5; i++) {
			System.out.println("Posicion "+i+" ="+matriz[i]);
		}	
		
		//-----------IO eXCEPTION---
		int a=5;
		int b=0;
		int c=4;
		try {
			c=a/b;
		}
		catch (ArithmeticException e) {
			System.out.println("Divides por cero");
		}
		System.out.println(c);
		
		//----------Exception de lectura de tipos
		int d;
		System.out.println("leo un numero");
		try {
		d = teclado.nextInt();
		}
		catch(InputMismatchException e) {
		System.out.println("es un numero");
		}
	}
}