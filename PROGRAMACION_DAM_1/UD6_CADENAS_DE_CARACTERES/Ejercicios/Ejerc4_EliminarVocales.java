package Ejercicios;

import java.util.Scanner;

public class Ejerc4_EliminarVocales {

	public static void main(String[] args) {
	
		Scanner teclado= new Scanner(System.in);
		String nombre;
		String NombreSinVocal="";
		char c;
		
		System.out.println("Introduce tu nombre con apellidos: ");
		nombre=teclado.nextLine();
		
		for (int i=0; i<nombre.length();i++) {
			c=nombre.charAt(i);
			if (esVocal(c)==false) {
				NombreSinVocal=NombreSinVocal+c;
			}
		}
		System.out.println("Tu nombre sin vocales es: " +NombreSinVocal);
		teclado.close();
	}	
	
		public static boolean esVocal (char c) {
			
			String vocales= "aàeèiìoòuù"; // le decimos las vocales que tiene que reconocer
			c = Character.toLowerCase(c); //para que tambien reconozca las vocales mayusculas
			if (vocales.indexOf(c)==-1) {  //compara con las vocales 
				return false;
			} 
			return true;
		}
		
		
		
		
	

}
