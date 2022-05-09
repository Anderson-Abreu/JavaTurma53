package Repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		System.out.println("TABUADA DO 4\n");
		
		for(int x=1;x<=10;x++)
			System.out.println("4 X "+x+" = "+4*x);
		
		System.out.print("\nEscolha uma tabuada: ");
		n=ler.nextInt();
		for(int x=1;x<=10;x++)
			System.out.println(n+" X "+x+" = "+n*x);
		
		for(int x=1;x<=9;x++)
		{
			System.out.println("\n TABUADA DO "+x+"\n");
			for(int y=1;y<=10;y++)
				System.out.println(x+" X "+y+" = "+x*y);
		}
	}

}
