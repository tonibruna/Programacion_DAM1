package Ejemplo_ClaseEmpleadosStatic;

public class Empleado {
	private final String nombre;
	private String seccion;
	private int id;
	
	public static int idSiguiente=1;
	
	public Empleado (String nombre) {
		this.nombre=nombre;
		this.seccion="Administracion";
		this.id=idSiguiente++;
	}
	
	public String devolverDatos () {
		return "Nombre : " +nombre+ " / Seccion: " +seccion+ " / Id " +id;
		
	}

}
