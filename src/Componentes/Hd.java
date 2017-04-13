package Componentes;

import java.io.IOException;

import Trabalho2.Arquivo;

public class Hd extends Produtos{
	private String nome;
	private String tamanho;
	private String rotacao;
	private String caminho= "arquivos/componentes.txt";
	public Hd(int id,int tipo,float valorDeCompra, float valorDeVenda, String descricao, String nome, String tamanho, String rotacao) {
		super(id,tipo, valorDeCompra, valorDeVenda,descricao);
		this.nome = nome;
		this.rotacao =rotacao;
		this.tamanho= tamanho;
	}
	public String toString(){
		super.toString();
		String str=super.toString()+"@@@"+nome+"@@@"+tamanho+"@@@"+rotacao;
		return str;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getRotacao() {
		return rotacao;
	}
	public void setRotacao(String rotacao) {
		this.rotacao = rotacao;
	}
	public void cadastraProduto() throws IOException{
		Arquivo v= new Arquivo();
		v.escritor(toString(),caminho);
	}
}
