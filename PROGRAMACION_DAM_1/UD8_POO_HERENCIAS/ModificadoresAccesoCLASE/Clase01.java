package ModificadoresAccesoCLASE;

//aqui asumimos que estamos usando modificador por Defecto
/*MODIFICADOR    CLASE    PACKAGE      SUBCLASE     TODOS 
 *                                 (de otro paquete)
 *-----------------------------------------------------------
 *PUBLIC          SI        SI           SI           SI
 *PROTECTED       SI        SI           SI           NO
 *PRIVATE         SI        NO           NO           NO
 *POR DEFECTO     SI        SI           NO           NO
 */
public class Clase01 {
	
	//ejemplo private
	protected int num1=7; //para que se pueda usar en otra subclase (Clase03)
	
   /*private int devolverNumero() { //No deja verlo en Clase02 al poner PRIVATE
		return num1;
	}*/
	
   /*int devolverNumero() { //Se puede ver en Clase02 al dejarlo POR DEFECTO
 		return num1;
 	}*/
	
	public int devolverNumero() { //Con PUBLIC sin problemas
 		return num1;
 	}
	
}
