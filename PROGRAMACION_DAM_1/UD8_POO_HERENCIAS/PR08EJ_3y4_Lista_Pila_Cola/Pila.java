package PR08EJ_3y4_Lista_Pila_Cola;

public class Pila extends Estructura{
	//constructores
	public Pila() {
		numeroElementos=0;
		this.array=new int [10];
	}
	
	public Pila(int x) {
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
		array[numeroElementos-1]=0;
		this.numeroElementos--;
	}
}