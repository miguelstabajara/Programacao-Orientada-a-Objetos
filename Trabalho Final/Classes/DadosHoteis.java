package Classes;
import java.util.ArrayList;
import java.time.LocalDateTime;
public class DadosHoteis {
	private ArrayList<Hotel> dadosHoteis = new ArrayList<Hotel>();
	
	public void cadastrar(Hotel hotel) {
		dadosHoteis.add(hotel);
	}
	
	//Falta fazer o metodo listar para mostrar os dados
	public ArrayList<Hotel> buscar3(String cidadeD,LocalDateTime diaChegada,LocalDateTime diaSaida,int quant,String tipo) {
		ArrayList<Hotel> h = new ArrayList<>();
		if(tipo=="Luxo") {
			for(int i = 0;i<dadosHoteis.size();i++) {
				if(dadosHoteis.get(i).getEndereco().getCidade().equals(cidadeD)&&dadosHoteis.get(i).getQuartos().get(0).analisaDisponibilidadeData(diaChegada, diaSaida,quant)) {
					h.add(dadosHoteis.get(i));
				}
			}
		}else if(tipo=="Single") {
			for(int i = 0;i<dadosHoteis.size();i++) {
				if(dadosHoteis.get(i).getEndereco().getCidade().equals(cidadeD)&&dadosHoteis.get(i).getQuartos().get(1).analisaDisponibilidadeData(diaChegada, diaSaida,quant)) {
					h.add(dadosHoteis.get(i));
				}
			}
		}else if(tipo=="Duplo") {
			for(int i = 0;i<dadosHoteis.size();i++) {
				if(dadosHoteis.get(i).getEndereco().getCidade().equals(cidadeD)&&dadosHoteis.get(i).getQuartos().get(2).analisaDisponibilidadeData(diaChegada, diaSaida,quant)) {
					h.add(dadosHoteis.get(i));
				}
			}
		}else if(tipo=="Triplo") {
			for(int i = 0;i<dadosHoteis.size();i++) {
				if(dadosHoteis.get(i).getEndereco().getCidade().equals(cidadeD)&&dadosHoteis.get(i).getQuartos().get(3).analisaDisponibilidadeData(diaChegada, diaSaida,quant)) {
					h.add(dadosHoteis.get(i));
				}
			}
		}
		if(h.size()==0) return h = null;
		if(h.size()==1) {
			h.add(h.get(0));
			h.add(h.get(0));
			return h;
		}
		if(h.size()==2) h.add(h.get(1));
		return h;
	}
	
	public Hotel buscar(String cnpj) {
		Hotel h = null;
		for(int i = 0;i<dadosHoteis.size();i++) {
			if(dadosHoteis.get(i).getCnpj().equals(cnpj)) {
				h = dadosHoteis.get(i);
				break;
			}
		}
		return h;
	}
	public boolean excluir(String cnpj) {
		Hotel h = buscar(cnpj);
		if(h!=null) {
			dadosHoteis.remove(h);
			return true;
		}
		else return false;
	}
}
