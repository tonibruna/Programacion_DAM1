package Arrays;

import java.util.*;

public class A_ArrayUnaDimension {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		/**
		 * Un array es un tipo de dato capaz de almacenar m�ltiples valores. Se utiliza para
		 *agrupar datos muy parecidos, por ejemplo, si se necesita almacenar la temperatura
		 *media diaria en M�laga durante el �ltimo a�o se pueden utilizar las variables temp0,
		 *temp1, temp2, temp3, temp4, � y as� hasta 365 variables distintas pero ser�a poco pr�ctico; es
		 *mejor utilizar un array de nombre temp y usar un �ndice para referanciar la temperatura
		 *de un d�a concreto del a�o*/
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("_____________________EJEMPLO 1");
		int[] n; // se define n como un array de enteros
		n = new int[4]; // se reserva espacio para 4 enteros
		n[0] = 26; //primer elemento empieza por cero
		n[1] = -30;
		n[2] = 0;
		n[3] = 100; //cuarto elemento
		System.out.print("Los valores del array n son los siguientes: ");
		System.out.print(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);
		int suma = n[0] + n[3];
		System.out.println("\nEl primer elemento del array m�s el �ltimo suman " + suma);
		
// definici�n del array y reserva de memoria en la misma l�nea
		int[] x = new int[5];
		x[0] = 8;
		x[1] = 33;
		x[2] = 200;
		x[3] = 150;
		x[4] = 11;

		System.out.println("__________________EJEMPLO 2");
		System.out.println("El array x tiene 5 elementos �cu�l de ellos quiere ver?");
		System.out.print("Introduzca un n�mero del 0 al 4: ");
		int indice = teclado.nextInt();
		System.out.print("El elemento que se encuentra en la posici�n " + indice);
		System.out.println(" es el " + x[indice]);
		
		System.out.println("____________________EJEMPLO 3");
		//tambien podemos usar 
		int[] p = {8, 33, 200, 150, 11};
		System.out.println("El array x tiene 5 elementos �cu�l de ellos quiere ver?");
		System.out.print("Introduzca un n�mero del 0 al 4: ");
		int indice2 = teclado.nextInt();
		System.out.print("El elemento que se encuentra en la posici�n " + indice2);
		System.out.println(" es el " + p[indice2]);
		
	}

}
