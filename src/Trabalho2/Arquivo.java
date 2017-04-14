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
	public static int buscarId(String caminho) throws IOException{
		int contador = 0;
		File f = new File(caminho);
		BufferedReader buffRead = new BufferedReader(new FileReader(f));
        String linha = "";
        while (true) {
            if (linha != null) {
                //System.out.println(linha);
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
	public static ArrayList<Produtos> leitorProdutos( ) throws IOException{
		
		String caminho = "arquivos/componentes.txt";
		ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
		File f = new File(caminho);
		BufferedReader buffRead = new BufferedReader(new FileReader(f));
        String linha = "";
        while (true) {
            if (linha != null) {
            	String [] itens = linha.split("@@@");
            	int id=Integer.parseInt(itens[0]);
            	int tipo =  Integer.parseInt(itens[1]);
            	switch (tipo){
            	case 1:
            		float valorDeCompra= Float.parseFloat(itens[2]);
                	float valorDeVenda= Float.parseFloat(itens[3]);
                	String descricao = itens[4];
                	String nome= itens[5];
                	String frequencia = itens[6];
                	String marca = itens[7];
                    Fonte fo = new Fonte(id, tipo, valorDeCompra, valorDeVenda, descricao, nome, frequencia, marca);
            		listaProdutos.add(fo);
                    break;
            	case 2:
            		valorDeCompra= Float.parseFloat(itens[2]);
                	valorDeVenda= Float.parseFloat(itens[3]);
                	descricao = itens[4];
                	nome= itens[5];
                	String tamanho = itens[6];
                	String rotacao = itens[7];
            		Hd hd =  new Hd(id, tipo, valorDeCompra, valorDeVenda, descricao, nome, tamanho, rotacao);
            		listaProdutos.add(hd);
            		break;
            	case 3:
            	    valorDeCompra= Float.parseFloat(itens[2]);
                	valorDeVenda= Float.parseFloat(itens[3]);
                	descricao = itens[4];
                	nome= itens[5];
                	Memoria m = new Memoria(id,tipo,valorDeCompra, valorDeVenda, descricao, nome, itens[6], itens[7]);	
                	listaProdutos.add(m);
            		break;
            	case 4:
            		valorDeCompra= Float.parseFloat(itens[2]);
                	valorDeVenda= Float.parseFloat(itens[3]);
                	descricao = itens[4];
                	nome= itens[5];               	
            		PlacaDeMae placaM = new PlacaDeMae(id, tipo, valorDeCompra, valorDeVenda, descricao, nome, itens[6], itens[7]);
            		listaProdutos.add(placaM);
            		break;
            	case 5:
             		valorDeCompra= Float.parseFloat(itens[2]);
                	valorDeVenda= Float.parseFloat(itens[3]);
                	descricao = itens[4];
                	nome= itens[5];      		
            		PlacaDeVideo placa = new PlacaDeVideo(id, tipo, valorDeCompra, valorDeVenda, descricao, nome, itens[6], itens[7]);
            		listaProdutos.add(placa);
            		break;
            	case 6:
             		valorDeCompra= Float.parseFloat(itens[2]);
                	valorDeVenda= Float.parseFloat(itens[3]);
                	descricao = itens[4];
                	nome= itens[5]; 
            		Processador p = new Processador(id, tipo, valorDeCompra, valorDeVenda, descricao, nome, itens[6], itens[7]);
            		listaProdutos.add(p);
            		break;
            	case 7:
             		valorDeCompra= Float.parseFloat(itens[2]);
                	valorDeVenda= Float.parseFloat(itens[3]);
                	descricao = itens[4];
                	nome= itens[5]; 
            		Tela t = new Tela(id, tipo, valorDeCompra, valorDeVenda, descricao, nome, itens[6], itens[7]);
            		listaProdutos.add(t);
            		break;
            	case 8:
             		valorDeCompra= Float.parseFloat(itens[2]);
                	valorDeVenda= Float.parseFloat(itens[3]);
                	descricao = itens[4];
                	nome= itens[5];
                	WaterCooler w = new WaterCooler(id, tipo, valorDeCompra, valorDeVenda, descricao, nome, itens[6], itens[7]);
                	listaProdutos.add(w);
                	break;
            	}
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
        return listaProdutos;
        		
	}
	public static void  leitorClientes(ArrayList<Clientes> clientes) throws IOException{ 
		String caminho = "arquivos/clientes.txt";
		leitor(caminho);
		/*File f = new File(caminho);
		BufferedReader buffRead = new BufferedReader(new FileReader(f));
<<<<<<< HEAD
        String linha = "";
        while (true) {
            if (linha != null) {
                String []itens = linha.split("@@@");
                int id =  Integer.parseInt(itens[0]);
                Clientes c = new Clientes(id, itens[1], itens[2], itens[3], itens[4]);
                clientes.add(c);
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
		*/

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
<<<<<<< HEAD
		//feito
=======
		
>>>>>>> 0b79b6a2fae0e81515116fea8c2766d7ff9a2612
>>>>>>> 2bb41aaefcf61c0963653cb4f5f67aefd01c3144
	}

	public static boolean existeCliente(int v) throws IOException{
		ArrayList<Clientes> cliente = new ArrayList<Clientes>();
		Arquivo.leitorClientes(cliente);
		for(int i=0;i<cliente.size();i++){
			if(v==cliente.get(i).getId()){
				return true;
			}
		}
		return false;
	}

}
