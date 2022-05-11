package VetoresEMatrizes;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int v[]= {1,2,3,4,5};//criando vetor com dados
		int v1[] = new int[5];//criando vetor vazio
		System.out.print(v[0]+"\t");
		System.out.println(v[1]);
			
		for(int indice=0;indice<5;indice++)
			System.out.print(v[indice]+"\t");
		
		System.out.print("\nDigite um numero: ");
		v1[0]=ler.nextInt();
		System.out.println(v1[0]);
		
		for(int indice=0;indice<5;indice++)
		{
			System.out.print("Digite um numero: ");
			v1[indice]=ler.nextInt();
		}
		for(int indice=0;indice<5;indice++)
			System.out.print(v1[indice]+"\t");
		
	}

}
