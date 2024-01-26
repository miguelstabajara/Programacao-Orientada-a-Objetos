import java.lang.Math;
public class Ponto {
	private double x,y;

	public double getX() {
		return x;
	}

	public boolean setXY(float x,float y) {
		if(x>=0&&y>=0) {
			this.x = x;
			this.y = y;
			return true;
		}else return false;
	}

	public double getY() {
		return y;
	}
	
	public double distancia(Ponto dois) {
		return Math.sqrt((this.x-dois.x)*(this.x-dois.x)+(this.y-dois.y)*(this.y-dois.y));
	}
	
}
