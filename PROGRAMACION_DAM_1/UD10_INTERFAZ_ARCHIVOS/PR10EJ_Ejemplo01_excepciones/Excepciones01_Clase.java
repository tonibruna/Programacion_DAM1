package PR10EJ_Ejemplo01_excepciones;
import java.util.*;
import java.io.*;

public class Excepciones01_Clase {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int matriz []= new int [5];
		Scanner teclado = new Scanner (System.in);
		//------- EXCEPCIONES NO COMPROBADAS. HEREDAN DE RUNTIMEEXCEPTION
		//-----java no nos obliga a capturarlas, ya que como son "culpa del 
		//-----programador" se deben solucionar antes de compilar. 
		
		try {
			matriz[0]=8;
			matriz[1]=6;
			matriz[2]=4;
			matriz[3]=3;
			matriz[4]=9;
			matriz[5]=8;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("te sales del array");
		}catch (ArithmeticException e) {
			System.out.println("divides por cero");
		}
		
		for (int i=0;i<5;i++) {
			System.out.println("Posicion "+i+" ="+matriz[i]);
		}
		
		
		//-------EXCEPCIONES COMPROBADAS. HEREDAN DE IOEXCEPTION
		//No son culpa del programador y java nos obliga a capturarlas
		String nombrefichero ="C:\\Users\\Paqui\\Documents\\08_"
				+ "ESPACIO_TRABAJO\\prueba4.txt";
		System.out.println("estoy aqui");
		try {
			BufferedReader f= new BufferedReader (new FileReader(nombrefichero));
		}catch (FileNotFoundException e) {
			System.out.println("No se encuentra el archivo");
		}
		catch (IOException e) {
			System.out.println("no se puede leer");
			}
					
		//-----------throws
		//aUNQUE es una mala práctica y no se debe abusar, puede interesarnos que 
		//en un momento dado se capture una excepcion no comprobada (culpa del prog)
		//pra ello utilizaremos throws nombreDelaExcepcion
		
	
		System.out.println("dame un dato");
		try {
			int edad=teclado.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("escribe bien ");
		}finally {
			//lo que quieres que pase si o  si
			teclado.close();
		}
		
	}
	

}
