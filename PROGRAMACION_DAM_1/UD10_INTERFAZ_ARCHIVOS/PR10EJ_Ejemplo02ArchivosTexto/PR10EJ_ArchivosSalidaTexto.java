package PR10EJ_Ejemplo02ArchivosTexto;
import java.io.*;
import java.util.Scanner;

public class PR10EJ_ArchivosSalidaTexto {

	public static void main(String[] args) {
		// para crear un fichero con el texto que pongas por teclado
		
		String nombreFichero="C:\\Users\\ifc\\eclipse-workspace\\prueba3.txt";
		
		Scanner teclado=new Scanner (System.in);
		System.out.println("Escribe un texto");
		String texto=teclado.nextLine();
		
		try {
			BufferedWriter f=new BufferedWriter (new FileWriter(nombreFichero));
			f.write("ESTE ES EL TEXTO INTRODUCIDO "+texto);
			f.close();
		}catch (Exception e) {
			System.out.println("El fichero no se pudo abrir");
		}
		
	}

	}
