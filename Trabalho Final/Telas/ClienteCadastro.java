package Telas;

import java.awt.EventQueue;
import Classes.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

public class ClienteCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf;
	private JTextField diaNasc;
	private JTextField mesNasc;
	private JTextField anoNasc;
	private JLabel lblEndereo;
	private JLabel lblCidade;
	private JLabel lblBairro;
	private JLabel lblRua;
	private JLabel lblBairro_2;
	private JTextField rua;
	private JTextField cidade;
	private JTextField bairro;
	private JTextField numero;
	private JLabel lblEmail;
	private JTextField email;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JFrame este = this;

	public ClienteCadastro(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nome = new JTextField();
		nome.setBounds(59, 11, 188, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(22, 13, 38, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCpf.setBounds(22, 45, 38, 14);
		contentPane.add(lblCpf);
		
		cpf = new JTextField();
		cpf.setBounds(59, 43, 128, 20);
		contentPane.add(cpf);
		cpf.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDataDeNascimento.setBounds(21, 74, 121, 14);
		contentPane.add(lblDataDeNascimento);
		
		diaNasc = new JTextField();
		diaNasc.setToolTipText("");
		diaNasc.setBounds(136, 70, 38, 20);
		contentPane.add(diaNasc);
		diaNasc.setColumns(10);
		
		mesNasc = new JTextField();
		mesNasc.setColumns(10);
		mesNasc.setBounds(177, 70, 38, 20);
		contentPane.add(mesNasc);
		
		anoNasc = new JTextField();
		anoNasc.setColumns(10);
		anoNasc.setBounds(219, 70, 62, 20);
		contentPane.add(anoNasc);
		
		lblEndereo = new JLabel("Endereço");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEndereo.setBounds(20, 101, 121, 14);
		contentPane.add(lblEndereo);
		
		lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidade.setBounds(22, 126, 51, 14);
		contentPane.add(lblCidade);
		
		lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairro.setBounds(219, 126, 45, 14);
		contentPane.add(lblBairro);
		
		lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRua.setBounds(22, 151, 31, 14);
		contentPane.add(lblRua);
		
		lblBairro_2 = new JLabel("Número:");
		lblBairro_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairro_2.setBounds(219, 152, 62, 14);
		contentPane.add(lblBairro_2);
		
		rua = new JTextField();
		rua.setBounds(48, 149, 167, 20);
		contentPane.add(rua);
		rua.setColumns(10);
		
		cidade = new JTextField();
		cidade.setColumns(10);
		cidade.setBounds(69, 124, 149, 20);
		contentPane.add(cidade);
		
		bairro = new JTextField();
		bairro.setColumns(10);
		bairro.setBounds(255, 124, 159, 20);
		contentPane.add(bairro);
		
		numero = new JTextField();
		numero.setColumns(10);
		numero.setBounds(275, 149, 137, 20);
		contentPane.add(numero);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(22, 190, 38, 14);
		contentPane.add(lblEmail);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(59, 188, 286, 20);
		contentPane.add(email);
		
		btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes c = new Clientes();
				if(c.validaCPF(cpf.getText())) {
					c = null;
					Endereco end = new Endereco(rua.getText(),bairro.getText(),cidade.getText(),numero.getText());
					LocalDate data = LocalDate.of(Integer.parseInt(anoNasc.getText()),Integer.parseInt(mesNasc.getText()),Integer.parseInt(diaNasc.getText()));
					Clientes cli = new Clientes(nome.getText(),cpf.getText(),end,data,email.getText());
					dadosC.cadastrar(cli);
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Cliente frame = new Cliente(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
								frame.setVisible(true);
								este.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}else{
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("CPF inválido");
				    JOptionPane.showMessageDialog(null, mensagem);
				}
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Cliente frame = new Cliente(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_1.setBounds(236, 227, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
