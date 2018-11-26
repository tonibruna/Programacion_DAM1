package AleatoriosEjemplos;

public class Aleatorio05 {

	public static void main(String[] args) {
		
		for (int i=1;i<=20;i++ ) {
			
			//generar 20 numeros del 0 al 1000
			System.out.println(Math.random()*1000); 
			
		    //generar 20 numeros del 50 al 60
			System.out.print(((int)(Math.random()*11) +50) +"  ");
			
		}
	}

}
