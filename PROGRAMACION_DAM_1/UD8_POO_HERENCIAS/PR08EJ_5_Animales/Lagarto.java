package PR08EJ_5_Animales;

public class Lagarto extends Animal {
	
	public Lagarto (Genero s) {
		super(s);
	}

	public String arrastrarse() {
		return "Me estoy arrastrando por el suelo";
	}
	
	public String tomarSol() {
		return "Necesito sol porque soy de sangre fria";
	}
}
