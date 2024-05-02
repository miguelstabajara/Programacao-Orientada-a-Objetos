package Telas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Classes.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;

public class CadastroTrecho2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField horaS1;
	private JTextField minS1;
	private JTextField horaC1;
	private JTextField minC1;
	private JTextField diaS1;
	private JTextField mesS1;
	private JTextField anoS1;
	private JTextField diaC1;
	private JTextField mesC1;
	private JTextField anoC1;
	private JTextField aeroS1;
	private JTextField aeroC1;
	private JTextField preco1;
	private JTextField vagas1;
	private JFrame este = this;

	public CadastroTrecho2(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP,Trecho tre) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cadastro de Voo:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 11, 109, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2_5_2 = new JLabel("Horário Saida:");
		lblNewLabel_1_1_2_5_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_5_2.setBounds(10, 34, 85, 14);
		contentPane.add(lblNewLabel_1_1_2_5_2);
		
		horaS1 = new JTextField();
		horaS1.setColumns(10);
		horaS1.setBounds(90, 32, 26, 20);
		contentPane.add(horaS1);
		
		JLabel lblNewLabel_1_1_2_4_3_1 = new JLabel("h");
		lblNewLabel_1_1_2_4_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_4_3_1.setBounds(121, 35, 13, 14);
		contentPane.add(lblNewLabel_1_1_2_4_3_1);
		
		minS1 = new JTextField();
		minS1.setColumns(10);
		minS1.setBounds(134, 32, 26, 20);
		contentPane.add(minS1);
		
		JLabel lblNewLabel_1_1_2_4_1_2_1 = new JLabel("m");
		lblNewLabel_1_1_2_4_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_4_1_2_1.setBounds(164, 34, 13, 14);
		contentPane.add(lblNewLabel_1_1_2_4_1_2_1);
		
		JLabel HORA = new JLabel("Horário Chegada");
		HORA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		HORA.setBounds(187, 34, 103, 14);
		contentPane.add(HORA);
		
		horaC1 = new JTextField();
		horaC1.setColumns(10);
		horaC1.setBounds(282, 32, 26, 20);
		contentPane.add(horaC1);
		
		JLabel lblNewLabel_1_1_2_4_2_1_1 = new JLabel("h");
		lblNewLabel_1_1_2_4_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_4_2_1_1.setBounds(311, 35, 13, 14);
		contentPane.add(lblNewLabel_1_1_2_4_2_1_1);
		
		minC1 = new JTextField();
		minC1.setColumns(10);
		minC1.setBounds(321, 32, 26, 20);
		contentPane.add(minC1);
		
		JLabel lblNewLabel_1_1_2_4_1_1_1_1 = new JLabel("m");
		lblNewLabel_1_1_2_4_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_4_1_1_1_1.setBounds(349, 35, 13, 14);
		contentPane.add(lblNewLabel_1_1_2_4_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_5_1_2 = new JLabel("Data Saida");
		lblNewLabel_1_1_2_5_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_5_1_2.setBounds(10, 59, 71, 14);
		contentPane.add(lblNewLabel_1_1_2_5_1_2);
		
		diaS1 = new JTextField();
		diaS1.setToolTipText("");
		diaS1.setColumns(10);
		diaS1.setBounds(71, 55, 38, 20);
		contentPane.add(diaS1);
		
		mesS1 = new JTextField();
		mesS1.setColumns(10);
		mesS1.setBounds(112, 55, 38, 20);
		contentPane.add(mesS1);
		
		anoS1 = new JTextField();
		anoS1.setColumns(10);
		anoS1.setBounds(154, 55, 62, 20);
		contentPane.add(anoS1);
		
		JLabel lblNewLabel_1_1_2_5_1_1_1 = new JLabel("Data Chegada:");
		lblNewLabel_1_1_2_5_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_5_1_1_1.setBounds(226, 59, 100, 14);
		contentPane.add(lblNewLabel_1_1_2_5_1_1_1);
		
		diaC1 = new JTextField();
		diaC1.setToolTipText("");
		diaC1.setColumns(10);
		diaC1.setBounds(311, 55, 38, 20);
		contentPane.add(diaC1);
		
		mesC1 = new JTextField();
		mesC1.setColumns(10);
		mesC1.setBounds(352, 55, 38, 20);
		contentPane.add(mesC1);
		
		anoC1 = new JTextField();
		anoC1.setColumns(10);
		anoC1.setBounds(401, 55, 62, 20);
		contentPane.add(anoC1);
		
		JLabel lblNewLabel_1_1_2_1_2_1 = new JLabel("Aeroporto saída:");
		lblNewLabel_1_1_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1_2_1.setBounds(10, 86, 124, 14);
		contentPane.add(lblNewLabel_1_1_2_1_2_1);
		
		aeroS1 = new JTextField();
		aeroS1.setColumns(10);
		aeroS1.setBounds(109, 84, 118, 20);
		contentPane.add(aeroS1);
		
		JLabel lblNewLabel_1_1_2_1_1_1_1 = new JLabel("Aeroporto chegada:");
		lblNewLabel_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1_1_1_1.setBounds(237, 86, 124, 14);
		contentPane.add(lblNewLabel_1_1_2_1_1_1_1);
		
		aeroC1 = new JTextField();
		aeroC1.setColumns(10);
		aeroC1.setBounds(349, 84, 114, 20);
		contentPane.add(aeroC1);
		
		JLabel preco = new JLabel("Preço:");
		preco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		preco.setBounds(10, 115, 71, 14);
		contentPane.add(preco);
		
		preco1 = new JTextField();
		preco1.setColumns(10);
		preco1.setBounds(48, 113, 86, 20);
		contentPane.add(preco1);
		
		JLabel lblNewLabel_1_1_2_2_1 = new JLabel("Número de vagas:");
		lblNewLabel_1_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_2_1.setBounds(191, 116, 105, 14);
		contentPane.add(lblNewLabel_1_1_2_2_1);
		
		vagas1 = new JTextField();
		vagas1.setColumns(10);
		vagas1.setBounds(294, 113, 86, 20);
		contentPane.add(vagas1);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dadosA.buscar(aeroS1.getText())==null) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("Aeroporto 1 não encontrado");
				    JOptionPane.showMessageDialog(null, mensagem);
				}
				if(dadosA.buscar(aeroC1.getText())==null) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("Aeroporto 2 não encontrado");
				    JOptionPane.showMessageDialog(null, mensagem);
				}
				Aeroporto localSaida = dadosA.buscar(aeroS1.getText());
				Aeroporto localChegada = dadosA.buscar(aeroC1.getText());
				CompanhiaAerea comp = tre.getVoo().get(0).getCompanhia();
				LocalDateTime dataSaida1 = LocalDateTime.of(Integer.parseInt(anoS1.getText()),Integer.parseInt(mesS1.getText()),Integer.parseInt(diaS1.getText()),Integer.parseInt(horaS1.getText()),Integer.parseInt(minS1.getText()));
				LocalDateTime dataChegada1 = LocalDateTime.of(Integer.parseInt(anoC1.getText()),Integer.parseInt(mesC1.getText()),Integer.parseInt(diaC1.getText()),Integer.parseInt(horaC1.getText()),Integer.parseInt(minC1.getText()));
				Voo voo = new Voo(Integer.parseInt(vagas1.getText()),Double.parseDouble(preco1.getText()),comp,localSaida,localChegada,dataSaida1,dataChegada1);
				tre.addVoo(voo);
				tre.setOrigemDestino();
				if(dadosT.buscar(tre.getIdentificador())==null) {
					dadosT.cadastrar(tre);
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
		btnNewButton.setBounds(378, 164, 89, 23);
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
		btnNewButton_1.setBounds(273, 164, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
