package Ejercicios;

import java.util.Scanner;

public class Ejerc26_Bid_3enRaya { //Realiza el juego de las tres en raya. 

	public static void main(String[] args) {
		
		System.out.println("********************** TRES EN RAYA **********************");
		  System.out.println("");  
		  int p=0, cont=0,j=1,cont1=0,cont2=0,v=0,e=0; 
		  String j1;
		  String j2;
		  String in;
		  char op=' ';
		  char of='X';
		  char od='O';
		  char a[]= new char[3];
		  char b[]= new char[3];
		  char c[]= new char[3]; 
		  a[0]='7';a[1]='8';a[2]='9';
		  b[0]='4';b[1]='5';b[2]='6';
		  c[0]='1';c[1]='2';c[2]='3'; 
		  Scanner lector=new Scanner(System.in);
		  
		  System.out.println("");
		  System.out.println("                 ********** Menu **********");
		  System.out.println("                 |                        |");
		  System.out.println("                 |  1.-Instrucciones      |");
		  System.out.println("                 |  2.-Jugar              |");
		  System.out.println("                 |  3.-Salir              |");
		  System.out.println("                 |                        |");
		  System.out.println("                 **************************");
		  System.out.println(" ");
		  System.out.print("Ingrese un Numero: ");
		  e=lector.nextInt();
		  if (e==1) {
		   System.out.println("");
		   System.out.println("*************** Instrucciones **************");
		   System.out.println("");
		   System.out.println("1.-Del numero ingresado solo se tomara en cuenta el primer numero");
		   System.out.println("   ejemplo: si se ingresa un 13, se tomara en cuenta que se ingreso");
		   System.out.println("   el numero 1.");
		   System.out.println("");
		   System.out.println("2.-Cada casilla tiene asignado un numero,se ingresa el numero de la");
		   System.out.println("   casilla en la que se quiere poner la X o el O");
		   System.out.println("");
		   System.out.println("3.-El ganador sera quien logre formar una linea orizontal, vertical ");
		   System.out.println("   o diaglonal con las X o los O");
		   System.out.println("");
		   System.out.println("4.-En caso de que nadie logre formar la linea se declarara empate");
		   System.out.println("");
		   System.out.println("5.-Si un jugador ingresa un caracter no correspondiente, tiene ");
		   System.out.println("   derecho de hacer un nuevo ingreso");
		   System.out.println("");
		   System.out.println(" ");
		   System.out.println("Ejemplo del tablero");
		   System.out.println("");
		   System.out.println("      |   |"  );
		   System.out.println("     7| 8 |9  "  );
		   System.out.println("------|---|------"  );
		   System.out.println("     4| 5 |6"  );
		   System.out.println("------|---|------"  );
		   System.out.println("     1| 2 |3"  );
		   System.out.println("      |   |"  );
		   System.out.println("");  
		   System.out.println("");   
		   }if (e==2) {
		   System.out.println("");
		   System.out.print("Ingrese el nombre del primer jugador: ");
		   j1=lector.next();
		   System.out.println("");
		   System.out.print("Ingrese el nombre del segundo jugador: ");
		   j2=lector.next();
		   System.out.println(" ");
		   while ((cont<9)&& v==0) { 
		    p=0;
		    System.out.println();   
		    if (j%2==0) {   
		     System.out.println("                  Es el turno de "+j2);
		     System.out.println(" ");
		    }else{
		     System.out.println("                  Es el turno de "+j1);
		     System.out.println(" ");
		    }
		    char a1;
		    System.out.print("Ingrese un numero: ");
		    in= lector.next();   
		    a1 = (char)in.charAt(0); 
		    if (a[0]==op) {
		     a[0]='7';
		    }
		    if (a[1]==op) {
		     a[1]='8';
		    }
		    if (a[2]==op) {
		     a[2]='9';
		    }
		    if (b[0]==op) {
		     b[0]='4';
		    }
		    if (b[1]==op) {
		     b[1]='5';
		    }
		    if (b[2]==op) {
		     b[2]='6';
		    }
		    if (c[0]==op) {
		     c[0]='1';
		    }
		    if (c[1]==op) {
		     c[1]='2';
		    }
		    if (c[2]==op) {
		     c[2]='3';
		    }
		    for (int i = 0; i < 3; i++) {
		     if(a1==a[i]||a1==b[i]||a1==c[i]){
		     if (j%2==0) {   
		      if (a1==a[i]) {
		       a[i]='O';
		      }
		      if (a1==b[i]) {
		       b[i]='O';
		      }
		      if (a1==c[i]) {
		       c[i]='O';
		      }
		     }else{
		      if (a1==a[i]) {
		       a[i]='X';
		      }
		      if (a1==b[i]) {
		       b[i]='X';
		      }
		      if (a1==c[i]) {
		       c[i]='X';
		      }
		     } 
		     }else{
		      cont1=cont1+1;     
		     }
		    } 
		    for (int i = 0; i < 3; i++) {
		     if (a[i]==of || a[i]==od) {      
		     }else{
		      a[i]=op;
		     }
		     if (b[i]==of || b[i]==od) {      
		     }else{
		      b[i]=op;
		     }
		     if (c[i]==of || c[i]==od) {      
		     }else{
		      c[i]=op;
		     }
		    } 
		    if (cont1==3) {
		     System.out.println("");
		     System.out.println("               Caracter no valido o casilla ocupada");
		     j=j-1;
		     cont=cont-1;
		     cont2=cont2-1;
		    }
		    cont1=0;
		    j= j+1;
		    cont=cont+1;
		    if(p==0){
		    System.out.println("      |   |"  );
		    System.out.println("    "+a[0]+" | "+a[1]+" |"+a[2]+"  "  );
		    System.out.println("------|---|------"  );
		    System.out.println("    "+b[0]+" | "+b[1]+" |"+b[2]+"  "  );
		    System.out.println("------|---|------"  );
		    System.out.println("    "+c[0]+" | "+c[1]+" |"+c[2]+"  "  );
		    System.out.println("      |   |"  );
		    }
		    Boolean x=((a[0]==a[1]&&a[1]==a[2]&&a[0]=='X')||(a[0]==b[0]&&b[0]==c[0]&&a[0]=='X')||(a[0]==b[1]&&b[1]==c[2]&&a[0]=='X')||(a[1]==b[1]&&b[1]==c[1]&&a[1]=='X')||(a[2]==b[2]&&b[2]==c[2]&&a[2]=='X')||(a[2]==b[1]&&b[1]==c[0]&&a[2]=='X')||(b[0]==b[1]&&b[1]==b[2]&&b[0]=='X')||(c[0]==c[1]&&c[1]==c[2]&&c[0]=='X'));
		    Boolean o=((a[0]==a[1]&&a[1]==a[2]&&a[0]=='O')||(a[0]==b[0]&&b[0]==c[0]&&a[0]=='O')||(a[0]==b[1]&&b[1]==c[2]&&a[0]=='O')||(a[1]==b[1]&&b[1]==c[1]&&a[1]=='O')||(a[2]==b[2]&&b[2]==c[2]&&a[2]=='O')||(a[2]==b[1]&&b[1]==c[0]&&a[2]=='O')||(b[0]==b[1]&&b[1]==b[2]&&b[0]=='O')||(c[0]==c[1]&&c[1]==c[2]&&c[0]=='O'));
		    System.out.println("");
		    if (x) {   
		     System.out.println("            *********** Felicidades ***********");
		     System.out.println("");
		     System.out.println("                   Ha ganado "+j1);
		     System.out.println(" ");
		     v=1;
		    }else{
		    if (o) {    
		     System.out.println("            *********** Felicidades ***********");
		     System.out.println(" ");
		     System.out.println("                   Ha ganado "+j2);
		     System.out.println(" ");
		     v=1;
		    }else{
		     cont2=cont2+1;
		     if(cont2==9){
		     System.out.println("            ********** El Juego ha terminado empatado **********");
		     System.out.println(" ");
		     System.out.println(" ");
		     }
		    }
		    }
		   }
		   a[0]='7';a[1]='8';a[2]='9';
		   b[0]='4';b[1]='5';b[2]='6';
		   c[0]='1';c[1]='2';c[2]='3'; 
		   cont=0;
		   v=0;
		   j=1;
		  }if (e>3) {
		   System.out.println("El numero ingresado no es valido ");
		   e=0;
		  } 
		  System.out.println("                 -------------------------------");
		  System.out.println("                 |            Autor            |");
		  System.out.println("                 |                             |");
		  System.out.println("                 |         Jorge Chueca        |");
		  System.out.println("                 |                             |");
		  System.out.println("                 -------------------------------");
		  lector.close();
		
		

	}

}
