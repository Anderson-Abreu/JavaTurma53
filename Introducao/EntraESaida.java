package Introducao;

import java.util.Scanner;

public class EntraESaida {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int n1, n2,soma;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1=ler.nextInt();
		
		System.out.print("\n Digite o segundo n�mero: ");
		n2=ler.nextInt();
		
		soma=n1+n2;
		
		System.out.println("\n A soma �: "+ soma);
	}

}
