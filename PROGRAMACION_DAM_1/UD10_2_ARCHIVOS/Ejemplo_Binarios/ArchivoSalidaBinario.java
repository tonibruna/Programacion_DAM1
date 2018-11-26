package Ejemplo_Binarios;

import java.io.*;
import java.util.Scanner;

public class ArchivoSalidaBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		String nombreFichero="C:\\Users\\ifc\\Documents\\DAM\\Programación\\3 Trimestre\\datos.dat";
		
		try {
			ObjectOutputStream out= new ObjectOutputStream (new FileOutputStream(nombreFichero));
			System.out.println("Introduce un numero entero");
			int x=teclado.nextInt();
			out.writeInt(x);
		}catch (Exception e) {
			System.out.println("El archivo no se pudo abrir");
		}
		
		
		
		
	}

}
