package PR10EJ_Ejemplo04_archivosBinario;
import java.io.*;
import java.util.*;

public class EjemploClaseBinarioImagen {

	public static void main(String[] args) {
		
		/*COPIAR BYTE A BYTE UNA IMAGEN 
		 * Y LUEGO 
		 * RECONSTRUIRLA EN OTRO ARCHIVO DE IMAGEN
		 */
		
		//queremos leer el fichero necesitamos darle la ruta de donde esta
		String nombrefichero="C:\\Users\\ifc\\eclipse-workspace\\Imagenes\\bicho.jpg";
		int contador =0;
		//nos puede arrojar excepciones controladas, por lo que tenemos que 
		//capturarlas con un bloque try catch
		int datos []=new int [5553];
		
		try {
			//crear el flujo de datos de lectura
			FileInputStream f=new FileInputStream (nombrefichero);
			boolean final_ar=false; //nos hace falta para controlar el final de archivo
			while (final_ar==false) {
				int byte_Entrada=f.read();
				if (byte_Entrada==-1) {
					final_ar=true;
				}else {
					datos[contador]=byte_Entrada;
					contador++;
				}
			}
			f.close();
		}catch (Exception e) {
			System.out.println("no se puede abrir");
		}
		
		// Ahora vamos a reconstruir los bytes y crear un archivo nuevo
		String nombrefichero2="C:\\Users\\ifc\\eclipse-workspace\\Imagenes\\bicho2.jpg";
		try {
			FileOutputStream g=new FileOutputStream (nombrefichero2);
			for (int i=0;i<datos.length;i++) {
				g.write(datos[i]); //escribo en el archivo g el dato del array
			}
			g.close();
		}catch (Exception e) {
			System.out.println("error");
		}
	
		
		
	}

}
