package Ejercicios01;

public class Ejerc4_ConversorEuros {

	public static void main(String[] args) {
		
		double euros = 3.00;   //double porque es decimal
	    double pesetas = (double) (euros * 166.386); //para que saque el resultado con decimales
	    System.out.print(euros + " euros son " + pesetas + " pesetas.");

	}

}
