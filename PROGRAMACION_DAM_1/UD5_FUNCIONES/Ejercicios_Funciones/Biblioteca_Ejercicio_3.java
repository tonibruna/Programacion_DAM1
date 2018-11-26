package Ejercicios_Funciones;

public class Biblioteca_Ejercicio_3 {

	//*******GENERAR ARRAY ALEATORIO********
	
	public static int[] generaArrayInt (int limiteinferior, int limitesuperior, int tamanoarray) {
		
		int[] num=new int[tamanoarray];
		for (int i=0;i<tamanoarray;i++) {
			num[i]=(int)(Math.random()*limitesuperior+limiteinferior);
		}
		return num;
	}
	
	//******DEVOLVER MINIMO*******
	
	public static int minimoArrayInt (int[] x) {
		
		int minimo=11;
		for (int n:x) {
			if (n<minimo) {
				minimo=n;
			}
		}
		return minimo;	
	}
	
	//******DEVOLVER MAXIMO*******
	
	public static int maximoArrayInt (int[] x) {
		
		int maximo=0;
		for (int n:x) {
			if (n>maximo) {
				maximo=n;
			}
		}
		return maximo;	
	}
	
	//******DEVOLVER MEDIA*******
	
	public static double mediaArrayInt (int[] x) {
		
		double suma=0;
		double contador=0;
		for (int n:x) {
			suma=suma+n;
			contador=contador+1;
		}
		double media=suma/contador;
		return media;	
	}

	//********SABER SI UN NUMERO ESTA EN EL ARRAY*******
	
	public static boolean estaEnArrayInt (int[] x, int y) {
		
		for (int n:x) {
			if (y==n) {
				return true;
			}
		}
		return false;	
	}
	//********POSICION EN EL ARRAY*******
	
	public static int[] posicionEnArray (int[] x, int y) {
		
		int numPosiciones=x.length;
		int[] posiciones=new int[numPosiciones];
		int p=0;
		for (int i=0;i<numPosiciones;i++) {
			if (y==x[i]) {
				posiciones[p]=i+1;
				p++;
			}
		}
		return posiciones;
	}
	//********VOLTEAR EL ARRAY*******
	
	public static void volteaArrayInt (int[] x) {
		
		int numPosiciones=x.length;
		for (int i=numPosiciones-1;i>=0;i--) {
			System.out.print(" |"+x[i]+"| ");			
		}
	}
}