package PR08EJ_5_Animales;

public class Pingüino extends Ave{
	
	public Pingüino(Genero s) {
		super(s);
	}

	public String tirarmeAlHielo() {
		return "Me apetece jugar un rato";
	}
	
	public String andarMuyRaro() {
		return "Porque no tendre las patas mas largas";
	}
}
