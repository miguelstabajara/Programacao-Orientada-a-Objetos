package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import Classes.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class CadastroQuartosHotel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField quantidadeS;
	private JTextField limiteS;
	private JTextField limiteD;
	private JTextField limiteT;
	private JTextField precoS;
	private JTextField precoD;
	private JTextField precoT;
	private JTextField descontoS;
	private JTextField quantidadeL;
	private JTextField limiteL;
	private JTextField precoL;
	private JTextField descontoL;
	private JFrame este = this;

	public CadastroQuartosHotel(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP,Hotel hotel) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Cadastro = new JLabel("Cadastro de Quartos");
		Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Cadastro.setBounds(129, 0, 227, 38);
		contentPane.add(Cadastro);
		
		JLabel lblNewLabel = new JLabel("Quantidade Standard:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 35, 137, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPreoSingle = new JLabel("Limite de pessoas single:");
		lblPreoSingle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle.setBounds(10, 60, 137, 14);
		contentPane.add(lblPreoSingle);
		
		JLabel lblPreoDuplo = new JLabel("Limite de pessoas duplo:");
		lblPreoDuplo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoDuplo.setBounds(10, 85, 137, 14);
		contentPane.add(lblPreoDuplo);
		
		JLabel lblPreoTriplo = new JLabel("Limite de pessoas triplo:");
		lblPreoTriplo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoTriplo.setBounds(10, 110, 137, 14);
		contentPane.add(lblPreoTriplo);
		
		JLabel lblPreoSingle_2 = new JLabel("Preço single:");
		lblPreoSingle_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2.setBounds(227, 60, 76, 14);
		contentPane.add(lblPreoSingle_2);
		
		JLabel lblPreoSingle_2_1 = new JLabel("Preço duplo:");
		lblPreoSingle_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1.setBounds(227, 85, 76, 14);
		contentPane.add(lblPreoSingle_2_1);
		
		JLabel lblPreoSingle_2_1_1 = new JLabel("Preço triplo:");
		lblPreoSingle_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1_1.setBounds(227, 110, 76, 14);
		contentPane.add(lblPreoSingle_2_1_1);
		
		JLabel lblPreoSingle_2_1_2 = new JLabel("Desconto:");
		lblPreoSingle_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1_2.setBounds(10, 135, 57, 14);
		contentPane.add(lblPreoSingle_2_1_2);
		
		JLabel lblPreoSingle_2_1_3 = new JLabel("Cancelamento:");
		lblPreoSingle_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1_3.setBounds(10, 160, 87, 14);
		contentPane.add(lblPreoSingle_2_1_3);
		
		JLabel lblPreoSingle_2_1_3_1 = new JLabel("Quantidade Luxo:");
		lblPreoSingle_2_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1_3_1.setBounds(10, 185, 113, 14);
		contentPane.add(lblPreoSingle_2_1_3_1);
		
		JLabel lblPreoSingle_2_1_3_1_1 = new JLabel("Limite de pessoas luxo:");
		lblPreoSingle_2_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1_3_1_1.setBounds(10, 210, 137, 14);
		contentPane.add(lblPreoSingle_2_1_3_1_1);
		
		JLabel lblPreoSingle_2_1_3_1_1_1 = new JLabel("Preço:");
		lblPreoSingle_2_1_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1_3_1_1_1.setBounds(227, 210, 37, 14);
		contentPane.add(lblPreoSingle_2_1_3_1_1_1);
		
		JLabel lblPreoSingle_2_1_2_1 = new JLabel("Desconto:");
		lblPreoSingle_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1_2_1.setBounds(10, 235, 57, 14);
		contentPane.add(lblPreoSingle_2_1_2_1);
		
		JLabel lblPreoSingle_2_1_3_2 = new JLabel("Cancelamento:");
		lblPreoSingle_2_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1_3_2.setBounds(10, 260, 87, 14);
		contentPane.add(lblPreoSingle_2_1_3_2);
		
		quantidadeS = new JTextField();
		quantidadeS.setBounds(139, 33, 86, 20);
		contentPane.add(quantidadeS);
		quantidadeS.setColumns(10);
		
		limiteS = new JTextField();
		limiteS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		limiteS.setColumns(10);
		limiteS.setBounds(150, 57, 67, 20);
		contentPane.add(limiteS);
		
		limiteD = new JTextField();
		limiteD.setFont(new Font("Tahoma", Font.PLAIN, 12));
		limiteD.setColumns(10);
		limiteD.setBounds(150, 82, 67, 20);
		contentPane.add(limiteD);
		
		limiteT = new JTextField();
		limiteT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		limiteT.setColumns(10);
		limiteT.setBounds(143, 107, 76, 20);
		contentPane.add(limiteT);
		
		precoS = new JTextField();
		precoS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		precoS.setColumns(10);
		precoS.setBounds(304, 57, 86, 20);
		contentPane.add(precoS);
		
		precoD = new JTextField();
		precoD.setFont(new Font("Tahoma", Font.PLAIN, 12));
		precoD.setColumns(10);
		precoD.setBounds(304, 82, 86, 20);
		contentPane.add(precoD);
		
		precoT = new JTextField();
		precoT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		precoT.setColumns(10);
		precoT.setBounds(304, 107, 86, 20);
		contentPane.add(precoT);
		
		descontoS = new JTextField();
		descontoS.setColumns(10);
		descontoS.setBounds(77, 133, 86, 20);
		contentPane.add(descontoS);
		
		quantidadeL = new JTextField();
		quantidadeL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		quantidadeL.setColumns(10);
		quantidadeL.setBounds(123, 182, 86, 20);
		contentPane.add(quantidadeL);
		
		limiteL = new JTextField();
		limiteL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		limiteL.setColumns(10);
		limiteL.setBounds(143, 207, 67, 20);
		contentPane.add(limiteL);
		
		precoL = new JTextField();
		precoL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		precoL.setColumns(10);
		precoL.setBounds(270, 207, 86, 20);
		contentPane.add(precoL);
		
		descontoL = new JTextField();
		descontoL.setColumns(10);
		descontoL.setBounds(73, 233, 86, 20);
		contentPane.add(descontoL);
		
		JComboBox cancelamentoS = new JComboBox();
		cancelamentoS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cancelamentoS.setModel(new DefaultComboBoxModel(new String[] {"Sim", "Não"}));
		cancelamentoS.setBounds(101, 156, 62, 22);
		contentPane.add(cancelamentoS);
		
		JComboBox cancelamentoL = new JComboBox();
		cancelamentoL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cancelamentoL.setModel(new DefaultComboBoxModel(new String[] {"Sim", "Não"}));
		cancelamentoL.setBounds(101, 256, 62, 22);
		contentPane.add(cancelamentoL);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				boolean cancelL,cancelS;
				if(cancelamentoL.getSelectedItem().toString()=="Sim") cancelL = true;
				else cancelL = false;
				if(cancelamentoS.getSelectedItem().toString()=="Sim") cancelS = true;
				else cancelS = true;
				//Seta informações do quarto luxo
				hotel.getQuartos().get(0).setHotel(hotel);
				hotel.getQuartos().get(0).setQuantidadeQuartos(Integer.parseInt(quantidadeL.getText()));
				hotel.getQuartos().get(0).setLimitePessoas(Integer.parseInt(limiteL.getText()));
				hotel.getQuartos().get(0).setAceitaCancelamento(cancelL);
				hotel.getQuartos().get(0).setDesconto(Double.parseDouble(descontoL.getText()));
				hotel.getQuartos().get(0).setPreco(Double.parseDouble(precoL.getText()));
				hotel.getQuartos().get(0).setPrecoDesconto();
				//Seta informações do quarto single
				hotel.getQuartos().get(1).setHotel(hotel);
				hotel.getQuartos().get(1).setQuantidadeQuartos(Integer.parseInt(quantidadeS.getText()));
				hotel.getQuartos().get(1).setLimitePessoas(Integer.parseInt(limiteS.getText()));
				hotel.getQuartos().get(1).setAceitaCancelamento(cancelS);
				hotel.getQuartos().get(1).setDesconto(Double.parseDouble(descontoS.getText()));
				hotel.getQuartos().get(1).setPreco(Double.parseDouble(precoS.getText()));
				hotel.getQuartos().get(1).setPrecoDesconto();
				//Seta informações do quarto duplo
				hotel.getQuartos().get(2).setHotel(hotel);
				hotel.getQuartos().get(2).setQuantidadeQuartos(Integer.parseInt(quantidadeS.getText()));
				hotel.getQuartos().get(2).setLimitePessoas(Integer.parseInt(limiteD.getText()));
				hotel.getQuartos().get(2).setAceitaCancelamento(cancelS);
				hotel.getQuartos().get(2).setDesconto(Double.parseDouble(descontoS.getText()));
				hotel.getQuartos().get(2).setPreco(Double.parseDouble(precoD.getText()));
				hotel.getQuartos().get(2).setPrecoDesconto();
				//Seta informações do quarto duplo
				hotel.getQuartos().get(3).setHotel(hotel);
				hotel.getQuartos().get(3).setQuantidadeQuartos(Integer.parseInt(quantidadeS.getText()));
				hotel.getQuartos().get(3).setLimitePessoas(Integer.parseInt(limiteT.getText()));
				hotel.getQuartos().get(3).setAceitaCancelamento(cancelS);
				hotel.getQuartos().get(3).setDesconto(Double.parseDouble(descontoS.getText()));
				hotel.getQuartos().get(3).setPreco(Double.parseDouble(precoT.getText()));
				hotel.getQuartos().get(3).setPrecoDesconto();
				
				dadosH.cadastrar(hotel);
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
		btnNewButton.setBounds(337, 281, 87, 23);
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
		btnNewButton_1.setBounds(238, 281, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
