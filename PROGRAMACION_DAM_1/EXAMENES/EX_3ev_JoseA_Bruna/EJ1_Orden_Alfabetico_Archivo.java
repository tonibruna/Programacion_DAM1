package EX_3ev_JoseA_Bruna;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class EJ1_Orden_Alfabetico_Archivo {

	public static void main(String[] args) {
		
		//Obtenemos la ruta del archivo
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce el nombre del fichero"); //introducimos palabras.txt
		String nombre="C:\\examen\\";     
		nombre=nombre+teclado.nextLine();
		String[] palabras=new String[10];
		int i=0;
		int contador=0;
		String c;
		
		//Abrimos el archivo
		try {
			BufferedReader file = new BufferedReader(new FileReader(nombre));
			do{
				c=file.readLine();//leemos una linea
				palabras[i]=c;
				i++;
				contador++;
			}while(i!=palabras.length);//mientras no lleguemos a final de archivo
			file.close();//cerrar el fichero				
		}catch (Exception e) {
			System.out.println("Error:El archivo no se pudo abrir");
		}
		
		i=0;
		Arrays.sort(palabras);//Ordenamos las palabras del Array
		
		String nuevoArchivo="C:\\examen\\palabras_sort.txt";
		
		//Escribimos en el nuevo archivo el array de palabras ya ordenadas
		try {
			BufferedWriter file = new BufferedWriter(new FileWriter(nuevoArchivo));
			while(contador!=0) {
				file.write(palabras[i]);
				file.newLine();
				System.out.println(palabras[i]);
				i++;
				contador--;
			}			
			file.close();
		}catch (Exception e) {
			System.out.println("Error:El fichero no se pudo abrir");
		}
		teclado.close();
	}

}
