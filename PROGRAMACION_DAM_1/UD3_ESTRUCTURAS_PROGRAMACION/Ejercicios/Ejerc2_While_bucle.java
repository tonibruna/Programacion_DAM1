package Ejercicios;

public class Ejerc2_While_bucle {//Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.

	public static void main(String[] args) {
		
        System.out.println("Primos de 5 del 1 al 100 con while:");
		
		int i = 0; 
		while (i <= 100) {
			System.out.println(i);
			i=i+5;
		}
	}

}
