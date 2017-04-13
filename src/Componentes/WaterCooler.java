package Componentes;

import java.io.IOException;

import Trabalho2.Arquivo;

public class WaterCooler extends Produtos{
	private String caminho= "arquivos/componentes.txt";
	private String nome;
	private String tamanho;
	private String marca;
	public WaterCooler(int id,int tipo,float valorDeCompra, float valorDeVenda, String descricao, String nome, String tamanho, String marca) {
		super(id,tipo,valorDeCompra, valorDeVenda, descricao);
		this.marca = marca;
		this.nome = nome;
		this.tamanho = tamanho;
	}
	@Override
	public String toString() {
		super.toString();
		String str =super.toString()+"@@@"+nome + "@@@" + tamanho + "@@@" + marca;
		return  str;
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
