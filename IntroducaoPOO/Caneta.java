package IntroducaoPOO;


public class Caneta {

	public static void main(String[] args) {
		
		ModeloCaneta caneta1 = new ModeloCaneta();
		ModeloCaneta caneta2 = new ModeloCaneta();
		ModeloCaneta caneta3 = new ModeloCaneta();
		
		caneta1.setCor("vermelho");
		System.out.println(caneta1.getCor());
		
		caneta1.setPonta(0.8);
		
		caneta1.estadoAtual();
		
		
	}

}
