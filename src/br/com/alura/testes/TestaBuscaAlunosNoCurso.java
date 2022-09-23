package br.com.alura.testes;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando coleções em java", "Mateus Ramos");
		 
		 javaColecoes.adiciona(new Aula("Aula de Java Intro", 23));
		 javaColecoes.adiciona(new Aula("Aula de Python", 10));
		 javaColecoes.adiciona(new Aula("Aula de Pandas", 31));
		 
		 Aluno aluno1 = new Aluno("Mateus Ramos", 1234);
		 Aluno aluno2 = new Aluno("Aluno inteligente", 3456);
		 Aluno aluno3 = new Aluno("João da Nica", 3458);
		 
		 javaColecoes.matricula(aluno1);
		 javaColecoes.matricula(aluno2);
		 javaColecoes.matricula(aluno3);
		 
		Aluno aluno = javaColecoes.buscaMatriculado(1234);
		System.out.println("aluno "+ aluno);
	}
}
