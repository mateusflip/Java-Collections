package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCurso2 {
	public static void main(String[] args) {
	 Curso javaColecoes = new Curso("Dominando coleções em java", "Mateus Ramos");
	 
	 javaColecoes.adiciona(new Aula("Aula de Java Intro", 23));
	 javaColecoes.adiciona(new Aula("Aula de Python", 10));
	 javaColecoes.adiciona(new Aula("Aula de Pandas", 31));
	 
	 List<Aula> aulasImutaveis = javaColecoes.getAulas();
	 System.out.println(aulasImutaveis);
	 
	 //Criando uma lista que identica a lista acima só que podemos modificar ela
	 List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
	 Collections.sort(aulas);
	 System.out.println(aulas);
	 
	 System.out.println("O tempo total dos cursos é de " + javaColecoes.getTempo());
	 
	 System.out.println(javaColecoes);
	}
}
