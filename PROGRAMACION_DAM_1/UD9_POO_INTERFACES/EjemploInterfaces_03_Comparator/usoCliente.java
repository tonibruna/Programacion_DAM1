package EjemploInterfaces_03_Comparator;

import java.util.Arrays;

public class usoCliente {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Cliente[] misClientes=new Cliente [5];
		
		misClientes[0]=new Cliente("22333444F","Paqui G.", 17,6200);
		misClientes[1]=new Cliente("44555666H","Marla Perez.", 27,6200);
		misClientes[2]=new Cliente("66777888T","juan Lopez", 43,8200);
		misClientes[3]=new Cliente("88999000R","Rosa Martinez",65,4200);
		misClientes[4]=new Cliente("11222333Q","Luis Lopez", 23,5200);
		
		Arrays.sort(misClientes);//llamamos al metodo sort, que nos obliga
									//a implementar la interfaz comparable
		System.out.println("Por DNI:"+Arrays.toString(misClientes));
		//¿?
		ComparaNombres c=new ComparaNombres();
		
		Arrays.sort(misClientes,c);
		System.out.println(" Por nombres: "+Arrays.toString(misClientes));
			//¿?
		ComparaEdades d=new ComparaEdades();
		Arrays.sort(misClientes, d);
		System.out.println(" Por Edades: "+Arrays.toString(misClientes));
		
	}

}
