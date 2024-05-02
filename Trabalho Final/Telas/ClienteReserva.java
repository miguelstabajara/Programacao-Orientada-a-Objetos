package Telas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import Classes.*;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class ClienteReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cidade;
	private JTextField diaC;
	private JTextField mesC;
	private JTextField anoC;
	private JTextField diaS;
	private JTextField mesS;
	private JTextField anoS;
	private JFrame este=this;
	private JLabel lblNewLabel_2;
	private JTextField quantidade;
	private JComboBox comboBox;
	private JLabel lblNewLabel_3;
	
	
	public ClienteReserva(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 253, 278);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pesquisa Reserva");
		lblNewLabel.setBounds(83, 11, 91, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cidade:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 40, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Data de chegada:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 65, 102, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Data de saída:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 90, 89, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
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
		btnNewButton_1.setBounds(10, 190, 89, 23);
		contentPane.add(btnNewButton_1);
		
		cidade = new JTextField();
		cidade.setBounds(51, 37, 162, 20);
		contentPane.add(cidade);
		cidade.setColumns(10);
		
		diaC = new JTextField();
		diaC.setColumns(10);
		diaC.setBounds(114, 65, 25, 20);
		contentPane.add(diaC);
		
		mesC = new JTextField();
		mesC.setColumns(10);
		mesC.setBounds(148, 65, 25, 20);
		contentPane.add(mesC);
		
		anoC = new JTextField();
		anoC.setColumns(10);
		anoC.setBounds(183, 65, 44, 20);
		contentPane.add(anoC);
		
		diaS = new JTextField();
		diaS.setColumns(10);
		diaS.setBounds(100, 90, 25, 20);
		contentPane.add(diaS);
		
		mesS = new JTextField();
		mesS.setColumns(10);
		mesS.setBounds(134, 90, 25, 20);
		contentPane.add(mesS);
		
		anoS = new JTextField();
		anoS.setColumns(10);
		anoS.setBounds(169, 90, 44, 20);
		contentPane.add(anoS);
		
		lblNewLabel_2 = new JLabel("Quantidade:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 118, 65, 14);
		contentPane.add(lblNewLabel_2);
		
		quantidade = new JTextField();
		quantidade.setColumns(10);
		quantidade.setBounds(83, 115, 42, 20);
		contentPane.add(quantidade);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Luxo", "Single", "Duplo", "Triplo"}));
		comboBox.setBounds(100, 140, 89, 22);
		contentPane.add(comboBox);
		
		
		JButton btnNewButton_1_1 = new JButton("Pesquisar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cidadeD = cidade.getText();
				int diaChegada = Integer.parseInt(diaC.getText()),mesChegada = Integer.parseInt(mesC.getText()),anoChegada = Integer.parseInt(anoC.getText());
				int diaSaida = Integer.parseInt(diaS.getText()),mesSaida = Integer.parseInt(mesS.getText()),anoSaida = Integer.parseInt(anoS.getText());
				LocalDateTime dataChegada = LocalDateTime.of(anoChegada,mesChegada,diaChegada,0,0);
				LocalDateTime dataSaida = LocalDateTime.of(anoSaida,mesSaida,diaSaida,0,0);
				int quant = Integer.parseInt(quantidade.getText());
				String tipo = comboBox.getSelectedItem().toString();
				LocalDate data1 = LocalDate.of(anoSaida,mesSaida,diaSaida);
				Pesquisa pesq = new Pesquisa(cidadeD,data1);
				dadosP.cadastrar(pesq);
				ArrayList<Hotel> h = dadosH.buscar3(cidadeD,dataChegada,dataSaida,quant,tipo);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ClienteReserva1 frame = new ClienteReserva1(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,h,dataChegada,dataSaida,quant,tipo);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_1_1.setBounds(125, 190, 102, 23);
		contentPane.add(btnNewButton_1_1);
		
		lblNewLabel_3 = new JLabel("Tipo de quarto:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 143, 91, 14);
		contentPane.add(lblNewLabel_3);
	}
}
