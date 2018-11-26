package Ejemplo_Archivos;

import java.io.*;
import java.util.Scanner;

public class ArchivosES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\ifc\\Documents\\DAM\\Programación\\3 Trimestre\\";
		Scanner teclado=new Scanner (System.in);
		String nombreFichero, nombre, texto, textoOriginal;
		int opcion=0;
		do {
			System.out.println("\nMENÚ");
			System.out.println("1. Leer un archivo");
			System.out.println("2. Escribir en un archivo desde cero");
			System.out.println("3. Leer y escribir en un archivo a continuación de lo que había");
			System.out.println("4. Lo mismo que la anterior, pero con true");
			System.out.println("5. Salir");
			System.out.println("Escribe una opcion");
			opcion=teclado.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Dime el nombre del fichero");
				teclado.nextLine();
				nombre=teclado.nextLine();
				nombreFichero=path+nombre;
				try {
					BufferedReader file = new BufferedReader(new FileReader(nombreFichero));
					int c=file.read();
					while(c!=-1) {
						System.out.print((char) c);
						c=file.read();
					}
					file.close();			
				}catch (Exception e) {
					System.out.println("El archivo no se pudo abrir");
				}break;
			case 2:
				System.out.println("Dime el nombre del fichero");
				teclado.nextLine();
				nombre=teclado.nextLine();
				nombreFichero=path+nombre;
				System.out.println("Introduce el texto");
				texto=teclado.nextLine();
				try {
					BufferedWriter file = new BufferedWriter(new FileWriter(nombreFichero));
					file.write(texto);
					file.close();
				}catch (Exception e) {
					System.out.println("El archivo no se pudo abrir");
				}break;
			case 3:
				System.out.println("Dime el nombre del fichero");
				teclado.nextLine();
				nombre=teclado.nextLine();
				nombreFichero=path+nombre;
				System.out.println("Introduce el texto");
				texto=teclado.nextLine();
				textoOriginal="";
				try {
					BufferedReader file = new BufferedReader(new FileReader(nombreFichero));
					int c=file.read();
					while(c!=-1) {
						textoOriginal=textoOriginal+(char)c;
						c=file.read();
					}
					file.close();			
				}catch (Exception e) {
					System.out.println("El archivo no se pudo abrir");
				}
				texto=textoOriginal+" "+texto;
				try {
					BufferedWriter file = new BufferedWriter(new FileWriter(nombreFichero));
					file.write(texto);
					file.close();
				}catch (Exception e) {
					System.out.println("El archivo no se pudo abrir");
				}break;
			case 4:
				System.out.println("Dime el nombre del fichero");
				teclado.nextLine();
				nombre=teclado.nextLine();
				nombreFichero=path+nombre;
				System.out.println("Introduce el texto");
				texto=teclado.nextLine();
				try {
					BufferedWriter file = new BufferedWriter(new FileWriter(nombreFichero, true));
					file.write(texto+" ");
					file.close();
				}catch (Exception e) {
					System.out.println("El archivo no se pudo abrir");
				}break;
			case 5:
				System.out.println("Has salido");break;
			}				
		}while(opcion!=5);
		teclado.close();
	}
}