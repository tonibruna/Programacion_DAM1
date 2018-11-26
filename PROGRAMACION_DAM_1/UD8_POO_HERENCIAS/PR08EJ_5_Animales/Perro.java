package PR08EJ_5_Animales;

public class Perro extends Mamifero{
	
	public Perro (Genero s) {
		super (s);
	}
	
	public String enterrarHueso() {
		return "Voy a destrozarte el bonito jardin";
	}
	
	public String quitarmeLasPulgas() {
		return "Me rasco las pulgas que me pican";
	}

}
