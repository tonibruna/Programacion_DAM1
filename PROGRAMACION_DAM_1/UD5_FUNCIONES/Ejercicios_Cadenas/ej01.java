package Ejercicios_Cadenas;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
	
		Scanner teclado=new Scanner (System.in);
		
		String respuesta;
		System.out.println("Escribe una frase palabra por palabra hasta poner la palabra fin");
		do {
			respuesta = teclado.nextLine();
			System.out.print(respuesta+" ");
			
		} while (respuesta.equals("fin"));
	}

}
