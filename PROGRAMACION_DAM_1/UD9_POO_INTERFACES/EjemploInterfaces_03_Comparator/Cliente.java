package EjemploInterfaces_03_Comparator;

import EjemploInterfaces_01_Clase.Empleado;

public class Cliente implements Comparable {
	String dni;
	String nombre;
	int edad;
	double saldo;

	public Cliente (String dni, String nombre, int edad, double saldo) {
		this.dni=dni;
		this.nombre=nombre;
		this.edad=edad;
		this.saldo=saldo;
	}
	
	public boolean equals (Object otro) {
		
		Cliente ob = (Cliente) otro;//casting de objeto otro a objeto cliente
		return this.dni.equals(ob.dni);
	}
	
	public String toString () {
		return "\nDni: "+dni +" nombre: "+nombre+" Edad: "+edad+" Saldo:"+saldo;
	}
	
	public int compareTo(Object otro) {
		//casting de Object a Empleado
		Cliente elotro = (Cliente) otro;
		
		return dni.compareTo(elotro.dni);
		
	}
}
