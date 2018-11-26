package Ejercicio_3_DiseñarCuenta_Jorge;

import java.util.Scanner;

public class UsoCuentaCorriente {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		/*System.out.println("Introduce nombre: ");
		String nombre=teclado.next();
		System.out.println("Introduce el DNI: ");
		String dni=teclado.next();
		CuentaCorriente cliente1 = new CuentaCorriente( nombre,dni);
		System.out.println("Introduce el dinero que quieres ingresar: ");
		int dinero= teclado.nextInt();
		String cadena;
		cliente1.ingresarDinero(dinero);
		System.out.println("Introduce el dinero que quieres sacar: ");
		dinero= teclado.nextInt();
		cadena=cliente1.sacarDinero(dinero);
		System.out.println(cadena);
		System.out.println(cliente1.mostrarInformacion());*/
		////////////////////////////
		int dinero;
		String cadena; 
		
		CuentaCorriente [] clientes=new CuentaCorriente[5];
		clientes[0]=new CuentaCorriente("Jorge Chueca", "1");
		clientes[1]=new CuentaCorriente("Alejandro","2");		
		clientes[2]=new CuentaCorriente("Jesus Garcia", "3");
		
		String introducir="";
		int numero=0;
		int aux=8;
		do {
			System.out.println("_____________________ ");
			System.out.println("|                    |");
			System.out.println("|                    |");
			System.out.println("|     BIENVENIDO     |");
			System.out.println("|     A TU BANCO     |");
			System.out.println("|    DE CONFIANZA    |");
			System.out.println("|                    |");
			System.out.println("|____________________|");
			
			Thread.sleep(2000);
			
			System.out.println("_____________________ ");
			System.out.println("|                    |");
			System.out.println("|                    |");
			System.out.println("|     INTRODUZCA     |");
			System.out.println("|       EL DNI       |");
			System.out.println("|                    |");
			System.out.println("|____________________|");
			
			introducir = teclado.next();	
			
			if(introducir.equals("1")) {
				aux=0;
			}	
			if(introducir.equals("2")) {
				aux=1;
			}
			if(introducir.equals("3")) {
				aux=2;
			}
			
			if(!introducir.equals("0")) {
				do {
					Thread.sleep(2000);
					System.out.println("_____________________ ");
					System.out.println("| Elige la operación:|");
					System.out.println("| 1.-Ingresar dinero |");
					System.out.println("| 2.-Retirar dinero  |");
					System.out.println("| 3.-Información     |");
					System.out.println("| 4.-Salir           |");
					System.out.println("|____________________|");
					
					numero = teclado.nextInt();
				
					switch (numero) {
					case 1:
						System.out.println("_____________________ ");
						System.out.println("|                    |");
						System.out.println("|     Introduce      |");
						System.out.println("|    la cantidad     |");
						System.out.println("|                    |");
						System.out.println("|                    |");
						System.out.println("|____________________|");
						dinero= teclado.nextInt();
						clientes[aux].ingresarDinero(dinero);break;
					case 2: 
						System.out.println("_____________________ ");
						System.out.println("|                    |");
						System.out.println("|     Introduce      |");
						System.out.println("|    la cantidad     |");
						System.out.println("|                    |");
						System.out.println("|                    |");
						System.out.println("|____________________|");
						dinero= teclado.nextInt();
						cadena=clientes[aux].sacarDinero(dinero);
						System.out.println(cadena);break;
					case 3: 
						System.out.println(clientes[aux].mostrarInformacion());break;
					default:
						System.out.println("_____________________ ");
						System.out.println("|                    |");
						System.out.println("|       ERROR        |");
						System.out.println("|     Introduce      |");
						System.out.println("|     un número      |");
						System.out.println("|     del 1 al 4     |");
						System.out.println("|____________________|");
					}
				}while(numero!=4);
			}			
		}while(!introducir.equals("0"));
		
		System.out.println("----------------------");
		System.out.println("|     HAS SALIDO     |");
		System.out.println("|                    |");
		System.out.println("|       Autor        |");
		System.out.println("|    Jorge Chueca    |");		
		System.out.println("|                    |");		
		System.out.println("----------------------");	
	}
}