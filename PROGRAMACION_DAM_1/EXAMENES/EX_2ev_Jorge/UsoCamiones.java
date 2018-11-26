package EX_2ev_Jorge;

import java.util.Scanner;

public class UsoCamiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;int numero=0;
		Scanner teclado = new Scanner (System.in);
		//Mecanicos
		Mecanicos mecanico1=new Mecanicos ("Javier", 66666, "Frenos");
		Mecanicos mecanico2=new Mecanicos ("Jorge", 77777, "Hidraúlica");
		//Cabezas
		Cabeza cabeza1=new Cabeza ("11111", 3300, 1999, mecanico1);
		Cabeza cabeza2=new Cabeza ("22222", 5500, 2007, mecanico2);
		//Conductores
		Conductores conductor1=new Conductores ("Miguel", "33333", 1500, "Conductor");
		Conductores conductor2=new Conductores ("Mario", "44444", 1200, "Tironero");
		//Camiones		
		Camion [] misCamiones =new Camion[2];
		misCamiones[0]=new Camion (cabeza1, conductor1);
		misCamiones[1]=new Camion (cabeza2, conductor2);
		//Contenedores
		Contenedores contenedor1=new Contenedores (1500, 1000, "Lana");
		
		do {
			//Creamos el menú
			System.out.println("");
			System.out.println(" ______________________________________________________ ");
			System.out.println("|                MENÚ PRINCIPAL                        |");
			System.out.println("|1.-Visualizar los datos de los camiones               |");
			System.out.println("|2.-Añadir contenedor a un camión determinado          |");
			System.out.println("|3.-Desenganchar un contenedor de un camión determinado|");		
			System.out.println("|4.-Salir                                              |");	
			System.out.println("|______________________________________________________|");
		
			num = teclado.nextInt();
			
			switch (num) {
			case 1:
				//Mostramos los datos del primer camión
				System.out.println("CAMIÓN 1");
				System.out.println(misCamiones[0].mostrar());
				misCamiones[0].mostrarContenedores();
				
				//Mostramos los datos del segundo camión
				System.out.println("\nCAMIÓN 2");
				System.out.println(misCamiones[1].mostrar());
				misCamiones[1].mostrarContenedores();				
				break;
			case 2: 
				//Insertar contenedor
				System.out.println("Introduzca el numero del camión al que le quieres añadir un contenedor: ");
				numero = teclado.nextInt();
				if(numero==1) {
					if(misCamiones[0].numElementos()!=3) {
						misCamiones[0].insertar(contenedor1);
					}else {
						System.out.println("No se pueden añadir más contenedores");
					}					
				}
				if(numero==2) {
					if(misCamiones[1].numElementos()!=3) {
						misCamiones[1].insertar(contenedor1);
					}else {
						System.out.println("No se pueden añadir más contenedores");
					}
				}
				break;
			case 3: 
				//Desenganchar contenedor
				System.out.println("Introduzca el numero del camión al que le quieres desenganchar un contenedor: ");
				numero = teclado.nextInt();
				if(numero==1) {
					if(misCamiones[0].numElementos()!=0) {
						misCamiones[0].eliminar();
					}else {
						System.out.println("No hay más contenedores para desenganchar");
					}					
				}
				if(numero==2) {
					if(misCamiones[1].numElementos()!=0) {
						misCamiones[1].eliminar();
					}else {
						System.out.println("No hay más contenedores para desenganchar");
					}					
				}
				break;
			case 4:
				System.out.println("Has salido");
				System.out.println("                 -------------------------------");
				System.out.println("                 |            Autor            |");
				System.out.println("                 |                             |");
				System.out.println("                 |         Jorge Chueca        |");
				System.out.println("                 |                             |");
				System.out.println("                 -------------------------------");break;
			default:
				System.out.println("ERROR, debe introducir un número entre el 1 y el 4");
			}
		}while(num!=4);
		teclado.close();
	}
}