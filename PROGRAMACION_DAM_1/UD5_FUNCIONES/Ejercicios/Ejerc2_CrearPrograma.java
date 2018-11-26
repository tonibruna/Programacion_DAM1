package Ejercicios;

import java.util.Scanner;

public class Ejerc2_CrearPrograma {

	public static void main(String[] args) {
		
	 Scanner teclado= new Scanner(System.in);
		 
	 int Op=0;

		do {
			System.out.println(" ___________________________");
			System.out.println("|************MENU***********|");
			System.out.println("|Op1 esPrimo                |");
			System.out.println("|Op2 siguientePrimo         |");
			System.out.println("|Op4 potencia               |");
			System.out.println("|Op5 tabla multiplicar      |");
			System.out.println("|Op6 tabla potencias        |");
			System.out.println("|op7 media conjunto numeros |");
			System.out.println("|Para salir, pulsa 0        |");
			System.out.println("|___________________________|\n");
		}
		while (Op!=0);
		
		
	System.out.println("Introduce el numero de la opcion que deseas: ");
	int numero= teclado.nextInt();
	
	switch (numero) {
	
	case 0: 				
		System.out.println("*******  Has salido del programa  *******");
		break;
	
	case 1: 
		System.out.println("Introduce un numero: ");
			numero=teclado.nextInt();
			if(esPrimo(numero)) {
				System.out.println("El " +numero+ " es primo.");
			}else {
				System.out.println("El " +numero+ " no es primo.");
			}break;
			
	case 2:
		numero=teclado.nextInt();
		int posteriorPrimo=siguientePrimo(numero);
		System.out.println("El siguiente numero primo al que has introducido es: "+posteriorPrimo);
		break;
	
	case 4:
		System.out.println("Introduce la base: ");
		int base=teclado.nextInt();
		System.out.println("Introduce el exponente: ");
		int exponente=teclado.nextInt();
		int potencia=potencia(base,exponente); 
		System.out.println("El valor de la potencia es: "+potencia);
		break;
	
	case 5:
		System.out.println("Introduce numero para mostrar su tabla de multiplicar: ");
		numero=teclado.nextInt();
		tablaMultiplicar(numero);
		break;
		
	case 6:
		System.out.println("Introduce numero para tabla de potencia: ");
		numero=teclado.nextInt();
		tablaPotencia(numero);
		break;
	
	default:
		System.out.println("Esa opcion no es valida.");break;
		
	}teclado.close();
}
	
	
	//***** SABER SI ES PRIMO ******
	
	public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
					return false;
			}
		}
		return true;
	}
	
	//************* CALCULAR EL MENOR PRIMO QUE ES MAYOR AL NUMERO ********

	public static int siguientePrimo (int x) {
		int i=x;
		do {
			i++;
		   } while(esPrimo(i)!=true);
		return i;
	}
	
	//************** CALCULO POTENCIA ************
	
	public static int potencia(int x,int y) {
		int resultado;
		resultado=(int) Math.pow(x, y);
		return resultado;
	}

	//************ MOSTRAR TABLA MULTIPLICAR **********
	
	public static void tablaMultiplicar(int x) {
		for (int i=0;i<=10;i++) {
			System.out.println(x+" * "+i+" = "+x*i);
	    }
	}

	//************ MOSTRAR LA TABLA DE 1 A 10 DE LA POTENCIA 2 Y 3 ***********
	
	public static void tablaPotencia (int x) {
		int i=0;
		int potencia2;
		int potencia3;
		while(i<=10) {
			potencia2=potencia(i*x,2);
			System.out.println(potencia2);
			potencia3=potencia(i*x,3);
			System.out.println(potencia3);
			i++;
			}
		}
	
}
		



