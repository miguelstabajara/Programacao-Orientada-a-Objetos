
public class Circulo {
	private String nome;
	private Ponto centro=new Ponto();
	private double raio;
	public static double pi=3.14;
	
	public void coordenadas(float d,float e) {
		this.centro.setXY(d,e);
	}
	public void point(float x,float y) {
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public void exibeDados() {
		System.out.println("Raio: "+getRaio());
	}
	
	public double diametro() {
		return raio*2;
	}
	public double area() {
		return pi*raio*raio;
	}
	public double circ() {
		return 2*pi*raio;
	}
}
