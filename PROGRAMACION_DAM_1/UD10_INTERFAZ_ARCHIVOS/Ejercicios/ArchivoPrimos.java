package Ejercicios;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Writer;

public class ArchivoPrimos {

	public static void main(String[] args) {
	
		ArchivoPrimos accede_es = new ArchivoPrimos();

	    accede_es.escribir();
	}

	private void escribir() {
		
		String nombrefichero="C:\\Users\\ifc\\eclipse-workspace\\primos.dat";
		
		try {
			ObjectOutputStream escritura= new ObjectOutputStream (new FileOutputStream(nombrefichero));
		
			for (int i=1;i<501;i++) {
				if(esPrimo(i)) {
					escritura.writeObject(String.valueOf(i)+"\n");
				}
			}
			escritura.close();
		} catch (IOException ioe) {
			System.out.println("Ha habido un error");
		}
	}

	public static boolean esPrimo(int x) {
		int contador=0;
		
		for(int i=2; i<x;i++) {
			if((x % i) == 0) {
				contador++;
			}
		}
		if (contador==2) {
			return true;
		}else {
			return false;
		}
		
	}
	
}



