package br.com.alura.testes;

import java.util.HashMap;
import java.util.Map;

public class IterandoPorMap {
	
	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(1, "Mateus");
		pessoas.put(2, "Jack");
		pessoas.put(3, "Testonildo");
		pessoas.put(4, "É");
	
		
		//Keyset é o conjunto de chaves que vamos iterar
		pessoas.keySet().forEach(pessoa ->{
			System.out.println(pessoas.get(pessoa));
		});
	}

}
