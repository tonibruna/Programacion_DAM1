package PR10EJ_Ejemplo01_excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiones01 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int matriz[]=new int[5];
		Scanner teclado = new Scanner (System.in);
		//-----------exception array-------
		try {
			matriz[0]=8;
			matriz[1]=6;
			matriz[2]=4;
			matriz[3]=3;
			matriz[4]=9;
			matriz[5]=1;
			//error NO COMPROBADA. puedes arreglarlo, pero tambien puedes manejarlo. 
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println ("Te sales del array");
		}
						
		
		for (int i=0;i<5;i++) {
			System.out.println("Posicion "+i+" ="+matriz[i]);
		}
		
		//------------------------- EXCEPCIONES COMPROBADAS HEREDAN DE IOEXCEPTION-----------------------------
		
		final String POR_DEFECTO ="C:\\Users\\Paqui\\Documents\\08_ESPACIO_TRABAJO\\prueba4.txt";
		String nombreFichero= POR_DEFECTO;
		//podemos comprobar que la excepcion FileNotFound es una excepcion COMPROBADA
		
		try {
			BufferedReader f=new BufferedReader (new FileReader(nombreFichero));
			int c=f.read(); //leemos un caracter
			while (c!=-1){
				System.out.print((char) c); //hacemos un cast del caracter leido
				c=f.read();
			}
			f.close();
		}catch (FileNotFoundException e) {
			System.out.println("no se puede abrir el archvio");
		}catch (IOException g) {
			System.out.println("no has podido leer o cerrar el archvio");
		}
		//prueba: cambiar el orden de los catch para ver que tiene que ser siempre de más especifica a menos especifica
		finally {
			System.out.println("este bloque de archvios está controlado");
		}
		//--------------------------throws 
		
		//vamos a provocar que un metodo nuestro lance excepcion para despues poderla capturar
		
		
		pedir_datos();
		
			
		//-------------------------- CLAUSULA FINALLY
	
	}
	
	
	static void pedir_datos () throws InputMismatchException {//aunque ponga esto no obliga a ser comprobada ya que hereda de runtimeException
		Scanner teclado = new Scanner (System.in);
		System.out.println("dame un dato");
		//try {
			int edad=teclado.nextInt();
			System.out.println("muestra el dato"+edad);
		//}catch (InputMismatchException e) { //evitas que tu programa se caiga
			System.out.println("hemos capturado");
	//	}
		
	}
	

}
