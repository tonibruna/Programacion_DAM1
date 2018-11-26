package Ejercicios;

import java.util.Scanner; 

public class Ejerc9_NumDigitos_2 {
	//Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.

	public static void main(String[] args) {
		
		System.out.println("Introduce numero: ");
		
		Scanner teclado = new Scanner (System.in);
		String clave = teclado.nextLine();
	
		System.out.println ("El numero tiene "+clave.length()+" digitos"); 
		//la funcion clave lenght vale para contar caracteres

	}

}
