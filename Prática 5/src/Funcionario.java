
public class Funcionario {
	private String nome,rg;
	private double salarioBase;
	
	public Funcionario(){}
	public Funcionario(String rg,String nome, double salarioBase) {
		this.rg = rg;
		this.nome = nome;
		this.salarioBase=salarioBase;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
}
