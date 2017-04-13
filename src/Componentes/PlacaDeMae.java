package Componentes;

import java.io.IOException;

import Trabalho2.Arquivo;

public class PlacaDeMae extends Produtos {
	private String nome;
	private String marca;
	private String soquete;
	private String caminho= "arquivos/componentes.txt";
	public PlacaDeMae(int id,int tipo,float valorDeCompra, float valorDeVenda, String descricao, String nome, String marca, String soquete) {
		super(id,tipo, valorDeCompra, valorDeVenda, descricao);
		this.nome = nome;
		this.marca = marca;
		this.soquete = soquete;
	}
	public String toString (){
		super.toString();
		String str= super.toString()+"@@@"+nome+"@@@"+marca+"@@@"+soquete;
		return str;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getSoquete() {
		return soquete;
	}
	public void setSoquete(String soquete) {
		this.soquete = soquete;
	}
	public void cadastraProduto() throws IOException{
		Arquivo v= new Arquivo();
		v.escritor(toString(),caminho);
	}
}
