package Trabalho2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import Componentes.Fonte;
import Componentes.Hd;
import Componentes.Memoria;
import Componentes.PlacaDeMae;
import Componentes.PlacaDeVideo;
import Componentes.Processador;
import Componentes.Produtos;
import Componentes.Tela;
import Componentes.WaterCooler;

public class Menu {
	static Scanner  scanner = new Scanner(System.in);
	private static Clientes cliente;
	private static Fonte fonte;
	private static Hd hd;
	private static Memoria memoria;
	private static PlacaDeMae placaM;
	private static PlacaDeVideo placaV;
	private static Processador processador;
	private static Tela tela;
	private static WaterCooler cooler;
	private static int opc;
	private static int tipo;
	private static float valor;
	
	public Menu(){
		
	}

	
	public static void cadastraCliente() throws IOException{// Metodo para cadastrar um cliente no txt
		String nome, cpf, endereco, telefone;
		System.out.println("Digite o nome do cliente: ");
		nome = scanner.nextLine();
		System.out.println("Digite o CPF: ");
		cpf= scanner.next();
		System.out.println("Digite o endereço: ");
		endereco = scanner.nextLine();
		endereco = scanner.nextLine();
		System.out.println("Digite o telefone: ");
		telefone = scanner.next();
		cliente =  new Clientes (Arquivo.buscarId("arquivos/clientes.txt"),nome,cpf,endereco,telefone);
		cliente.incluiCliente();
		nome=scanner.nextLine();
	}
	
	public static void incluiComponente() throws IOException{//Metodo para cadastrar um produto no txt
		 float valorDeCompra, valorDeVenda;
		String descricao,  frequencia,  marca, nome, rotacao, tamanho, barramento, soquete;
		System.out.println("Escolha o produto a se cadastrar:");

		System.out.println("1 - Fonte\n2 - HD\n3 - Memoria\n4 - Placa Mae\n5 - Placa de video\n6 - Processador\n7 - Tela\n8 - WaterCooler");
		opc = scanner.nextInt();
		switch (opc){
			case 1:
				System.out.println("Digite o valor de compra do produto: ");
				valorDeCompra = scanner.nextFloat();
				
				System.out.println("Digite o valor de venda: ");
				valorDeVenda =  scanner.nextFloat();
				
				System.out.println("Digite o nome da fonte: ");
				nome = scanner.nextLine();
				nome = scanner.nextLine();
				
				System.out.println("Digite a frequencia da fonte: ");
				frequencia = scanner.nextLine();
				
		
				System.out.println("Digite a marca: ");
				marca= scanner.next();
				
				System.out.println("Digite a descrição: ");
				descricao = scanner.nextLine();
				descricao = scanner.nextLine();
				tipo =1;
				fonte= new Fonte(Arquivo.buscarId("arquivos/componentes.txt"),tipo,valorDeCompra,valorDeVenda,descricao,nome,frequencia, marca);
				fonte.cadastraProduto();
				break;
			case 2:				
				System.out.println("Digite o valor de compra do produto: ");
				valorDeCompra = scanner.nextFloat();
				
				System.out.println("Digite o valor de venda: ");
				valorDeVenda =  scanner.nextFloat();
				
				System.out.println("Digite o nome do HD: ");
				nome = scanner.nextLine();
				nome = scanner.nextLine();
				System.out.println("Digite a tamanho do HD: ");
				
				tamanho = scanner.next();
		
				System.out.println("Digite a rotação: ");
				rotacao= scanner.next();
				
				System.out.println("Digite a descrição: ");
				descricao = scanner.nextLine();
				descricao = scanner.nextLine();
				tipo =2;
				hd = new Hd(Arquivo.buscarId("arquivos/componentes.txt"),tipo,valorDeCompra,valorDeVenda,descricao,nome,tamanho, rotacao);
				hd.cadastraProduto();
				break;
			case 3:
				System.out.println("Digite o valor de compra do produto: ");
				valorDeCompra = scanner.nextFloat();
				
				System.out.println("Digite o valor de venda: ");
				valorDeVenda =  scanner.nextFloat();
				
				System.out.println("Digite o nome da memoria: ");
				nome = scanner.nextLine();
				nome = scanner.nextLine();
				System.out.println("Digite a marca da memoria: ");
				marca = scanner.next();
		
				System.out.println("Digite o barramento: ");
				barramento= scanner.next();
				
				System.out.println("Digite a descrição: ");
				descricao = scanner.nextLine();
				descricao = scanner.nextLine();
				tipo = 3;
				memoria= new Memoria(Arquivo.buscarId("arquivos/componentes.txt"),tipo,valorDeCompra,valorDeVenda,descricao,nome,marca, barramento);
				memoria.cadastraProduto();
				break;
			case 4: 
				System.out.println("Digite o valor de compra do produto: ");
				valorDeCompra = scanner.nextFloat();
				
				System.out.println("Digite o valor de venda: ");
				valorDeVenda =  scanner.nextFloat();
				
				System.out.println("Digite o nome da Placa Mãe: ");
				nome = scanner.nextLine();
				nome = scanner.nextLine();
				System.out.println("Digite a marca da Placa Mãe: ");
				marca = scanner.next();
		
				System.out.println("Digite o soquet: ");
				soquete= scanner.next();
				
				System.out.println("Digite a descrição: ");
				descricao = scanner.nextLine();
				descricao = scanner.nextLine();
				tipo = 4;
				placaM= new PlacaDeMae(Arquivo.buscarId("arquivos/componentes.txt"),tipo,valorDeCompra,valorDeVenda,descricao,nome,marca, soquete);
				placaM.cadastraProduto();
				break;
			case 5:
				System.out.println("Digite o valor de compra do produto: ");
				valorDeCompra = scanner.nextFloat();
				
				System.out.println("Digite o valor de venda: ");
				valorDeVenda =  scanner.nextFloat();
				
				System.out.println("Digite o nome da Placa de Video: ");
				nome = scanner.nextLine();
				nome = scanner.nextLine();
				System.out.println("Digite o tamanho da memoria da Placa de Video: ");
				tamanho = scanner.next();
		
				System.out.println("Digite a fabricante da Placa de Video: ");
				marca= scanner.next();
				
				System.out.println("Digite a descrição: ");
				descricao = scanner.nextLine();
				descricao = scanner.nextLine();
				tipo = 5;
				placaV= new PlacaDeVideo(Arquivo.buscarId("arquivos/componentes.txt"),tipo,valorDeCompra,valorDeVenda,descricao,nome,tamanho, marca);
				placaV.cadastraProduto();
				break;
			case 6: 
				System.out.println("Digite o valor de compra do produto: ");
				valorDeCompra = scanner.nextFloat();
				
				System.out.println("Digite o valor de venda: ");
				valorDeVenda =  scanner.nextFloat();
				
				System.out.println("Digite o nome do processador:  ");
				nome = scanner.nextLine();
				nome = scanner.nextLine();
				
				System.out.println("Digite a velocidade do clock: ");
				tamanho = scanner.next();
		
				System.out.println("Digite a fabricante: ");
				marca= scanner.next();
				
				System.out.println("Digite a descrição: ");
				descricao = scanner.nextLine();
				descricao = scanner.nextLine();
				tipo=6;
				processador= new Processador(Arquivo.buscarId("arquivos/componentes.txt"),tipo,valorDeCompra,valorDeVenda,descricao,nome,tamanho, marca);
				processador.cadastraProduto();
				break;
			case 7: 
				System.out.println("Digite o valor de compra do produto: ");
				valorDeCompra = scanner.nextFloat();
				
				System.out.println("Digite o valor de venda: ");
				valorDeVenda =  scanner.nextFloat();
				
				System.out.println("Digite o nome da Tela: ");
				nome = scanner.nextLine();
				nome = scanner.nextLine();
				
				System.out.println("Digite o tamanho da tela: ");
				tamanho = scanner.next();
		
				System.out.println("Digite a marca: ");
				marca= scanner.next();
				
				System.out.println("Digite a descrição: ");
				descricao = scanner.nextLine();
				descricao = scanner.nextLine();
				
				tipo=7;
				tela= new Tela(Arquivo.buscarId("arquivos/componentes.txt"),tipo,valorDeCompra,valorDeVenda,descricao,nome,tamanho, marca);
				tela.cadastraProduto();
				break;
			case 8:
				System.out.println("Digite o valor de compra do produto: ");
				valorDeCompra = scanner.nextFloat();
				
				System.out.println("Digite o valor de venda: ");
				valorDeVenda =  scanner.nextFloat();
				
				System.out.println("Digite o nome do Water Cooler: ");
				nome = scanner.nextLine();
				nome = scanner.nextLine();
				
				System.out.println("Digite o tamanho: ");
				tamanho = scanner.next();
		
				System.out.println("Digite a marca: ");
				marca= scanner.next();
				
				System.out.println("Digite a descrição: ");
				descricao = scanner.nextLine();
				descricao = scanner.nextLine();
				tipo=8;
				cooler= new WaterCooler(Arquivo.buscarId("arquivos/componentes.txt"),tipo,valorDeCompra,valorDeVenda,descricao,nome,tamanho, marca);
				cooler.cadastraProduto();
				break;
			default:
				System.out.println("Produto inexistente");
				break;
		}
		
	}// 
	public static void vender() throws IOException{//Metodo para cadastrar uma venda no Txt
		int opcao=0, o;
		int idProduto;
		int id = 0 ;
		String nome = null;
		ArrayList<Integer>listaCompra = new ArrayList<Integer>();
		System.out.println("Escolha pesquisar por: 1-ID 2-NOME");
		o=scanner.nextInt();
		if(o==1){
			id= scanner.nextInt();
		}else{
			System.out.println("Digite o nome: ");
			nome=scanner.nextLine();
			nome=scanner.nextLine();
			id= Arquivo.retornaIdCliente(nome);
			
		}
		System.out.println("\n\n----------------------------------");
		
		if(Arquivo.verificaId(id) || Arquivo.verificaNome(nome)){
			Arquivo.leitorProdutos();
			while(opcao!=2){ 
				
				System.out.println("Digite o ID do produto: ");
				idProduto = scanner.nextInt(); 
				Arquivo.listaDeProdutos(idProduto, listaCompra);
				valor += Arquivo.precoProduto(idProduto);
				System.out.println("Deseja add outro item: 1- SIM     2- NAO");	
				opcao=scanner.nextInt();
			}
			
			
			Vendas venda = new Vendas(Arquivo.buscarId("arquivos/vendas.txt"), id, valor,listaCompra);
			Arquivo.escritor(venda.toString(), "arquivos/vendas.txt");
			valor=0;
		}else{
			System.out.println("CLIENTE NÃO EXISTE");
		}
		
		
	} 


}
