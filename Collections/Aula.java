package Collections;

public class Aula {
	private int tempo;
	private String titulo;
	
	public Aula(String x, int n)
	{
		this.titulo=x;
		this.tempo=n;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String toString()
	{
		return "Aulas:" + this.titulo+", " + this.tempo+" min";
	}
	
}
