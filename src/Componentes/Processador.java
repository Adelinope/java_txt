package Componentes;

import java.io.IOException;

import Trabalho2.Arquivo;

public class Processador extends Produtos{

	private String nome;
	private String ghz;
	private String marca;
	private String caminho= "arquivos/componentes.txt";
	public Processador(int id,int tipo,float valorDeCompra, float valorDeVenda, String descricao, String nome, String ghz, String marca) {
		super(id,tipo,valorDeCompra, valorDeVenda, descricao);
		this.nome=nome;
		this.ghz=ghz;
		this.marca=marca;
	}
	
	public String toString(){
		super.toString();
		String str = super.toString()+"@@@"+nome+"@@@"+ghz+"@@@"+marca;
		return str;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGhz() {
		return ghz;
	}

	public void setGhz(String ghz) {
		this.ghz = ghz;
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

}
