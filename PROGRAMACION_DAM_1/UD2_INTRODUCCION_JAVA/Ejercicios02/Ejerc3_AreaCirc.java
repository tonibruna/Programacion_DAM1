package Ejercicios02;

import java.util.*;

public class Ejerc3_AreaCirc {
	//Se requiere obtener el área de una circunferencia
	
	public static void main(String[] args) {
		
        double radio, area;         
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("HALLA EL AREA DE UN CIRCULO");
        
        System.out.print("Ingresar el radio r = ");
        
        radio = teclado.nextFloat();
        area =  (3.14159*radio*radio);      
        System.out.println("Area = " + area);    
        
        teclado.close();
    }           

	}