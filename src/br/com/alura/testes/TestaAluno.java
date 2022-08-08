package br.com.alura.testes;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {
	public static void main(String[] args) {
		Set<String> alunos= new HashSet<>();
		
		alunos.add("Mateus Ramos");
		alunos.add("Mantuan");
		alunos.add("Fábio Santos");
		alunos.add("Yuri Alberto");
		alunos.add("Vitor Pereira");
		alunos.add("Paulinho");
		System.out.println(alunos);
		
		//Contains verifica se um objeto está no conjunto que passamos
		boolean MateusEstaMatriculado = alunos.contains("Mateus Ramos");
		System.out.println(MateusEstaMatriculado);
		
		//Remove um objeto em especifico, mas não pelo indice
		alunos.remove("Paulinho");
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos.size());
		
		
		
		
		//Set é um conjunto, logo não possui ordem quando implementamos
		//Não permite implementar um objeto identico
		//Não possui um indice que podemos acessar um objeto em específico
		//Set são usados por conta da sua performace, são muito mais rápidos
	}
}
