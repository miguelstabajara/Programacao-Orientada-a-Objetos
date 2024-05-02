package Classes;
import java.util.ArrayList;
public class DadosClientes {
	private ArrayList<Clientes> dadosClientes = new ArrayList<Clientes>();
	
	public void cadastrar(Clientes clientes) {
		dadosClientes.add(clientes);
	}
	
	//Falta fazer o metodo listar para mostrar os dados
	
	public Clientes buscar(String cpf) {
		Clientes c = null;
		for(int i = 0;i<dadosClientes.size();i++) {
			if(dadosClientes.get(i).getCpf().equals(cpf)) {
				c = dadosClientes.get(i);
				break;
			}
		}
		return c;
	}
	public boolean excluir(String cpf) {
		Clientes c = buscar(cpf);
		if(c!=null) {
			dadosClientes.remove(c);
			return true;
		}
		else return false;
	}
}
