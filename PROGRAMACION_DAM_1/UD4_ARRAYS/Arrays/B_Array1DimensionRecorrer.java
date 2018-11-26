package Arrays;

public class B_Array1DimensionRecorrer {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

		/**Cada elemento del array se puede utilizar exactamente igual que cualquier otra
		variable, es decir, se le puede asignar un valor o se puede usar dentro de una
		expresi�n. En el siguiente ejemplo se muestran varias operaciones en las que los
		operandos son elementos del array num.
		Para recorrer todos los elementos de un array se suele utilizar un bucle for junto con
		un �ndice que va desde 0 hasta el tama�o del array menos 1.
		*/
		int[] num = new int[10];
		num[0] = 8;
		num[1] = 33;
		num[2] = 200;
		num[3] = 150;
		num[4] = 11;
		num[5] = 88;
		num[6] = num[2] * 10;
		num[7] = num[2] / 10;
		num[8] = num[0] + num[1] + num[2];
		num[9] = num[8];
		System.out.println("El array num contiene los siguientes elementos:");
		for (int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
		for (int i = 0; i < 10; i++) {
			num[i]=i;
			System.out.println(num[i]);
			
			}
		
	}

}
