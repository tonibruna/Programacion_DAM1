package PR08EJ_5_Animales;

public class Uso_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Canario Piolin = new Canario(Animal.Genero.Macho); 
		Lagarto Juancho = new Lagarto (Animal.Genero.Macho);
		Gato Garfield = new Gato (Animal.Genero.Macho);
		Animal Serpiente = new Animal (Animal.Genero.Hembra);
		Pingüino Celia = new Pingüino (Animal.Genero.Hembra);
		
		System.out.println("�Que haces Piolin?");
		Piolin.alimentarse();
		System.out.println(Piolin.alimentarse()+"\n");
		System.out.println("�Que haces Piolin?");
		Piolin.ponerHuevos();
		System.out.println(Piolin.ponerHuevos()+"\n");
		System.out.println("�Que haces Juancho?");
		Juancho.dormir();
		System.out.println(Juancho.dormir()+"\n");
		System.out.println("�Que haces Garfield?");
		Garfield.arañarSofa();
		System.out.println(Garfield.arañarSofa()+"\n");
		System.out.println("�Que haces Serpiente?");
		Serpiente.alimentarse();
		System.out.println(Serpiente.alimentarse()+"\n");
		System.out.println("�Porque andas asi Celia?");
		Celia.andarMuyRaro();
		System.out.println(Celia.andarMuyRaro()+"\n");
		
	}

}
