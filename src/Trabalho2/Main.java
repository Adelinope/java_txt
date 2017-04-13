package Trabalho2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Componentes.Memoria;
import Componentes.Produtos;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) throws IOException {
		int opc = -1;
		scanner = new Scanner(System.in);
		while (opc != 0) {
			System.out.println("MENU");
			System.out.println(
					"1- CADASTRAR CLIENTE\n2-CADASTRAR PRODUTO\n3-VENDA\n4-LISTAR PRODUTOS\n5-LISTAR CLIENTES\n0-SAIR");
			opc=scanner.nextInt();
			switch(opc){
			case 1:
				Menu.cadastraCliente();
				break;
			case 2:
				Menu.incluiComponente();
				break;
			case 3:
				Menu.vender();
				break;
			case 4:
				ArrayList<Produtos>produtos = new ArrayList<Produtos>();
				produtos.addAll(Arquivo.leitorProdutos());
				for(int i=0;i<produtos.size();i++){
					System.out.println(produtos);
				}
				break;
			case 5:
				ArrayList<Clientes>cliente =  new ArrayList<Clientes>();
				Arquivo.leitorClientes(cliente);
				for(int i=0;i<cliente.size();i++){
					System.out.println(cliente);
				}
				break;
			case 0:
				System.out.println("SAINDO...");
				break;
			default:
				break;
			}
		}
	}
}
