package Ejercicios01;

public class Ejerc6_Factura {

	public static void main(String[] args) {
		
		
	    double baseImponible = 30.00;

	    System.out.printf("Base imponible %8.2f\n", baseImponible);
	    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
	    System.out.printf("-----------------------\n");
	    System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));

	    //%8.2f para sacar maximo 2 decimales y el 8 tiene que ver con las posiciones
	}

}
