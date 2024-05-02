package Classes;
import java.time.LocalDateTime;

public class Reserva {
	private LocalDateTime inicio,fim;
	private Quarto quarto;
	
	public Reserva(LocalDateTime inicio,LocalDateTime fim,Quarto quarto) {
		setInicio(inicio);
		setFim(fim);
		setQuarto(quarto);
	}
	public LocalDateTime getInicio() {
		return inicio;
	}
	public double getPrecoQuarto() {
		return quarto.getPreco();
	}
	public double getPrecoDescontoQuarto() {
		return quarto.getPrecoDesconto();
	}
	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}
	public LocalDateTime getFim() {
		return fim;
	}
	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	public Quarto getQuarto() {
		return quarto;
	}
}
