package Trabalho2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Componentes.Produtos;

public class Vendas {
	int id;
	static float valor;
	int idcliente;
	static ArrayList<Integer> produto;
	
	public Vendas(int id, int idCliente, float valor, ArrayList<Integer>produto){
		this.id = id;
		this.valor=valor;
		this.idcliente=idCliente;
		this.produto = produto;
		
	}


	public  String toString(){
		String str =id+"@@@"+idcliente+"@@@"+valor;
		for(int i=0;i<produto.size();i++){
			str=str+"@@@"+produto.get(i);
		}
		return str;
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
	public ArrayList<Integer> getProduto() {
		return produto;
	}
	public void setProduto(ArrayList<Integer> produto) {
		this.produto = produto;
	}
	
	
	
}
