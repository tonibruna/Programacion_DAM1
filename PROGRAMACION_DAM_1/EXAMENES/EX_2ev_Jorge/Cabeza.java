package EX_2ev_Jorge;

public class Cabeza {

	String matricula;
	int potencia;
	int annio;
	Mecanicos mec;
	
	protected Cabeza (String x, int y, int z, Mecanicos m) {
		this.matricula=x;
		this.potencia=y;
		this.annio=z;
		this.mec=m;
	}
	
	public String mostrar() {
		return "Matricula: "+this.matricula+
				" Potencia: "+this.potencia+
				" Año: "+this.annio+
				" Mecanico: "+this.mec.mostrar();
	}
}
