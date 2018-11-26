package Ejemplo_CocheStatic;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche1 = new Coche ("Alfa","147");
		Coche coche2 = new Coche ("Toyota","Corolla");
		
		coche1.recorrer(30);
		coche1.recorrer(40);
		coche1.recorrer(120);
		
		coche2.recorrer(40);
		coche2.recorrer(60);
		coche2.recorrer(530);
		
		System.out.println("El coche 1 ha recorrido "+coche1.getKmDia()+ " km");
		System.out.println("El coche 2 ha recorrido "+coche2.getKmDia()+ " km");
	
		System.out.println("El total recorrido es "+Coche.getKilometrajeTotal()+" km");
	}

}
