package Ejemplo_Herencia_Coche;

public class UsoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche micoche1 = new Coche();
		micoche1.obtenerCoche();
		System.out.println(micoche1.obtenerCoche());
		micoche1.setColor("fucsia");
		micoche1.setCuero("si");
		System.out.println(micoche1.obtenerCoche());

		Coche micoche2 = new Coche("Verde manzana", "si", "si");
		System.out.println(micoche2.obtenerCoche());
		
		Furgoneta mifurgo1 = new Furgoneta(7,600);
		mifurgo1.setColor("MANZANA");
		System.out.println(mifurgo1.obtenerCoche()+mifurgo1.obtenerFurgoneta());
		
		
	}

}
