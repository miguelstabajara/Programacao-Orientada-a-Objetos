package Classes;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Trecho {
	private String identificador;
	private String origem,destino;
	private LocalDateTime horarioSaida,horarioChegada;
	private Aeroporto localSaida,localChegada;
	private ArrayList<Voo> voos = new ArrayList<Voo>();
	private CanilVoo canil;
		
	public Trecho() {}
	public Trecho(String id,Voo voo,LocalDateTime horarioSaida,LocalDateTime horarioChegada,CanilVoo canil) {
		setIdentificador(id); 
		addVoo(voo);
		setHorarioSaida(horarioSaida);
		setHorarioChegada(horarioChegada);
		setCanil(canil);
	}
	public void setOrigemDestino() {
		origem = voos.get(0).getLocalSaida().getEndereco().getCidade();
		destino = voos.get(voos.size()-1).getLocalChegada().getEndereco().getCidade();
		localSaida = voos.get(0).getLocalSaida();
		localChegada = voos.get(voos.size()-1).getLocalChegada();
	}
	public boolean clienteComprouCanil(Clientes clientes){
		for(int i =0;i<canil.getCliente().size();i++) {
			if(canil.getCliente().get(i)==clientes) return true;
		}
		return false;
	}
	
	public CanilVoo getCanil() {
		return canil;
	}
	public void setCanil(CanilVoo canil) {
		this.canil = canil;
	}
	public void setVoos(ArrayList<Voo> voos) {
		this.voos = voos;
	}
	public boolean validaIdentificador(String id) {
		boolean idValido = true;
	    if (id.length() > 0) {
	        if (id.length() < 8) {
	            idValido = false;
	        } else {
	            if (!id.matches("[A-Z]{3}[0-9]{5}")) {
	                idValido = false;
	            }
	        }
	    }
	    return idValido;
	}
	public void addVoo(Voo voo) {
		voos.add(voo);
	}
	public void addTrecho(ArrayList<Voo> voo) {
		voos = voo;
	}
	public ArrayList<Voo> getVoo() {
		return voos;
	}
	public void setIdentificador(String id) {
		if(validaIdentificador(id)) identificador = id;
		else identificador = "--------";
	}
	public String getIdentificador() {
		return identificador;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		if(origem.length()>0) this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		if(destino.length()>0) this.destino = destino;
	}
	public LocalDateTime getHorarioSaida() {
		return horarioSaida;
	}
	public void setHorarioSaida(LocalDateTime horarioSaida) {
		this.horarioSaida = horarioSaida;
	}
	public LocalDateTime getHorarioChegada() {
		return horarioChegada;
	}
	public void setHorarioChegada(LocalDateTime horarioChegada) {
		this.horarioChegada = horarioChegada;
	}
	public Aeroporto getLocalSaida() {
		return localSaida;
	}
	public void setLocalSaida(Aeroporto localSaida) {
		this.localSaida = localSaida;
	}
	public Aeroporto getLocalChegada() {
		return localChegada;
	}
	public void setLocalChegada(Aeroporto localChegada) {
		this.localChegada = localChegada;
	}
	
}
