package Ejemplos_2;

import java.util.Scanner;

public class EjemploSwitch_HECHO {

	public static void main(String[] args) {
	
		System.out.print("Por favor, introduzca un numero de mes: "); 
		/*
		 *  En caso de no encontrarse el break, el programa contin�a la ejecuci�n en la l�nea siguiente.
		 *  El bloque que corresponde al default se ejecuta cuando la variable no coincide con ninguno de los valores de los case.
		 *   Escribiremos siempre el default al final de la sentencia switch aunque no sea necesario.
		 *   La sentencia switch se utiliza con frecuencia para crear men�s.
		 */
		Scanner teclado = new Scanner(System.in); 
		int mes = teclado.nextInt();
		String nombreDelMes;
		switch (mes) {
		case 1: nombreDelMes = "enero"; break;
		case 2:	nombreDelMes = "febrero"; break;
		case 3:	nombreDelMes = "marzo"; break;
		case 4:	nombreDelMes = "abril"; break;
		case 5:	nombreDelMes = "mayo"; break;
		case 6:	nombreDelMes = "junio"; break;
		case 7:	nombreDelMes = "julio"; break;
		case 8:	nombreDelMes = "agosto"; break;
		case 9:	nombreDelMes = "septiembre"; break;
		case 10:nombreDelMes = "octubre"; break;
		case 11: nombreDelMes = "noviembre"; break;
		case 12:nombreDelMes = "diciembre"; break;  
		default:nombreDelMes = "no existe ese mes"; 
		}
		System.out.println("Mes " + mes + ": " + nombreDelMes);
		
		}
	}


