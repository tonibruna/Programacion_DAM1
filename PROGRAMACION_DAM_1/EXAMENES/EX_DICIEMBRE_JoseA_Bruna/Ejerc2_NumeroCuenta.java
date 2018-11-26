package EX_DICIEMBRE_JoseA_Bruna;

import java.util.Scanner;

public class Ejerc2_NumeroCuenta {

	public static void main(String[] args) {
		
		Scanner teclado =  new Scanner (System.in);
		
		int [] cuenta= new int [20];
		
		System.out.println("Introduce los 20 digitos por teclado: ");
		for (int i=0;i<20;i++) {
			System.out.println("Introduce valor de la posicion "+i+" del array :");
			cuenta[i]=teclado.nextInt();
			}
		for (int i=0;i<20;i++) {
			  System.out.println("El valor de la posicion "+i+" del array es "+cuenta[i]);
			}
			
		//Calculamos el primer digito de control
		int ent1=cuenta[0]*4;
		int ent2=cuenta[1]*8;
		int ent3=cuenta[2]*5;
		int ent4=cuenta[3]*10;
		int suc1=cuenta[4]*9;
		int suc2=cuenta[5]*7;
		int suc3=cuenta[6]*3;
		int suc4=cuenta[7]*6;
		
		int sumaEntSuc=(ent1+ent2+ent3+ent4+suc1+suc2+suc3+suc4);
		int resto=sumaEntSuc%11;
		int digControl1=11-resto;
		System.out.println("El primer digito de control" +digControl1);
		

	
	}
}
