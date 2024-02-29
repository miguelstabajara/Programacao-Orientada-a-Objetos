
public class Administrativo extends Funcionario{
	private double horasExtras;
	public double salarioBonus;
	
	
	public Administrativo(String nome,String rg,double salarioBase) {
		super(nome,rg,salarioBase);
		this.horasExtras=0;
	}
	
	public double calculaSalario() {
		setSalarioBonus();
		return getSalarioBase()+salarioBonus;
	}
	
	public void acumulaHoras(double horas) {
		horasExtras=horas+horasExtras;
	}
	
	public void setSalarioBonus() {
		salarioBonus = getSalarioBase()*(0.1*horasExtras);
	}
	
	public void zeraSalarioBonus() {
		salarioBonus = 0;
		horasExtras=0;
	}
	
}
