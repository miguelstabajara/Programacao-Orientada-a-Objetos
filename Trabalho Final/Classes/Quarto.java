package Classes;
import java.util.ArrayList;
import java.time.LocalDateTime;

public abstract class Quarto {
	private int limitePessoas;
	private double preco,desconto,precoDesconto;
	private int quantidadeQuartos;
	private boolean aceitaCancelamento;
	private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	private Hotel hotel;
	
	public Quarto() {}
	public Quarto(int limitePessoas,double preco,double desconto,int quantidadeQuartos,boolean aceitaCancelamento,Hotel hotel) {
		setLimitePessoas(limitePessoas);
		setPreco(preco);
		setDesconto(desconto);
		setPrecoDesconto();
		setQuantidadeQuartos(quantidadeQuartos);
		setAceitaCancelamento(aceitaCancelamento);
		setHotel(hotel);
	}
	
	public void removeReservaExpirada() {
		for(int i = 0;i<reservas.size();i++) {
			if(reservas.get(i).getFim().isBefore(LocalDateTime.now()))
				reservas.remove(i);
		}
	}
	public void cancelamentoReserva(Reserva reserva) {
		if(aceitaCancelamento) {
			for(int i=0;i<reservas.size();i++) 
				if(reserva==reservas.get(i)) reservas.remove(i);
		}
	}
	
	//Esta funcao contabiliza as datas que estão em conflito com aquelas entradas por parametro incrementando um contador,
	//ao final do laço é comparado o contador com a quantidade limite de quartos para verifciar se aquela data está
	//disponível para reserva
	public boolean analisaDisponibilidadeData(LocalDateTime chegada, LocalDateTime saida,int quant) {
		int cont=quant;
		boolean caso1,caso2,caso3,caso4;
		for(int i=0;i<reservas.size();i++) {
			caso1 = chegada.isAfter(reservas.get(i).getInicio())&&chegada.isBefore(reservas.get(i).getFim());
			caso2 = saida.isAfter(reservas.get(i).getInicio())&&saida.isBefore(reservas.get(i).getFim());
			caso3 = chegada.isBefore(reservas.get(i).getInicio())&&saida.isAfter(reservas.get(i).getFim());
			caso4 = chegada.isAfter(reservas.get(i).getInicio())&&saida.isBefore(reservas.get(i).getFim());
			if(caso1||caso2||caso3||caso4) cont++;
		}
		if(quantidadeQuartos<cont) return false;
		return true;
	}
	public void addReserva(Reserva reserva,int quantidadeReserva) {
		if(quantidadeReserva>1){
			for(int i = 0;i<quantidadeReserva;i++)
				reservas.add(reserva);
		}else reservas.add(reserva);
	}
	public Hotel getHotel() {
		return hotel;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco>0) this.preco = preco;
		else this.preco =0;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		if(desconto>0) this.desconto = desconto;
		else this.desconto = 0;
	}
	public double getPrecoDesconto() {
		return precoDesconto;
	}
	public void setPrecoDesconto() {
		if(preco-desconto>0) this.precoDesconto = preco-desconto;
		else this.precoDesconto = 0;
	}
	public int getQuantidadeQuartos() {
		return quantidadeQuartos;
	}
	public void setQuantidadeQuartos(int quantidadeQuartos) {
		if(quantidadeQuartos>0) this.quantidadeQuartos = quantidadeQuartos;
		else this.quantidadeQuartos = 0;
	}
	public boolean isAceitaCancelamento() {
		return aceitaCancelamento;
	}
	public void setAceitaCancelamento(boolean aceitaCancelamento) {
		this.aceitaCancelamento = aceitaCancelamento;
	}
	public int getLimitePessoas() {
		return limitePessoas;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public void setLimitePessoas(int limitePessoas) {
		if(limitePessoas>0) this.limitePessoas = limitePessoas;
		else this.limitePessoas = 0;
	}
	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}
	
}
