package PR10EJ_Ejemplo04_archivosBinario;

import java.io.*;
import java.util.*;
public class AccesoFicherosBin {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		String nombrefichero="C:\\Users\\ifc\\eclipse-workspace\\bicho.jpg";
		int contador=0;//tenemos que saber cuantos bytes tiene
		
		
		try {
			FileInputStream f=new FileInputStream (nombrefichero);
			boolean final_ar=false;
			//cuando llega a final de archivo read devuelve -1;
			while (!final_ar) {
				int byte_entrada=f.read();
				
				if (byte_entrada==-1) {
					final_ar=true;//hemos llegado al final del archivo
				}
				contador++;
				System.out.println (contador);
			}
			f.close();
		}catch (Exception e) {
			System.out.println("error");
		}
		//ahora tenemos que coger estos bytes y creamos un archivo nuevo
		
		
		
	}

}
