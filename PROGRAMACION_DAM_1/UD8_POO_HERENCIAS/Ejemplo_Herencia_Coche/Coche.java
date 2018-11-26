package Ejemplo_Herencia_Coche;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	
	
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;
		
	}
	
	public Coche (String c, String cuero, String clima) {
		this();
		color=c.toLowerCase();
		
		String cad=cuero.toLowerCase();
		if((cad.equals("si")))
			asientos_cuero=true;
		else
			asientos_cuero=false;
		
		cad=clima.toLowerCase();
		if((cad.equals("si")))
			climatizador=true;
		else
			climatizador=false;
	}
	
	//metodos getter
	public int getRuedas() {//getter. obtencion de propiedad
		return ruedas; 
	}
	public int getLargo() {//getter. obtencion de propiedad
		return largo; 
	}
	public int getAncho() {//getter. obtencion de propiedad
		return ancho; 
	}
	public int getMotor() {//getter. obtencion de propiedad
		return motor; 
	}
	public int getPeso() {//getter. obtencion de propiedad
		return peso; 
	}
	public String getColor() {//getter. obtencion de propiedad
		return color; 
	}
	public boolean getCuero() {//getter. obtencion de propiedad
		return asientos_cuero; 
	}
	public boolean getClimatizador() {//getter. obtencion de propiedad
		return climatizador; 
	}
	
	//metodos setter
	
	public void setRuedas(int r) {
		ruedas=r; 
	}
	public void setLargo(int l) {
		 largo=l; 
	}
	public void setAncho(int a) {
		 ancho=a; 
	}
	public void setMotor(int m) {
		 motor=m; 
	}
	public void setPeso(int p) {
		 peso=p; 
	}
	public void setColor(String c) {
		 color=c; 
	}
	public void setCuero(String a) {
		 a.toLowerCase();
		 if (a.equals("si"))
			 asientos_cuero=true;
		 else
			 asientos_cuero=false;
		 
	}
	public void setClimatizador(String a) {
		 a.toLowerCase();
		 if (a.equals("si"))
			 climatizador=true;
		 else
			 climatizador=false;
	}

	public String obtenerCoche() {
		return "-------------------------------------\n"
				+ "Datos del coche \n Ruedas: "+this.ruedas+"\tLargo "+this.largo+"\tAncho "+this.ancho+"\tMotor "+this.motor+"\tPeso "+this.peso+"\nColor "+this.color
				+"\tpeso_total "+this.peso_total+"\tAsientos "+this.getCuero()+"\tClimatizador "+this.getClimatizador()
				+"\n---------------------------------\n";
	}
}
