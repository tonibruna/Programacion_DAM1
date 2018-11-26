package PR08EJ_01_Hora;

public class Hora {
	//atributos
	protected int hora; //no ponemos private para poder modificarlo en Hora12
	protected int minutos;
	
	//constructor
	public Hora(int h, int min) {
		this.hora=0;
		this.minutos=0;
		//se usan setter para acotar las horas y minutos a 23 y 59
		setHora(h); 
		setMinutos(min);
	}

	//metodos
	public void inc() {
		this.minutos++;
		if (this.minutos>59) {
			minutos=0;
			hora++;
			if (this.hora>23) {
			hora=0;
			}
		}
	}
	
	public void setMinutos (int x) { //da igual que letra usemos mientras devuelva un INT 
		if(x>=0 && x<60) {
			this.minutos=x;
		}
	}
	
	public void setHora (int y) {
		if(y>=0 && y<24) {
			this.hora=y;
		}
	}

	public String ToString () { //devolver datos
		return hora+":"+minutos;
	}


}
