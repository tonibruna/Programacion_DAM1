package PR10EJ_Ejemplo02ArchivosTexto;
import java.io.*;
import java.util.Scanner;

public class ArchivosSalida {

	public static void main(String[] args)  {
		
		/*Diseñar una aplicación que pida al usuario su nombre y edad . Estos dalos deben
		guardarse en el fichero datos.txt Si esto fichero existe, debe borrarse su contenido , y
		en caso de no existir, debe crearse.*/
		
		String nombrefichero="C:\\Users\\ifc\\eclipse-workspace\\prueba2.txt";
		
		Scanner teclado= new Scanner (System.in);
		
		System.out.print ("Escribe su nombre");
		String nombre=teclado.nextLine();
		System.out.println("Escriba su edad");
		int edad=teclado.nextInt();
		
		try {
			BufferedWriter f=new BufferedWriter (new FileWriter(nombrefichero));
			
			f.write("nombre :"+nombre);
			f.newLine();
			f.write ("edad: "+edad);
			f.close();
		}catch (IOException eof) {
			System.out.println ("fichero no se pudo abrir");
		}
		

	}

}
