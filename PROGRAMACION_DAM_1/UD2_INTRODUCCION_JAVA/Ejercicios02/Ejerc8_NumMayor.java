package Ejercicios02;
import java.util.Scanner;
public class Ejerc8_NumMayor {
	//Escribe un programa que determine el mayor de tres números enteros introducidos por teclado

	public static void main(String[] args) {
		
		        Scanner teclado=new Scanner(System.in);
		        
		        System.out.println("Ingresa un numero ");
		        int A = teclado.nextInt();
		        System.out.println("Ingresa otro numero ");
		        int B = teclado.nextInt();
		        System.out.println("Ingresa otro numero mas ");
		        int C = teclado.nextInt();
		        
		        if((A>=B) && (A>=C)){    //&& significa (And/y)
		        System.out.println("El numero mayor es " + A);
		        
		        }else{
		            if((B>=A) && (B>=C)){
		            System.out.println("El numero mayor es " + B);
		            
		            }else{
		            System.out.println("El numero mayor es " + C);
		            }
		        }
	}
}    