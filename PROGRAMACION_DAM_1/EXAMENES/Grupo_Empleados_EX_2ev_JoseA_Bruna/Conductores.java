package Grupo_Empleados_EX_2ev_JoseA_Bruna;

public class Conductores extends Empleados{
	private String DNI;
	private double sueldo;
	private enum Rango{conductor,becario}
	
	private Rango ran;
	
	
	
	public Conductores(String n, String DNi, int sue, Rango ran) {
		super (n);
		this.DNI=DNI;
		this.sueldo=sue;
		this.ran=ran;
	}
	
  //*****METODOS GETTER****
	public String getDniCond() {
		return DNI; 
	}
	
	public double getSueldo() {
		return sueldo;
	}
	

}
