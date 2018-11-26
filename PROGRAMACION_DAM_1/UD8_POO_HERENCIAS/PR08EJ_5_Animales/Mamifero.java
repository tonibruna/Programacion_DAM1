package PR08EJ_5_Animales;

public class Mamifero extends Animal {

	public Mamifero(Genero s) {
		super(s);
	}
	
	public String amamantarCrias() {
		return "Estoy dando de comer a mis crias";
	}
		
	public String cuidarCrias() {
	    return "Estoy cuidando a mis crias"; 
	}
}
