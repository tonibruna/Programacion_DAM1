package Ejercicios;
import java.util.*;
public class Ejerc15_Potencias { /*Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), 
saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. No se deben utilizar 
funciones de exponenciación.*/

	public static void main(String[] args) {
		
		System.out.print("Introduzca base: ");
	 	Scanner teclado = new Scanner (System.in);
	    int base = teclado.nextInt();
	    
	    System.out.print("Introduzca exponente: ");
	    int exponenteFijo = teclado.nextInt();

	    int potencia;
	    int exponente;
	        
	    for (int i = 1; i <= exponenteFijo; i++) {
	        
	      potencia = 1;
	      exponente = i;
	      
	      for (int a = 0; a < exponente; a++) {
	        potencia *= base;
	      }
	      
	      System.out.println(base + "^" + i + " = " + potencia);
	    }
	}

}
