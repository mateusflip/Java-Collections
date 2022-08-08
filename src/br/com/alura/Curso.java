package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	//Declaramos lista de forma genaralizada assim podemos declarar uma linkedList ou ArrayList a qualquer momento
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	
	
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		//Retorna uma lista que não é possível manipular(adicionar, remover...) que não seja pela classe Curso
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempo() {
		int total = 0;
		for (Aula aula : aulas) {
			total += aula.getTempo();
		}
		return total;
	}
	
	@Override
	public String toString() {
		return "[Curso: " + nome + " duração total "+ this.getTempo() +" Aulas: " + aulas ;
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
}
