package Ejemplos;

public class HolaMundo {

	public static void main(String[] args) {
		
		System.out.println("Hola Mundo");
		System.out.println("*******************************");
		
		
		byte edad;
		edad=28;
		
		short cm=165;
		double metros= 1.72;
		
		String nombre= "Toni";     
		
		
		
		System.out.println("Tienes estos años:");
		System.out.println(edad);
		
		System.out.println("Tu nombre es:"+nombre); //+nombre concatena con nombre
		
		System.out.println("Muestra tu altura en centimetros:");
		System.out.println(cm);
		
		int resultado; //Inicializar
		resultado=cm+5; //Asigno mediante operacion
		System.out.println("si hubieras comido mas:"+resultado);
		
		double resultadoComaFlotante=metros-1;
		System.out.println("cuando tenias la mitad de tu edad:"+(edad/2)+" años, medias "+resultadoComaFlotante);
		
		
		
		
	}

}
