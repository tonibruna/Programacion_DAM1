package Ejercicios02;
import java.util.*;
public class Ejerc4_SueldoMes {

	public static void main(String[] args) {
		/*Determinar el sueldo mensual de un trabajador con base en las horas que trabaja
		  y el pago por hora que recibe.*/

		
		  Scanner teclado = new Scanner (System.in);
		  
		float horas_trabajo;
		float precio_hora;
		float sueldo_mensual;
		
		System.out.println("Cuantas horas ha trabajado: ");
	    horas_trabajo=teclado.nextFloat();

	    System.out.println("Cuanto gana la hora: ");
	    precio_hora=teclado.nextFloat();
	    
	    sueldo_mensual= horas_trabajo*precio_hora;
	    
	    System.out.println("Su sueldo mensual es:"+sueldo_mensual);
	    
	    teclado.close();
	}

}
