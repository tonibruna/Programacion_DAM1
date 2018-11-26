package PR10EJ_Ejemplo02ArchivosTexto;
import java.util.*;
import java.io.*;
public class PR01EJ_archivosEntradaTexto  {
	
	public static void main (String[] args)  {
		//leemos un archivo de texto
		
String nombrefichero="C:\\Users\\ifc\\eclipse-workspace\\prueba3.txt";
	
try {
	BufferedReader file = new BufferedReader (new FileReader(nombrefichero));

	int c=file.read(); //leemos un caracter
	while (c!=-1) {//mientras no lleguemos a final de archivo
		System.out.print((char) c); //hago cast para pasar el caracter a char, estaba en int porque lo trasforma en numeros
		c=file.read(); //volvemos a leer por si no hay nada escrito y el primer numero es -1
	}
		file.close (); //cerrar el fichero
		
}catch (Exception eof) {
	System.out.print("El archvio no se pudo abrir");
}
	

	
	}

}
