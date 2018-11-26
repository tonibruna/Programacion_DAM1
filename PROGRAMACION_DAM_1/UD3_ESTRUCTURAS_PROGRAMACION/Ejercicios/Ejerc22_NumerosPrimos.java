package Ejercicios;

public class Ejerc22_NumerosPrimos {
/*Muestra por pantalla todos los números primos entre 2 y 100, 
ambos incluidos.*/

	public static void main(String[] args) {
		
		System.out.println("Numeros primos entre 2 y 100");

		boolean Primo = true;

		for (int i = 2; i <= 100; i++) {
			Primo = true;
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					Primo = false;
				}
			}		     
			if (Primo) {
				System.out.println(i);
			}	
		} 
		

	}

}
