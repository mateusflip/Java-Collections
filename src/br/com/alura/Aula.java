package br.com.alura;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	//Reescrevendo o toString para setarmos o que deve ser descrito como objeto
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " Minutos]";
	}

	
	//Reescrevendo o compareTo para definirmos os parametros de comparação da classe
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}

}
