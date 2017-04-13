package Componentes;

import java.io.IOException;

import Trabalho2.Arquivo;

public class Memoria extends Produtos{
	private String nome;
	private String marca;
	private String barramento;
	private String caminho= "arquivos/componentes.txt";
	public Memoria(int id,int tipo,float valorDeCompra, float valorDeVenda, String descricao, String nome, String marca, String barramento) {
		super(id,tipo,valorDeCompra, valorDeVenda, descricao);
		this.barramento = barramento;
		this.marca = marca;
		this.nome = nome;
	}
	public String toString(){
		String str =super.toString();
		 str=  super.toString()+"@@@"+ "@@@"+nome+"@@@"+barramento+"@@@"+marca;
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
	public String getBarramento() {
		return barramento;
	}
	public void setBarramento(String barramento) {
		this.barramento = barramento;
	}

	public void cadastraProduto() throws IOException{
		Arquivo v= new Arquivo();
		v.escritor(toString(),caminho);
	}
}
