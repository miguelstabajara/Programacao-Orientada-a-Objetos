
public class Tempo {
	private int hora,minuto,segundo;
	
	public Tempo(){}
	public Tempo(int h, int m, int s) {
		if(h>=0||h<=23) {
			hora = h;
		}else hora = 0;
		if(m>=0||m<=59) {
			minuto = m;
		}else minuto = 0;
		if(s>=0||s<=59) {
			segundo = s;
		}else segundo = 0;
	}
	public Tempo(int h, int m) {
		segundo = 0;
		if(h>=0||h<=23) {
			hora = h;
		}else hora = 0;
		if(m>=0||m<=59) {
			minuto = m;
		}else minuto = 0;
	}
	public Tempo(int h) {
		segundo = 0;
		minuto = 0;
		if(h>=0||h<=23) {
			hora = h;
		}else hora = 0;
	}
	public Tempo(Tempo tmp) {
		segundo = tmp.segundo;
		minuto = tmp.minuto;
		hora = tmp.hora;
	}
	public void imprime() {
		if(hora<10) {
			System.out.print("0"+hora+":");
		}else System.out.print(hora+":");
		if(minuto<10) {
			System.out.print("0"+minuto+":");
		}else System.out.print(minuto+":");
		if(segundo<10) {
			System.out.println("0"+segundo);
		}else System.out.println(segundo);
	}
	public void incrementa() {
		minuto = minuto+1;
		if(minuto==60) {
			minuto = 0;
			hora = hora+1;
		}
		if(hora==24) {
			hora = 0;
		}
	}
	public void decrementa() {
		minuto = minuto-1;
		if(minuto==-1) {
			minuto = 59;
			hora = hora-1;
		}
		if(hora==-1) {
			hora = 23;
		}
	}
}
