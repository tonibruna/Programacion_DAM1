package EjemploInterfaces_01_Clase;
import java.util.Arrays;
public class Uso_Empleados {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		
		Jefatura jefeRRHH=new Jefatura ("JEFAZO Lopez", 55000, 2006, 9, 25);
		//jefeRRHH.estableceIncentivo(232570);
		Empleado [] misEmpleados =new Empleado[5];
		
		misEmpleados[0]=new Empleado("Paqui Garcia", 85000, 2008,02,04);
		misEmpleados[1]=new Empleado("Marta Lopez", 80000, 2008,11,01);
		misEmpleados[2]=new Empleado("Ana Garcia", 90000, 2012,12,03);
		misEmpleados[3]=jefeRRHH;//polimorfismo.
		//principio de sustitución:SE PUEDE UTILIZAR UN OBJETO DE LA SUBCLASE
		//SIEMPRE QUE EL PROGRAMA ESPERE UN OBJETO DE LA SUPERCLASE
		
		//O LO QUE ES LO MISMO: UN OBJETO SE PUEDE COMPORTAR DE DIFERENTE
		//FORMA DEPENCIENDO DEL CONTEXTO. LAS VARIABLES OBJETO SON POLIMORFICAS
		//otra forma de ver el polimorfismo
		misEmpleados[4]=new Jefatura("JEFAZA Garcia", 90000, 2012,12,03);
		
		//misEmpleados5 es de tipo Incentivo, no nos sale metodo incentivo
		
		//misEmpleados[5].
		for (Empleado e: misEmpleados) {
			e.subirSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		for (Empleado e: misEmpleados) {
			System.out.println("NOMBRE EMPLEADO :"+e.getNombre() + "\t" +
					"ID :"+e.getId() +"\t" +
				   " SUELDO: "+        e.getSueldo()+"\t" +//a que metodo estamos llamando?? al de empleado
	   						
				   								
				   " FECHA DE ALTA: "+e.getAltaContrato());
		}
		
		//OJO!!!!!PQ APARECEN DESORDENADOS LOS IDS
		//OBSERVAR EL SUELDO DE JEFE, ACTUA EL POLIMORFISMO, Y getSueldo es el 
		//getSueldo de Jefatura.
		
		//¿como sabe a que método tiene que llamar? enlazado dinamico, la maquina
		//virtual de java es capaz en tiempo de ejecucion de saber a que método
		//tiene que llamar.
		
	//ejemplo metodo instanceOf
	Empleado[] misEmpleados2 =new Empleado[5];
	misEmpleados2[0]  = new Jefatura ("sonia", 85000, 2012, 05,05);
	Empleado directorComercial=new Empleado ("susana",85000,2013,4,9);
	
	if(directorComercial instanceof Empleado) {
		System.out.println("Es de tipo Empleado");
	}
	Comparable ejemplo =new Empleado ("eli", 76000, 2011, 06,07);
	if(ejemplo instanceof Comparable) {
		System.out.println("Implementa la interfaz comparable");
	}
	
	}
}
