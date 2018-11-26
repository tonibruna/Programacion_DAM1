package Ejemplos;
import java.util.*; //Importar toda la libreria util de java

public class LecturaTecladoyCasting {

	public static void main(String[] args) {
		
    Scanner teclado = new Scanner (System.in);
    
    int entero;
    float decimales;
    String mitexto;
    
    System.out.println("dame un entero: ");
    entero=teclado.nextInt();
    
    System.out.println("Dame un numero con decimales: ");
    decimales=teclado.nextFloat();
    
    mitexto=teclado.nextLine(); //para evitar que el intro anterior lo adjudique a texto
    System.out.println("dame un texto:");
    mitexto=teclado.nextLine();
    
    System.out.println("el entero fue: "+entero);
    System.out.println("el decimal fue:"+decimales);
    System.out.println("el texto fue:"+mitexto);
    
    //ahora ejemplo de Casting
    
    System.out.println("___________________");
    System.out.println("Introduce 3 numeros separados por decimales, separados por un espacio");
    float x1=teclado.nextFloat(); // ponemos float porque son numeros pequeños
    float x2=teclado.nextFloat();
    float x3=teclado.nextFloat();
    System.out.println("numero1: "+x1);
    System.out.println("numero2: "+x2);
    System.out.println("numero3: "+x3);
    
    
    
    
    
	}

}