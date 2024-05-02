package Classes;
import java.time.Duration;
import java.time.LocalDateTime;

public class Compra {
	private Trecho passagemAerea;
	private int quantidadePassagens,quantidadeReserva;
	private Reserva reserva;
	private LocalDateTime dataCompra;
	private Clientes clientes;
	private double valorTotal;
	private String formaPagamento;
	
	public Compra() {}
	
	public Compra(Clientes clientes, Trecho passagem,int quantidadePassagens,int quantidadeReserva,String formaPagamento) {
		setCliente(clientes);
		setPassagemAerea(passagem);
		setFormaPagamento(formaPagamento);
		setQuantidadePassagens(quantidadePassagens);
		setQuantidadeReserva(quantidadeReserva);
		dataCompra = LocalDateTime.now();
	}

	public Compra(Clientes clientes, Reserva reserva, Quarto quarto,int quantidadePassagens,int quantidadeReserva,String formaPagamento) {
		setCliente(clientes);
		setReserva(reserva);
		setFormaPagamento(formaPagamento);
		setQuantidadePassagens(quantidadePassagens);
		setQuantidadeReserva(quantidadeReserva);
		dataCompra = LocalDateTime.now();
	}

	public void setQuantidadeReserva(int quantidadeReserva) {
		if(quantidadeReserva>0)this.quantidadeReserva = quantidadeReserva;
		else this.quantidadeReserva = 0;
	}

	public void decrementaVagaVoo() {
		for(int i = 0;i<passagemAerea.getVoo().size();i++) {
			passagemAerea.getVoo().get(i).decrementaVagas(quantidadePassagens);
		}
	}
	public double valorPagoUdiDecola() {
		return valorTotal*(Hotel.getPagamentoUdiDecola()+CompanhiaAerea.getPagamentoUdiDecola());
	}
	
	public void calculaValorPassagem() {
		double soma=0;
		//Calcula o valor das passagens
		for(int i = 0;i<passagemAerea.getVoo().size();i++) {
					soma = soma+passagemAerea.getVoo().get(i).getPreco()*quantidadePassagens;
		}
			
		//Verifica se o cliente comprou vaga no canil e soma
		if(passagemAerea.clienteComprouCanil(clientes)) {
				soma = soma+passagemAerea.getCanil().getPrecoAnimal();
		}

		//Verifica se o cliente eh vip e aplica desconto
		clientes.isVip();
		if(clientes.getehVip())
			valorTotal = soma-soma*Clientes.getDescontoVip();
		else valorTotal = soma;
		//Analisa se o valor não é negativo
		analisaValor();
	}
	
	public void calculaValorHotel() {
		double soma=0;
		//Calcula o valor da reserva do hotel
		soma = reserva.getPrecoQuarto()*(Duration.between((reserva.getInicio()),(reserva.getFim())).toDays())*quantidadeReserva;
		//Verifica se o cliente eh vip e aplica desconto
		clientes.isVip();
			if(clientes.getehVip())
				valorTotal = soma-soma*Clientes.getDescontoVip();
			else valorTotal = soma;
		//Analisa se o valor não é negativo
		analisaValor();
	}
	
	public void descontoValorDiariaQuarto() {
		valorTotal = valorTotal-reserva.getPrecoDescontoQuarto()*(Duration.between((reserva.getInicio()),(reserva.getFim())).toDays());
		//Aplica o desconto das diarias de hotel caso houver
		
	}
	
	public int getQuantidadePassagens() {
		return quantidadePassagens;
	}

	public void setQuantidadePassagens(int quantidadePassagens) {
		if(quantidadePassagens>0) this.quantidadePassagens = quantidadePassagens;
		else this.quantidadePassagens=0;
	}

	public int getQuantidadeReserva() {
		return quantidadeReserva;
	}
	public Trecho getPassagemAerea() {
		return passagemAerea;
	}

	public void setPassagemAerea(Trecho passagemAerea) {
		this.passagemAerea = passagemAerea;
	}

	public LocalDateTime getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDateTime dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Clientes getCliente() {
		return clientes;
	}

	public void setCliente(Clientes clientes) {
		this.clientes = clientes;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void analisaValor() {
		if(valorTotal<0) valorTotal=0;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		if(formaPagamento.length()>0) this.formaPagamento = formaPagamento;
	}

	public Reserva getReserva() {
		return reserva;
	}
	
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	
	
}
