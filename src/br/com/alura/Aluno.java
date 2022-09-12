package br.com.alura;

public class Aluno {

	
	private String nome;
	private int numeroMatricula;
	
	
	public Aluno(String nome, int numeroMatricula) {
		
		if(nome == null || nome == "") {
			throw new NullPointerException("Nome n�o pode ser nulo ou vazio");
		}
		if( numeroMatricula == 0) {
			throw new NullPointerException("N�mero de matricula n�o pode ser zero");
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
	
	//Equals equipara se dois objetos s�o iguais
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		
		return this.nome.equals(outro.nome);
	}
	
	//Depois que reescrevemos o m�todo equals, devemos reescerever tamb�m o hashcode
	//HashCode � o c�digo de espalhamento
	//Se dois objetos s�o equals, ent�o eles devem ter o mesmo hashcode
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
