package Ejercicio_3_DiseñarCuentaCorriente;

public class CuentaCorriente {
	private int saldo;
	private int limiteDescubierto;
	private final String nombre;
	private final String DNI;
	
	public CuentaCorriente (String nombre, String DNI) {
		this.saldo=0;
		this.limiteDescubierto=-50;
		this.nombre=nombre;
		this.DNI=DNI;
	}
	
	public CuentaCorriente (int saldo) { //Otro constructor 
		this.limiteDescubierto=0;
		this.saldo=saldo;
		this.nombre="";
		this.DNI="";
	}
	
	public CuentaCorriente (int saldo, int limiteDescubierto, String DNI) { //Otro constructor
		this.nombre="";
		this.saldo=saldo;
		this.limiteDescubierto=limiteDescubierto;
		this.DNI=DNI;
	}
	
	public void sacarDinero (int cantidad) {
		if (this.saldo-cantidad>limiteDescubierto) {
			this.saldo=this.saldo-cantidad;
			System.out.println("SACAR DINERO Se ha realizado la operacion con exito");
	    }else{
	    	System.out.println("Esta operacion no se permite realizar");
	    }
	 }
	
	public void ingresarDinero (int ingreso){
		System.out.println("INGRESAR DINERO Se ha realizado la operacion con exito");
		this.saldo=this.saldo+ingreso;
	}
	
	public String DevolverDatos () {
		return "Nombre: " +nombre+ " / Dni " +DNI+ " / Saldo: " +saldo;
	}
	
	//getter
	public String getNombre() {
		return nombre;
	}
	public int getSaldo() {
		return saldo;
	}
	public String getDni() {
		return DNI;
	}
	public int getLimite() {
		return limiteDescubierto;
	}
}
