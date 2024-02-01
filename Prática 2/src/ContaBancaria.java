
public class ContaBancaria {
	private String nome,tipo;
	private int numero;
	private int senha;
	private float saldo;
	
	public ContaBancaria(String n,int num, int s, float sald,String tip) {
		nome = n;
		numero = num;
		senha = s;
		saldo = sald;
		tipo = tip;
	}
	public ContaBancaria(String n,int num, int s, String tip) {
		nome = n;
		numero = num;
		senha = s;
		tipo = tip;
		saldo = 0;
	}
}
