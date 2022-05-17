package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1,n2;
		try {
			System.out.println("Digite os numeros para a divisão:");
			n1=ler.nextInt();
			n2=ler.nextInt();
			System.out.println("\nA divisão é:"+n1/n2);
		}catch(InputMismatchException erro)
		{
			System.out.println("Tipo de dado incompatível ");
		}catch(ArithmeticException erro)
		{
			System.out.println("Não é possível divir por ZERO! ");
		}
		System.out.println("\n FIM DO PROGRAMA!!!!");


	}

}
