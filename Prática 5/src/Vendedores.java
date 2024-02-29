
public class Vendedores extends Funcionario{
	private double vendas;
	private double salarioBonus;
	
	public Vendedores(String nome,String rg,double salarioBase) {
		super(nome,rg,salarioBase);
		this.vendas = 0;
	}
	
	public void setSalarioBonus() {
		salarioBonus = vendas*0.5;
	}
	
	public double calculaSalario() {
		setSalarioBonus();
		return getSalarioBase()+salarioBonus;
	}
	
	public double getVendas() {
		return vendas;
	}
	
	public void zeraSalarioBonus() {
		salarioBonus = 0;
		vendas=0;
	}
	
	public void acumulaVendas(double vendas) {
		this.vendas = this.vendas+vendas;
	}
	
}
