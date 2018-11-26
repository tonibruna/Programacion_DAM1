package EjemploInterfaces_04_InterfacesPropiasHerencia;

//las clases son publicas o modificador x defecto
public interface Jefes extends Trabajadores {
	//los metodos son publicas o modificador por defecto y abstractas, si no lo ponemos 
	String tomarDecisiones(String decision);//los metodos se definen pero no se implementan
	
	//esto quiere decir que quien implemente jefes tambien tienen que implementar trabajadores

	
}
