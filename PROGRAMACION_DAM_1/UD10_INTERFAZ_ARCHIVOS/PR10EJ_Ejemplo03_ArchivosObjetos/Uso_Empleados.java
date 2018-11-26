package PR10EJ_Ejemplo03_ArchivosObjetos;

import java.io.*;
import java.util.Scanner;


public class Uso_Empleados {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		String nombrefichero="C:\\Users\\Paqui\\Documents\\08_ESPACIO_TRABAJO\\datos.dat";
		/* tenemos un array de objetos y lo vamos a serializar, lo vamos a transformar en una serie de bytes para almacenarlo en el disco duro
		 * para ello usamos la interfaz serializable. Solo indica que este array se va a transformar en bytes. 
		 * 
		 * 1) ¿de que tipo son los objetos ? de empleados, por tanto nos vamos a empleados y decimos que esa interfaz implementa serializable
		 *    
		 *     - Vamos a la api de java y vemos la interfaz Serializable, no hay metodo. 
		 *     
		 *     - Vemos también la api de java ObjectOutputStream
		 * 
		 * 2) Construimos el objectOutputStream dentro de un stream
		 * 
		 * 3) ahora vamos a recuperar con objectInputStream
		 * 		-creamos el flujo
		 * 
		 * 		- vamos a usar readObject(), pero en la api de java se ve que ese método devuelve un array. Tendremos que hacer un cast
		 * 
		 * 
		 * 	
		 *  */
		
		Empleado [] misEmpleados;
		misEmpleados=new Empleado[3];
		
		misEmpleados[0]=new Empleado("Paqui Garcia", 85000, 2008,02,04);
		misEmpleados[1]=new Empleado("Marta Lopez", 80000, 2008,11,01);
		misEmpleados[2]=new Empleado("Ana Garcia", 90000, 2012,12,03);
		
				
		try {
			ObjectOutputStream f= new ObjectOutputStream (new FileOutputStream(nombrefichero));
			f.writeObject(misEmpleados);
			f.close();
		}catch (IOException e){
			System.out.println("algo ha fallado");
		}
		
		//---------probamos la primera parte
		
		
		for (Empleado e: misEmpleados) {
			e.setSueldo(0.0);
		}
		for (Empleado e: misEmpleados) {
			System.out.println(e.devolverEmpleado());
		}
		
		
		
		
				
		Scanner teclado=new Scanner (System.in);
		teclado.nextLine(); 
		
		
		//-----------segunda parte
		try {
			ObjectInputStream f= new ObjectInputStream (new FileInputStream(nombrefichero));
		
			//ahora vamos a leer, pero necesitamos un array
							
			Empleado[] recup;
			recup= (Empleado[]) f.readObject();
			
			for (Empleado g: recup) {
				System.out.println(g.devolverEmpleado());
			}
			f.close();
		}catch (Exception e){
			System.out.println("algo ha fallado");
		}
		
		
		
		
	}

	

}
