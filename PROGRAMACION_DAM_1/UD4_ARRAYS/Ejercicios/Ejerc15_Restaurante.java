package Ejercicios;

import java.util.Scanner;

public class Ejerc15_Restaurante {
	/**Un restaurante nos ha encargado una aplicación para colocara los clientes en sus mesas. En
una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales (mesa llena). Cuando llega un
cliente se le pregunta cuántos son. De momento el programa no está preparado para colocara
grupos mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo de 6, el programa
dará el mensaje "Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como
máximo e intente de nuevo". Para el grupo que llega, se busca siempre la primera mesa libre
(con 0 personas). Si no quedan mesas libres, se busca donde haya un hueco para todo el grupo,
por ejemplo si el grupo es de dos personas, se podrá colocar donde haya una o dos personas.
Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se pueden romper
aunque haya huecos sueltos suficientes. */

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int[] mesa=new int[10];
		int[] ocupacion=new int[10];
		int numeroIntroducido= 0;
		int mesasllenas=0;
		System.out.print("Mesa nº:   ");
		for(int i=0;i<10;i++) {
			mesa[i]=i+1;
			System.out.print("  "+mesa[i]+"  ");
		}
		System.out.println(" ");
		System.out.print("Ocupacion: ");
		for(int i=0;i<10;i++) {
			ocupacion[i]=(int)(Math.random()*5);						
			System.out.print(" |"+ocupacion[i]+"| ");
		}
		while ((numeroIntroducido >= 0)&&(mesasllenas!=10)) {
			System.out.println("\n¿Cuantos son? (Introduzca -1 para salir del programa): ");
			numeroIntroducido = teclado.nextInt();
			if ((numeroIntroducido<=4)&&(numeroIntroducido>=0)) {
				int ivacia=0;
				boolean mesavacia = false;
				for(int i=9;i>=0;i--) {
					if (ocupacion[i]==0) {
						ivacia=i;
						mesavacia=true;		
					}					
				}
				if(mesavacia==true) {
					ocupacion[ivacia]=numeroIntroducido;
				}else {
					int haysitio=0;
					for(int i=9;i>=0;i--) {
						if(numeroIntroducido<=(4-ocupacion[i])) {
							haysitio=i;				
						}
					}
					ocupacion[haysitio]=ocupacion[haysitio]+numeroIntroducido;
				}
				mesasllenas=0;
				for(int i=0;i<10;i++) {
					if(ocupacion[i]==4) {
						mesasllenas=mesasllenas+1;
					}
				}
				System.out.print("Mesa nº:   ");
				for(int i=0;i<10;i++) {
					System.out.print("  "+mesa[i]+"  ");
				}
				System.out.println(" ");
				System.out.print("Ocupacion: ");
				for(int i=0;i<10;i++) {
					System.out.print(" |"+ocupacion[i]+"| ");
				}				
			}else {
				System.out.println("Por favor, debes introducir un número entre 1 y 4");
			}
		}
		if(mesasllenas==10) {
			System.out.println(" ");
			System.out.println("Están todas mesas llenas");
		}
		teclado.close();
		

	}

}
