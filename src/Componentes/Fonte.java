package Componentes;

import java.io.IOException;

import Trabalho2.Arquivo;

public class Fonte extends Produtos {
	private String nome;
	private String frequencia;
	private String marca;
	private String caminho= "arquivos/componentes.txt";
	public Fonte(int id,int tipo,float valorDeCompra, float valorDeVenda, String descricao, String nome, String frequencia,
			String marca) {
		super(id,tipo,valorDeCompra, valorDeVenda, descricao);
		this.frequencia = frequencia;
		this.marca = marca;
		this.nome = nome;
	}
	public String toString(){
		super.toString();
		String str =super.toString()+"@@@"+ nome+"@@@"+frequencia+"@@@"+marca;
		return str;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void cadastraProduto() throws IOException{
		Arquivo v= new Arquivo();
		v.escritor(toString(),caminho);
	}
	public void getProduto()throws IOException {
		Arquivo v= new Arquivo();
		v.leitor(caminho);
	}
}
