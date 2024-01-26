
public class principal {

	public static void main(String[] args) {
		Triangulo tri = new Triangulo();
		tri.setLado1(3);
		tri.setLado2(4);
		tri.setLado3(5);
		if(tri.construir()) {
			System.out.println("É possivel construir");
		}else System.out.println("Não é possivel");
		System.out.println(tri.tipoTri());
		System.out.println(tri.perimetro());
		
		
		Ponto um = new Ponto();
		Ponto dois = new Ponto();
		um.setXY(4,4);
		dois.setXY(8,8);
		System.out.println(um.distancia(dois));
		
		Circulo novo = new Circulo();
		float a=1, b=2;
		novo.coordenadas(a,b);
		novo.setRaio(10);
		System.out.println(novo.diametro());
		System.out.println(novo.area());
		System.out.println(novo.circ());

	}

}
