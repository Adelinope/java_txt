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

	
	public static void cadastraCliente() throws IOException{
		String nome, cpf, endereco, telefone;
		System.out.println("Digite o nome do cliente: ");
		nome = scanner.nextLine();
		System.out.println("Digite o CPF: ");
		cpf= scanner.next();
		System.out.println("Digite o endere�o: ");
		endereco = scanner.nextLine();
		endereco = scanner.nextLine();
		System.out.println("Digite o telefone: ");
		telefone = scanner.next();
		cliente =  new Clientes (Arquivo.buscarId("arquivos/clientes.txt"),nome,cpf,endereco,telefone);
		cliente.incluiCliente();
	}
	
	public static void incluiComponente() throws IOException{
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
				
				System.out.println("Digite a descri��o: ");
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
		
				System.out.println("Digite a rota��o: ");
				rotacao= scanner.next();
				
				System.out.println("Digite a descri��o: ");
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
				
				System.out.println("Digite a descri��o: ");
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
				
				System.out.println("Digite o nome da Placa M�e: ");
				nome = scanner.nextLine();
				nome = scanner.nextLine();
				System.out.println("Digite a marca da Placa M�e: ");
				marca = scanner.next();
		
				System.out.println("Digite o soquet: ");
				soquete= scanner.next();
				
				System.out.println("Digite a descri��o: ");
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
				
				System.out.println("Digite a descri��o: ");
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
				
				System.out.println("Digite a descri��o: ");
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
				
				System.out.println("Digite a descri��o: ");
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
				
				System.out.println("Digite a descri��o: ");
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
		
	}// me mostra o metodo que calcula o valor 
	public static void vender() throws IOException{
		int opcao=0;
		int idProduto;
		ArrayList<Integer>listaCompra = new ArrayList<Integer>();
		System.out.println("Digite o id do cliente: ");
		int id = scanner.nextInt();
		
		if(Arquivo.verificaId(id)){
			Arquivo.leitorProdutos();
			while(opcao!=2){ 
				
				System.out.println("Digite o ID do produto: ");
				idProduto = scanner.nextInt(); 
				Arquivo.listaDeProdutos(idProduto, listaCompra);
				valor += Arquivo.precoProduto(idProduto);//cria uma variavel global VALOR  kk oloco como assim? kk pera ..
				System.out.println("Deseja add outro item: 1- SIM     2- NAO");	//acho que sei um jeito de arrumar isso kkk
				opcao=scanner.nextInt();
			}
			
			
			Vendas venda = new Vendas(Arquivo.buscarId("arquivos/vendas.txt"), id, valor,listaCompra);// A fonte do erro ta na classe de Vendas... pera 
			Arquivo.escritor(venda.toString(), "arquivos/vendas.txt");
		}else{
			System.out.println("CLIENTE N�O EXISTE");//Na arquivos, vou fazer 1 altera��o s� para testar, vai que da milagre kkk blz
		}
		
		
	} 
////	public static void imprimeTipo(int tipo) throws IOException{c�digo inutil
//		ArrayList<Produtos>comp;
//		comp=Arquivo.leitorProdutos();
//		switch(tipo){
//		case 1:
//			for(int i =0;i<comp.size();i++){
//				if(comp.get(i).getTipo()== 1){
//					System.out.println(comp.get(i));
//				}
//			}
//			break;
//		case 2:
//			for(int i =0;i<comp.size();i++){
//				if(comp.get(i).getTipo()== 2){
//					System.out.println(comp.get(i));
//				}
//			}
//			break;
//		case 3:
//			for(int i =0;i<comp.size();i++){
//				if(comp.get(i).getTipo()== 3){
//					System.out.println(comp.get(i));
//				}
//			}
//			break;
//		case 4:
//			for(int i =0;i<comp.size();i++){
//				if(comp.get(i).getTipo()== 4){
//					System.out.println(comp.get(i));
//				}
//			}
//			break;
//		case 5:
//			for(int i =0;i<comp.size();i++){
//				if(comp.get(i).getTipo()== 5){
//					System.out.println(comp.get(i));
//				}
//			}
//			break;
//		case 6:
//			for(int i =0;i<comp.size();i++){
//				if(comp.get(i).getTipo()== 6){
//					System.out.println(comp.get(i));
//				}
//			}
//			break;
//		case 7:
//			for(int i =0;i<comp.size();i++){
//				if(comp.get(i).getTipo()== 7){
//					System.out.println(comp.get(i));
//				}
//			}
//			break;
//		case 8:  
//			for(int i =0;i<comp.size();i++){
//				if(comp.get(i).getTipo()== 8){
//					System.out.println(comp.get(i));
//				}
//			}
//			break;
//		}funciona 
//	}

}
