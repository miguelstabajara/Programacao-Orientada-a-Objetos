
public class Caminhao extends Veiculo{ //Caminhão está usando hierarquicamente os atributos e metodos de Veiculo
	private int eixos;
	
	public Caminhao(String placa, int ano, int eixos) { //Construtores para instanciar o objeto 
		super(placa,ano);
		this.eixos=eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	public void exibirDados() {
		super.exibirDados(); //A subclasse está sobrepondo o metódo exibirDados da classe original, acessando o metodo original atraves do operador "super"
		System.out.println("Eixos: "+eixos);
	}
	
}
