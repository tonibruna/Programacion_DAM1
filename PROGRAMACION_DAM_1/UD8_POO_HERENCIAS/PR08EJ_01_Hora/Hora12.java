package PR08EJ_01_Hora;

public class Hora12 extends Hora {
	public enum Meridiano {AM,PM}
	
	//Creamos el atributo Mer que falta para la clase Hora12
	private Meridiano mer;
	
	//Constructor
	public Hora12(int h, int min, Meridiano mer) {
		super(h,min);
		setHora(h);//este setter es propio de Hora12
		this.mer=mer;
	}
	
	//sobreescribimos setHora porque cambia 
	public void setHora(int x) {
		if(x>=1 && x<12) {
			this.hora=x;
	}
  }
	
	public void inc() {
		this.minutos++;
		if(this.minutos>59){
			this.minutos=0;
			this.hora++;
			if(this.hora>12) {
				this.hora=hora-12;
				mer=Meridiano.PM;
			}else {
				mer=Meridiano.AM;
			}
		}
	}
	
	public String toString() {
		return hora+":"+minutos+"-"+mer;
	}
	
	
	
	
	
}
