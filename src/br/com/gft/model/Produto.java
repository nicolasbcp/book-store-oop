package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public abstract class Produto implements Imposto {
	// Atributos
	private String nome;
	private double preco;
	private int qtd;
	
	// M�todos Construtores
	public Produto() {
		
	}

	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	// M�todos Especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
}
