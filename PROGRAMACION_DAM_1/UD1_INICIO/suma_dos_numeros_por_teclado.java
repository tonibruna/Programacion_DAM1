import java.io.*;
import java.util.Scanner; 
import java.util.Scanner;
public class suma_dos_numeros_por_teclado {

	public static void main(String[] args) throws IOException {
		
		Scanner teclado= new Scanner(System.in);
		
		//Buffer del teclado
		 InputStreamReader flujo=new InputStreamReader(System.in);
		 //BufferedReader teclado =new BufferedReader (flujo);
		 
		 //declaracion de variables
		 int num1;
		 int num2;
		 int resultado;
		 
		 //leer las variables 
		 System.out.println("Introduce un numero: ");
		 num1=teclado.nextInt();
		 System.out.println("Introduce otro numero: ");
		 num2=teclado.nextInt();
	}

}
