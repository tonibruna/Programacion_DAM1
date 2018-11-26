package Ejemplo_CocheStatic;

public class Coche {
	
//Atributos del objeto
	private String marca;
	private String modelo;
	private int kmDia;
	
//Atributo de clase
	private static int kilometrajeTotal=0;
	
//Constructor
public Coche(String ma, String mo) {
	marca=ma;
	modelo=mo;
	kmDia=0;
}

//Metodo Getter
public int getKmDia() {
	return kmDia;
}

//Metodo de clase
public static int getKilometrajeTotal() {
	return kilometrajeTotal;
}

//Metodo Setter
public void recorrer (int km) { //Actualiza con el ultimo valor de kms del dia
	this.kmDia=km;
	kilometrajeTotal+=km; //igual a kilometrajeTotal=kilometrajeTotal+km;
}




}
