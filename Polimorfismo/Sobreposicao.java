package Polimorfismo;

public class Sobreposicao {

	public static void main(String[] args) {
		
		Cachorro lulu = new Cachorro();
		Papagaio loro = new Papagaio();
	 
		System.out.println("CACHORRO");
		lulu.locomover();
		System.out.println("PAPAGAIO");
		loro.locomover();
	
	}

}
