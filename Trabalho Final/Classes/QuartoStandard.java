package Classes;

public class QuartoStandard extends Quarto{
	private String tipo;
	
	public QuartoStandard(){}
	public QuartoStandard(String tipo) {
		setTipo(tipo);
	}
	public QuartoStandard(int limitePessoas,double preco,double desconto,int quantidadeQuartos,boolean aceitaCancelamento,Hotel hotel,String tipo) {
		super(limitePessoas,preco,desconto,quantidadeQuartos,aceitaCancelamento,hotel);
		setTipo(tipo);
	}
	public void setTipo(String tipo) {
		if(tipo=="Single"||tipo=="Duplo"||tipo=="Triplo"||tipo=="single"||tipo=="double"||tipo=="triple") {
			this.tipo = tipo;
		}
	}
	public String getTipo() {
		return this.tipo;
	}
}
