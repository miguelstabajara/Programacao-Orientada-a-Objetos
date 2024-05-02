package Classes;
import java.io.Serializable;
import java.util.ArrayList;

public class DadosAeroporto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Aeroporto> dadosAeroporto = new ArrayList<Aeroporto>();
	
	public void cadastrar(Aeroporto aero) {
		dadosAeroporto.add(aero);
	}
	
	//Falta fazer o metodo listar para mostrar os dados
	
	public Aeroporto buscar(String nome) {
		Aeroporto a = null;
		for(int i = 0;i<dadosAeroporto.size();i++) {
			if(dadosAeroporto.get(i).getNome().equals(nome)) {
				a = dadosAeroporto.get(i);
				break;
			}
		}
		return a;
	}
	public boolean excluir(String nome) {
		Aeroporto a = buscar(nome);
		if(a!=null) {
			dadosAeroporto.remove(a);
			return true;
		}
		else return false;
	}
}
