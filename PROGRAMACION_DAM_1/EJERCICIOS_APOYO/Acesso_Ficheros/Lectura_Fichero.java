package Acesso_Ficheros;

import java.io.*;


public class Lectura_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leer_Fichero accediendo=new Leer_Fichero();
		
		accediendo.lee();//usamos el metodo lee 

	}

}

class Leer_Fichero{
	
	public void lee() {
		
		try {
			//Abrimos el flujo de datos
			FileReader entrada=new FileReader("C:/Users/Maria Aznar/eclipse-workspace/PRUEBAS_PILDORAS/src/archivos/prueba1.txt");
		
		    int c=0;//almacenamos en c los caracteres
		    
		    while(c!=-1) {//mientras no hayas llegado al ultimo caracter
		    	
		    	c=entrada.read();//guarda en c cada caracter
		    	
		    	char letra=(char)c; //hacemos un casting para transformar en letras
		    	
		    	System.out.print(letra);
		    }
		    
		    entrada.close();//cerramos el flujo de datos
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se encuentra el archivo");
		}
	}
}
