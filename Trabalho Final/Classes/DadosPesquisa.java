package Classes;
import java.util.ArrayList;

public class DadosPesquisa {
private ArrayList<Pesquisa> dadosPesquisa = new ArrayList<Pesquisa>();
	
	public void cadastrar(Pesquisa pesq) {
		dadosPesquisa.add(pesq);
	}
}
