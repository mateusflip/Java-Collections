package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.Aula;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de Objetos", 12);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 10);
		
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//Ordenar o array de aulas pelo tempo das aulas usando como parametro o tempo
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}

}
