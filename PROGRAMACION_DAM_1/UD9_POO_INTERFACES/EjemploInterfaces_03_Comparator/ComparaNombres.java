package EjemploInterfaces_03_Comparator;

import java.util.Comparator;

public class ComparaNombres implements Comparator {
	
	
	public int compare (Object o1, Object o2) {
		Cliente c1=(Cliente)o1;
		Cliente c2=(Cliente)o2;
		return c1.nombre.compareTo(c2.nombre);
		
	}
	
}
