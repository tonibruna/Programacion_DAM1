package AleatoriosEjemplos;

public class Aleatorio03 {

	public static void main(String[] args) {
		
		for (int i=1;i<=10;i++ ) {
			
			//generar 10 numeros enteros
			System.out.printf(" "+(int)(Math.random()*10)); 
		}	
		for (int i=1;i<=10;i++ ) {
			//generar 10 numeros con 2 cifras decimales
			System.out.printf("%8.2f",(Math.random()*10)); 
		}
	}

}
