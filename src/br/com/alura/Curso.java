package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	//Declaramos lista de forma genaralizada assim podemos declarar uma linkedList ou ArrayList a qualquer momento
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	
	
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
		//Retorna uma lista que n�o � poss�vel manipular(adicionar, remover...) que n�o seja pela classe Curso
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void remover(Aula aula) {
		this.aulas.remove(aula);
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
		return "[Curso: " + nome + " dura��o total "+ this.getTempo() +" Aulas: " + aulas ;
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		//Associamos o aluno e a matricula em um mapa de alunos e matricula
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		
	}
	
	public void desmatricular(Aluno aluno) {
		this.alunos.remove(aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	

	public boolean estaMatriculado(Aluno aluno1) {
		return this.alunos.contains(aluno1);
	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException("n�mero de matricula n�o encontrada");
		return matriculaParaAluno.get(numero);
		}
}
