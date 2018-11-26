package EjemploMatematicas_03;

public class Varias {
	/**
	* Comprueba si un n�mero entero positivo es primo o no.
	* Un n�mero es primo cuando �nicamente es divisible entre
	* �l mismo y la unidad.
	*
	* @param x un n�mero entero positivo
	* @return <code>true</code> si el n�mero es primo
	* @return <code>false</code> en caso contrario
	*/
	public static boolean esPrimo(int x) {
	for (int i = 2; i < x; i++) {
		if ((x % i) == 0) {
				return false;
		}
	}
	return true;
	}
	/**
	* Devuelve el n�mero de d�gitos que contiene un n�mero entero
	*
	* @param x un n�mero entero
	* @return la cantidad de d�gitos que contiene el n�mero
	*/
	public static int digitos(int x) {
		int n = 0;
		if (x == 0) {
			return 1;
		} else {	
			
			while (x > 0) {
				x = x / 10;
				n++;
			}
		}
		return n;
	}
}
