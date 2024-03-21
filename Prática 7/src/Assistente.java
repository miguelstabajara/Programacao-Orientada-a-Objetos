
public class Assistente extends Funcionario{
	
	public Assistente(String n,String m,double s) {
		super(n,m,s);
	}
	
	public double calculaSalario() {
		return getSalario_base();
	}
	
	public void mostrarDados() {
		System.out.println("Nome:"+getNome()+"\nMatricula: "+getMatricula()+"\nSalario: "+calculaSalario()+"\n");
	}
}
