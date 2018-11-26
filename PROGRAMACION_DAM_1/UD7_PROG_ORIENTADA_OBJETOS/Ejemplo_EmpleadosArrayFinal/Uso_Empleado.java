package Ejemplo_EmpleadosArrayFinal;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1=new Empleado("Maria Lopez",85000,2008,02,04);
		Empleado empleado2=new Empleado("Marta Soria",87000,2007,01,24);
		Empleado empleado3=new Empleado("Mario Santos",78000,2005,10,15);
		
		empleado1.subirSueldo(5);
		empleado2.subirSueldo(13);
		empleado3.subirSueldo(6);
		
		System.out.println("NOMBRE EMPLEADO :"+empleado1.getNombre() + 
			 	" SUELDO: "+ empleado1.getSueldo()+
			 	" FECHA DE ALTA: "+empleado1.getAltaContrato());
		
		System.out.println("NOMBRE EMPLEADO :"+empleado2.getNombre() + 
			 	" SUELDO: "+ empleado2.getSueldo()+
			 	" FECHA DE ALTA: "+empleado2.getAltaContrato());
		
		System.out.println("NOMBRE EMPLEADO :"+empleado3.getNombre() + 
			 	" SUELDO: "+ empleado3.getSueldo()+
			 	" FECHA DE ALTA: "+empleado3.getAltaContrato());
	*/
	//Con el Array siguiente hacemos la misma operativa mucho mas rapido
		
		String [] miArray = new String [3];
		
		Empleado[] misEmpleados = new Empleado[3];
		
		misEmpleados [0]=new Empleado("Maria Lopez",85000,2008,02,04);
		misEmpleados [1]=new Empleado("Marta Soria",87000,2007,01,24);
		misEmpleados [2]=new Empleado("Mario Santos",78000,2005,10,15);
		
		for (int i=0;i<3;i++) {
			misEmpleados[i].subirSueldo(5); //la misma subida para todos
		}
		//Sintaxis: (VariabelDeTipoQueHayDentroDelArray  variable: nombreArray)
		//Este for te recorre el Array entero del 0 hasta el final
		for (Empleado e:misEmpleados) {
			System.out.println("nombre Empleado: "+e.getNombre()+
					"Sueldo:"+e.getSueldo()+
					"Fecha de alta: "+e.getAltaContrato());
		}
		
		
		
	}

}
