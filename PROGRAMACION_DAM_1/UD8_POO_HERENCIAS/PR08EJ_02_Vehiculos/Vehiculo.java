package PR08EJ_02_Vehiculos;

public class Vehiculo {

	//Atributo de objeto
	private int kmsRecorridos;
	private String marca;
	private int vehiculos;
	
	//Atributo de clase
	public static int kmsTotales=0;
	public static int vehiculosCreados=1;
	
	//Constructor
	public Vehiculo(String ma) {
		marca=ma;
		kmsRecorridos=0;
		vehiculos=vehiculosCreados;
		vehiculosCreados++;
	}
	
	public int getKmsNuevos() {
		return kmsRecorridos;
	}
	
	public static int getKilometrajeTotal() {
		return kmsTotales;
	}
	
	public void recorrer (int km) {
		this.kmsRecorridos=km;
		kmsTotales+=km;
	}
		
		
}
