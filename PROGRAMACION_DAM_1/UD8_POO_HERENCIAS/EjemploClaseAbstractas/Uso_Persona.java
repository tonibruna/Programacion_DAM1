package EjemploClaseAbstractas;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Persona[] misPersonas=new Persona [2];
		
		misPersonas[0]= new Empleado ("paqui", 50000, 2008,4,2);
		misPersonas[1]= new Alumno ("paqui","ITIG");
		
		for (Persona e:misPersonas) {
			System.out.println(e.dameDescripcion());
			
		}
	}

}
