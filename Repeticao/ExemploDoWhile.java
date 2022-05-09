package Repeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		do
		{
			System.out.print("Escolha uma tabuado do 1 ao 10: ");
			n=ler.nextInt();
			for(int x=1;x<=10;x++)
				System.out.println(n+" X "+x+" = "+n*x);
		}while(n>0 && n<=10);
		System.out.println("Valor inválido Fim do programa!!!");

	}

}
