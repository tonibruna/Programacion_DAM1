package Ejemplo_ClaseEmpleadosStatic;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado [] misEmpleados =new Empleado[5];
		
		misEmpleados [0]=new Empleado ("Maria");
		misEmpleados [1]=new Empleado ("Pepe");
		misEmpleados [2]=new Empleado ("Rosa");
		misEmpleados [3]=new Empleado ("Julia");
		misEmpleados [4]=new Empleado ("Antonio");
		
		for (Empleado e:misEmpleados) {
			System.out.println(e.devolverDatos());
		}

	}

}
