package Ejercicios;

import java.util.Scanner;

public class Ejerc4_NumCuadradoCubo {/*Define tres arrays de 20 n�meros enteros cada una, con nombres n�mero, cuadrado y cubo.
Carga el array n�mero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
almacenar los cuadrados de los valores que hay en el array numero. En el array cubo se deben
almacenar los cubos de los valores que hay en numero. A continuaci�n, muestra el contenido de
los tres arrays dispuesto en tres columnas.*/

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int [] numero=new int [20];
		int [] cuadrado=new int [20];
		int [] cubo=new int [20];
		
		for (int i=0;i<=19;i++ ) {
			numero[i]=((int)(Math.random()*100 + 1));
		    cuadrado[i]=(int) Math.pow(numero[i], 2);
		    cubo[i]=(int) Math.pow(numero[i], 3);
		}
		
		for (int i=0;i<=19;i++ ) {
		System.out.println("El valor del array numero " +i+ " es "+numero[i]);
		System.out.println("El valor del array numero " +i+ " al cuadrado es "+cuadrado[i]);
		System.out.println("El valor del array numero " +i+ " al cubo es " +cubo[i]);
		
	}teclado.close();
  }
}


