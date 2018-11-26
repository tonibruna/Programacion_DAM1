package Ejerc_If_Switch;

import java.util.Scanner;

public class Ejerc6_Granja {
/* En granja se compra diariamente una cantidad (comidaDiaria ) de comida para los animales.
   El número de animales a alimentar (todos de la misma especie) es numAnimales, y sabemos que
   cada animal come una media de kilosporAnimal. Diseñar un programa que solicite al usuario 
   los valores anteriores y determine si disponemos de alimento suficiente para cada animal. 
   En caso negativo, ha de calcular cúal es la ración que corresponde a cada uno de los animales. 
   Evitar que la aplicación realice divisiones por cero.*/

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce comida diaria en kilos: ");
		int comidaDiaria = teclado.nextInt();
		System.out.println("Introduce el numero de animales: ");
		int numAnimales = teclado.nextInt();
		System.out.println("Introduce los kilos que consume cada animal: ");
		int kilosporAnimal = teclado.nextInt();
		
		int consumo;
		int kilosrestantes;
		consumo=numAnimales*kilosporAnimal;
		kilosrestantes=comidaDiaria-consumo;
		if (kilosrestantes==0) {
			System.out.println("Tienes la comida necesaria");
		}
		if (kilosrestantes>0) {
			System.out.println("Sobran "+kilosrestantes+" kilos.");
		}
		if (kilosrestantes<0) {
			System.out.println("Faltan "+kilosrestantes+" kilos");
		}
		teclado.close();

	}

}
