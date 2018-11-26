package Grupo_Empleados_EX_2ev_JoseA_Bruna;

public class Mecanicos extends Empleados{
	private int telefono;
	private String especialidad;
	
	public Mecanicos(String n, int telf, String esp) {
		super(n);
		this.telefono=telf;
		this.especialidad=esp;
	}
	
	
//****Metodos*****
	public int getTelefono() {
		return telefono; 
	}
	
	public String getEspecialidad() {
		return especialidad;
	}

}
