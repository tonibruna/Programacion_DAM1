package Arrays;
import java.util.*;

public class C_notasDeAlumnos {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		Scanner teclado=new Scanner(System.in);
		double[] nota = new double[4];
		System.out.println("Para calcular la nota media necesito saber la ");
		System.out.println("nota de cada uno de tus ex�menes.");
		for (int i = 0; i < 4; i++) {
			System.out.print("Nota del examen n� " + (i + 1) + ": ");
			nota[i] = teclado.nextDouble();
		}
			System.out.println("Tus notas son: ");
			double suma = 0;
		for (int i = 0; i < 4; i++) {
			System.out.print(nota[i] + " ");
			suma += nota[i];
		}
			System.out.println("\nLa media es " + suma / 4);
	}

}
