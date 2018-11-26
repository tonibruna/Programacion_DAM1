package Ejemplo_Archivos;
import java.io.*;
import java.util.Scanner;

public class ArchivosSalidaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreFichero="C:\\Users\\ifc\\Documents\\DAM\\Programación\\3 Trimestre\\prueba.txt";
		
		Scanner teclado=new Scanner (System.in);
		System.out.println("Escribe un texto");
		String texto=teclado.nextLine();
		
		try {
			BufferedWriter file = new BufferedWriter(new FileWriter(nombreFichero));
			file.write("ESTE ES EL TEXTO INTRODUCIDO "+texto);
			file.close();
		}catch (Exception e) {
			System.out.println("El fichero no se pudo abrir");
		}
		teclado.close();
	}
}