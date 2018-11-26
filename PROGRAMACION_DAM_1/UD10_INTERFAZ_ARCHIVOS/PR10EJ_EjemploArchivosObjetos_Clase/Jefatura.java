package PR10EJ_EjemploArchivosObjetos_Clase;
			
public class Jefatura extends Empleado {
	private double incentivo;
	
	public Jefatura (String nom, double sue, int agno, int mes, int dia) {
		super (nom, sue, agno, mes, dia) ;
	}
	
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	
	public double getSueldo() {
		double sueldoJefe=super.getSueldo();
		return sueldoJefe+this.incentivo;
	}
	
		public String devolverJefatura () {
		return "incentivo: "+incentivo;
	}

}
