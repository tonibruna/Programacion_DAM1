package Ejemplos_2;
import java.util.*;

public class UsoPrintf_HECHO {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		
		System.out.printf ("%d\n", 26);//%d, en base 10
		System.out.printf ("%d\n", +26);//%d, en base 10 con signo
		System.out.printf ("%d\n", -26); //%d, en base 10 con signo
		System.out.printf ("%o\n", 10);//%o, octal
		System.out.printf ("%x\n", 26);//%x, hexdecimal con minusculas
		System.out.printf ("%X\n", 26);//%X, hexdecimal con mayusculas
		
		System.out.println("pulsa una tecla para continuar...");
		Scanner teclado = new Scanner (System.in);
		
		String tecla = teclado.nextLine();
		
		//e, E -> Muestra el valor de punto flotante en notaci�n exponencial. 
		//El car�cter de conversi�n E muestra la salida en letras may�sculas.
		System.out.printf ("%e\n", 12345678.9); 
		System.out.printf ("%e\n", +12345678.9);
		System.out.printf ("%e\n", -12345678.9);
		System.out.printf ("%E\n", 12345678.9);
		//f-> muestra el valor de punto flotante en notacion decimal
		System.out.printf ("%f\n", 12345678.9);
		System.out.printf ("%8.2f\n\t%8.5f", 12345678.9,12345678.987654);
		
		System.out.println("\npulsa una tecla para continuar...");
		tecla = teclado.nextLine();
		
		
		//c, C-> muestra un caracter
		//s, S-> muestra una cadena. minusculas y mayusculas
		char caracter ='A';
		String string ="esta tambien es una cadena";
		Integer entero =1234;
		
		
		System.out.printf ("%c\n", caracter); //si queremos mostrar string no funciona
		System.out.printf ("%s\n", "esta tambi�n es una cadena");
		System.out.printf ("%s\n", string);
		System.out.printf ("%S\n", string);
		System.out.printf ("%s\n", entero); //llamada implicita a toString
		
		System.out.printf("%-20s%-20s%-20s\n","0000011","Ca rlos","Mauricio");
		System.out.printf("%-20s%-20s%-20s\n","0001442","Andrea","Margarita");
		System.out.printf("%-20s%-20s%-20s\n","0344127","Marco","Antonio");
		System.out.printf("%-20s%-20s%-20s\n","9532114","Juan","Fernando");

		System.out.println("\npulsa una tecla para continuar...");
		tecla = teclado.nextLine();
		
		//imprimiendo con amplitudes y precisiones de campo
		System.out.printf("%4d\n", 1);
		System.out.printf("%4d\n", 12);
		System.out.printf("%4d\n", 123);
		System.out.printf("%4d\n", 1234);
		System.out.printf("%4d\n", 12345);
		
		System.out.printf("%4d\n", -1);
		System.out.printf("%4d\n", -12);
		System.out.printf("%4d\n", -123);
		System.out.printf("%4d\n", -1234);
		System.out.printf("%4d\n", -12345);
		
		System.out.println("\npulsa una tecla para continuar...");
		tecla = teclado.nextLine();
		
		
		
		double f=123.987654;
		String s="Hola Mundo";
		
		System.out.printf("Usando precision para "+"numeros de punto flotante\n");
		System.out.printf("\t%.3f\t%.3e\t%.3g\n\n", f,f,f);
		System.out.printf("%.4g", f);
		System.out.printf("\t%-9s\n",s);
		System.out.printf("\t%.9s\n",s);
		
	
		
		
	}

}
