package Ejemplo_Archivos;

import java.io.*;
import java.util.Scanner;

public class ArchivosEntradaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		final String POR_DEFECTO="C:\\Users\\ifc\\Documents\\DAM\\Programación\\3 Trimestre\\prueba.txt";
		
		String nombreFichero=POR_DEFECTO;
		
		try {
			BufferedReader file = new BufferedReader(new FileReader(nombreFichero));
			int c=file.read();//leemos un caracter
			while(c!=-1) {//mientras no lleguemos a final de archivo
				System.out.println((char) c);//hago cast para pasar el caracter a char, estaba en int
				c=file.read();
			}
			file.close();//cerrar el fichero				
		}catch (Exception e) {
			System.out.println("El archivo no se pudo abrir");
		}
		teclado.close();
	}
}