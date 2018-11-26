package PR08EJ_5_Animales;

public class Canario extends Ave{
	
	public Canario(Genero s) {
		super(s);
	}
	
	public String comerPipas() {
		return "Me gustan las pipas peladas";
	}
	
	public String cantar() {
		return "Me gusta cantar por las mañanas";
	}

}
