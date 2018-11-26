package EjemploClaseAbstractas;

 abstract class Persona {//esto marca el diseño de la herencia, 
	// ya que las clases que 
	// heredan de Persona están obligadas a definir el método 
	 //abstracto dameDescripcion.
	// Tiene poca funcionalidad
	 private String nombre;
	 
	 
	 public Persona (String nombre) {
		 this.nombre=nombre;
	 }
	 
	 public String getNombre (){
		 return nombre;
	 }
	 
	 public abstract String dameDescripcion();
	 

}
