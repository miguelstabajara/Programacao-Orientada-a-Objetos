
public class Vendedor extends Funcionario{
	public double comissao;
	
	public Vendedor(String n,String m,double s,double c) {
		super(n,m,s);
		setComissao(c);
	}
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		if(comissao>0) this.comissao = comissao;
		else this.comissao = 0;
	}
	
	public double calculaSalario() {
		return comissao+getSalario_base();
	}
	
	public void mostrarDados() {
		System.out.println("Nome:"+getNome()+"\nMatricula: "+getMatricula()+"\nSalario: "+calculaSalario()+"\n");
	}
}
