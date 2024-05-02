package Classes;
import java.time.LocalDate;
public class Funcionario extends Pessoa{
	private String numCarteira;
	private double salarioFixo;
	
	public Funcionario() {}
	public Funcionario(String nome,String cpf,Endereco endereco,String numCarteira,LocalDate dataNascimento,double salario) {
		super(nome,cpf,dataNascimento,endereco);
		setNumCarteira(numCarteira);
		setSalarioFixo(salario);
	}
	public Funcionario(String cpf) {
		setCpf(cpf);
	}
	public double getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(double salarioFixo) {
		if(salarioFixo>0) this.salarioFixo = salarioFixo;
		else this.salarioFixo = 0;
	}
	
	public String getNumCarteira() {
		return numCarteira;
	}
	public void setNumCarteira(String numCarteira) {
		if(numCarteira.length()>0) this.numCarteira = numCarteira;
	}
	
}
