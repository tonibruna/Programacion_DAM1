package AleatoriosEjemplos;

public class Ejemplo_completo_NumAleatorios {

	public static void main(String[] args) {
		
		 System.out.println ("\n\n1) Generar 10 numeros aleatorios entre [0 - 1) nunca llega a generarse 1");
	        System.out.println ("El rango es [0,0000... - 0,9999...]");
	        for (int i=0;i<10;i++) {
	            System.out.print(" "+Math.random());
	        }
	       
	        System.out.print ("\n\n2) Ahora vamos a generar 10 numeros aleatorios entre 0 y 10, sin llegar a 10 (con decimales)");
	        System.out.println ("\n el rango es [0,000... - 9.999...] ya que multiplicamos el valor anterior x 10");
	        for (int i=0;i<10;i++) {
	            System.out.print(" "+Math.random()*10);
	        }
	        System.out.print ("\n\n3) El siguiente paso es conseguir numeros enteros. lo hacemos con casting. ");
	        System.out.println ("Aqui quitamos los decimales del ejercicio anterior, por lo que nunca llega a 10");
	        System.out.println ("Aqui el rango es [0 - 9]");
	        for (int i=0;i<10;i++) {
	            System.out.print(" "+(int)(Math.random()*10));
	        }
	       
	        System.out.print ("\n\n4) Ahora queremos conseguir es de 1 a 10. ");
	        System.out.println ("Añadimos una suma de 1 unidad. Así movemos el rango anterior quedando de la sguiente forma");
	        System.out.println ("Aqui el rango es [0+1 - 9+1]==>[1 - 10]");
	       
	        for (int i=0;i<10;i++) {
	            System.out.print(" "+(int)(Math.random()*10 +1));
	        }
	       
	        System.out.print ("\n\n5) Ahora queremos conseguir  0 a 10. ");
	        System.out.println ("Multiplicamos por 11. Así, antes del casting los límites quedan [0,00000...*11 - 0,9999..*11, resultando [0.000... - 10.999...");
	        System.out.println ("\nal hacer casting queda [0 - 10]");
	       
	        for (int i=0;i<10;i++) {
	            System.out.print(" "+(int)(Math.random()*11));
	        }
	       
	        System.out.print ("\n\n6) Ahora queremos conseguir  50 a 60. ");
	        System.out.print ("\nMultiplicamos por 11. Así, antes del casting los límites quedan [0,00000...*11 - 0,9999..*11, resultando [0.000... - 10.999...");
	        System.out.println ("\nal hacer casting queda [0 - 10]. Si sumamos 50 al resultado el intervalo quedara [50 - 60]");
	       
	        for (int i=0;i<10;i++) {
	            System.out.print(" "+(int)(Math.random()*11 +50));
	        }
	       
	        System.out.print ("\n\n7) El resto queda a la imaginación.  ");
	        System.out.println ("\nSi queremos conseguir numeros entre 0 y 5 podemos dividir entre 2 el random de [0 - 10]");
	        System.out.println ("\n");
	       
	        for (int i=0;i<10;i++) {
	            System.out.print(" "+(int)((Math.random()*11) /2));
	        }
	       
	    }

	}


