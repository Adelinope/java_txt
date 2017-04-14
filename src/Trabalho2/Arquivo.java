package Trabalho2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
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


public class Arquivo {
	static ArrayList <Integer>VARIAVEL=  new ArrayList<Integer>();
	static ArrayList <Integer>IDS = new ArrayList <Integer>();
	static ArrayList <Float>VALORES = new ArrayList <Float>();
	static float VALORAUX;
	public static void leitor(String caminho) throws IOException 
	{
		File f = new File(caminho);
		BufferedReader buffRead = new BufferedReader(new FileReader(f));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
	}
	
	public static void escritor(String s, String caminho) throws IOException
	{
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(caminho, true)));
	    out.println(s);
	    out.close();
	}	
	public static int buscarId(String caminho) throws IOException{// Metodo para calcular o id de clientes, componentes e vendas
		int contador = 0;
		File f = new File(caminho);
		BufferedReader buffRead = new BufferedReader(new FileReader(f));
        String linha = "";
        while (true) {
            if (linha != null) {
               contador++;
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
        
        if(caminho == "arquivos/clientes.txt"&& contador > 1){
        	return contador;
        }else if(caminho == "arquivos/componentes.txt"&& contador > 1){
        	return contador;
        }else if(caminho == "arquivos/vendas.txt" && contador > 1){
        	return contador;
        }
        return 1;
	}
	public static void leitorProdutos( ) throws IOException{//metodo para imprimir produtos do txt
		
		String caminho = "arquivos/componentes.txt";
		ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
        String linha = "";
		File f = new File(caminho);

        Scanner leitor = new Scanner(f);
		while(leitor.hasNext())
		{
			linha = leitor.nextLine();
			String aux[] = linha.split("@@@");
    		
        	int tipo =  Integer.parseInt(aux[1]); 
        	switch (tipo){
        	case 1:
        		float valorDeCompra= Float.parseFloat(aux[2]);
            	float valorDeVenda= Float.parseFloat(aux[3]);
            	String descricao = aux[4];
            	String nome= aux[5];
            	String frequencia = aux[6];
            	String marca = aux[7];
            	String barramento;
    			System.out.println(
    					"ID: "+Integer.parseInt(aux[0])+"\n"+
    					"Valor de Compra: " + Float.parseFloat(aux[2]) + "\n" +
    					"Valor de Venda: " + Float.parseFloat(aux[3]) + "\n" + 
    					"Descrição: " + aux[4] + "\n" +
    					"Nome: " + aux[5] + "\n" +
    					"Frequencia: " + aux[6] + "\n" +
    					"Marca: " + aux[7] + "\n" +
    					"----------------------------------------"
    					);
              
                break;
        	case 2:
        		valorDeCompra= Float.parseFloat(aux[2]);
            	valorDeVenda= Float.parseFloat(aux[3]);
            	descricao = aux[4];
            	nome= aux[5];
            	String tamanho = aux[6];
            	String rotacao = aux[7]; 
            	System.out.println(
            			"ID: "+Integer.parseInt(aux[0])+"\n"+
    					"Valor de Compra: " + Float.parseFloat(aux[2]) + "\n" +
    					"Valor de Venda: " + Float.parseFloat(aux[3]) + "\n" + 
    					"Descrição: " + aux[4] + "\n" +
    					"Nome: " + aux[5] + "\n" +
    					"Tamanho: " + aux[6] + "\n" +
    					"Rotação: " + aux[7] + "\n" +
    					"----------------------------------------"
    					);
        		break;
        	case 3:
        	    valorDeCompra= Float.parseFloat(aux[2]);
            	valorDeVenda= Float.parseFloat(aux[3]);
            	descricao = aux[4];
            	nome= aux[5];
            	marca = aux[6];
            	barramento = aux[7];
            	System.out.println(
            			"ID: "+Integer.parseInt(aux[0])+"\n"+
    					"Valor de Compra: " + Float.parseFloat(aux[2]) + "\n" +
    					"Valor de Venda: " + Float.parseFloat(aux[3]) + "\n" + 
    					"Descrição: " + aux[4] + "\n" +
    					"Nome: " + aux[5] + "\n" +
    					"Marca: " + aux[6] + "\n" +
    					"Barramento: " + aux[7] + "\n" +
    					"----------------------------------------"
    					);
        		break; 
        	case 4:
        		valorDeCompra= Float.parseFloat(aux[2]);
            	valorDeVenda= Float.parseFloat(aux[3]);
            	descricao = aux[4];
            	nome= aux[5];   
            	barramento = aux[6];
            	marca = aux[7];
            	System.out.println(
            			"ID: "+Integer.parseInt(aux[0])+"\n"+
    					"Valor de Compra: " + Float.parseFloat(aux[2]) + "\n" +
    					"Valor de Venda: " + Float.parseFloat(aux[3]) + "\n" + 
    					"Descrição: " + aux[4] + "\n" +
    					"Nome: " + aux[5] + "\n" +
    					"Soquet: " + aux[6] + "\n" +
    					"MArca: " + aux[7] + "\n" +
    					"----------------------------------------"
    					);
        		break;
        	case 5:
         		valorDeCompra= Float.parseFloat(aux[2]);
            	valorDeVenda= Float.parseFloat(aux[3]);
            	descricao = aux[4];
            	nome= aux[5];  
            	tamanho = aux[6];
            	marca = aux[7];
            	System.out.println(
            			"ID: "+Integer.parseInt(aux[0])+"\n"+
    					"Valor de Compra: " + Float.parseFloat(aux[2]) + "\n" +
    					"Valor de Venda: " + Float.parseFloat(aux[3]) + "\n" + 
    					"Descrição: " + aux[4] + "\n" +
    					"Nome: " + aux[5] + "\n" +
    					"Memoria: " + aux[6] + "\n" +
    					"Marca: " + aux[7] + "\n" +
    					"----------------------------------------"
    					);
        		break;
        	case 6:
         		valorDeCompra= Float.parseFloat(aux[2]);
            	valorDeVenda= Float.parseFloat(aux[3]);
            	descricao = aux[4];
            	nome= aux[5]; 
            	tamanho =  aux[6];
            	marca = aux[7];
            	System.out.println(
            			"ID: "+Integer.parseInt(aux[0])+"\n"+
    					"Valor de Compra: " + Float.parseFloat(aux[2]) + "\n" +
    					"Valor de Venda: " + Float.parseFloat(aux[3]) + "\n" + 
    					"Descrição: " + aux[4] + "\n" +
    					"Nome: " + aux[5] + "\n" +
    					"Clock: " + aux[6] + "\n" +
    					"Marca: " + aux[7] + "\n" +
    					"----------------------------------------"
    					);
        		break;
        	case 7:
         		valorDeCompra= Float.parseFloat(aux[2]); 
            	valorDeVenda= Float.parseFloat(aux[3]);
            	descricao = aux[4];
            	nome= aux[5]; 
            	tamanho =  aux[6];
            	marca = aux[7];
            	System.out.println(
            			"ID: "+Integer.parseInt(aux[0])+"\n"+
    					"Valor de Compra: " + Float.parseFloat(aux[2]) + "\n" +
    					"Valor de Venda: " + Float.parseFloat(aux[3]) + "\n" + 
    					"Descrição: " + aux[4] + "\n" +
    					"Nome: " + aux[5] + "\n" +
    					"Tamanho: " + aux[6] + "\n" +
    					"Marca: " + aux[7] + "\n" +
    					"----------------------------------------"
    					);
            	
        		break;
        	case 8:
         		valorDeCompra= Float.parseFloat(aux[2]);
            	valorDeVenda= Float.parseFloat(aux[3]);
            	descricao = aux[4];
            	nome= aux[5];
            	tamanho=aux[6];
            	marca =  aux[7];
            	System.out.println(
            			"ID: "+Integer.parseInt(aux[0])+"\n"+
    					"Valor de Compra: " + Float.parseFloat(aux[2]) + "\n" +
    					"Valor de Venda: " + Float.parseFloat(aux[3]) + "\n" + 
    					"Descrição: " + aux[4] + "\n" +
    					"Nome: " + aux[5] + "\n" +
    					"Tamanho: " + aux[6] + "\n" +
    					"Marca: " + aux[7] + "\n" +
    					"----------------------------------------"
    					);
            	break;
        	}//ele ta dando que o cliente 1 n existe k
        	IDS.add(Integer.parseInt(aux[0]));
        	VALORES.add(Float.parseFloat(aux[3]));
        }
			leitor.close();	
	}
	static float precoProduto(int id) throws FileNotFoundException{//Calcula o preço de uma compra 
		String caminho = "arquivos/componentes.txt";
		File f = new File(caminho);
        Scanner leitor = new Scanner(f);
        int i = 0;
		while(leitor.hasNext())
		{
			//float rFinal = 0;
			String linha = leitor.nextLine();
			String aux[] = linha.split("@@@");
			if(id == IDS.get(i)){
				    return VALORES.get(i);
			}
			i++;
		}
		leitor.close();
		return 0;
		
	}
	static void listaDeProdutos(int id,ArrayList<Integer>lista){//Guarda os IDS dos produtos comprados
		for(int i=0;i<IDS.size();i++){
			if(id==IDS.get(i)){
				lista.add(IDS.get(i));
			}
		}
	}
	public static void  leitorClientes(ArrayList<Clientes> clientes) throws IOException{ //Metodo para listar os clientes
		String caminho = "arquivos/clientes.txt";
		File f = new File(caminho);
        Scanner leitor = new Scanner(f);
		while(leitor.hasNext())
		{
			String linha = leitor.nextLine();
			String aux[] = linha.split("@@@");
			
			System.out.println(
					"ID: " + aux[0] + "\n" +
					"Nome: " + aux[1] + "\n" + 
					"CPF: " + aux[2] + "\n" +
					"Endereço: " + aux[3] + "\n" +
					"Telefone: " + aux[4] + "\n" +
					"----------------------------------------"
					);
		
		}
		leitor.close();
	}
	public static boolean verificaId(int id) throws FileNotFoundException{//metodo para verificar se o id de cliente existe
		String caminho = "arquivos/clientes.txt";
		File f = new File(caminho);
		int i = 0;
        Scanner leitor = new Scanner(f);
		while(leitor.hasNext())
		{
			String linha = leitor.nextLine();
			String aux[] = linha.split("@@@");
			
			VARIAVEL.add(Integer.parseInt(aux[0]));
			if(id==VARIAVEL.get(i)){
				return true;
			}
			i++;
			
		}
		leitor.close();
		return false;
	}

}
