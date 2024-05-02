package Classes;

import java.io.Serializable;

public class Endereco implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String rua,bairro,cidade,numero;
	
	public Endereco() {}
	public Endereco(String rua, String bairro, String cidade, String numero) {
		setRua(rua);
		setBairro(bairro);
		setCidade(cidade);
		setNumero(numero);
	}
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		if(rua.length()>0) this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		if(bairro.length()>0) this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if(cidade.length()>0) this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if(numero.length()>0&&Integer.valueOf(numero)>0) this.numero = numero;
	}
}
