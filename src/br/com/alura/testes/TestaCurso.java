package br.com.alura.testes;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCurso {

 public static void main(String[] args) {
	 Curso javaColecoes = new Curso("Dominando coleções em java", "Mateus Ramos");
 
	 javaColecoes.adiciona(new Aula("Aula de Java Intro", 23));
	 
	 //Linha abaixo não compila devido ao unmodifiableList
	 //javaColecoes.getAulas().remove(0);
	 
	 javaColecoes.adiciona(new Aula("Aula de Python", 10));
	 javaColecoes.adiciona(new Aula("Aula de Pandas", 31));
	 
	 System.out.println(javaColecoes.getAulas());
 
 }
}
