package Ejercicio_3_DiseñarCuenta_Jorge;

public class CuentaCorriente {
	private int saldo;
	private int limiteDescubierto;
	private String nombre;
	private String dni;
	private int id;
	
	public static int idSiguiente=1;
	
	//constructor
	public CuentaCorriente (String nombre, String dni) {
		this.nombre=nombre;
		this.dni=dni;	
		this.saldo=0;
		this.limiteDescubierto=-50;
		this.id=idSiguiente;
		idSiguiente++;
	}
	public CuentaCorriente (int saldo) {
		this.limiteDescubierto=0;
		this.nombre="";
		this.dni="";	
		this.saldo=saldo;		
	}
	public String sacarDinero(int x) {
		if (this.saldo-x>limiteDescubierto) {
			this.saldo=this.saldo-x;
			return "_____________________ \n|                    |\n|      Operación     |"
					+ "\n|      correcta      |\n|                    |\n|                    |"
					+ "\n|____________________|";
		}else {
			return "_____________________ \n|                    |\n|       ERROR        |"
					+ "\n|      Operación     |\n|     Defectuosa     |\n|                    |"
					+ "\n|____________________|";
		}
	}
	public void ingresarDinero(int x) {
		this.saldo=this.saldo+x;
	}
	public String mostrarInformacion() {
		/*return "_____________________ \n|     INFORMACIÓN    |\n|                    |"
		+ "\n|                    |\n|                    |\n|                    |"
		+ "\n|____________________|";*/
		return "Nombre: "+nombre+"\nDNI: "+dni+"\nSaldo: "+saldo+"€";
	}	
}