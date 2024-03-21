
public abstract class Funcionario implements Imprimivel {
	private String nome;
	private String matricula;
	private double salario_base;
	public Funcionario() {}
	public Funcionario(String n, String m, double s) {
		setNome(n);
		setMatricula(m);
		setSalario_base(s);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalario_base() {
		return salario_base;
	}
	public void setSalario_base(double salario_base) {
		if(salario_base>0) this.salario_base = salario_base;
		else salario_base = 0;
	}
	public abstract double calculaSalario();
	
	
}
