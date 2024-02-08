import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Exercicio 1
		Scanner ler = new Scanner(System.in);
		ContaEspecial[] contae = new ContaEspecial[5];
		ContaPoupança[] contap = new ContaPoupança[5];
		int cpf,nro;
		double saldo;
		for(int i=0;i<5;i++) {
			System.out.println("Insira seu cpf,numero da conta e saldo");
			cpf = ler.nextInt();
			nro = ler.nextInt();
			saldo = ler.nextDouble();
			contae[i] = new ContaEspecial(cpf,nro,saldo);
			contap[i] = new ContaPoupança(cpf,nro,saldo);
			if(contae[i].saqueEspecial(11000)) System.out.println("Saque realizado com sucesso");
			if(contae[i].saqueEspecial(16000)) System.out.println("Saque realizado com sucesso");
			else System.out.println("Limite excedido");
			contap[i].calcularNovoSaldo();
			System.out.println(contap[i].getSaldo());
		}
		//Exercicio 2
		Cliente c = new Cliente("Miguel", "Tabajara", 22,55869598,"Catanduva",471166908,"Rua");
		Fornecedor f = new Fornecedor("Miguel", "Tabajara", 22,55869598,"Catanduva",471166908,"Rua");
		c.info();
		f.info();
		
		//Exercicio 3
		Horista profh = new Horista();
		profh.trabalho(40);
		System.out.println(profh.getSaldo());
		DedicaçãoExclusiva profd = new DedicaçãoExclusiva();
		System.out.println(profd.getSalario());
	}

}
