package Ejemplos;

public class operador_logico_comparacion {

	public static void main(String[] args) {
		
		boolean a= true; //boolean para verdadero o falso
	 	boolean b= false;
	 	System.out.println("a= "+a);
	 	System.out.println("b = "+b);
	 	System.out.println("a && b = "+(a && b));
	 	System.out.println("a || b = "+(a || b));
	 	 
	 	System.out.println("!a = "+!a);
	 	System.out.println("a || (6>10) = "+ (a||(6>10)));
	 	 
	 	System.out.println("((4<=4) || false) && (!a)) ="+(((4<=4) || false) && (!a)));

	}

}

/*
                  ==               Es igual
                  !=               Es distinto
                  <, <=, >, >=     Menor, menor o igual, mayor, mayor o igual
                  &&               Operador and (y)
                  ||               Operador or (o)
				  !                Operador not (no)                                          */






