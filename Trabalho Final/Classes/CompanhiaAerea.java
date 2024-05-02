package Classes;
import java.time.LocalDate;

public class CompanhiaAerea {
	private String CNPJ,nomeOficial,nomeDivulgacao;
	private LocalDate dataCriacao;
	private static double taxaPagamentoUdiDecola = 0.1;
	
	public CompanhiaAerea() {}
	public CompanhiaAerea(String cnpj, String nomeOficial,String nomeDivulgacao,LocalDate dataCriacao) {
		setCNPJ(cnpj);
		setNomeOficial(nomeOficial);
		setNomeDivulgacao(nomeDivulgacao);
		setDataCriacao(dataCriacao);
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String CNPJ) {
		if(CNPJ.length()>0) this.CNPJ = CNPJ;
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
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public static double getPagamentoUdiDecola() {
		return taxaPagamentoUdiDecola;
	}
	
}
