package Ejercicio1_Coche;

import java.util.Scanner;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado=new Scanner (System.in);
	
		System.out.println("Introduce el color del coche: ");
		String color=teclado.nextLine();
		System.out.println("¿Tiene los asientos de cuero?: ");
		String asientos_cuero=teclado.nextLine();
		System.out.println("¿Tiene climatizador?: ");
		String climatizador=teclado.nextLine();
		
		//Creamos 4 objetos para el plano de coche. Ejercicio 3
		Coche Seat =new Coche(color,asientos_cuero,climatizador); 
		Coche Renault = new Coche(color,asientos_cuero,climatizador);
		Coche Alfa = new Coche(color,asientos_cuero,climatizador);
		Coche Citroen = new Coche(color,asientos_cuero,climatizador);
		
		System.out.println("El numero de ruedas del Seat es:" +Seat.getRuedas());
		System.out.println("El largo del Seat es:" +Seat.getLargo());
		System.out.println("El ancho del Seat es:" +Seat.getAncho());
		System.out.println("El motor de este Seat es de:" +Seat.getMotor());
		System.out.println("El peso del Seat es:" +Seat.getPeso());
		System.out.println("El color del coche Seat es: " +Seat.getColor());
		System.out.println("¿Este Seat tiene cuero en los asientos?: " +Seat.getAsientosCuero());
		System.out.println("¿Este Seat lleva climatizador?: " +Seat.getClima());
		
		Seat.setRuedas();
		System.out.println(Seat.getRuedas());
		Seat.setLargo();
		System.out.println(Seat.getLargo());
		Seat.setAncho(350);//Esta es la (int x) que ponemos en el setAncho
		System.out.println(Seat.getAncho());
		Seat.setPeso(700);
		System.out.println(Seat.getPeso());
		//Ejercicio 5. Modificar color
		Seat.setColor("Azul celeste");
		System.out.println(Seat.getColor());
		Seat.setAsientos("si");
		System.out.println(Seat.getAsientosCuero());
		Seat.setClimatizador("no");
		System.out.println(Seat.getClima());
		
		teclado.close();
	}
	

}
