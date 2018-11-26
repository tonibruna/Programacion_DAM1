package Ejercicios;

import java.util.Scanner;

public class Adicional_NotaMedia {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int [] nota = new int [10];
		
		System.out.println("Introduce 10 notas por teclado: ");
		for (int i=0;i<10;i++) {
			System.out.println("Introduce valor de la posicion "+i+" del array NOTAS:");
			nota[i]=teclado.nextInt();
		}
		System.out.println("Mostramos los NOTAS del array: ");
		for (int i=0;i<10;i++) {
			System.out.println("Posicion de Nota ["+i+"]:"+nota[i]);
	}
		int contador=0; //iniciamos contador para contar cada nota 
		int suma=0; //para recopilar la suma de todas las notas
		for (int i=0;i<10;i++) {
		suma=suma+nota[i];	//la suma va sumando las notas una por una
		contador=contador+1;
		
		}
		int notaMedia=suma/contador;
		System.out.println("La Nota media de estas 10 notas es " +notaMedia);
		teclado.close();
	}
	
}

