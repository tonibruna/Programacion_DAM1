package PR08EJ_3y4_Lista_Pila_Cola;

import java.util.Scanner;

public class Lista extends Estructura{
	
	//constructores
	public Lista() {
		numeroElementos=0;
		this.array=new int [10];
	}
	
	public Lista(int x) {
		numeroElementos=0;
		this.array=new int [x];
	}
	
	//metodos
	int getNumElemnetos() {
		return this.numeroElementos;
	}
	
	void insertarPrincipio (int x) {
		if (!estructuraLlena()) {
			for (int i=numeroElementos;i>=1;i--) {
				array[i]=array[i-1];
			}
			array[0]=x;
			numeroElementos++;
		}
	}
	
	void insertarFinal (int x) {
		if (!estructuraLlena()) {
			array[numeroElementos]=x;
			numeroElementos++;
		}
	}
	
	void insertar(int num) {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Dime la posición a insertar: ");
		int pos=teclado.nextInt();
		if (pos<numeroElementos) {
			super.array[pos]=num;
		}
	}
	void eliminar() {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Dime la posición a eliminar: ");
		int pos=teclado.nextInt();
		if(pos>=0 && pos<this.numeroElementos) {
			for (int i=pos;i<this.numeroElementos-1;i++) {
				array[i]=array[i+1];
			}
			array[numeroElementos-1]=0;
			this.numeroElementos--;
		}
	}	
}