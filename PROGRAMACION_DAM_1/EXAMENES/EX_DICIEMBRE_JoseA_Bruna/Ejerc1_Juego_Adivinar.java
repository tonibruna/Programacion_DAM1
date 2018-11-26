package EX_DICIEMBRE_JoseA_Bruna;

import java.util.Scanner;

public class Ejerc1_Juego_Adivinar {

	public static void main(String[] args) {
		
		Scanner teclado =  new Scanner (System.in);
		
		int NumAcierto = ((int)(Math.random()*10)+1); 
		boolean acierto=false;

	
        do {
		     System.out.println("Estoy pensando un numero, �lo adivinas?");
		     System.out.println ("Introduce un n�mero de 1 a 10:"); 
		     int n = teclado.nextInt();
		     
		     if (n==NumAcierto) {
		    		System.out.println("�Enhorabuena!, �has acertado!");
		    		acierto=true;
		       }else{
		    	   if (n>NumAcierto ) {
		   	    	System.out.println("El numero introducido es mas alto");
		   	    	System.out.println("Lo siento, tienes otro intento.");
		    	   }
		    	   if (n<NumAcierto ) {
			   	    	System.out.println("El numero introducido es mas bajo");
			   	    	System.out.println("Lo siento, tienes otro intento.");
			    	   }	
		 } 
  
		    }while (acierto==false); 
        
        teclado.close();
		

        /*if (n>NumAcierto ) {
	    	System.out.println("El numero introducido es mas alto");
	    	System.out.println("Lo siento, tienes otro intento.");*/
	
	}

}
