import java.util.ArrayList;
public class Teste {

	public static void main(String[] args) {
		Gerente Gerente1 = new Gerente("Rafael","10201",8000);
		Vendedor Vendedor1 = new Vendedor("Matheus","15613",2000,200);
		Assistente Assistente1 = new Assistente("Miguel","65687",1500);
		Gerente Gerente2 = new Gerente("Carla","98765",9000);
		Vendedor Vendedor2 = new Vendedor("Vanessa","34657",2500,500);
		
		ArrayList<Funcionario> f = new ArrayList<Funcionario>();
		f.add(Gerente1);
		f.add(Vendedor1);
		f.add(Assistente1);
		f.add(Gerente2);
		f.add(Vendedor2);
		double salario = 0;
		for(int i=0;i<f.size();i++) {
			salario = salario+f.get(i).calculaSalario();
		}
		System.out.println(salario+"\n\n");
		for(int i = 0;i<f.size();i++) {
			f.get(i).mostrarDados();
		}
	}

}
