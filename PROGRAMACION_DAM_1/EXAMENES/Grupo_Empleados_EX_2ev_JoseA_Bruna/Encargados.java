package Grupo_Empleados_EX_2ev_JoseA_Bruna;

public class Encargados extends Empleados{
	private String DNI;
	
	public Encargados(String n, String DNI) {
		super(n);
		this.DNI=DNI;
	}
	
	//****Metodos****
	public String getDniEnc() {
		return DNI; 
	}
}
