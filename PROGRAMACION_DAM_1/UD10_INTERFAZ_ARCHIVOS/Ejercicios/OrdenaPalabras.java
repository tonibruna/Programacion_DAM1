package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class OrdenaPalabras {
	/*Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
	contenidas en un fichero de texto. El nombre del fichero que contiene las palabras se
	debe pasar como argumento en la línea de comandos. El nombre del fichero resultado
	debe ser el mismo que el original añadiendo la coletilla sort, por ejemplo
	palabras_sort.txt. Suponemos que cada palabra ocupa una línea.
	 */

	public static void main(String[] args) {
		
		        //Obtener la ruta del archivo
				Scanner teclado=new Scanner (System.in);
				/*System.out.println("Introduce el nombre del fichero");
				String nombre="C:/";
				nombre=nombre+teclado.nextLine();*/
				String nombreFichero="C:\\Users\\ifc\\eclipse-workspace\\alumnos.txt";
				String[] palabras=new String[4];
				int i=0,contador=0;
				String c;
				//Abrir el archivo
				try {			
						BufferedReader file = new BufferedReader(new FileReader(nombreFichero));
					do{
						c=file.readLine();//leemos una linea
						palabras[i]=c;
						i++;
						contador++;
					}while(i!=palabras.length);//mientras no lleguemos a final de archivo
					file.close();//cerrar el fichero				
				}catch (Exception e) {
					System.out.println("El archivo no se pudo abrir");
				}
				i=0;
				Arrays.sort(palabras);		
				String nombreFichero2="C:\\Users\\ifc\\eclipse-workspace\\alumnos_sort1.txt";
				try {
					BufferedWriter file = new BufferedWriter(new FileWriter(nombreFichero2));
					while(contador!=0) {
						file.write(palabras[i]);
						file.newLine();
						System.out.println(palabras[i]);
						i++;
						contador--;
					}			
					file.close();
				}catch (Exception e) {
					System.out.println("El fichero no se pudo abrir");
				}
				teclado.close();

		}
	}



