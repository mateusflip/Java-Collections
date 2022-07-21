package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		//Declarar o tipo do arrayList
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		//Para cada aula dentro de aulas, faça
		System.out.println("Percorrendo com o for");
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		System.out.println("Percorrendo com indice");
		for(int i = 0; i <aulas.size(); i++) {
			System.out.println("Aula: "+ aulas.get(i));
		}
		
		System.out.println("O primeiro curso da lista é o " + aulas.get(0));
		
		//Para cada aula dentro de aulas, faça o comando após a seta dentro das chaves
		System.out.println("Percorrendo com o ForEach");
		aulas.forEach(aula -> {
			System.out.println("Aula " + aula);
		});
		
		System.out.println("O tamanho do array é de " + aulas.size());
		
		
		//Ordenando em ordem alfabetica
		aulas.add("Aula de Strings");
		Collections.sort(aulas);
		System.out.println(aulas);
	}

}
