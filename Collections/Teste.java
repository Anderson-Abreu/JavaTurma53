package Collections;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Double>preco	= new ArrayList<>();
		double soma=0;
		preco.add(5.0);
		preco.add(5.5);
		preco.add(6.7);
		preco.add(8.3);
		
		System.out.println(preco);
		
		for(int x=0;x<preco.size();x++)
		{
			soma=soma+preco.get(x);
		}
		System.out.println(soma);
	}

}
