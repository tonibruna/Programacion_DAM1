package Ejerc_If_Switch;

import java.util.Scanner;

public class Ejerc4_HoraMinSeg {/*Escribir un programa que pida una hora de la forma:
 hora, minutos y segundos. El programa debe mostrar la hora un segundo mas tarde*/


	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int horas, minutos, segundos;
		
		System.out.println("Introduce hora: ");
		horas=teclado.nextInt();
		
		System.out.println("Introduce minuto: ");
		minutos=teclado.nextInt();
		
		System.out.println("Introduce segundo: ");
		segundos=teclado.nextInt();
		
		segundos++; //Con esto le das el segundo de mas
		
		if (segundos>59) {  //este if es para los cambios de minuto u hora
			segundos=0;
			minutos++;
			
		if (minutos>59) {
			minutos=0;
			horas++;
			
		if (horas>23) {
			horas=0;
				}
			}
		}
		System.out.println("Hora + 1 segundo: "+ horas + ":" + minutos + ":" + segundos);
		teclado.close();

	}

}
