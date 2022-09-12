package br.com.alura;

public class Aluno {

	
	private String nome;
	private int numeroMatricula;
	
	
	public Aluno(String nome, int numeroMatricula) {
		
		if(nome == null || nome == "") {
			throw new NullPointerException("Nome não pode ser nulo ou vazio");
		}
		if( numeroMatricula == 0) {
			throw new NullPointerException("Número de matricula não pode ser zero");
		}
		
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}


	public String getNome() {
		return nome;
	}


	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	//Equals equipara se dois objetos são iguais
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		
		return this.nome.equals(outro.nome);
	}
	
	//Depois que reescrevemos o método equals, devemos reescerever também o hashcode
	//HashCode é o código de espalhamento
	//Se dois objetos são equals, então eles devem ter o mesmo hashcode
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aluno: " + this.nome +", "+ " Matricula: "+ this.numeroMatricula;
	}
	
}
