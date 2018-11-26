package EjemploInterfaces_03_Comparator;

import java.util.Comparator;

public class ComparaEdades implements Comparator {
	
	public int compare (Object o1, Object o2) {
		return ((Cliente) o1).edad -((Cliente) o2).edad;
	}

}
