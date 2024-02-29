import java.util.ArrayList;
public class Teste {

	public static void main(String[] args) {
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		Onibus um = new Onibus("AEB1111",1998,40);
		Onibus um1 = new Onibus("AEB1111",1998,40);
		Caminhao dois = new Caminhao("ABC0001",2005,4);
		Caminhao tres = new Caminhao("AED4553",2002,5);
		
		veiculos.add(um);
		veiculos.add(um1);
		veiculos.add(dois);
		veiculos.add(tres);
		
		
	}
	/*Neste exercício estamos usando os conceitos de construtores, hierarquias e sobreposições. */
	


}
