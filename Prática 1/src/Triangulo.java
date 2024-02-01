
public class Triangulo {
	private float lado1, lado2, lado3;

	public float getLado1() {
		return lado1;
	}

	public boolean setLado1(float l1) {
		if(l1>0) {
			this.lado1 = l1;
			return true;
		}else{
			this.lado1=1;
			return false;
		}
	}

	public float getLado2() {
		return lado2;
	}

	public boolean setLado2(float l2) {
		if(l2>0) {
			this.lado2 = l2;
			return true;
		}else{
			this.lado2=1;
			return false;
		}
	}

	public float getLado3() {
		return lado3;
	}

	public boolean setLado3(float l3) {
		if(l3>0) {
			this.lado3 = l3;
			return true;
		}else{
			this.lado3=1;
			return false;
		}
	}
	
	public boolean construir() {
		if(((lado1+lado2)>lado3)&&((lado1+lado3)>lado2)&&((lado3+lado2)>lado1)) {
			return true;
		}else return false;
	}
	
	public String tipoTri() {
		if(this.lado1==this.lado2&&this.lado1==this.lado3) {
			return "Equilatero";
		}else if(this.lado1!=this.lado3&&this.lado2!=this.lado2) {
			return "Escaleno";
		}else return "Isosceles";
	}
	
	public float perimetro() {
		return this.lado1+this.lado2+this.lado3;
	}
}
