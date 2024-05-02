package Telas;
import Classes.*;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class CadastroFuncionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf;
	private JTextField carteira;
	private JTextField diaNasc;
	private JTextField cidade;
	private JTextField bairro;
	private JTextField rua;
	private JTextField numero;
	private JTextField salario;
	private JTextField mesNasc;
	private JTextField anoNasc;
	private JFrame este = this;

	public CadastroFuncionario(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 31, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCpf.setBounds(10, 56, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblNumCarteira = new JLabel("Num carteira:");
		lblNumCarteira.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumCarteira.setBounds(10, 81, 93, 14);
		contentPane.add(lblNumCarteira);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDataDeNascimento.setBounds(10, 108, 114, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidade.setBounds(10, 158, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairro.setBounds(220, 158, 46, 14);
		contentPane.add(lblBairro);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRua.setBounds(10, 183, 46, 14);
		contentPane.add(lblRua);
		
		JLabel lblNmero = new JLabel("Número:");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNmero.setBounds(220, 184, 56, 14);
		contentPane.add(lblNmero);
		
		JLabel lblSalrioFixo = new JLabel("Salário fixo:");
		lblSalrioFixo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSalrioFixo.setBounds(10, 208, 75, 14);
		contentPane.add(lblSalrioFixo);
		
		JLabel lblParceiro = new JLabel("Parceiro");
		lblParceiro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblParceiro.setBounds(10, 233, 46, 14);
		contentPane.add(lblParceiro);
		
		nome = new JTextField();
		nome.setBounds(50, 29, 222, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		cpf = new JTextField();
		cpf.setColumns(10);
		cpf.setBounds(38, 54, 235, 20);
		contentPane.add(cpf);
		
		carteira = new JTextField();
		carteira.setColumns(10);
		carteira.setBounds(86, 79, 188, 20);
		contentPane.add(carteira);
		
		diaNasc = new JTextField();
		diaNasc.setColumns(10);
		diaNasc.setBounds(127, 106, 31, 20);
		contentPane.add(diaNasc);
		
		cidade = new JTextField();
		cidade.setColumns(10);
		cidade.setBounds(60, 156, 158, 20);
		contentPane.add(cidade);
		
		bairro = new JTextField();
		bairro.setColumns(10);
		bairro.setBounds(258, 156, 166, 20);
		contentPane.add(bairro);
		
		rua = new JTextField();
		rua.setColumns(10);
		rua.setBounds(38, 181, 172, 20);
		contentPane.add(rua);
		
		numero = new JTextField();
		numero.setColumns(10);
		numero.setBounds(268, 181, 86, 20);
		contentPane.add(numero);
		
		salario = new JTextField();
		salario.setColumns(10);
		salario.setBounds(74, 206, 86, 20);
		contentPane.add(salario);
		
		mesNasc = new JTextField();
		mesNasc.setColumns(10);
		mesNasc.setBounds(168, 106, 31, 20);
		contentPane.add(mesNasc);
		
		anoNasc = new JTextField();
		anoNasc.setColumns(10);
		anoNasc.setBounds(209, 106, 67, 20);
		contentPane.add(anoNasc);
		
		String opcoes[] = {"Sim","Não"};
		JComboBox comboBox = new JComboBox(opcoes);
		comboBox.setBounds(66, 230, 58, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario f = new Funcionario();
				if(f.validaCPF(cpf.getText())&&dadosF.buscar(carteira.getText())==null) {
					f = null;
					if(comboBox.getSelectedItem().toString()=="Sim") {
						Endereco end = new Endereco(rua.getText(),bairro.getText(),cidade.getText(),numero.getText());
						LocalDate data = LocalDate.of(Integer.parseInt(anoNasc.getText()),Integer.parseInt(mesNasc.getText()),Integer.parseInt(diaNasc.getText()));
						FuncionarioParceiro func = new FuncionarioParceiro(nome.getText(),cpf.getText(),end,carteira.getText(),data,Float.parseFloat(salario.getText()));
						dadosF.cadastrarParceiro(func);
					}
					else {
						Endereco end = new Endereco(rua.getText(),bairro.getText(),cidade.getText(),numero.getText());
						LocalDate data = LocalDate.of(Integer.parseInt(anoNasc.getText()),Integer.parseInt(mesNasc.getText()),Integer.parseInt(diaNasc.getText()));
						Funcionario func = new Funcionario(nome.getText(),cpf.getText(),end,carteira.getText(),data,Float.parseFloat(salario.getText()));
						dadosF.cadastrar(func);
					}
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Administrativo frame = new Administrativo(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
								frame.setVisible(true);
								este.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}else if(!f.validaCPF(cpf.getText())){
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("CPF inválido");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("O funcionário já está cadastrado");
				    JOptionPane.showMessageDialog(null, mensagem);
				}
			}
		});
		btnNewButton.setBounds(335, 268, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblCadastroFuncionrio = new JLabel("Cadastro Funcionário");
		lblCadastroFuncionrio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCadastroFuncionrio.setBounds(158, 4, 129, 14);
		contentPane.add(lblCadastroFuncionrio);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Administrativo frame = new Administrativo(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_1.setBounds(236, 268, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
