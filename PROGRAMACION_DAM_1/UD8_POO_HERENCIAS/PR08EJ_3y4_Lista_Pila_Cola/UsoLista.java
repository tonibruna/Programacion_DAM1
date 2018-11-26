package PR08EJ_3y4_Lista_Pila_Cola;

import java.util.Scanner;

public class UsoLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;int numero=0;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce el tamaño del array: ");
		int tamaño=teclado.nextInt();
		Lista list= new Lista(tamaño);
		 int[] posiciones=new int[tamaño];
		do {
			System.out.println("");
			System.out.println("___________________________________ ");
			System.out.println("|1.-Obtener el numero de elementos |");
			System.out.println("|2.-Insertar numero al final       |");
			System.out.println("|3.-Insertar numero al principio   |");
			System.out.println("|4.-Eliminar numero                |");		
			System.out.println("|5.-Buscar numero                  |");
			System.out.println("|6.-Mostrar lista                  |");
			System.out.println("|7.-Salir                          |");	
			System.out.println("|__________________________________|");
		
			num = teclado.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("Hay "+list.getNumElemnetos()+" elementos en la lista");break;
			case 2: 	
				System.out.println("Introduce numero: ");
				numero = teclado.nextInt();
				list.insertarFinal(numero);break;
			case 3: 
				System.out.println("Introduce numero: ");
				numero = teclado.nextInt();
				list.insertarPrincipio(numero);break;
			case 4: 	
				list.eliminar();break;
			case 5: 
				System.out.println("Introduce numero: ");
				numero = teclado.nextInt();
				posiciones=list.buscarNumero(numero);
				System.out.println("El numero se encuentra en la posicion: ");
				for (int i=0;i<tamaño;i++) {
					if (posiciones[i]!=0) {
						System.out.print(" "+posiciones[i]);	
					} 					
				}break;
			case 6:
				list.mostrar();break;
			case 7:
				System.out.println("Has salido");
				System.out.println("                 -------------------------------");
				System.out.println("                 |            Autor            |");
				System.out.println("                 |                             |");
				System.out.println("                 |         Jorge Chueca        |");
				System.out.println("                 |                             |");
				System.out.println("                 -------------------------------");;break;
			default:
				System.out.println("ERROR, debe introducir un n�mero entre el 1 y el 7");
			}
		}while(num!=7);
		teclado.close();
	}
}
