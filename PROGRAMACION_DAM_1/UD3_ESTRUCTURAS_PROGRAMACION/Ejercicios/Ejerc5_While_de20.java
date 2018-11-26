package Ejercicios;

public class Ejerc5_While_de20 {//Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.

	public static void main(String[] args) {
	     
		System.out.println("Del 320 al 160 con while:");
			
			int i = 320; 
			while (i >= 160) {
				System.out.println(i);
				i=i-20;
			}

	}

}
