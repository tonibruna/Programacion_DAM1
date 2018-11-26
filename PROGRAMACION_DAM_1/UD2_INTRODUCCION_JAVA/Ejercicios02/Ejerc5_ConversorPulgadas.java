package Ejercicios02;

public class Ejerc5_ConversorPulgadas {

	public static void main(String[] args) {
		
		/*Una modista, para realizar sus prendas de vestir, encarga las telas al extranjero. 
		  Para cada pedido, tiene que proporcionar las medidas de la tela en pulgadas, 
		  pero ella generalmente las tiene en metros. Realice un algoritmo
          para ayudar a resolver el problema, determinando cuántas pulgadas debe pedir 
          con base en los metros que requiere. (1 pulgada = 0.0254 m)*/
		
		double pulgadas = 10.00;   //este dato se puede modificar a antojo
	    double metros = (double) (pulgadas * 0.0254); 
	    System.out.print(pulgadas + " pulgadas son " + metros + " metros.");

		
	
	}
}
