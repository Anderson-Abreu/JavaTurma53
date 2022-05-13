package Polimorfismo;

public class Papagaio extends Pet {
	
	@Override
	public void locomover()
	{
		System.out.println("Voando...");
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("Falar...");
	}
	
}
