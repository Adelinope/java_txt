package Trabalho2;

import java.io.IOException;

public class Clientes {
	private String caminho = "arquivos/clientes.txt";
	private String nome;
	private int id;
	private String cpf;
	private String endereco;
	private String telefone;
	public Clientes(int id,String nome, String cpf, String endereco, String telefone) {
		this.id=id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String toString(){
		String str=id+"@@@"+ nome+"@@@"+cpf+"@@@"+endereco+"@@@"+telefone;
		return str;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void incluiCliente() throws IOException{
		Arquivo v= new Arquivo();
		v.escritor(toString(),caminho);
	}
	
}
