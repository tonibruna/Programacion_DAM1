package Ejercicios02;

import java.util.Scanner;

public class Ejerc11_AreaCuadradoRectanguloTriangulo {
/*Dise�a  una  aplicaci�n  que  te  calcule  el  �rea  de  un  cuadrado,  
de  un  rect�ngulo  o  de  un  tri�ngulo dependiendo de la opci�n de men� que le introduzcamos.. 
As�, si es 1 nos pedir� los datos por teclado para realizar la operaci�n  (calcular  el  �rea  de  un  cuadro),
si  es  un  2,  el  �rea  de  un  triangulo  y  si  es  un  3  el  �rea  de  un  c�rculo. 
Si introducimos otro valor el programa acabar�. */

	public static void main(String[] args) {
		
		System.out.println("Introduce un numero del 1 al 3:");
	 	Scanner teclado= new Scanner(System.in);
	 	 
	 	int numero= teclado.nextInt();
	    double area=0;
	 	 
	 	switch (numero) { //para seleccionar solo uno de los casos
	
	 	case 1:
	 		System.out.println("introduce lado");
	 		float lado=teclado.nextFloat();
	 		area=lado*lado;
	 		
	 		 System.out.println("Area del cudrado es= " + area); 
	 		break; //se usa para romper el bucle 
	  	
	 	case 2:
	 		System.out.println("introduce la base");
	 		float base=teclado.nextFloat();
	 		System.out.println("introduce altura");
	 		float altura=teclado.nextFloat();
	 		area=(base*altura)/2;
	 		System.out.println("el area del triangulo es= " +area);
	 		break;
	 		
	 	case 3:
	 		System.out.println("introducir base");
	 		base=teclado.nextFloat();
	 		System.out.println("introducir altura");
	 		altura=teclado.nextFloat();
	 		area=base*altura;
	 		System.out.println("el area del rectangulo es=" +area);
	 		 break;
	 		 
	 		default:System.out.println("tiene que ser entre el 1 y el 3"); ; break;
	 		//por si metes un numero que no sea de 1 a 3.
	 	}
	 	teclado.close();
	}
}
	
