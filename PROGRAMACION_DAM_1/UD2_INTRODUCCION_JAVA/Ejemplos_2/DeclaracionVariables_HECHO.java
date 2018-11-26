package Ejemplos_2;

public class DeclaracionVariables_HECHO {

	public static void main(String[] args) {
		byte edad; //reservamos en memoria el espacio
		edad =30; 
		System.out.println("muestra tu edad: ");
		System.out.println(edad);
		
		//otra forma de hacerlo todo a la vez
		short cm=167;
		double metros = 1.67;
		
		String nombre;
		nombre="paqui";
		
		System.out.println("Tu nombre es: "+nombre);
		
		System.out.println("Muestra tu altura en centimetros ");
		System.out.println(cm);
		System.out.println("muestra tu altura en metros "+metros);
		System.out.println("______________");
		
		int resultado = cm+5;
		System.out.println("Si hubieras comido 2 petit suis medirias: "+resultado);
		
		System.out.println("pero mides: "+cm+"cm porque solo te alimentabas de bollicaos");
		double resultadoComaFlotante =metros-1;
		System.out.println("cuando tenias la mitad de tu edad, "+(edad/2)+"a�os, medias "+resultadoComaFlotante);
		
		

	}

}
