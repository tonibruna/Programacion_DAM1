package Ejercicios;

public class Ejerc19_Jorge {

	public static void main(String[] args) {
		
		int[][] num=new int[4][5];
		int[] sumafila=new int[4];
		int[] sumacolumna=new int[6];
		int suma=0; int sumatotal=0;
		
		for (int i=0;i<4;i++) {
			for (int j=0;j<5;j++) {
				num[i][j]=((int)(Math.random()*900) +100);
				sumatotal=sumatotal+num[i][j];
			}
		}
		for (int i=0;i<4;i++) {
			for (int j=0;j<5;j++) {
				suma=suma+num[i][j];
			}
			sumafila[i]=suma;
			suma=0;
		}
		for (int j=0;j<5;j++) {
			for (int i=0;i<4;i++) {
				suma=suma+num[i][j];
			}
			sumacolumna[j]=suma;
			suma=0;
			sumacolumna[5]=sumatotal;
		}
		System.out.println("La tabla final es: ");
		for (int i=0;i<4;i++) {
			for (int j=0;j<5;j++) {
				System.out.print(" |"+num[i][j]+"| ");
			}
		System.out.print(" |"+sumafila[i]+"| ");
		System.out.println(" ");
		}
		for (int j=0;j<6;j++) {	
		System.out.print(" |"+sumacolumna[j]+"| ");
		}

	}

}
