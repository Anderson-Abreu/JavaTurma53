package IntroducaoPOO;

import java.util.Scanner;

public class Caneta {

	public static void main(String[] args) {
		
		ModeloCaneta caneta1 = new ModeloCaneta();
		ModeloCaneta caneta2 = new ModeloCaneta();
		ModeloCaneta caneta3 = new ModeloCaneta();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Caneta 2");
		//caneta2.carga=50;
		caneta2.destampar();
		caneta2.estadoAtual();
		caneta2.escrever();
		
		System.out.println("\nCaneta 1");
	//	caneta1.carga=99;
		caneta1.tampar();
		caneta1.destampar();
		caneta1.estadoAtual();
		caneta1.escrever();
		
		System.out.println("\nCaneta 3");
		caneta3.estadoAtual();
	}

}
