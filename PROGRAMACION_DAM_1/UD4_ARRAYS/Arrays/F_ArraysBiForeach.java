package Arrays;

public class F_ArraysBiForeach {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		/*F�jate en el segundo for; en este caso no se utiliza ning�n �ndice; simplemente decimos
		 *�ve sacando uno a uno los elementos del array nota y deposita cada uno de esos
		 *elementos en la variable n que es de tipo double�.*/
		
		double[] nota = new double[4];
		System.out.println("Para calcular la nota media necesito saber la ");
		System.out.println("nota de cada uno de tus ex�menes.");
		for (int i = 0; i < 4; i++) {
		System.out.print("Nota del examen n� " + (i + 1) + ": ");
		nota[i] = 4;
		}
		System.out.println("Tus notas son: ");
		double suma = 0;
		for (double n : nota) { // for al estilo foreach
		System.out.print(n + " ");
		suma += n;
		}
		System.out.println("\nLa media es " + suma / 4);
	}

}
