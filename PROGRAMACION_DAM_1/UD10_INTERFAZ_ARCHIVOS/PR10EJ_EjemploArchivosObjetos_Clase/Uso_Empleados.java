package PR10EJ_EjemploArchivosObjetos_Clase;
import java.io.*;

public class Uso_Empleados {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		String nombrefichero="C:\\Users\\ifc\\eclipse-workspace\\datos.dat";
		
		Jefatura jefeRRHH=new Jefatura ("JEFAZO Lopez", 550000, 2006, 9, 25);
		jefeRRHH.estableceIncentivo(10000);
		
		Empleado [] misEmpleados =new Empleado[4];
		
		misEmpleados[0]=new Empleado ("empleado uno", 85000, 2008, 02, 04);
		misEmpleados[1]=new Empleado ("empleado dos", 85000, 2008, 02, 14);
		misEmpleados[2]=new Empleado ("empleado uno", 85000, 2008, 02, 8);
		misEmpleados[3]=jefeRRHH;
		
		
		for (Empleado e: misEmpleados) {
			System.out.println(e.devolverEmpleado());
		}
		
		//------ESCRIBIR EL ARRRAY DE OBJETOS EN ARCHIVO
		try {
			ObjectOutputStream f= new ObjectOutputStream
					(new FileOutputStream (nombrefichero));
			f.writeObject(misEmpleados);
			f.close();
		}catch (IOException e) {
			
			System.out.println("algo ha fallado"+e.getMessage());
		}
		
	//leemos los objetos del archivo y lo cargamos en un array
		
		try {
			ObjectInputStream f= new ObjectInputStream (new FileInputStream(nombrefichero));
			//ahora leemos
			Empleado[] EmpleadosRecuperados;//Necesito un array de empleados para
			//guardar el objeto que lea del archivo
			EmpleadosRecuperados =(Empleado[]) f.readObject();
			//readObject devuelve un objeto de tipo Object (el nivel superior de los objetos)
			//, por tanto, tengo que hacer cast para transformarlo
			System.out.println("\n\n\n\n");
			for (Empleado g: EmpleadosRecuperados) {
				System.out.println(g.devolverEmpleado());
			}
			f.close();
		}catch (Exception e) {
			System.out.println("algo ha fallado");
		}
		
		
		
	}

}
