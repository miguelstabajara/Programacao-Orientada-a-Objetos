package Classes;
import java.util.ArrayList;
public class DadosFuncionarios {
	private ArrayList<Funcionario> dadosFuncionarios = new ArrayList<Funcionario>();
	
	public void cadastrar(Funcionario funcionario) {
		dadosFuncionarios.add(funcionario);
	}
	public void cadastrarParceiro(FuncionarioParceiro funcionario) {
		dadosFuncionarios.add(funcionario);
	}
	
	//Falta fazer o metodo listar para mostrar os dados
	
	public Funcionario buscar(String carteira) {
		Funcionario f = null;
		for(int i = 0;i<dadosFuncionarios.size();i++) {
			if(dadosFuncionarios.get(i).getNumCarteira().equals(carteira)) {
				f = dadosFuncionarios.get(i);
				break;
			}
		}
		return f;
	}
	public FuncionarioParceiro buscarParceiro(String carteira) {
		FuncionarioParceiro f = null;
		for(int i = 0;i<dadosFuncionarios.size();i++) {
			if(dadosFuncionarios.get(i).getNumCarteira().equals(carteira)&&dadosFuncionarios.get(i) instanceof FuncionarioParceiro) {
				f = (FuncionarioParceiro)dadosFuncionarios.get(i);
				break;
			}
		}
		return f;
	}
	public boolean excluir(String cpf) {
		Funcionario f = buscar(cpf);
		if(f!=null) {
			dadosFuncionarios.remove(f);
			return true;
		}
		else return false;
	}
}
