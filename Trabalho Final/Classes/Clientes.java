package Classes;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Clientes extends Pessoa{
	private String email;
	private LocalDateTime dataCadastro,dataVip;
	private ArrayList<Compra> compras = new ArrayList<Compra>();
	private boolean ehVip;
	private static int minimoVip = 8;
	private static double descontoVip=0.1;
	
	public Clientes(){}
	public Clientes(String nome,String cpf,Endereco endereco,LocalDate dataNascimento,String email) {
		dataCadastro = LocalDateTime.now();
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		setDataNascimento(dataNascimento);
		setEmail(email);
	}
	
	public void isVip() {
		if(compras.size()==minimoVip) {
			setEhVip(true);
			dataVip = LocalDateTime.now();
		}
	}
	public boolean getehVip() {
		return ehVip;
	}
	public void setEmail(String email) {
		if(email.length()>0) this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro() {
		dataCadastro = LocalDateTime.now();
	}
	public LocalDateTime getDataVip() {
		return dataVip;
	}
	
	public void addCompra(Compra compra) {
		compras.add(compra);
	}
	public ArrayList<Compra> getCompras() {
		return compras;
	}
	public void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;
	}
	
	public void setEhVip(boolean ehVip) {
		this.ehVip = ehVip;
	}
	public static double getDescontoVip() {
		return descontoVip;
	}
	
}
