package PR08EJ_01_Hora;

public class HoraExacta extends Hora{
	
	//atributos
	protected int segundos;
	
	//constructor
	public HoraExacta(int h, int min, int s) {
		super(h,min);
		setSegundos(s);
	}
	
	//metodos
	public void inc() {
		this.segundos++;
		if(this.segundos>59) {
			this.segundos=0;
			this.minutos++;
			if(this.minutos>59) {
				this.minutos=0;
				this.hora++;
				if(this.hora>23) {
					this.hora=0;
				}
			}	
		}
	}

	public void setSegundos (int x) {
		if(x<60 && 0<=x) {
			this.segundos=x;
		}
	}
	
	public String toString() {
		return hora+":"+minutos+":"+segundos;
	}
}
