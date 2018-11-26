package Ejemplo_Persona;

import Ejemplo_Persona.Persona;

public class Uso_Persona {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Persona alumno = new Persona("Alberto", 13, 1.35);
			String cadena=alumno.getNombre();
			System.out.println(cadena);
			 int cadena2=alumno.getEdad();
			System.out.println("La edad es: "+cadena2);
			double cadena3=alumno.getAltura();
			System.out.println("La altura es: "+cadena3);
			
			alumno.setEdad(18);
			cadena2=alumno.getEdad();
			System.out.println(cadena2);
			
			if(cadena2>=18) {
				System.out.println("El alumno es mayor de edad");
			}else {
				System.out.println("El alumno es menor de edad");
			}
		}

	}