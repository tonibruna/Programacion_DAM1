package Arrays;
import java.util.*;

public class Array1DimensionRecorrer2_HERRO {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner teclado=new Scanner (System.in);

		int[] n;//definimos n como un array de enteros
		n = new int [4]; //reservamos espacio en memoria
		
		//otra opcion es hacerlo todo en una linea
		int [] num = new int [10];
		
		System.out.println("Introduce 10 numeros por teclado: ");
		for (int i=0;i<10;i++) {
			System.out.print("Introduce valor de la posicion "+i+" del array:");
			num[i]=teclado.nextInt();
		}
		//mostramos los valores del array
		System.out.println("Mostramos los valores del array: ");
		for (int i=0;i<10;i++) {
			System.out.println("posici�n ["+i+"]:"+num[i]);
		}
		//Podemos hacer operaciones con los valores del array
		num[5]=num[1]+num[9];
		num[9]=num[2]/10;
		num[3]=num[0]*5;
		//tambi�n podemos controlar el indice;
		
		int r=5;
		num[(r+3)/2]=num[(r*2)-3];
		//mostramos los nuevos valores
		System.out.println("Mostramos los valores del array: ");
		int suma=0;
		int contador=0;
		for (int i=0;i<10;i++) {
			System.out.println("posici�n ["+i+"]:"+num[i]);
			suma=suma+num[i];
			contador=contador+1;
			
		
		}
		int media=suma/contador;
		
		
	}

}
