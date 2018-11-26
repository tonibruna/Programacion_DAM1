package PR08EJ_01_Hora;

public class Uso_Hora {

	public static void main(String[] args) {
		
		Hora Hora1=new HoraExacta(15,45,32);
		//si metes mas de 23:59 sale 0:0 por error
		System.out.println(Hora1.ToString());
		
		Hora Hora2=new HoraExacta(15,45,32);
		//si metes mas de 23:59 sale 0:0 por error
		System.out.println(Hora2.toString());
	}

}
