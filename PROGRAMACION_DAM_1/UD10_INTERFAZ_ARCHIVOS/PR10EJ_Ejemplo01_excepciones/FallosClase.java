package PR10EJ_Ejemplo01_excepciones;
import java.util.*;
public class FallosClase {

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
		}
		catch (Exception e) {
			System.out.println("te sales del array");
		}
		
		
		for (int i=0;i<5;i++) {
			System.out.println("Posicion "+i+" ="+matriz[i]);
		}
	
		//--------io exception
		int a=5;
		int b=0;
		int c=4;
		try {
			c=a/b;
		}
		catch (ArithmeticException e) {
			System.out.println("divides por cero");
		}
		System.out.println(c);
		//----------excepcion de lectura de tipos 
		int d=0;
		System.out.println("leo un numero");
		try {
			d=teclado.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("No es un numero");
		}
		System.out.println(d);
	}

}
