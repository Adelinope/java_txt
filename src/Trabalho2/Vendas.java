package Trabalho2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Componentes.Produtos;

public class Vendas {
	int id;
	static float valor;
	int idcliente;
	static ArrayList<Produtos>produto;
	
	public Vendas(int id, int idCliente, float valor, ArrayList<Produtos>produto){
		this.id = id;
		this.valor=valor;
		this.idcliente=idCliente;
		
	}
	public static void addProduto(Produtos item){
		produto.add(item);
		valor= valor+item.getValorDeVenda();
	
	}
	public static Produtos localiza(int x) throws IOException{
		ArrayList<Produtos>nossa;
		int posicao = 0;
		nossa=Arquivo.leitorProdutos();
		for (int i=0;i<nossa.size();i++){
			if(nossa.get(i).getId() ==  x){
				posicao = i;
			}
		}
		return nossa.get(posicao);
	}
	public String toString(){
		String str = "@@@"+idcliente+"@@@"+valor+"@@@";
		for(int i=0;i<produto.size();i++){
			str=str+"@@@"+produto.get(i).getId();
		}
		return str;
	}
	public static float retornaPreco(ArrayList<Produtos> produto) throws IOException{
		float preco = 0;
		for(int i=0;i<produto.size();i++){
				preco=preco+produto.get(i).getValorDeVenda();
		}
		return preco;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public ArrayList<Produtos> getProduto() {
		return produto;
	}
	public void setProduto(ArrayList<Produtos> produto) {
		this.produto = produto;
	}
	

	
}
