package Exception;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1,n2;
		try {
		System.out.println("Digite os numeros para a divis�o:");
		n1=ler.nextInt();
		n2=ler.nextInt();
		System.out.println("\nA divis�o �:"+n1/n2);
		}catch(Exception erro)
		{
			System.out.println("Valor inv�lido "+erro);
		}
		System.out.println("\n FIM DO PROGRAMA!!!!");

	}

}
