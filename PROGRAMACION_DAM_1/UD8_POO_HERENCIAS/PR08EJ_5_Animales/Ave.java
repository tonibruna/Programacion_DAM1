package PR08EJ_5_Animales;

public class Ave extends Animal {
	
	public Ave (Genero s) {
		super(s);
	}

	public String ponerHuevos() {
		return "Voy a poner unos cuantos huevos";
	}
	
	public String tenerPlumas() {
		return "Menos mal que tengo este pelaje";
	}
}
