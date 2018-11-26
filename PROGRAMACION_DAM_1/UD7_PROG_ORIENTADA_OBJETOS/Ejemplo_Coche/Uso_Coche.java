package Ejemplo_Coche;

import Ejemplo_Coche.Coche;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Instanciar el objeto.
		 * SintaxisnombreClase nombreObjeto = new NombreConstructor(); */
		Coche Renault = new Coche();

		/* Acceder al objeto. Sintaxis. nombreObjeto.atributo */
		/*System.out.println("el numero de ruedas es: "+Renault.ruedas);
		Renault.ruedas=3;
		System.out.println("el numero de ruedas es: "+Renault.ruedas);
		Coche Renault2 = new Coche();
		System.out.println("el numero de ruedas es: "+Renault2.ruedas);*/
		
		String cadena=Renault.getRuedas();
		System.out.println(cadena);
		cadena=Renault.getLargo();
		System.out.println(cadena);
		cadena=Renault.getAncho();
		System.out.println(cadena);
		cadena=Renault.getPeso();
		System.out.println(cadena);
		
		Renault.setRuedas();
		cadena=Renault.getRuedas();
		System.out.println(cadena);
		
		Renault.setLargo();
		cadena=Renault.getLargo();
		System.out.println(cadena);
		
		Renault.setAncho(1212);
		cadena=Renault.getAncho();
		System.out.println(cadena);
		
		Renault.setPeso(750);
		cadena=Renault.getPeso();
		System.out.println(cadena);		
	}
}
