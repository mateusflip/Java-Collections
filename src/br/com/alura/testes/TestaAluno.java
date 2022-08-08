package br.com.alura.testes;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {
	public static void main(String[] args) {
		Set<String> alunos= new HashSet<>();
		
		alunos.add("Mateus Ramos");
		alunos.add("Mantuan");
		alunos.add("F�bio Santos");
		alunos.add("Yuri Alberto");
		alunos.add("Vitor Pereira");
		alunos.add("Paulinho");
		System.out.println(alunos);
		
		//Contains verifica se um objeto est� no conjunto que passamos
		boolean MateusEstaMatriculado = alunos.contains("Mateus Ramos");
		System.out.println(MateusEstaMatriculado);
		
		//Remove um objeto em especifico, mas n�o pelo indice
		alunos.remove("Paulinho");
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos.size());
		
		
		
		
		//Set � um conjunto, logo n�o possui ordem quando implementamos
		//N�o permite implementar um objeto identico
		//N�o possui um indice que podemos acessar um objeto em espec�fico
		//Set s�o usados por conta da sua performace, s�o muito mais r�pidos
	}
}
