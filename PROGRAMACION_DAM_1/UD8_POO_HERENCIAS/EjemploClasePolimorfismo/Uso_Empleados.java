package EjemploClasePolimorfismo;

public class Uso_Empleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Jefatura JefeRRHH = new Jefatura ("Manuel Navarro",550000,2008,7,30);
		JefeRRHH.estableceIncentivo(10000);
		
		Empleado [] misEmpleados = new Empleado[4];
		
		misEmpleados[0]=new Empleado ("Sofia Vergara",34000,2003,8,19);
		misEmpleados[1]=new Empleado ("Vega Sanchez",32000,2005,1,16);
		misEmpleados[2]=new Empleado ("Mario Gomez",31000,2007,12,21);
		misEmpleados[3]=JefeRRHH; //Se puede meter directo porque lo has creado ya
		
		/*for (Empleado e:misEmpleados) {
			System.out.println(e.devolverEmpleado());
		}*/
		for (Empleado e:misEmpleados) {
			System.out.println("NOMBRE EMPLEADO :"+e.getNombre() + "\t" +
					   " ID: "+e.getId() + "\t" +
					   "SUELDO: "+e.getSueldo() + "\t" + 
	        //Al estar duplicado getSueldo en las clases, 
		    //el programa coge el que necesita para la clase que es
					   "FECHA DE ALTA: "+e.getAltaContrato()
					   
					);
		}
	}

}
