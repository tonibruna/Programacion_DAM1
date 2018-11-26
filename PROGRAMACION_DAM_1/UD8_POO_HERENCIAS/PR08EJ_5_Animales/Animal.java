package PR08EJ_5_Animales;

public class Animal {

	public enum Genero {Hembra,Macho} //para crear listado con las condiciones que quieras Ejemplo: Semana {Lunes,Martes...}
	public Genero sexo;
	private int edad;
	
	public Animal (Genero s) {
		s=sexo;
		edad=edad;
		
	}
	

	public String alimentarse() {
		return "Estoy comiendo porque necesito energia";
		
	}
	
	public String dormir() {
		return "Me voy al sobre, que estoy cansado";
	}
}
