package EX_DICIEMBRE_JoseA_Bruna;

import java.util.Scanner;

public class Ejerc3_sumaArrays {

	public static void main(String[] args) {
		
	Scanner teclado=new Scanner(System.in);
		
		int[][] num = new int[10][10];
		int fila;
		int columna;
		int numero = teclado.nextInt();
		
		
	    for(fila=0;fila<10;fila++) {
	      for(columna=0;columna<10; columna++) {
		     num[fila][columna]=((int)(Math.random()*50));
		
		switch (numero) {
		   
		case 1:
			
	    int sumaFila;
		  for(fila=0;fila<10;fila++) {
		  sumaFila=0;  
		  for(columna=0;columna<10;columna++) {
			 System.out.printf("%7d   ", num[fila][columna]);
		     sumaFila+=num[fila][columna];
		 }  
			 System.out.printf("|%7d\n", sumaFila);
		} break;
				    
		case 2:
				    
			 for(columna=0;columna<10;columna++) {
			    System.out.print("----------");
		     }
				System.out.println("-----------");

			int sumaColumna;
			 int sumaTotal=0;
				    
				    for(columna=0;columna<10;columna++) {
				      sumaColumna=0;
				      for(fila=0;fila<10;fila++) {
				        sumaColumna+=num[fila][columna];
				      }
				     
				      sumaTotal+=sumaColumna;
				      System.out.printf("%7d   ", sumaColumna);
				    }
				    System.out.printf("|%7d   ", sumaTotal);break;
				    
		case 3: 
				    
				    
		case 5: 
			System.out.println("�Hasta luego!"); ; break;
			
			      } 
			      
		      }
	    }
	}

}
