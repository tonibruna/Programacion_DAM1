package Ejercicios02;
import java.util.*;
public class Ejerc6_AreaTerreno {

	public static void main(String[] args) {
		
		double area,a,b,c;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce valor de a:");
		a=teclado.nextDouble();
		System.out.println("Introduce valor de b:");
		b=teclado.nextDouble();
		System.out.println("Introduce valor de c:");
		c=teclado.nextDouble();
		
		area = ((b*c)+((a-c)*b/2));
		
		System.out.println("El valor del area es:" + area);
		
		
		teclado.close();
	}

}
