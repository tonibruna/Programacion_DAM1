package Ejemplos;
import java.util.Scanner;
public class CondicionalesTexto {

	public static void main(String[] args) {
		
		System.out.println("Cual es la capital de Aragon?");
		Scanner teclado = new Scanner (System.in);
	    String respuesta= teclado.nextLine();

		
		if(respuesta.equals("Zaragoza")) {
			System.out.println("correcto!");
		}
		else {
			System.out.println("Repasa Geografia");
		}

	}

}
