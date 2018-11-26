package EX_2ev_Jorge;

public class Contenedores {
	
	int capacidadMax;
	int capacidadAct;
	String tipoMercan;
	
	Contenedores (int x, int y, String z) {
		this.capacidadMax=x;
		this.capacidadAct=y;
		this.tipoMercan=z;
	}
	
	public String mostrar() {
		return "Capacidad Máx: "+this.capacidadMax+
				" Capacidad Actual: "+this.capacidadAct+
				" Tipo mercancia: "+this.tipoMercan;
	}
}
