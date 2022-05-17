package Collections;

import java.util.*;

public class Exemplo1 {

	public static void main(String[] args) {
		String aula1 = "Bloco I";
	    String aula2 = "Bloco II";
		String aula3 = "Bloco III";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		
		aulas.add(aula1);

		
		aulas.add(aula3);
		aulas.add(aula2);
		
		aulas.add("Aula Zero");
		aulas.add("como fazer");
		System.out.println(aulas);
		
		aulas.remove(4);
		
		System.out.println("Mostra o conteudo do indice 2");
		System.out.println(aulas.get(2));
		
		System.out.println("\nConteudo do ArrayList aulas");
		System.out.println(aulas);
		
		System.out.println(aulas.contains("Bloco I"));
		
		System.out.println("\nMostra o tamanho da lista");
		System.out.println(aulas.size());
		
		System.out.println("\nLista organizada");
		
		Collections.sort(aulas);
		aulas.remove(3);
		System.out.println(aulas);
		
		aulas.clear();
		
		System.out.println("\nConteudo do ArrayList aulas");
		System.out.println(aulas);
		
		System.out.println(aulas.contains("bloc"));
		
	}

}
