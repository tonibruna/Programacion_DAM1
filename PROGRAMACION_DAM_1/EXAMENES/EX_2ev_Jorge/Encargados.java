package EX_2ev_Jorge;

public class Encargados extends Personal{
	
	String dni;
	
	public Encargados (String nombre, String x) {
		super(nombre);
		this.dni=x;
	}
	
	public String mostrar() {
		return "Nombre: "+this.nombre+
				" DNI: "+this.dni;
	}
}
