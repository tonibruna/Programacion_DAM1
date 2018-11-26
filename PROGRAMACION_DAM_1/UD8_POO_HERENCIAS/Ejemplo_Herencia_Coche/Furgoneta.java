package Ejemplo_Herencia_Coche;
				
	//       Subclase       Superclase
public class Furgoneta extends Coche{
	private int capacidad_carga;
	private int plazas_extra;;
	
	public Furgoneta (int plazas_extra, int capacidad_carga) {
		super();
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	
	public String obtenerFurgoneta() {
		return "-------------------------------------\nLa capacidad de carga es: "
	+capacidad_carga+" las plazas son: "+plazas_extra+
	"\n---------------------------------\n";
	}
	
	
	
	
}
