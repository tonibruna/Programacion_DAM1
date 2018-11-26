package Ejercicio_02_numeros_primos;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejercicio_02_numeros_primos {

	public static void main(String[] args) {

		String ruta = "C:\\Users\\ifc\\eclipse-workspace\\primos.dat";
		
		int numeros_primos [] = new int [500];
		
		int contador = 2;
		
		int n_primo = 0;
		
		//------------------------------------------------------------------
		//CALCULO LOS 500 PRIMEROS NUMEROS PRIMOS----------------
		
		while(contador<500)
		{
			int bandera = 0;
			
			for(int i = 1; i<=contador;i++)
			{
				if(contador%i==0)
				{
					bandera++;
				}
			}
			
			if(bandera<=2)
			{
				numeros_primos[n_primo]=contador;
				n_primo++;
			}
			
			contador++;
		}
		
		//ENVIO LOS NUMEORS PRIMOS A UN ARCHIVO DE OBJETOS-------------------------------------------
		
		try
		{
			ObjectOutputStream archivo_salida = new ObjectOutputStream(new FileOutputStream(ruta));
		
			archivo_salida.writeObject(numeros_primos);
			
			archivo_salida.close();
		}
		catch(Exception e)
		{}
		
		//AHORA ABRO EL ARCHIVO DE OBJETOS PARA LEERLO--------------------------------------------------
		
		try
		{
			ObjectInputStream objeto_entrada = new ObjectInputStream(new FileInputStream(ruta));
			
			int recuperar_n_primos [] = (int[])objeto_entrada.readObject();
			

			for(int i=0;i<n_primo;i++)
			{
				System.out.println(recuperar_n_primos[i]);
			}
		}
		catch(Exception e)
		{}
		
		
	}

}
