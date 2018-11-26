package PR10EJ_Ejemplo01_excepciones;

import java.util.Scanner;

public class Excepciones02 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int M,a=0,b=0, c=0;
		int matriz[]=new int[5];
		Scanner teclado = new Scanner (System.in);
		//-----------parte 1-------
		System.out.println("Introduzca 3 numeros separados por espacios");
		try {//prueba a hacer esto, y si no lo hace se hace el catch
			 a=teclado.nextInt();
			 b=teclado.nextInt();
			 c=teclado.nextInt();
			
		}catch (Exception e) {//dejas sin cerrar el scanner. necesitas que se ejecute un codigo si se ejecuta el codigo o si no se ejecuta
			System.out.println("ha habido un error");
		}finally {//te aseguras que esto se haga tanto si las cosas van bien como si van mal
			teclado.close();
		}
		
		if (a>b) {
			if (a>c) {
				 M = a;				
			}else {
				 M = c;
			}
		}else {
			if (b>c) {
				 M = b;
			}else {
				 M = c;
			}
		}
		System.out.println ("El mayor es "+ M);
		
		//-------------------------parte 2
		int i = 1;
		while (i < 11) {
		System.out.print(i);
		i++;
		}
			
	}

}
