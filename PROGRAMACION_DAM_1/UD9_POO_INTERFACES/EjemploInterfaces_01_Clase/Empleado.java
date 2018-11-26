package EjemploInterfaces_01_Clase;
import java.util.*;

//si quiero usar el metodo sort la clase Arrays me obliga a implementar la interfaz comparable
public class Empleado implements Comparable{
	
	private final String nombre;
	private String seccion;
	private double sueldo;
	private Date altaContrato;
	private  int id;
	
	public static int idSiguiente=1;
	
	
	public Empleado (String nombre, double sueldo, int anio, int mes, int dia) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		//******Usamos el constructor de GregorianCalendar. VER API DE JAVA
		GregorianCalendar calendario=new GregorianCalendar (anio, mes-1, dia);
		altaContrato=calendario.getTime(); //no esta getTime, esta en calendar. HERENCIA
		id=idSiguiente;
		idSiguiente++;
	}
	
		
	public Empleado (String nombre) {
		this.nombre=nombre;
		this.seccion="Administracion";
		id=idSiguiente;
		idSiguiente++;
	}
	
	public String devolverEmpleado() {
		
		return "NOMBRE EMPLEADO :"+nombre + 
				   " SECCION: "+seccion+ 
				   " ID: "+id;
	}
	
	
		
	
	//***********METODOS GETTER
		public String getNombre() {//metodo get para obtener el nombre
			return nombre;
		}
		public double getSueldo() {//metodo get para obtener el sueldo
			return sueldo;
		}
		public Date getAltaContrato() {//metodo get para obtener la fecha
			return altaContrato;
		}
		
		public int getId() {
			return id;
		}
		public void cambiarSeccion(String seccion) {
			this.seccion=seccion;
		}
		
		/** podemos agregar un método que agregue un incentivo.
		-lo podemos hacer a todo el mundo. y esto no deberia ser así
		- no diferenciamos quien es jefe y quien es empleado
	*/
		public void subirSueldo (double porcentaje) {
			double aumento=(sueldo*porcentaje)/100;
			this.sueldo=sueldo+aumento;
		}
	
		public int compareTo (Object o) {//implemento el metodo compareTo que me dice la 
										//interfaz comparable
			//casting de Object a Empleado
			Empleado elotro = (Empleado) o;
			
			if (this.id<elotro.id) {
				return -1;
			}
			if (this.id>elotro.id) {
				return 1;
			}
			return 0;
		}
}
