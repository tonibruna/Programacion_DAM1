package Arrays;

public class E_ArraysBidimensionales2 {

	public static void main(String[] args) throws InterruptedException { // Se a�ade esta l�nea para poder usar sleep{
		// TODO Ap�ndice de m�todo generado autom�ticamente
/*Mediante la l�nea int[][] n = new int[3][2] se define un array bidimensional de 3 filas
*por 2 columnas, pero bien podr�an ser 2 filas por 3 columnas, seg�n el objetivo y el
*uso que del array haga el programador.
*Los valores del array bidimensional se pueden proporcionar en la misma l�nea de la
*definici�n como se muestra en el siguiente ejemplo.*/
		
		
			int fila, columna;
			int[][] n = {{20, 4}, {67, 33}, {0,7}};
			for(fila = 0; fila < 3; fila++) {
				System.out.print("Fila: " + fila);
				for(columna = 0; columna < 2; columna++) {
						System.out.printf("%10d ", n[fila][columna]);
						Thread.sleep(1000); // retardo de un segundo
				}
				System.out.println();
				}
	}
}
