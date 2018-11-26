package EX_2ev_Jorge;

abstract class Personal {
	String nombre;
	
	public Personal (String nombre) {
		this.nombre=nombre;
	}
	
	public abstract String mostrar();
}
