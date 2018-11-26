package EjemploInterfaces_04_InterfacesPropiasHerencia;

public interface Trabajadores {

	//no se pone el public y el abastrac en los metodos de la interfaz
	double estableceBonus(double gratificacion);
	//minimo de 1500 euros y segun la productividad tiene una gratificacion. los jefes tienen una prima.
	
	//por defecto las constantes estaticas en las interfaces son public static y final
	public static final double bonus_base=1500; //variable estatica
}
