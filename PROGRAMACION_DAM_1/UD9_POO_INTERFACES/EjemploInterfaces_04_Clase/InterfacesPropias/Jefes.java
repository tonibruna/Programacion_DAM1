package EjemploInterfaces_04_Clase.InterfacesPropias;

//las interfaces son publicas o modificador x defecto
public interface Jefes extends Trabajadores {
	
	//los metodos de una interfaz son publicas o modificador por defecto y abstractas
	//si no los ponemos da igual
	String tomarDecisiones (String decision);

}
