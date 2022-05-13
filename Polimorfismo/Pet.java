package Polimorfismo;

public abstract class Pet {
	
	private double peso;
	private String nome;
	
	public void locomover()
	{
		System.out.println("mudando de posição");
	}
	
	public void emitirSom()
	{
		System.out.println("Som de Pet");
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}
