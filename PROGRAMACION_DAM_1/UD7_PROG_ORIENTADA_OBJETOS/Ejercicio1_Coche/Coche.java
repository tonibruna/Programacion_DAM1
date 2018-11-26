package Ejercicio1_Coche;


public class Coche {  //Ejercicio 1_Crear clase
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private String color;
	private boolean asientos_cuero;
	private boolean climatizador;
	
	//Constructor 1 
	public Coche() { 
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;
	}
	
	
	//Constructor 2. 
	//Hacemos la llamada a las variables que estan en Uso_Coche 
	public Coche(String color,String asientos_cuero,String climatizador) { 
			
			ruedas=4;    //todos estos campos pueden sustituirse por un (this();)
			largo=2000;
			ancho=300;
			motor=1600;
			peso=500;
			
			this.color=color;

		  if (asientos_cuero.equalsIgnoreCase("si")) {
			  this.asientos_cuero=true;
		  }else {
			  this.asientos_cuero=false;
		  }
		  
		  if (climatizador.equalsIgnoreCase("si")) { //para ignorar si es mayuscula o minuscula
			  this.climatizador=true;
		  }else {
			  this.climatizador=false;
		  }
	}
	
	//Creamos los getter. obtener la propiedad del objeto. Ejercicio 4.
	public int getRuedas() {
		return ruedas;
	}
	public int getLargo() {
		return largo;
	}
	public int getAncho() {

		return ancho;
	}
	public int getMotor() {
		return motor;
	}
	public int getPeso() {
		return peso;
	}
	public String getColor() {
		return color;
	}
	public boolean getAsientosCuero() {
		return asientos_cuero;
	}
	public boolean getClima() {
		return climatizador;
	}

	//Creamos los setter. Definir una propiedad. Ejercicio 4.
	
	public void setRuedas() {
		this.ruedas=5;
	}
	public void setLargo() {
		largo=1000;
	}
	public void setAncho(int x) {
		ancho=x; //con esa x el valor se lo pondras directamente en la llamada en Uso_Coche
	}
	public void setPeso(int x) {
		peso=x;
	}
	public void setColor(String x) {
		color=x;
	}
	public void setAsientos(String asientos_cuero) {
		if (asientos_cuero=="si") {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
	public void setClimatizador(String climatizador) {
		if (climatizador=="si") {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
}


