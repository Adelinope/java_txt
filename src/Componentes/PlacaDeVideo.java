package Componentes;

import java.io.IOException;

import Trabalho2.Arquivo;

public class PlacaDeVideo extends Produtos {
	private String nome;
	private String memoria;
	private String marca;
	private String caminho= "arquivos/componentes.txt";

	public PlacaDeVideo(int id,int tipo,float valorDeCompra, float valorDeVenda, String descricao, String nome, String memoria, String marca) {
		super(id, tipo, valorDeCompra, valorDeVenda, descricao);
		this.nome = nome;
		this.memoria = memoria;
		this.marca=marca;
	}
	public String toString (){
		super.toString();
		String str = super.toString()+"@@@"+nome+"@@@"+memoria+"@@@"+marca;
		return str;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
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
