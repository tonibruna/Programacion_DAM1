package EX_RECUP_1ev_JoseA_Bruna;
import java.util.Scanner;

public class Calculo_Digito_Control {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		//Creamos los arrays 
		int [] nEntidad = new int [4];
		int [] nSucursal = new int [4];
		int[] nCuenta=new int[10];
		
		//creamos dos variables para meter los digitos de control
		int control_1=0;
		int control_2=0;

		//Pedimos introducir los numeros de entidad por teclado
		System.out.println("Introduce los 4 digitos de la entidad de uno en uno: ");
		for(int i=0;i<4;i++) {
			nEntidad[i]=teclado.nextInt();
		}
		
		//Pedimos introducir los numeros de sucursal por teclado
		System.out.println("Introduce los 4 digitos de la sucursal de uno en uno: ");
		for(int i=0;i<4;i++) {
			nSucursal[i]= teclado.nextInt();
		}
		
		//Pedimos introducir los numeros de la cuenta por teclado
		System.out.println("Introduce los 10 digitos de la cuenta de uno en uno: ");
		for(int i=0;i<10;i++) {
			nCuenta[i]= teclado.nextInt();
		}
		
		//Operamos para sacar el primer digito
		nEntidad[0]=nEntidad[0]*4;
		nEntidad[1]=nEntidad[1]*8;
		nEntidad[2]=nEntidad[2]*5;
		nEntidad[3]=nEntidad[3]*10;
		nSucursal[0]=nSucursal[0]*9;
		nSucursal[1]=nSucursal[1]*7;
		nSucursal[2]=nSucursal[2]*3;
		nSucursal[3]=nSucursal[3]*6;
		for(int i=0;i<4;i++) {
			control_1=control_1+nEntidad[i]+nSucursal[i];
		}
		control_1=control_1%11;
		control_1=11-control_1;
		if (control_1==10){
			control_1=1;
		}
		
		System.out.println("El primer digito de control es: "+control_1);
		
		//Operamos para sacar el segundo digito
		nCuenta[0]=nCuenta[0]*1;
		nCuenta[1]=nCuenta[1]*2;
		nCuenta[2]=nCuenta[2]*4;
		nCuenta[3]=nCuenta[3]*8;
		nCuenta[4]=nCuenta[4]*5;
		nCuenta[5]=nCuenta[5]*10;
		nCuenta[6]=nCuenta[6]*9;
		nCuenta[7]=nCuenta[7]*7;
		nCuenta[8]=nCuenta[8]*3;
		nCuenta[9]=nCuenta[9]*6;
		for(int i=0;i<10;i++) {
			control_2=control_2+nCuenta[i];
		}
		control_2=control_2%11;
		control_2=11-control_2;
		if (control_2==10){
			control_2=1;
		}
		
		System.out.println("El segundo digito de control es: "+control_2);	
		teclado.close();
		
	}

}
