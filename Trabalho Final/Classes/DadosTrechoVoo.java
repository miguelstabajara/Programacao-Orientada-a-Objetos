package Classes;
import java.util.ArrayList;
import java.time.LocalDate;

public class DadosTrechoVoo {
	private ArrayList<Trecho> dadosTrecho = new ArrayList<Trecho>();
	
	public void cadastrar(Trecho trecho) {
		dadosTrecho.add(trecho);
	}
	public ArrayList<Trecho> getDadosTrecho(){
		return dadosTrecho;
	}
	
	public ArrayList<Trecho> buscar3(LocalDate data,String origem, String destino,int quant){
		ArrayList<Trecho> t = new ArrayList<Trecho>();
		boolean dia;
		boolean mes;
		boolean ano;
		for(int i=0;i<dadosTrecho.size();i++) {
			dia = dadosTrecho.get(i).getHorarioSaida().getDayOfMonth()==data.getDayOfMonth();
			mes = dadosTrecho.get(i).getHorarioSaida().getMonthValue()==data.getMonthValue();
			ano = dadosTrecho.get(i).getHorarioSaida().getYear()==data.getYear();
			if(dadosTrecho.get(i).getLocalSaida().getEndereco().getCidade().equals(origem)&&dadosTrecho.get(i).getLocalChegada().getEndereco().getCidade().equals(destino)&&ano&&mes&&dia&&dadosTrecho.get(i).getVoo().get(0).getNumeroVagas()>=quant) {
				t.add(dadosTrecho.get(i));
			}
		}
		if(t.size()==0) {
			return t=null;
		}else if(t.size()==1) {
			t.add(t.get(0));
			t.add(t.get(0));
			return t;
		}else if(t.size()==2) {
			t.add(t.get(1));
		}
		return t; 
	}
	
	public Trecho buscar(String identificador) {
		Trecho t = null;
		for(int i = 0;i<dadosTrecho.size();i++) {
			if(dadosTrecho.get(i).getIdentificador().equals(identificador)) {
				t = dadosTrecho.get(i);
				break;
			}
		}
		return t;
	}
	public boolean excluir(String identificador) {
		Trecho t = buscar(identificador);
		if(t!=null) {
			dadosTrecho.remove(t);
			return true;
		}
		else return false;
	}
	
}
