package Classes;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

public class Hotel {
	private String cnpj,nomeOficial,nomeDivulgacao,mensagem;
	private int anoCriacao;
	private LocalTime checkin,checkout;
	private int numeroEstrelas;
	private boolean pets;
	private Endereco endereco;
	private FuncionarioParceiro funcionarioParceiro;
	private static double pagamentoUdiDecola = 0.1;
	private int numeroTotalVagasQuartos;
	private ArrayList<Quarto> quartos= new ArrayList<Quarto>();
	
	public Hotel() {}
	public Hotel(String cnpj,String nomeOficial,String nomeDivulgacao,String mensagem,int anoCriacao,LocalTime checkin,LocalTime checkout,int numeroEstrelas,boolean pets,Endereco endereco,FuncionarioParceiro parceiro) {
		setCnpj(cnpj);
		setNomeOficial(nomeOficial);
		setNomeDivulgacao(nomeDivulgacao);
		setMensagem(mensagem);
		setAnoCriacao(anoCriacao);
		setCheckin(checkin);
		setCheckout(checkout);
		setNumeroEstrelas(numeroEstrelas);
		setPets(pets);
		setEndereco(endereco);
		setFuncionarioParceiro(parceiro);
		inicializaTiposDeQuartos();
	}
	public void setNumeroTotalQuartos(){
		numeroTotalVagasQuartos = 0;
		for(int i = 0;i<quartos.size();i++) {
			numeroTotalVagasQuartos = numeroTotalVagasQuartos+quartos.get(i).getLimitePessoas();
		}
	}
	
	public void inicializaTiposDeQuartos() {
		quartos.add(new QuartoLuxo());
		quartos.add(new QuartoStandard("Single"));
		quartos.add(new QuartoStandard("Duplo"));
		quartos.add(new QuartoStandard("Triplo"));
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		if(cnpj.length()>0) this.cnpj = cnpj;
	}
	public String getNomeOficial() {
		return nomeOficial;
	}
	public void setNomeOficial(String nomeOficial) {
		if(nomeOficial.length()>0) this.nomeOficial = nomeOficial;
	}
	public String getNomeDivulgacao() {
		return nomeDivulgacao;
	}
	public void setNomeDivulgacao(String nomeDivulgacao) {
		if(nomeDivulgacao.length()>0) this.nomeDivulgacao = nomeDivulgacao;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		if(mensagem.length()>0) this.mensagem = mensagem;
	}
	public int getAnoCriacao() {
		return anoCriacao;
	}
	public void setAnoCriacao(int anoCriacao) {
		if(anoCriacao>1000&&anoCriacao<=LocalDate.now().getYear()) this.anoCriacao = anoCriacao;
	}
	public LocalTime getCheckin() {
		return checkin;
	}
	public void setCheckin(LocalTime checkin) {
		this.checkin = checkin;
	}
	public LocalTime getCheckout() {
		return checkout;
	}
	public void setCheckout(LocalTime checkout) {
		this.checkout = checkout;
	}
	public int getNumeroEstrelas() {
		return numeroEstrelas;
	}
	public void setNumeroEstrelas(int numeroEstrelas) {
		if(numeroEstrelas>=0&&numeroEstrelas<=5) this.numeroEstrelas = numeroEstrelas;
	}
	public boolean isPets() {
		return pets;
	}
	public void setPets(boolean pets) {
		this.pets = pets;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Funcionario getFuncionarioParceiro() {
		return funcionarioParceiro;
	}
	public void setFuncionarioParceiro(FuncionarioParceiro funcionarioParceiro) {
		this.funcionarioParceiro = funcionarioParceiro;
	}
	public static double getPagamentoUdiDecola() {
		return pagamentoUdiDecola;
	}
	public ArrayList<Quarto> getQuartos() {
		return quartos;
	}
}
