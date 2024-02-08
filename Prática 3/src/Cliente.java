public class Cliente extends Pessoa{
	private int cpf;
	private String endereço;
	
	public Cliente(String n, String s,int i,int r,String ln,int c,String e) {
		this.setNome(n);
		this.setSobrenome(s);
		this.setIdade(i);
		this.setRg(r);
		this.setLugarNascimento(ln);
		cpf = c;
		endereço = e;
	}
	public void info() {
		this.infoPessoa();
		System.out.println("CPF: "+cpf+"\nEndereço "+endereço);
	}
}
