package Ejemplo_Persona;

public class Persona {
	private String nombre;
	private int edad;
	private double altura;	
	
	public Persona() {
		nombre="Toni";
		edad=33;
		altura=1.70;		
	}
	
	public Persona(String n, int e, double a) {
		nombre=n;
		edad=e;
		altura=a;		
	}
	
	 //getter
	public String getNombre() {
		return "El nombre de la persona es "+nombre; 
	}
	public int getEdad() {
		return edad; 
	}
	public double getAltura() {
		return altura; 
	}
	
	//setter
	public void setNombre() {
		nombre="Jorge"; 
	}
	public void setEdad(int x) {
		edad=x; 
	}
	public void setAltura() {
		altura=3; 
	}

	
	
}
