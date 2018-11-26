package EjemploClaseAbstractas;

public class Alumno extends Persona{
	private String carrera;
	
	public Alumno (String nom, String car) {
		super(nom);
		carrera=car;
	}
	
	public String getCarrera() {
		return carrera;
	}
	
	public String dameDescripcion() {
		return "Alumno: "+super.getNombre()+" Carrera: "+carrera;
	}

}
