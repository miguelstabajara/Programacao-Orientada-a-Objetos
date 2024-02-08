public class ContaPoupança extends ContaBancaria{
	private static double taxa=1.01;
	
	ContaPoupança(){}
	public ContaPoupança(int c,int n, double s) {
		this.setCpf(c);
		this.setNro(n);
		this.setSaldo(s);
	}
	public void calcularNovoSaldo() {
		this.setSaldo(getSaldo()*taxa);
	}
}
