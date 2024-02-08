
public class Horista extends Professor{
	private static double saldoHora = 30.50;
	private double saldo;
	
	public void trabalho(int horas) {
		saldo = saldo+horas*saldoHora;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
