package Ejemplo_Herencia_Empleado;

public class Jefatura extends Empleado{
	private double incentivo;
	
	public Jefatura (String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);
		this.incentivo=0;
	}
	
	public String devolverJefatura () {
		return "incentivo: "+incentivo;
	}
}
