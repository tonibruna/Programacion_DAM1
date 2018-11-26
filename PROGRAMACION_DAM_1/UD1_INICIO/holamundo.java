import java.io.*;  

public class holamundo {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 /*esto es un comentario*/
		
		
		 /*instrucciones necesarias para poder leer desde teclado*/
		 InputStreamReader flujo=new InputStreamReader(System.in);
		 BufferedReader teclado =new BufferedReader (flujo);
		 
		 /*es igual con: Scanner teclado=new Scanner(System.in);*/
		 
		 String miNombre; /*declaramos la variable*/
		 
		 System.out.println("Introduce tu nombre: "); /*escribir texto*/
		 miNombre = teclado.readLine(); /*leer por teclado*/
		 
         System.out.println("\nPor fin sabemos que tu nombre es: ");
         /* /n : para salto de linea */
         System.out.println(miNombre);
	}

}
