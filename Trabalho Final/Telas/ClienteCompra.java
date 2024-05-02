package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import Classes.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClienteCompra extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cidadeOrigem;
	private JTextField cidadeDestino;
	private JFrame este = this;
	private JTextField quantidade;
	private JTextField diaSaida;
	private JTextField mesSaida;
	private JTextField anoSaida;

	public ClienteCompra(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 192);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Procura");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(178, 11, 56, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cidade Destino:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(244, 45, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cidade Origem:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 45, 108, 14);
		contentPane.add(lblNewLabel_1_1);
		
		cidadeOrigem = new JTextField();
		cidadeOrigem.setBounds(105, 42, 129, 20);
		contentPane.add(cidadeOrigem);
		cidadeOrigem.setColumns(10);
		
		cidadeDestino = new JTextField();
		cidadeDestino.setColumns(10);
		cidadeDestino.setBounds(335, 42, 119, 20);
		contentPane.add(cidadeDestino);
		
		JButton btnNewButton = new JButton("Procurar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cidadeO = cidadeOrigem.getText(),cidadeD = cidadeDestino.getText();
				int dia = Integer.parseInt(diaSaida.getText()),mes = Integer.parseInt(mesSaida.getText()),ano = Integer.parseInt(anoSaida.getText());
				LocalDate data = LocalDate.of(ano,mes,dia);
				LocalDate data1 = LocalDate.of(ano,mes,dia);
				Pesquisa pesq = new Pesquisa(cidadeD,data1);
				dadosP.cadastrar(pesq);
				int quant = Integer.parseInt(quantidade.getText());
				ArrayList<Trecho> t = dadosT.buscar3(data,cidadeO,cidadeD,quant);
				if(t==null) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("Não foram encontrados voos");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else {
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									ClienteCompra1 frame = new ClienteCompra1(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,t,quant);
									frame.setVisible(true);
									este.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
				}
			}
		});
		btnNewButton.setBounds(365, 119, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
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
		btnNewButton_1.setBounds(262, 119, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade de Passagens:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 100, 166, 14);
		contentPane.add(lblNewLabel_3);
		
		quantidade = new JTextField();
		quantidade.setColumns(10);
		quantidade.setBounds(167, 98, 129, 20);
		contentPane.add(quantidade);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Data de saida:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(10, 73, 85, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		diaSaida = new JTextField();
		diaSaida.setColumns(10);
		diaSaida.setBounds(105, 70, 34, 20);
		contentPane.add(diaSaida);
		
		mesSaida = new JTextField();
		mesSaida.setColumns(10);
		mesSaida.setBounds(146, 70, 34, 20);
		contentPane.add(mesSaida);
		
		anoSaida = new JTextField();
		anoSaida.setColumns(10);
		anoSaida.setBounds(190, 70, 56, 20);
		contentPane.add(anoSaida);
	}
}
