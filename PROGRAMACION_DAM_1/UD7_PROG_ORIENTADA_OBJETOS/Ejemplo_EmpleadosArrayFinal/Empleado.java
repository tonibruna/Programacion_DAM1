package Ejemplo_EmpleadosArrayFinal;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
	//Atributos del objeto
		private final String nombre; //final para que no se pueda modificar
		private String seccion;
		private double sueldo;
		private Date altaContrato;
		
	//Constructor
public Empleado(String nombre, double sueldo,int anio, int mes, int dia) {
	this.nombre=nombre;
	this.seccion="Administracion";
	this.sueldo=sueldo;
	//Crear el objeto 'Date':Clase nombre objeto=new Constructor()
	
	GregorianCalendar calendario=new GregorianCalendar(anio,mes,dia);
	altaContrato=calendario.getTime();//.getTime devuelve un tipo 'Date'
}

//Getter
public String getNombre() {
	return nombre;
}
public double getSueldo() {
	return sueldo;
}
public Date getAltaContrato() {
	return altaContrato;
}

//Setter 
public void cambiarSeccion(String seccion) {
	this.seccion=seccion;
}


//Metodo
public void subirSueldo (double porcentaje) {
	double aumento=(sueldo*porcentaje)/100;
	this.sueldo=sueldo+aumento;
}

}