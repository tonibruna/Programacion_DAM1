package Grupo_maquinaria_EX_2ev_JoseA_Bruna;

import java.util.Scanner;

public class Uso_Camiones {

	public static void main(String[] args) {
		
		//Crear array de 2 camiones
		String [] miArray = new String [2];
		
		Camiones [] miscamiones = new Camiones [2];
		miscamiones [0]=new Camiones (2500,3000,15000);
		miscamiones [1]=new Camiones (2500,3000,15000);
		
		//Menu
		Scanner teclado= new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("________________________________");
			System.out.println("| Elige por teclado:            |");
			System.out.println("| 1.-Ver datos camiones         |");
			System.out.println("| 2.-Añadir contenedor          |");
			System.out.println("| 3.-Desenganchar contenedor    |");
			System.out.println("| 4.-Salir                      |");
			System.out.println("|_______________________________|");
			
			numero=teclado.nextInt();
			
			switch(numero) {
			
			case 1:
				for (Camiones e:miscamiones) {
					System.out.println(e.obtenerCamion());
					}
				break;
				
			case 2:
				//miscamiones.insertar();
				break;
				
			case 3: 
				//miscamiones.eliminar();
				break;
			
		default: System.out.println("Bye bye");
		
	    
		}
		
	}while(numero!=4);

	}
}
