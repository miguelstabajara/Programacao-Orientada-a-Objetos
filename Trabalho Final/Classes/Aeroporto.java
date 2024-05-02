package Classes;

import java.io.Serializable;

public class Aeroporto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private Endereco endereco;
	
	public Aeroporto() {}
	public Aeroporto(String nome, Endereco endereco){
		setNome(nome);
		setEndereco(endereco);
	}
	public Aeroporto(String nome, String cidade, String bairro, String rua, String numero) {
		endereco = new Endereco(rua,bairro,cidade,numero);
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length()>0) this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
