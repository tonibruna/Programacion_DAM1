package Ejercicios02;
import java.util.*;
public class Ejerc7_ConversorSegundos {
	
	/*Diseñar una aplicación que solicite al usuario que introduzca una cantidad de segundos.
	  La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos 
	  introducidos por el usuario. */

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
        int num,hor,min,seg;
        
        System.out.println("Ingrese los segundos a convertir:");
        num=teclado.nextInt();
        
        hor=num/3600;
        min=(num-(3600*hor))/60;
        seg=num-((hor*3600)+(min*60));
       
        System.out.println(hor+"h "+min+"m "+seg+"s");
		
        teclado.close();
	}

}
