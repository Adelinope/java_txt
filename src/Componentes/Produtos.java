package Componentes;

import java.io.IOException;

import Trabalho2.Arquivo;

public class Produtos {
	private float valorDeCompra;
	private float valorDeVenda;
	private int id, tipo;

	private String descricao;
	public Produtos(int id,int tipo,float valorDeCompra, float valorDeVenda ,String descricao) {
		this.valorDeCompra = valorDeCompra;
		this.valorDeVenda = valorDeVenda;
		this.id = id;
		this.descricao = descricao;
		this.tipo = tipo;
	}
	public String toString(){
		String str =id+"@@@"+tipo+"@@@"+valorDeCompra+"@@@"+valorDeVenda+"@@@"+"@@@"+descricao; 
		return str;
	}
	public float getValorDeCompra() {
		return valorDeCompra;
	}
	public void setValorDeCompra(float valorDeCompra) {
		this.valorDeCompra = valorDeCompra;
	}
	public float getValorDeVenda() {
		return valorDeVenda;
	}
	public void setValorDeVenda(float valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void cadastraProduto()throws IOException{	 
		
	}
	public void getProduto()throws IOException {
		
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
