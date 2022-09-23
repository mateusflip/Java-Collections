package br.com.alura.testes;

import java.util.HashSet;
import java.util.Set;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		 Curso javaColecoes = new Curso("Dominando coleções em java", "Mateus Ramos");
		 
		 javaColecoes.adiciona(new Aula("Aula de Java Intro", 23));
		 javaColecoes.adiciona(new Aula("Aula de Python", 10));
		 javaColecoes.adiciona(new Aula("Aula de Pandas", 31));
		 
		 System.out.println(javaColecoes.getAulas());

		 
		 Aluno aluno1 = new Aluno("Mateus Ramos", 1234);
		 Aluno aluno2 = new Aluno("Aluno inteligente", 3456);
		 Aluno aluno3 = new Aluno("João da Nica", 3458);
		 
		 javaColecoes.matricula(aluno1);
		 javaColecoes.matricula(aluno2);
		 javaColecoes.matricula(aluno3);
		
		 System.out.println("Todos os alunos matriculados");
		 javaColecoes.getAlunos().forEach(aluno -> {
			 System.out.println(aluno);
		 });
		 
		 
		 System.out.println("O aluno " + aluno1 + " está matriculado?");
		 System.out.println(javaColecoes.estaMatriculado(aluno1));
	
	
		 Aluno mateus = new Aluno("Mateus Ramos", 1234);
		 System.out.println("Esse Mateus está matriculado?");
		 System.out.println(javaColecoes.estaMatriculado(mateus));
		 
		 System.out.println("O Aluno1 é equals ao Mateus?");
		 System.out.println(aluno1.equals(mateus));
		 
		 
	}
}
