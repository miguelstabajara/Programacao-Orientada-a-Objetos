
public class ContaBancaria {
	private int cpf,nro;
	private double saldo;
	
	public ContaBancaria(){}
	
	public boolean saque(int valor) {
		if(saldo-valor>0) {
			saldo = saldo-valor;
			return true;
		}
		return false;
	}
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposito(int valor) {
		saldo = saldo+valor;
	}

}
