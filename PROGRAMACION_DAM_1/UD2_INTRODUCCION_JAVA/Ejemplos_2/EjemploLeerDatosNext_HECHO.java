package Ejemplos_2;
import java.util.*;

public class EjemploLeerDatosNext_HECHO {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner teclado = new Scanner (System.in);
		/*String linea;
		//una forma de leer datos por teclado
		System.out.println ("Por favor, introduce un n�mero: "); 
		linea = System.console().readLine(); 
		int primerNumero;
		primerNumero = Integer.parseInt(linea);
		
		System.out.print("__________________________");*/
		
		System.out.println("Introduce tu nombre");
		String nombre =teclado.nextLine();
		System.out.println("Tu nombre es " + nombre);
		
		//Otra forma de leer
		System.out.println("\nIntroduce tu edad");
		int edad = Integer.parseInt(teclado.nextLine());
		System.out.println("Tu edad es " + edad);
		
		/*
		 * *********diferencia entre las 2 formas: Mediante el uso de la clase Scanner es posible leer varios datos en una misma l�nea. 
		 * En el programa anterior se ped�a un nombre y una edad, en total dos datos que hab�a que introducir en l�neas separadas.
		 *  Observa c�mo en el siguiente ejemplo se piden esos	dos datos en una sola l�nea y separados por un espacio.	*/
		
		System.out.println("__________________________");
		System.out.print("Introduce tu nombre y tu edad separados por un espacio: "); 
		String nombre2 = teclado.next();
		int edad2 = teclado.nextInt();
		System.out.println("Tu nombre es " + nombre2 + " y tu edad es " + edad2);
		
		System.out.println("____________________");
		System.out.println ("Introduce tres n�meros (pueden contener decimales) separados por espacios: ");
		double x1 = teclado.nextDouble(); 
		double x2 = teclado.nextDouble(); 
		double x3 = teclado.nextDouble();
		double media = (x1 + x2 + x3) / 3;
		System.out.println("La media de esos tres n�meros es " + media);
		
	teclado.close();
	}

}
