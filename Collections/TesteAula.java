package Collections;

import java.util.ArrayList;

public class TesteAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Laços", 50);
		Aula a2 = new Aula("POO", 120);
		Aula a3 = new Aula("Herança", 90);
		
		ArrayList<Aula> taula = new ArrayList<>();
		
		System.out.println(taula);
		
		taula.add(a1);
		taula.add(a2);
		taula.add(a3);
		
		System.out.println(taula);
	}

}
