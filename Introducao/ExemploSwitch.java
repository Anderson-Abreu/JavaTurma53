package Introducao;

import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1,n2,calc = 0;
		int opcao;
		
		System.out.println("Digite o primeiro numero");
		n1=ler.nextDouble();
		
		System.out.println("\nDigite o segundo numero");
		n2=ler.nextDouble();
		
		System.out.println("\nDigite:\n1-soma\n2-subtração");
		System.out.println("3-multiplicação\n4-divisão");
		opcao=ler.nextInt();
		
		switch (opcao) {
		case 1:
			calc=n1+n2;
			System.out.println("A soma é: "+calc);
			break;
		case 2:
			calc=n1-n2;
			System.out.println("A subtração é: "+ calc);
			break;
		case 3:
			calc=n1*n2;
			System.out.println("A multiplicação é: "+ calc);
			break;
		case 4:
			if(n2==0)
				System.out.println("ERRO!!! Não é possível dividir por 0");
			else
			{
				calc=n1/n2;
				System.out.println("A divisao é "+ calc);
			}
			break;
		default:
			System.out.println("Opção inválida!!!");
			break;
		}
	}

}
