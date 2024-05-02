package Classes;
import java.time.LocalDateTime;
import java.time.LocalDate;
public class Pesquisa {
	private LocalDateTime dataPesquisa;
	private String origem;
	private LocalDate dataProcurada;
	
	public Pesquisa(String origem,LocalDate dataProcurada) {
		setDataPesquisa();
		setOrigem(origem);
		setDataProcurada(dataProcurada);
	}
	public LocalDateTime getDataPesquisa() {
		return dataPesquisa;
	}
	public void setDataPesquisa() {
		dataPesquisa = LocalDateTime.now();
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		if(origem.length()>0) this.origem = origem;
	}
	
	public LocalDate getDataInicio() {
		return dataProcurada;
	}
	public void setDataProcurada(LocalDate dataInicio) {
		this.dataProcurada = dataInicio;
	}
	
}
