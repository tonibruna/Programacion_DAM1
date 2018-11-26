package Grupo_maquinaria_EX_2ev_JoseA_Bruna;

public class Camiones {
	private int motor;
	private int peso;
	private int capacidad_carga;
	private int numero_contenedores;
	
	public Camiones(int motor, int peso, int capCarga) { 
		this.motor=motor;
		this.peso=peso;
		this.capacidad_carga=capCarga;
		numero_contenedores=0;
	}
	
	//Metodos getter
	
	public int getMotor() {
		return motor;
	}
	public int getPeso() {
		return peso;
	}
	public int getCapacidad() {
		return capacidad_carga;
	}
	
	void insertar(){
		numero_contenedores++;
	}
	
	void eliminar() {
		numero_contenedores--;
	}
	
	//Metodo setter
	public String obtenerCamion() {
		return "-------------------------------------\n"
				+ "Datos del camion \n Motor "+this.motor+"\tPeso "+this.peso+"\nCapacidad "+this.capacidad_carga	
				+"\n---------------------------------\n";
	}
	

}
