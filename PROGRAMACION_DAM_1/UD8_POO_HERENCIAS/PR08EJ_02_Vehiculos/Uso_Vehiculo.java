package PR08EJ_02_Vehiculos;

import java.util.Scanner;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicicleta Alma = new Bicicleta ("Orbea");
		Coche Leon = new Coche("Seat");
		
		Scanner teclado= new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("____________________________");
			System.out.println("| Elige por teclado:        |");
			System.out.println("| 1.-Anda con la bici       |");
			System.out.println("| 2.-Haz caballito          |");
			System.out.println("| 3.-Anda con el coche      |");
			System.out.println("| 4.-Quema rueda            |");
			System.out.println("| 5.-Cuentakilometros bici  |");
			System.out.println("| 6.-Cuentakilometros coche |");
			System.out.println("| 7.-Kilometros Totales     |");
			System.out.println("| 8.-Salir                  |");
			System.out.println("|___________________________|");
			
			numero=teclado.nextInt();
			
			switch(numero) {
			
			case 1:
				System.out.println("Marca los kms que quieres recorrer con tu bici");
				int km=teclado.nextInt();
				Alma.recorrer(km);
			    break;
			    
			case 2: 
				System.out.println(Alma.hacerCaballito());
				break;
				
			case 3: 
				System.out.println("Marca los kms que quieres recorrer con tu buga");
				int kms=teclado.nextInt();
				Leon.recorrer(kms);
			    break;
			    
			case 4:
				System.out.println(Leon.quemarRueda());
				break;
				
			case 5:
				System.out.println("La bicicleta ha recorrido "+Alma.getKmsNuevos()+" km");
			    break;
			    
			case 6:
				System.out.println("El coche ha recorrido "+Leon.getKmsNuevos()+" km");
			    break;
			    
			case 7:
				System.out.println("El total de kilometros recorridos es "+Vehiculo.getKilometrajeTotal());
			    break;
			    
			default: System.out.println("Bye bye");
				
			    
			}
			
		}while(numero!=8);
		
		
	
			teclado.close();
	}

}
