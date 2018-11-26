package ModificadorProtected;
import ModificadoresAccesoCLASE.*; 
//SIN IMPORTARLO DE OTRO PAQUETE, NO PUEDES USAR num1 (Heredar)
public class Clase03 extends Clase01 {
	
	public int num2;
	
	public int devolverSuma() {
		return num2+super.num1;  //para que el num1 funcione debe estar en PROTECTED
	}

}
