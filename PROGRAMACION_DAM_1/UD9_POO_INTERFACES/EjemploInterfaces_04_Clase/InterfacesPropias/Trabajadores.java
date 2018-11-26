package EjemploInterfaces_04_Clase.InterfacesPropias;

public interface Trabajadores {

	//esta interfaz define el metodo establece bonus. Este bonus base
	//sera de 1500 e, mas una prima si es jefe, y una gratificación extra
	//para todos los empleados según la productividad
	double estableceBonus (double gratificacion);
	
	public static final double bonus_base=1500;
	
}
