package Ejemplos;
import java.util.*;

public class Switch { //Segun sea

	public static void main(String[] args) {
		
		System.out.println("Introduce un numero de mes:");
		Scanner teclado= new Scanner(System.in);
		
		int mes= teclado.nextInt();
		String NombreMes;
		
		switch (mes) { //switch para seleccionar uno de estos casos
		case 1:
			NombreMes = "Enero";
			break;               //para cerrar bucle (al haber obtenido solucion)
		case 2:
			NombreMes = "Febrero";
			break;
		case 3:
			NombreMes = "Marzo";
			break;
		case 4: 
			NombreMes = "Abril";
			break;
		case 5: 
			NombreMes = "Mayo";
			break;
		case 6: 
			NombreMes = "Junio";
			break;
		case 7: 
			NombreMes = "Julio";
			break;
		case 8: 
			NombreMes = "Agosto";
			break;
		case 9: 
			NombreMes = "Septiembre";
			break;
		case 10: 
			NombreMes = "Octubre";
			break;
		case 11: 
			NombreMes = "Noviembre";
			break;
		case 12: 
			NombreMes = "Diciembre";
			break;
		default: 
			NombreMes = "no existe este mes";  //por si metes numero mayor que 12
			break;
		}

        System.out.println(NombreMes);

	}

}
