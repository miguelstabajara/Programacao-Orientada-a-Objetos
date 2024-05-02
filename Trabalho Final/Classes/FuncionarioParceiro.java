package Classes;

import java.time.LocalDate;
import java.util.ArrayList;

public class FuncionarioParceiro extends Funcionario{
	private static double porcentagemAdicional=0.1;
	private ArrayList<Hotel> hoteisParceiros = new ArrayList<Hotel>();
	
	public FuncionarioParceiro(String nome,String cpf,Endereco endereco,String numCarteira,LocalDate dataNascimento,double salario) {
		super(nome,cpf,endereco,numCarteira,dataNascimento,salario);
	}
	
	public double calculaSalario() {
		double taxa=porcentagemAdicional*hoteisParceiros.size();
		return getSalarioFixo()+getSalarioFixo()*(taxa);
	}
	
	public void addHotel(Hotel hotel) {
		hoteisParceiros.add(hotel);
	}
	
	public ArrayList<Hotel> getHoteisParceiros() {
		return hoteisParceiros;
	}
	public void setHoteisParceiros(ArrayList<Hotel> parceiros) {
		this.hoteisParceiros = parceiros;
	}
}
