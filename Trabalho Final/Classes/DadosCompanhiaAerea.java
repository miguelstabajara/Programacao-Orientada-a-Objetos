package Classes;
import java.util.ArrayList;
public class DadosCompanhiaAerea {
	private ArrayList<CompanhiaAerea> dadosComp = new ArrayList<CompanhiaAerea>();
	
	public void cadastrar(CompanhiaAerea comp) {
		dadosComp.add(comp);
	}
	
	//Falta fazer o metodo listar para mostrar os dados
	
	public CompanhiaAerea buscar(String cnpj) {
		CompanhiaAerea c = null;
		for(int i = 0;i<dadosComp.size();i++) {
			if(dadosComp.get(i).getCNPJ().equals(cnpj)) {
				c = dadosComp.get(i);
				break;
			}
		}
		return c;
	}
	public boolean excluir(String nome) {
		CompanhiaAerea c = buscar(nome);
		if(c!=null) {
			dadosComp.remove(c);
			return true;
		}
		else return false;
	}	
}
