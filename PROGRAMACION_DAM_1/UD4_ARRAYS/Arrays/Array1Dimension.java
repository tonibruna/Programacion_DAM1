package Arrays;

import java.util.Scanner;

public class Array1Dimension {

	public static void main(String[] args) {
		
		  Scanner teclado=new Scanner(System.in);
		  
		  System.out.println("________ejemplo 01");
		  
		  int[] n; //definimos n como un array de enteros
		  n = new int[4];
		  
		  //asignamos valores a nuestro array de 1 en 1
		  n[0]=26;
		  n[1]=-30;
		  n[2]=0;
		  n[3]=180;
		  
		  System.out.print("Los valores del array son estos: ");
		  System.out.print(n[0]+"  "+n[1]+"  "+n[2]+"  "+n[3]+"\n\n");
		  
		  //asignamos valores con FOR a nuestro array
		  for (int i=0;i<=3;i++) {
		  System.out.println("El valor del array en la posicion "+i+" es "+n[i]);
		  }
		  
		  //asignamos nuevos valores a nuestro array. Todos tienen que tener valor 10
		  for (int i=0;i<=3;i++) {
			  n[i]=10;
			  System.out.println("El valor del array en la posicion "+i+" es "+n[i]);
			  
		  
			  }
		  
	}
}
