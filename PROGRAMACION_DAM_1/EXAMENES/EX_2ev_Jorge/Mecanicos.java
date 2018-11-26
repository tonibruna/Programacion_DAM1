package EX_2ev_Jorge;

public class Mecanicos extends Personal{
	int telefono;
	String especialidad;
	
	public Mecanicos (String nombre, int y, String z) {
		super(nombre);
		this.telefono=y;
		this.especialidad=z;
	}
	
	public String mostrar() {
		return "Nombre: "+this.nombre+
				" Telefono: "+this.telefono+
				" Especialidad: "+this.especialidad;
	}
}
