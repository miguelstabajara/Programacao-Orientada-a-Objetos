package Classes;
import java.util.ArrayList;
public class CanilVoo {
	private double precoAnimal;
	private int limiteAnimais;
	private ArrayList<Clientes> clientes = new ArrayList<Clientes>();
	private ArrayList<String> nomeAnimais = new ArrayList<String>();

	public CanilVoo(double precoAnimal,int limiteAnimais) {
		setPrecoAnimal(precoAnimal);
		setLimiteAnimais(limiteAnimais);
	}

	public double getPrecoAnimal() {
		return precoAnimal;
	}

	public void setPrecoAnimal(double precoAnimal) {
		if(precoAnimal>0) this.precoAnimal = precoAnimal;
		else this.precoAnimal = 0;
	}

	public double getLimiteAnimais() {
		return limiteAnimais;
	}

	public void setLimiteAnimais(int limiteAnimais) {
		if(limiteAnimais>0)this.limiteAnimais = limiteAnimais;
		else this.limiteAnimais = 0;
	}

	public ArrayList<Clientes> getCliente() {
		return clientes;
	}

	public boolean addClienteEAnimal(Clientes clientes,String nomeAnimal) {
		if(this.clientes.size()<limiteAnimais) {
			nomeAnimais.add(nomeAnimal);
			this.clientes.add(clientes);
			return true;
		}else return false;
	}

	public ArrayList<String> getNomeAnimais() {
		return nomeAnimais;
	}

}
