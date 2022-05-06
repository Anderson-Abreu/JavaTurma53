package Introducao;

import java.util.Scanner;

public class ExemploIf {
/*
 && -> e
 || -> ou
 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1,idade;
		
		System.out.println("Digite um numero");
		n1=ler.nextInt();
		
		if(n1%2==0)
		{	System.out.println("par");
			System.out.println("parabéns por escolher esse numero");
		}
		else
		{
			System.out.println("impar");
			System.out.println("\nQue pena que não é par");
		}
		
		System.out.println("Digite sua idade:");
		idade=ler.nextInt();
		
		if(idade>=0 && idade<=13)
			System.out.println("Criança");
		else if(idade>13 && idade<=21)
			System.out.println("Adolecente");
		else
			System.out.println("Adulto");
	}

}
