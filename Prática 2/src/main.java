
public class main {

	public static void main(String[] args) {
		Tempo t = new Tempo(0,0,30);
		t.imprime();
		t.decrementa();
		t.imprime();
		t.incrementa();
		t.imprime();
		
		Ponto p = new Ponto();
		System.out.println("("+p.getX()+","+p.getY()+")");
		Ponto q = new Ponto(2,4);
		System.out.println("("+q.getX()+","+q.getY()+")");
		
		Triangulo tri = new Triangulo(1,1,1);
		System.out.println(tri.perimetro());
		Triangulo tri1 = new Triangulo("Primeiro");
		System.out.println(tri1.getNome());
	}

}
