package PR08EJ_3y4_Lista_Pila_Cola;

abstract class Estructura {
	
	//atributos
		int numeroElementos;
		int[] array;
		
		//constructores
		public Estructura() {
			numeroElementos=0;
			this.array=new int [10];
		}
		
		public Estructura(int x) {
			numeroElementos=0;
			this.array=new int [x];
		}
		
		//metodos
		boolean estructuraLlena() {
			boolean i;
			if(numeroElementos==array.length) {
				i=true;
			}else {
				i=false;
			}
			return i;
		}
		
		abstract void insertar(int num);
		abstract void eliminar();
		int[] buscarNumero (int x) {		
			int numPosiciones=array.length;
			int[] posiciones=new int[numPosiciones];
			int p=0;
			for (int i=0;i<numPosiciones;i++) {
				if (x==array[i]) {
					posiciones[p]=i+1;
					p++;
				}
			}
			return posiciones;
		}
		
		void mostrar() {		
			int numPosiciones=array.length;
			for (int i=0;i<numPosiciones;i++) {
				if (array[i]!=0) {
					System.out.print(" |"+array[i]+"| ");
				}
			}
		}
}