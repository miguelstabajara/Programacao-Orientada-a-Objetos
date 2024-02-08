
public class ContaEspecial extends ContaBancaria{
	private static double limite=-5000;
	
	ContaEspecial(){}
	public ContaEspecial(int c,int n, double s) {
		this.setCpf(c);
		this.setNro(n);
		this.setSaldo(s);
	}
	public boolean saqueEspecial(double valor) {
		if(getSaldo()-valor>limite) {
			this.setSaldo(getSaldo()-valor);
			return true;
		}
		return false;
	}
}
