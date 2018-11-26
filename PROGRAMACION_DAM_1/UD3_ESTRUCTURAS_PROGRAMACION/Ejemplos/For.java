package Ejemplos;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		for (int i=1;i<11;i++) {  //i=1 desde el 1, i<11 hasta menor 11, i++ de uno en uno
			System.out.print(" "+i);
		}
		
		System.out.println("\nPulse una tecla para continuar...");
		String pausa = teclado.nextLine();
		
		System.out.println("_________________");
		for (int i=1;i<=10;i++) {
			System.out.print(" "+i);
		}
		
		System.out.println("\n_________________");
		System.out.println("Pulse una tecla para continuar...");
		pausa = teclado.nextLine();
		for (int i=1;i<=10;i=i+2) {
			System.out.println(i);
		}
		System.out.println("Pulse una tecla para continuar...");
		pausa = teclado.nextLine();
		
		System.out.println("_________________");
		for (int i=0;i<=11;i++) {
			System.out.println(i);
		}
		System.out.println("Pulse una tecla para continuar...");
		pausa = teclado.nextLine();
		System.out.println("_________________");
		for (int i=0;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("Pulse una tecla para continuar...");
		pausa = teclado.nextLine();
		System.out.println("_________________");
		for (int i=10;i>=0;i--) {
			System.out.println(i);
		}
		System.out.println("Pulse una tecla para continuar...");
		pausa = teclado.nextLine();
		System.out.println("_________________");
		for (int i=10;i>=0;i=i-2) {
			System.out.println(i);
		}
	}

}
