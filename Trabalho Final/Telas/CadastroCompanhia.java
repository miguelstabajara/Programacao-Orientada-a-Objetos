package Telas;
import java.time.LocalDate;
import Classes.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroCompanhia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomeOficial;
	private JTextField nomeDivulgacao;
	private JTextField Cnpj;
	private JTextField diaCriacao;
	private JTextField mesCriacao;
	private JTextField anoCriacao;
	private JFrame este = this;

	public CadastroCompanhia(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDaCompanhia = new JLabel("Cadastro da Companhia Aérea");
		lblCadastroDaCompanhia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastroDaCompanhia.setBounds(99, 11, 288, 49);
		contentPane.add(lblCadastroDaCompanhia);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Oficial:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 59, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome de Divulgação:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 83, 115, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("CNPJ:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 108, 37, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel labelGen = new JLabel("Data de Criação:");
		labelGen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelGen.setBounds(10, 133, 101, 14);
		contentPane.add(labelGen);
		
		nomeOficial = new JTextField();
		nomeOficial.setBounds(84, 57, 202, 20);
		contentPane.add(nomeOficial);
		nomeOficial.setColumns(10);
		
		nomeDivulgacao = new JTextField();
		nomeDivulgacao.setColumns(10);
		nomeDivulgacao.setBounds(127, 81, 159, 20);
		contentPane.add(nomeDivulgacao);
		
		Cnpj = new JTextField();
		Cnpj.setColumns(10);
		Cnpj.setBounds(44, 106, 184, 20);
		contentPane.add(Cnpj);
		
		diaCriacao = new JTextField();
		diaCriacao.setColumns(10);
		diaCriacao.setBounds(105, 131, 25, 20);
		contentPane.add(diaCriacao);
		
		mesCriacao = new JTextField();
		mesCriacao.setColumns(10);
		mesCriacao.setBounds(140, 131, 25, 20);
		contentPane.add(mesCriacao);
		
		anoCriacao = new JTextField();
		anoCriacao.setColumns(10);
		anoCriacao.setBounds(175, 131, 53, 20);
		contentPane.add(anoCriacao);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dadosComp.buscar(Cnpj.getText())!=null) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("Esta companhia já existe");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else {
					LocalDate data = LocalDate.of(Integer.parseInt(anoCriacao.getText()),Integer.parseInt(mesCriacao.getText()),Integer.parseInt(diaCriacao.getText()));
					CompanhiaAerea comp = new CompanhiaAerea(Cnpj.getText(),nomeOficial.getText(),nomeDivulgacao.getText(),data);
					dadosComp.cadastrar(comp);
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
			}
		});
		btnNewButton.setBounds(335, 151, 89, 23);
		contentPane.add(btnNewButton);
		
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
		btnNewButton_1.setBounds(236, 151, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
