package PR10EJ_Ejemplo04_archivosBinario;

import java.io.*;
import java.util.*;
public class AccesoFicherosBin2 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		String nombrefichero="C:/pr/i.jpg";
		String nombrefichero2="C:/pr/i2.jpg";
		int contador=0;//tenemos que saber cuantos bytes tiene
		
		int datos[]=new int [2935];
		try {
			FileInputStream f=new FileInputStream (nombrefichero);
			boolean final_ar=false;
			//cuando llega a final de archivo read devuelve -1;
			while (!final_ar) {
				int byte_entrada=f.read();
				
				if (byte_entrada==-1) {
					final_ar=true;//hemos llegado al final del archivo
				}else {
					datos[contador]=byte_entrada;
					
					
				}
				
				//System.out.println (datos[contador]);
				contador++;
			}
			f.close();
		}catch (Exception e) {
			System.out.println("Error al abrir el archivo");
		}
		//ahora tenemos que coger estos bytes y creamos un archivo nuevo
		
		//para escribir en un archivo
		System.out.println(contador);
		try {
			FileOutputStream g=new FileOutputStream(nombrefichero2);
			for (int i=0;i<datos.length;i++) {
				g.write(datos[i]);
				
			}
			
			g.close();
			
		}
		
		catch (Exception e) {
			System.out.println("Error al abrir el archivo");
			}
		}
		
	}


