package Classes;
import java.time.LocalDateTime;

public class Voo {
	private LocalDateTime horarioChegada,horarioSaida;
	private Aeroporto localSaida,localChegada;
	private int numeroVagas;
	private double preco;
	private CompanhiaAerea companhia;
	
	public Voo() {}
	public Voo(int numVagas,double preco,CompanhiaAerea companhia,Aeroporto localSaida, Aeroporto localChegada,LocalDateTime horarioSaida, LocalDateTime horarioChegada) {
		setHorarioChegada(horarioChegada);
		setHorarioSaida(horarioSaida);
		setLocalChegada(localChegada);
		setLocalSaida(localSaida);
		setCompanhia(companhia);
		setNumeroVagas(numVagas);
		setPreco(preco);
	}

	public void decrementaVagas(int quantidadePassagens) {
		numeroVagas = numeroVagas-quantidadePassagens;
	}
	public void setHorarioChegada(LocalDateTime horarioChegada) {
		this.horarioChegada = horarioChegada;
	}
	public void setHorarioSaida(LocalDateTime horarioSaida) {
		this.horarioSaida = horarioSaida;
	}
	public void setLocalSaida(Aeroporto localSaida) {
		this.localSaida = localSaida;
	}
	public void setLocalChegada(Aeroporto localChegada) {
		this.localChegada = localChegada;
	}
	public void setNumeroVagas(int numeroVagas) {
		if(numeroVagas>0) this.numeroVagas = numeroVagas;
		else this.numeroVagas=0;
	}
	public void setPreco(double preco) {
		if(preco>0) this.preco = preco;
		else this.preco = 0 ;
	}
	public void setCompanhia(CompanhiaAerea companhia) {
		this.companhia = companhia;
	}
	public LocalDateTime getHorarioChegada() {
		return horarioChegada;
	}
	public LocalDateTime getHorarioSaida() {
		return horarioSaida;
	}
	public Aeroporto getLocalSaida() {
		return localSaida;
	}
	public Aeroporto getLocalChegada() {
		return localChegada;
	}
	public int getNumeroVagas() {
		return numeroVagas;
	}
	public double getPreco() {
		return preco;
	}
	public CompanhiaAerea getCompanhia() {
		return companhia;
	}
	
}
 