

public class Pessoa {
	private String nome, sobrenome,lugarNascimento;
	private int idade,rg;
	
	public void infoPessoa() {
		System.out.println("Nome: "+nome+"\nSobrenome: "+sobrenome+"\nIdade: "+idade+"\nRG: "+rg+"\nLocal de Nascimento: "+lugarNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getLugarNascimento() {
		return lugarNascimento;
	}

	public void setLugarNascimento(String lugarNascimento) {
		this.lugarNascimento = lugarNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}
	
}
