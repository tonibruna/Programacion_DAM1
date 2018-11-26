package Ejercicio_3_DiseñarCuentaCorriente;

import java.util.Scanner;

public class Uso_CuentaCorriente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente Cuenta1 =new CuentaCorriente(3000); //
		//Aqui pones el constructor que te convenga metiendo los valores de la lista de argumentos
		
		Cuenta1.ingresarDinero(80);
		
		System.out.println(Cuenta1.DevolverDatos());
		
		Cuenta1.sacarDinero(20);
		
		System.out.println(Cuenta1.DevolverDatos());
		
		//Crear Array con 5 clientes
		
		String [] miArray = new String [5];
		
		CuentaCorriente [] clientes = new CuentaCorriente [5];
		
		clientes [0] = new CuentaCorriente ("Maria","65747345L");
		clientes [1] = new CuentaCorriente ("Pablo","87457124P");
		clientes [2] = new CuentaCorriente ("Marcos","48571247K");
		clientes [3] = new CuentaCorriente ("Enzo","34675691H");
		clientes [4] = new CuentaCorriente ("Sofia","87678970J");
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 3 del menu: ");
		int numero=teclado.nextInt();
		
		switch (numero) {
		
		case 1:
			for (int i=0;i<5;i++) {
				clientes[i].ingresarDinero(50);
			}
			
			for (CuentaCorriente e:clientes) {
				System.out.println(e.DevolverDatos());
			
			
		}break;
			
		case 2:
			for (int i=0;i<5;i++) {
				clientes[i].sacarDinero(25);
			}	
			for (CuentaCorriente e:clientes) {
				System.out.println(e.DevolverDatos());
			
			
		
		}break;
			
		case 3:
			for (CuentaCorriente e:clientes) {
				System.out.println(e.DevolverDatos());
			}break;
			default:System.out.println("Introduce un numero del 1 al 3 del menu: ");break;
	
		}
	
	}
}
