package IntroducaoPOO;

public class ModeloCaneta {
	
	//CARACTERISTICAS -> ATRIBUTOS
	public String cor;
	public double ponta;
	private int carga;
	private boolean tampada;
	
	//METODO CONTRUTOR
	
	public ModeloCaneta()
	{
		this.carga=100;
		this.tampada=true;
	}
	
	//COMPORTAMENTO -> MÉTODOS
	public void escrever()
	{
		
		if(this.tampada==true)
			System.out.println("Erro! A caneta está tampada");
		else
			System.out.println("Escrevendo...");
	}
	
	public void tampar()
	{
		this.tampada=true;
	}
	
	public void destampar()
	{
		this.tampada=false;
	}
	
	public void estadoAtual()
	{
		System.out.println("cor: "+this.cor);
		System.out.println("ponta: "+this.ponta);
		System.out.println("Esta tampada? "+this.tampada);
		System.out.println("A carga esta em "+this.carga+"%");
	}

}
