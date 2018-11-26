package Ejemplo_Coche;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int peso;
	
	//Constructor
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=1500;
		peso=500;
	}
	
	//getter. Obtener una propiedad del objeto
	public String getRuedas() {
		return "Las ruedas del coche es "+ruedas; 
	}
	public String getLargo() {
		return "El largo del coche es "+largo; 
	}
	public String getAncho() {
		return "El ancho del coche es "+ancho; 
	}
	public String getPeso() {
		return "El peso del coche es "+peso; 
	}
	
	// setter. Definir una propiedad
	public void setRuedas() {
		 ruedas=3; 
	}
	public void setLargo() {
		 largo=1000; 
	}
	public void setAncho(int x) {
		 ancho=x; 
	}
	public void setPeso(int x) {
		 peso=x; 
	}
	
}