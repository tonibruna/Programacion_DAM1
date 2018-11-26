package EjemploClasePolimorfismo;

public class Jefatura extends Empleado{
	private double incentivo;
	
	public Jefatura (String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);
	}
	
	public void estableceIncentivo (double b) { //setter
		incentivo=b;
	}
	
	public double getSueldo() { //Getter para sumar los incentivos
		double sueldoJefe = super.getSueldo();
		return sueldoJefe+this.incentivo;
	}
	
	public String devolverJefatura () {
		return "incentivo: "+incentivo;
	}
}
