package Ejemplos;

import java.util.*;

public class CondicionalesTexto_HECHO {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.print("�Cu�l es la capital de Arag�n? "); 
		String respuesta = teclado.nextLine();
		
		if (respuesta.equals("Zaragoza")) { 
			System.out.println("�La respuesta es correcta!");
		} else{
			System.out.println("Lo siento, la respuesta es incorrecta.");
		}

	}

}
