package PR10EJ_Ejemplo02ArchivosTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class PR10EJ_ArchivoES {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
	
		String path="C:\\Users\\ifc\\eclipse-workspace\\";
		Scanner teclado=new Scanner (System.in);
		int opcion =0;
		String nombre, nombreFichero, texto;
		
		do {
			System.out.println("MENU");
			System.out.println("1. leer un archivo");
			System.out.println("2. Escribir en un archivo");
			System.out.println("3. Leer y escribir en un archivo");
			System.out.println("4. Salir");
			System.out.println("Escribe una opcion");
			opcion = teclado.nextInt ();
		
			switch (opcion) {
				case 1:
					System.out.print("dime el nombre del fichero que quieres leer");
					teclado.nextLine();
					
					nombre=teclado.nextLine();
					nombreFichero=path+nombre;
					try {
						BufferedReader f=new BufferedReader (new FileReader(nombreFichero));
						int c=f.read(); //leemos un caracter
						while (c!=-1){
							System.out.print((char) c); //hacemos un cast del caracter leido
							c=f.read();
						}
						f.close();
					}catch (Exception e) {
						System.out.println("Ha habido un error");
					}
					break;
				
				case 2:
					System.out.print("dime el nombre del fichero que quieres escribir ");
					teclado.nextLine();
					nombre=teclado.nextLine();
					nombreFichero=path+nombre;
					System.out.println("Escribe un texto");
					texto=teclado.nextLine();
					try {
						BufferedWriter f=new BufferedWriter (new FileWriter(nombreFichero));
						f.write("ESTE ES EL TEXTO INTRODUCIDO "+texto);
						f.close();
					}catch (Exception e) {
						System.out.println("El fichero no se pudo abrir");
					}
					
					break;
				case 3:
					System.out.print("dime el nombre del fichero que quieres escribir ");
					teclado.nextLine();
					nombre=teclado.nextLine();
					nombreFichero=path+nombre;
					System.out.println("Escribe un texto");
					texto=teclado.nextLine();
					try {
						BufferedWriter f=new BufferedWriter (new FileWriter(nombreFichero,true));
						f.write("ESTE ES EL TEXTO INTRODUCIDO "+texto);
						f.close();
					}catch (Exception e) {
						System.out.println("El fichero no se pudo abrir");
					}
				
					
					
					break;
									
			}
		}while (opcion!=4);
		
		
	
		
	}

}
