package EX_2ev_Jorge;

public class Conductores extends Personal{

	String dni;
	int sueldo;
	String rango;
	
	public Conductores (String nombre, String x, int y, String z) {
		super(nombre);
		this.dni=x;
		this.sueldo=y;
		this.rango=z;
	}
	
	public String mostrar() {
		return "Nombre: "+this.nombre+
				" DNI: "+this.dni+
				" Sueldo: "+this.sueldo+
				" Rango: "+this.rango;
	}
}
