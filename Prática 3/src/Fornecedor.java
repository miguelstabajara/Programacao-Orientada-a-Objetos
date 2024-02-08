public class Fornecedor extends Pessoa{
	private int cnpj;
	private String endereçoEmpresa;
	
	public Fornecedor(String n, String s,int i,int r,String ln,int c,String e) {
		this.setNome(n);
		this.setSobrenome(s);
		this.setIdade(i);
		this.setRg(r);
		this.setLugarNascimento(ln);
		cnpj = c;
		endereçoEmpresa = e;
	}
	
	public void info() {
		this.infoPessoa();
		System.out.println("CNPJ: "+cnpj+"\nEndereço: "+endereçoEmpresa);
	}
}
