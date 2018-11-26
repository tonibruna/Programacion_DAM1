package Ejerc_If_Switch;

import java.util.Scanner;

public class Ejerc3_DiaMesAñoFecha { /*Pedir el dia, mes y a�o de una fecha e indicar si es correcta.
Recordamos que existen meses cos 28,30 y 31 dias. No consideramos los a�os bisiestos.*/

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce d�a: ");
		int dia = teclado.nextInt();
		System.out.println("Introduce mes: ");
		int mes = teclado.nextInt();
		
		if (mes>12) {
			System.out.println("Fecha incorrecta");
		}
		else {
		
			if ((mes==1) || (mes==3) || (mes==5) || (mes==7) || (mes==8) || (mes==10) || (mes==12)) {        
				if ((dia>0)&&(dia<=31)) {
				System.out.println("Fecha correcta");
				}
			else {
				System.out.println("Incorrecto");
				} 
			}	
			if ((mes==4) || (mes==6) || (mes==9) || (mes==11)) {
				if ((dia>0)&&(dia<=30)) {
					System.out.println("Fecha correcta");
					}
				else {
					System.out.println("Incorrecto");
					} 
			}
			if (mes==2) {
				if ((dia>0)&&(dia<=28)) {
					System.out.println("Fecha correcta");
					}
				else {
					System.out.println("Incorrecto");
					} 
			}				
		}
		teclado.close();		
	}

}
