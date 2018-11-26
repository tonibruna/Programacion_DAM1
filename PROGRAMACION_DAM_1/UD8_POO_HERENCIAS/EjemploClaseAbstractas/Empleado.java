package EjemploClaseAbstractas;
import java.util.*;

public class Empleado extends Persona {
	private String seccion;
	private double sueldo;
	private Date altaContrato;
	private  int id;
	
	
	public static int idSiguiente=1;
	
	
	public Empleado (String nombre, double sueldo, int anio, int mes, int dia) {
		super(nombre);
		this.sueldo=sueldo;
		//******Usamos el constructor de GregorianCalendar. VER API DE JAVA
		GregorianCalendar calendario=new GregorianCalendar (anio, mes-1, dia);
		altaContrato=calendario.getTime(); //no esta getTime, esta en calendar. HERENCIA
		id=idSiguiente;
		idSiguiente++;
	}
	
		
	public Empleado (String nombre) {
		super(nombre);
		this.seccion="Administracion";
		id=idSiguiente;
		idSiguiente++;
	}
	
	//************METODOS ABSTRACTOS*******
	
	public String dameDescripcion () {
		return "Empleado : "+super.getNombre()+" Id: "+id+" Sueldo: "+sueldo;
	}
	
	
		
	
	//***********METODOS GETTER
		
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
	

}
