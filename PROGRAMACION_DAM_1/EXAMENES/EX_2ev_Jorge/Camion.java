package EX_2ev_Jorge;

public class Camion {

	Cabeza cab;	
	Contenedores[] cont=new Contenedores[3];
	Conductores cond;
	int numeroContenedores;
	
	protected Camion (Cabeza c, Conductores m) {
		numeroContenedores=0;
		this.cab=c;
		this.cond=m;
	}
	
	boolean estructuraLlena() {
		boolean i;
		if(numeroContenedores==cont.length) {
			i=true;
		}else {
			i=false;
		}
		return i;
	}
	
	void insertar(Contenedores x) {
		if (!estructuraLlena()) {
			cont[numeroContenedores]=x;
			numeroContenedores++;
		}
	}
	
	public int numElementos() {
		return numeroContenedores; 
	}
	
	void eliminar() {
		cont[numeroContenedores-1]=null;
		this.numeroContenedores--;
	}
	
	public String mostrar() {
		return "Cabeza: "+this.cab.mostrar()+
				"\nConductor: "+this.cond.mostrar()+
				"\nNúmero de contenedores: "+this.numeroContenedores;
	}
	void mostrarContenedores() {		
		int numPosiciones=cont.length;
		for (int i=0;i<numPosiciones;i++) {
			if (cont[i]!=null) {
				System.out.println(cont[i].mostrar());
			}
		}
	}
}