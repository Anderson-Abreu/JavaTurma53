package Polimorfismo;

public class Cachorro extends Pet{

	private String raca;
	private String cor;
	
	@Override
	public void locomover()
	{
		System.out.println("Correndo...");
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("Latir...");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
}
