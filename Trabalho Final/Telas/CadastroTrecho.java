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

public class CadastroTrecho extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel label;
	private JTextField id;
	private JTextField cnpj;
	private JTextField preco1;
	private JTextField vagas1;
	private JTextField limCanil;
	private JTextField valorAnimal;
	private JFrame este = this;
	private JTextField horaS1;
	private JTextField minS1;
	private JTextField horaC1;
	private JTextField minC1;
	private JTextField diaS1;
	private JTextField mesS1;
	private JTextField anoS1;
	private JTextField diaC1;
	private JTextField mesC1;
	private JTextField aeroC1;
	private JTextField aeroS1;
	private JTextField anoC1;

	public CadastroTrecho(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 402);
		label = new JPanel();
		label.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(label);
		label.setLayout(null);
		
		JLabel lblCadastroDoTrecho = new JLabel("Cadastro do Trecho");
		lblCadastroDoTrecho.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastroDoTrecho.setBounds(130, 11, 166, 49);
		label.add(lblCadastroDoTrecho);
		
		JLabel lblNewLabel_1 = new JLabel("Identificador:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 58, 85, 14);
		label.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CNPJ da companhia aerea:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 83, 152, 14);
		label.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cadastro do voo 1:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 108, 109, 14);
		label.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Preço:");
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_2.setBounds(10, 212, 71, 14);
		label.add(lblNewLabel_1_1_2_2);
		
		JLabel lblNewLabel_1_1_2_2_1 = new JLabel("Número de vagas:");
		lblNewLabel_1_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_2_1.setBounds(191, 213, 105, 14);
		label.add(lblNewLabel_1_1_2_2_1);
		
		id = new JTextField();
		id.setBounds(84, 56, 86, 20);
		label.add(id);
		id.setColumns(10);
		
		cnpj = new JTextField();
		cnpj.setColumns(10);
		cnpj.setBounds(160, 81, 86, 20);
		label.add(cnpj);
		
		preco1 = new JTextField();
		preco1.setColumns(10);
		preco1.setBounds(48, 210, 86, 20);
		label.add(preco1);
		
		vagas1 = new JTextField();
		vagas1.setColumns(10);
		vagas1.setBounds(294, 210, 86, 20);
		label.add(vagas1);
		
		JLabel lblNewLabel_1_1_2_2_1_1_1 = new JLabel("Cadastro canil do trecho:");
		lblNewLabel_1_1_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_2_1_1_1.setBounds(10, 237, 152, 14);
		label.add(lblNewLabel_1_1_2_2_1_1_1);
		
		JLabel lblNewLabel_1_1_2_2_1_1_1_1 = new JLabel("Limite de animais:");
		lblNewLabel_1_1_2_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_2_1_1_1_1.setBounds(10, 262, 100, 14);
		label.add(lblNewLabel_1_1_2_2_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_2_1_1_1_1_1 = new JLabel("Valor por animal:");
		lblNewLabel_1_1_2_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_2_1_1_1_1_1.setBounds(191, 263, 109, 14);
		label.add(lblNewLabel_1_1_2_2_1_1_1_1_1);
		
		limCanil = new JTextField();
		limCanil.setColumns(10);
		limCanil.setBounds(109, 260, 77, 20);
		label.add(limCanil);
		
		valorAnimal = new JTextField();
		valorAnimal.setColumns(10);
		valorAnimal.setBounds(282, 260, 86, 20);
		label.add(valorAnimal);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Trecho t = new Trecho();
				if(t.validaIdentificador(id.getText())==false) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("ID inválido");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else {
					t = null;
					Aeroporto localSaida = dadosA.buscar(aeroS1.getText());
					Aeroporto localChegada = dadosA.buscar(aeroC1.getText());
					CompanhiaAerea comp = dadosComp.buscar(cnpj.getText());
					LocalDateTime dataSaida1 = LocalDateTime.of(Integer.parseInt(anoS1.getText()),Integer.parseInt(mesS1.getText()),Integer.parseInt(diaS1.getText()),Integer.parseInt(horaS1.getText()),Integer.parseInt(minS1.getText()));
					LocalDateTime dataChegada1 = LocalDateTime.of(Integer.parseInt(anoC1.getText()),Integer.parseInt(mesC1.getText()),Integer.parseInt(diaC1.getText()),Integer.parseInt(horaC1.getText()),Integer.parseInt(minC1.getText()));
					Voo voo = new Voo(Integer.parseInt(vagas1.getText()),Double.parseDouble(preco1.getText()),comp,localSaida,localChegada,dataSaida1,dataChegada1);
					CanilVoo c = new CanilVoo(Double.parseDouble(valorAnimal.getText()),Integer.parseInt(limCanil.getText()));
					Trecho tre = new Trecho(id.getText(),voo,dataSaida1,dataChegada1,c);
					tre.setOrigemDestino();
					if(dadosT.buscar(id.getText())==null) {
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
			}
		});
		btnNewButton.setBounds(379, 331, 89, 23);
		label.add(btnNewButton);
		
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
		btnNewButton_1.setBounds(237, 331, 89, 23);
		label.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_2_5_2 = new JLabel("Horário Saida:");
		lblNewLabel_1_1_2_5_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_5_2.setBounds(10, 131, 85, 14);
		label.add(lblNewLabel_1_1_2_5_2);
		
		horaS1 = new JTextField();
		horaS1.setColumns(10);
		horaS1.setBounds(90, 129, 26, 20);
		label.add(horaS1);
		
		JLabel lblNewLabel_1_1_2_4_3_1 = new JLabel("h");
		lblNewLabel_1_1_2_4_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_4_3_1.setBounds(121, 132, 13, 14);
		label.add(lblNewLabel_1_1_2_4_3_1);
		
		minS1 = new JTextField();
		minS1.setColumns(10);
		minS1.setBounds(134, 129, 26, 20);
		label.add(minS1);
		
		JLabel lblNewLabel_1_1_2_4_1_2_1 = new JLabel("m");
		lblNewLabel_1_1_2_4_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_4_1_2_1.setBounds(164, 131, 13, 14);
		label.add(lblNewLabel_1_1_2_4_1_2_1);
		
		JLabel HORA = new JLabel("Horário Chegada");
		HORA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		HORA.setBounds(187, 131, 103, 14);
		label.add(HORA);
		
		horaC1 = new JTextField();
		horaC1.setColumns(10);
		horaC1.setBounds(282, 129, 26, 20);
		label.add(horaC1);
		
		JLabel lblNewLabel_1_1_2_4_2_1_1 = new JLabel("h");
		lblNewLabel_1_1_2_4_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_4_2_1_1.setBounds(311, 132, 13, 14);
		label.add(lblNewLabel_1_1_2_4_2_1_1);
		
		minC1 = new JTextField();
		minC1.setColumns(10);
		minC1.setBounds(321, 129, 26, 20);
		label.add(minC1);
		
		JLabel lblNewLabel_1_1_2_4_1_1_1_1 = new JLabel("m");
		lblNewLabel_1_1_2_4_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_4_1_1_1_1.setBounds(349, 132, 13, 14);
		label.add(lblNewLabel_1_1_2_4_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_5_1_2 = new JLabel("Data Saida");
		lblNewLabel_1_1_2_5_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_5_1_2.setBounds(10, 156, 71, 14);
		label.add(lblNewLabel_1_1_2_5_1_2);
		
		diaS1 = new JTextField();
		diaS1.setToolTipText("");
		diaS1.setColumns(10);
		diaS1.setBounds(71, 152, 38, 20);
		label.add(diaS1);
		
		mesS1 = new JTextField();
		mesS1.setColumns(10);
		mesS1.setBounds(112, 152, 38, 20);
		label.add(mesS1);
		
		anoS1 = new JTextField();
		anoS1.setColumns(10);
		anoS1.setBounds(154, 152, 62, 20);
		label.add(anoS1);
		
		JLabel lblNewLabel_1_1_2_5_1_1_1 = new JLabel("Data Chegada:");
		lblNewLabel_1_1_2_5_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_5_1_1_1.setBounds(226, 156, 100, 14);
		label.add(lblNewLabel_1_1_2_5_1_1_1);
		
		diaC1 = new JTextField();
		diaC1.setToolTipText("");
		diaC1.setColumns(10);
		diaC1.setBounds(311, 152, 38, 20);
		label.add(diaC1);
		
		mesC1 = new JTextField();
		mesC1.setColumns(10);
		mesC1.setBounds(352, 152, 38, 20);
		label.add(mesC1);
		
		aeroC1 = new JTextField();
		aeroC1.setColumns(10);
		aeroC1.setBounds(349, 181, 114, 20);
		label.add(aeroC1);
		
		JLabel lblNewLabel_1_1_2_1_1_1_1 = new JLabel("Aeroporto chegada:");
		lblNewLabel_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1_1_1_1.setBounds(237, 183, 124, 14);
		label.add(lblNewLabel_1_1_2_1_1_1_1);
		
		aeroS1 = new JTextField();
		aeroS1.setColumns(10);
		aeroS1.setBounds(109, 181, 118, 20);
		label.add(aeroS1);
		
		JLabel lblNewLabel_1_1_2_1_2_1 = new JLabel("Aeroporto saída:");
		lblNewLabel_1_1_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1_2_1.setBounds(10, 183, 124, 14);
		label.add(lblNewLabel_1_1_2_1_2_1);
		
		JButton btnNewButton_2 = new JButton("Concluir e inserir segundo voo no trecho");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Trecho t = new Trecho();
				if(t.validaIdentificador(id.getText())==false) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("ID inválido");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else {
					t = null;
					Aeroporto localSaida = dadosA.buscar(aeroS1.getText());
					Aeroporto localChegada = dadosA.buscar(aeroC1.getText());
					CompanhiaAerea comp = dadosComp.buscar(cnpj.getText());
					LocalDateTime dataSaida1 = LocalDateTime.of(Integer.parseInt(anoS1.getText()),Integer.parseInt(mesS1.getText()),Integer.parseInt(diaS1.getText()),Integer.parseInt(horaS1.getText()),Integer.parseInt(minS1.getText()));
					LocalDateTime dataChegada1 = LocalDateTime.of(Integer.parseInt(anoC1.getText()),Integer.parseInt(mesC1.getText()),Integer.parseInt(diaC1.getText()),Integer.parseInt(horaC1.getText()),Integer.parseInt(minC1.getText()));
					Voo voo = new Voo(Integer.parseInt(vagas1.getText()),Double.parseDouble(preco1.getText()),comp,localSaida,localChegada,dataSaida1,dataChegada1);
					CanilVoo c = new CanilVoo(Double.parseDouble(valorAnimal.getText()),Integer.parseInt(limCanil.getText()));
					Trecho tre = new Trecho(id.getText(),voo,dataSaida1,dataChegada1,c);
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								CadastroTrecho2 frame = new CadastroTrecho2(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,tre);
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
		btnNewButton_2.setBounds(201, 297, 267, 23);
		label.add(btnNewButton_2);
		
		anoC1 = new JTextField();
		anoC1.setColumns(10);
		anoC1.setBounds(401, 152, 62, 20);
		label.add(anoC1);
	}
}
