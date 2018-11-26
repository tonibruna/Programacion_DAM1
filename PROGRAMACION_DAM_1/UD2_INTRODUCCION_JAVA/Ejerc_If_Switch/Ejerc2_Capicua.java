package Ejerc_If_Switch;

import java.util.Scanner;

public class Ejerc2_Capicua {

	public static void main(String[] args) {
	
		int unidades, decenas, centenas, umillar;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un numero entre 0 y 9.999: ");
		int numero= teclado.nextInt();
		
		if (numero<10) {
			System.out.println("El numero es capicua");
		}
		if ((numero>=10)&&(numero<100)) {
			unidades=numero%10;
			decenas=numero/10;
			if (unidades==decenas) {
				System.out.println("El numero es capicua");
			}else {
				System.out.println("El numero NO es capicua");
			}
		}
		if ((numero>=100)&&(numero<1000)) {
			unidades=numero%10;
			numero=numero/10;
			decenas=numero%10;
			centenas=numero/10;			
			if (unidades==centenas) {
				System.out.println("El numero es capicua");
			}else {
				System.out.println("El numero NO es capicua");
			}
		}
		if ((numero>=1000)&&(numero<10000)) {
			unidades=numero%10;
			numero=numero/10;
			decenas=numero%10;
			numero=numero/10;
			centenas=numero%10;
			umillar=numero/10;
			if ((unidades==umillar)&&(decenas==centenas)) {
				System.out.println("El numero es capicua");
			}else {
				System.out.println("El numero NO es capicua");
			}
		}
		teclado.close();

	}

}
