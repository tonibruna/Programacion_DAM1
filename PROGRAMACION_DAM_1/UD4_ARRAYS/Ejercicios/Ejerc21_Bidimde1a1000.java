package Ejercicios;

public class Ejerc21_Bidimde1a1000 {
	/**Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos 
	 * comprendidos entre 0 y 1000 (ambos incluidos). 
	 * A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.
	 */

	public static void main(String[] args) {

		int[][] num=new int[6][10];
		int maximo=0; int minimo=1000;
		for (int i=0;i<6;i++) {
			for (int j=0;j<10;j++) {
				num[i][j]=((int)(Math.random()*1000));
			}
		}
		for (int i=0;i<6;i++) {
			for (int j=0;j<10;j++) {
				if (num[i][j]>maximo) {
					maximo=num[i][j];
					}
				if (num[i][j]<minimo) {
					minimo=num[i][j];
				}
			}
		}
		for (int i=0;i<6;i++) {
			for (int j=0;j<10;j++) {
				if (num[i][j]==minimo) {
					System.out.print(" |--"+num[i][j]+"--| ");	
				}
				if (num[i][j]==maximo) {
					System.out.print(" |++"+num[i][j]+"++| ");
				}
				if ((num[i][j]!=minimo)&&(num[i][j]!=maximo)) {
					System.out.print(" |"+num[i][j]+"| ");
				}
			}
		System.out.println(" ");
		}
		for (int i=0;i<6;i++) {
			for (int j=0;j<10;j++) {
				if (num[i][j]==minimo) {
					System.out.println("El minimo se encuentra en la posicion: ["+i+"]["+j+"]");	
				}
				if (num[i][j]==maximo) {
					System.out.println("El maximo se encuentra en la posicion: ["+i+"]["+j+"]");
				}
			}
		}	

	}

}
