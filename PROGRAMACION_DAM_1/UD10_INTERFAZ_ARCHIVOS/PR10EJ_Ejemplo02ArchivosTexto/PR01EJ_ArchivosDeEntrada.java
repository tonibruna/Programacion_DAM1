package PR10EJ_Ejemplo02ArchivosTexto;
import java.util.*;
import java.io.*;
public class PR01EJ_ArchivosDeEntrada {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner teclado=new Scanner (System.in);
		
		final String POR_DEFECTO ="C:\\Users\\ifc\\eclipse-workspace\\prueba4.txt";
		
		String nombreFichero= POR_DEFECTO;
		
		try {
			
			BufferedReader f=new BufferedReader (new FileReader(nombreFichero));
			
			int c=f.read(); //leemos un caracter
			while (c!=-1){
				System.out.print((char) c); //hacemos un cast del caracter leido
				c=f.read();
			}
			f.close();
			
		}
		catch (Exception e) {
			System.out.println("El fichero ha dado error ");
		}
		
		
	}

}
