package PR08EJ_3y4_Lista_Pila_Cola;

public class Cola extends Estructura{
	//constructores
	public Cola() {
		numeroElementos=0;
		this.array=new int [10];
	}
	
	public Cola(int x) {
		numeroElementos=0;
		this.array=new int [x];
	}
	
	//metodos
	int getNumElemnetos() {
		return this.numeroElementos;
	}
	
	void insertar(int x) {
		if (!estructuraLlena()) {
			array[numeroElementos]=x;
			numeroElementos++;
		}
	}
	void eliminar() {
		for (int i=0;i<this.numeroElementos-1;i++) {
			array[i]=array[i+1];
		}
		array[numeroElementos-1]=0;
		this.numeroElementos--;
	}	
}