package Ejerc_If_Switch;

import java.util.Scanner;

public class Ejerc5_LetraDNI {

	public static void main(String[] args) {
		
		System.out.println("Introduce DNI: ");
		Scanner teclado = new Scanner (System.in);
		int DNI = teclado.nextInt();
		int letra;

		letra=DNI % 23; //la letra sale de obtener el MOD de el numero de DNI
		
		if (letra==0) {
			System.out.println("Tu DNI es:"+DNI+"T");
			}
		if (letra==1) {
			System.out.println("Tu DNI es:"+DNI+"R");
			}
		if (letra==2) {
			System.out.println("Tu DNI es:"+DNI+"W");
			}
		if (letra==3) {
			System.out.println("Tu DNI es:"+DNI+"A");
			}
		if (letra==4) {
			System.out.println("Tu DNI es:"+DNI+"G");
			}
		if (letra==5) {
			System.out.println("Tu DNI es:"+DNI+"M");
			}
		if (letra==6) {
			System.out.println("Tu DNI es:"+DNI+"Y");
			}
		if (letra==7) {
			System.out.println("Tu DNI es:"+DNI+"F");
			}
		if (letra==8) {
			System.out.println("Tu DNI es:"+DNI+"P");
			}
		if (letra==9) {
			System.out.println("Tu DNI es:"+DNI+"D");
			}
		if (letra==10) {
			System.out.println("Tu DNI es:"+DNI+"X");
			}
		if (letra==11) {
			System.out.println("Tu DNI es:"+DNI+"B");
			}
		if (letra==12) {
			System.out.println("Tu DNI es:"+DNI+"N");
			}
		if (letra==13) {
			System.out.println("Tu DNI es:"+DNI+"J");
			}
		if (letra==14) {
			System.out.println("Tu DNI es:"+DNI+"Z");
			}
		if (letra==15) {
			System.out.println("Tu DNI es:"+DNI+"S");
			}
		if (letra==16) {
			System.out.println("Tu DNI es:"+DNI+"Q");
			}
		if (letra==17) {
			System.out.println("Tu DNI es:"+DNI+"V");
			}
		if (letra==18) {
			System.out.println("Tu DNI es:"+DNI+"H");
			}
		if (letra==19) {
			System.out.println("Tu DNI es:"+DNI+"L");
			}
		if (letra==20) {
			System.out.println("Tu DNI es:"+DNI+"C");
			}
		if (letra==21) {
			System.out.println("Tu DNI es:"+DNI+"K");
			}
		if (letra==22) {
			System.out.println("Tu DNI es:"+DNI+"E");
			}
		teclado.close();

	}

}
