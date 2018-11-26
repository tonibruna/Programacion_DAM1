package Acesso_Ficheros;

import java.io.*;

public class Escritura_Fichero {
	
	public static void main(String[] args) {
		
		Escribiendo accede_es =new Escribiendo();
		
		accede_es.escribir();
	}

}

class Escribiendo{
	
	public void escribir() {
		
		String frase="Esto es una prueba de escritura";
		
		try {
			FileWriter escritura=new FileWriter("C:/Users/Maria Aznar/eclipse-workspace/PRUEBAS_PILDORAS/src/archivos/escribir.txt");
			
			//FileWriter escritura=new FileWriter("C:/Users/Maria Aznar/Desktop/escribir.txt",true);
		    //con el true como atributo para escribir en una nota ya creada
			
		    for(int i=0;i<frase.length();i++) {
		    	
		    	escritura.write(frase.charAt(i));
		    }
		    
		    escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Ha habido un error");
		}
	
	}
}