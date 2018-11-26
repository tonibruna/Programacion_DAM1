package EjemploInterfaces_04_Clase.InterfacesPropias;
			//subclase    //superclase
public class Jefatura extends Empleado implements Jefes {
	/* entiende que llama al constructor ppor defecto, el que 
	 * no tiene parámetros. aL IRse a la clase empleado y no encontrar el
	 * constructor por defecto da un error
	 * 
	 */
	private double incentivo;
	
	public Jefatura (String nom, double sue, int agno, int mes, int dia) {
		super(nom,sue,agno,mes,dia);//depende de los parametros que pases llamara a un constructor o a otro
	}
	
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	
	//getSueldo no nos vale pq es de empleado, y es diferente al sueldo del jefe, 
	//pq hay que sumar el incentivo
	//tenemos que sobreescribir el getsueldo de empleado
	
	//este invalida getSueldo de empleado SOLO para esta clase
	public double getSueldo() {
		double sueldoJefe=super.getSueldo();//almaceno el sueldo del empleado en sueldojefe
		return sueldoJefe+incentivo;
	}
	
	public String tomarDecisiones (String dec) {
		return "el jefe "+this.getNombre()+" ha tomado la decision de "+dec;
	}
	
	public double estableceBonus (double grat) {
		double prima=2000;
		System.out.println("Este empleado TIENE PRIMA");
		return Trabajadores.bonus_base+grat+prima;
	}

}
