
public class Gerente extends Funcionario{
	
	public Gerente(String n,String m,double s) {
		super(n,m,s);
	}
	
	public double calculaSalario() {
		return 2*getSalario_base();
	}
	
	public void mostrarDados() {
		System.out.println("Nome:"+getNome()+"\nMatricula: "+getMatricula()+"\nSalario: "+calculaSalario()+"\n");
	}
}
