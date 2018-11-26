package Ejercicios_Funciones;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int n=1;
		int numero=1;
		do {
			System.out.println("_______________________________________________________________ ");
			System.out.println("|0.-Salir del programa                                         |");
			System.out.println("|1.-Saber si un n�mero es primo                                |");
			System.out.println("|2.-Devuelve el menor primo y mayor que el numero introducido  |");
			System.out.println("|3.-Calcular la potencia                                       |");
			System.out.println("|4.-Mostrar la tabal de multiplicar de un n�mero               |");	
			System.out.println("|5.-Muestra la tablade 1 a 10 de la potencia 2 y 3             |");
			System.out.println("|6.-Calcular la media de un conjunto de numeros                |");
			System.out.println("|______________________________________________________________|");	
		
			n = teclado.nextInt();
			
			switch (n) {
			case 0: 				
				System.out.println("            *******  Has salido del programa  *******");
				System.out.println("                 -------------------------------");
				System.out.println("                 |            Autor            |");
				System.out.println("                 |                             |");
				System.out.println("                 |                             |");
				System.out.println("                 |                             |");
				System.out.println("                 -------------------------------");break;
			case 1: 
				System.out.println("Introduce n�mero: ");
				numero=teclado.nextInt();
				if (esPrimo(numero)) {
					System.out.println("El " + numero + " es primo.");
				} else {
					System.out.println("El " + numero + " no es primo.");
				}break;
			case 2: 
				numero=teclado.nextInt();
				int menorPrimo=siguientePrimo(numero);
				System.out.println("El menor primo y mayor que el numero es: "+menorPrimo);break;
			case 3: 
				System.out.println("Introduce base: ");
				int base=teclado.nextInt();
				System.out.println("Introduce exponente: ");
				int exponente=teclado.nextInt();
				int potencia=potencia(base,exponente);
				System.out.println("La potencia es: "+potencia);break;
			case 4:
				System.out.println("Introduce numero para calcular su tabla de multiplicar: ");
				numero=teclado.nextInt();
				tablaMulti(numero);break;
			case 5: 
				System.out.println("Introduce numero: ");
				numero=teclado.nextInt();
				tablaPotencia(numero);break;
			case 6: 
				int suma=0; int contador=0; numero=0;
				System.out.println("Introduce numero para calcular la media: ");
				do {
					numero=teclado.nextInt();
					if (numero>=0) {				
						suma=suma+numero;
						contador=contador+1;
					}					
				} while (numero >= 0);
				int resultado=CalcularMedia(suma,contador);
				System.out.println("La media es: "+resultado);break;
			default: System.out.println("Debes introducir un n�mero entre el 0 y el 6");
			}			
		}while(n!=0);		
		teclado.close();	
	}
	
	//************1.-SABER SI ES PRIMO**************
	
	public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
					return false;
			}
		}
		return true;
	}
	
	//*************2.-CALCULAR EL MENOR PRIMO QUE ES MAYOR AL NUMERO********
	
	public static int siguientePrimo (int x) {
		int i=x;
		do {
			i++;
		} while (esPrimo(i)!=true);		
		return i;		
	}
	//********3.-POTENCIA*****************
	
	public static int potencia (int x, int y) {
		int resultado;
		resultado=(int) Math.pow(x, y);	
		return resultado;		
	}
	
	//*********4.-MUESTRA LA TABLA DE MULTIPLICAR**********
	
	public static void tablaMulti (int x) {
		int i=0;
		while (i<=10) {
			System.out.println(i*x);
			i++;
		}			
	}
	
	//*************5.-MUESTRA LA TABLA DE 1 A 10 DE LA POTENCIA 2 Y 3***********
	
	public static void tablaPotencia (int x) {
		int i=0;
		int resultado1;
		int resultado2;
		while (i<=10) {
			resultado1=potencia(i*x,2);
			System.out.print(resultado1);
			resultado2=potencia(i*x,3);
			System.out.println("\t"+resultado2);		
			i++;
		}			
	}
	
	//**********6.-CALCULAR MEDIA***********************
	
	public static int CalcularMedia (int x, int y) {
		int media=x/y;	
		return media;		
	}	
}