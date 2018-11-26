package Ejemplos_2;

public class EjemploOperadoresLogicos02_HECHO {

	public static void main(String[] args) {
		
		boolean a = true; 
		boolean b = false; 
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a && b = " + (a && b));
		System.out.println("a || b = " + (a || b));
		System.out.println("!a = " + !a);
		System.out.println("a || (6 > 10) = " + (a || (6 > 10)));
		//(true O false) Y (!false) = false
		System.out.println("((4 <= 4) || false) && (!a) = " + (((4 <= 4) || false) && (!a)));
		
	}

}

/*Nombre	Operador	Utilizaci�n	  Resultado
   AND	     &&	         A && B	       verdadero cuando A y B son verdaderos. Evaluaci�n condicional.
   OR	     ||	         A || B	       verdadero cuando A o B son verdaderos. Evaluaci�n condicional.
   NOT	     !	         !A	           verdadero si A es falso.
   AND	     &	         A & B	       verdadero cuando A y B son verdaderos. Siempre eval�a ambos operandos.
   OR	     |	         A | B	       verdadero cuando A o B son verdaderos. Siempre eval�a ambos operandos.
   XOR	     ^	         A ^ B	       verdadero cuando A y B son diferentes    */