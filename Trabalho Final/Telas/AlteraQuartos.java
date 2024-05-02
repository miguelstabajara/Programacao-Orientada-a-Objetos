package Telas;
import Classes.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AlteraQuartos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cnpj;
	private JTextField quantidadeS;
	private JTextField precoS;
	private JTextField precoD;
	private JTextField precoT;
	private JTextField precoL;
	private JTextField descontoS;
	private JTextField quantidadeL;
	private JTextField descontoL;
	private JFrame este = this;
	
	public AlteraQuartos(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCnpjDoHotel = new JLabel("CNPJ do Hotel:");
		lblCnpjDoHotel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCnpjDoHotel.setBounds(10, 34, 93, 14);
		contentPane.add(lblCnpjDoHotel);
		
		JLabel lblQuantidadeStandard = new JLabel("Quantidade Standard:");
		lblQuantidadeStandard.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuantidadeStandard.setBounds(10, 59, 127, 14);
		contentPane.add(lblQuantidadeStandard);
		
		JLabel lblPreoSingle = new JLabel("Preço single:");
		lblPreoSingle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle.setBounds(10, 81, 75, 14);
		contentPane.add(lblPreoSingle);
		
		JLabel lblPreoDuplo = new JLabel("Preço duplo:");
		lblPreoDuplo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoDuplo.setBounds(10, 106, 75, 14);
		contentPane.add(lblPreoDuplo);
		
		JLabel lblPreoTriplo = new JLabel("Preço triplo:");
		lblPreoTriplo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoTriplo.setBounds(10, 131, 75, 14);
		contentPane.add(lblPreoTriplo);
		
		JLabel lblLimiteDePessoas_2_1 = new JLabel("Desconto:");
		lblLimiteDePessoas_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLimiteDePessoas_2_1.setBounds(10, 159, 65, 14);
		contentPane.add(lblLimiteDePessoas_2_1);
		
		JLabel lblQuantidadeLuxo = new JLabel("Quantidade Luxo:");
		lblQuantidadeLuxo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuantidadeLuxo.setBounds(10, 186, 127, 14);
		contentPane.add(lblQuantidadeLuxo);
		
		JLabel lblLimiteDePessoas_1_1 = new JLabel("Preço:");
		lblLimiteDePessoas_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLimiteDePessoas_1_1.setBounds(10, 214, 43, 14);
		contentPane.add(lblLimiteDePessoas_1_1);
		
		JLabel lblLimiteDePessoas_1_2 = new JLabel("Desconto:");
		lblLimiteDePessoas_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLimiteDePessoas_1_2.setBounds(10, 242, 65, 14);
		contentPane.add(lblLimiteDePessoas_1_2);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dadosH.buscar(cnpj.getText())==null) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("Hotel não encontrado ou CNPJ incorreto");
				    JOptionPane.showMessageDialog(null, mensagem);
				}
				else {
					Hotel hotel = dadosH.buscar(cnpj.getText());
					hotel.getQuartos().get(0).setPreco(Double.parseDouble(precoL.getText()));
					hotel.getQuartos().get(0).setDesconto(Double.parseDouble(descontoL.getText()));
					hotel.getQuartos().get(0).setQuantidadeQuartos(Integer.parseInt(quantidadeL.getText()));
					hotel.getQuartos().get(0).setPrecoDesconto();
					
					hotel.getQuartos().get(1).setPreco(Double.parseDouble(precoS.getText()));
					hotel.getQuartos().get(1).setDesconto(Double.parseDouble(descontoS.getText()));
					hotel.getQuartos().get(1).setQuantidadeQuartos(Integer.parseInt(quantidadeS.getText()));
					hotel.getQuartos().get(1).setPrecoDesconto();
					
					hotel.getQuartos().get(2).setPreco(Double.parseDouble(precoD.getText()));
					hotel.getQuartos().get(2).setDesconto(Double.parseDouble(descontoS.getText()));
					hotel.getQuartos().get(2).setQuantidadeQuartos(Integer.parseInt(quantidadeS.getText()));
					hotel.getQuartos().get(2).setPrecoDesconto();
					
					hotel.getQuartos().get(3).setPreco(Double.parseDouble(precoT.getText()));
					hotel.getQuartos().get(3).setDesconto(Double.parseDouble(descontoS.getText()));
					hotel.getQuartos().get(3).setQuantidadeQuartos(Integer.parseInt(quantidadeS.getText()));
					hotel.getQuartos().get(3).setPrecoDesconto();
					
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
		btnNewButton.setBounds(259, 279, 89, 23);
		contentPane.add(btnNewButton);
		
		cnpj = new JTextField();
		cnpj.setBounds(94, 32, 86, 20);
		contentPane.add(cnpj);
		cnpj.setColumns(10);
		
		quantidadeS = new JTextField();
		quantidadeS.setColumns(10);
		quantidadeS.setBounds(133, 57, 86, 20);
		contentPane.add(quantidadeS);
		
		precoS = new JTextField();
		precoS.setColumns(10);
		precoS.setBounds(81, 78, 55, 20);
		contentPane.add(precoS);
		
		precoD = new JTextField();
		precoD.setColumns(10);
		precoD.setBounds(81, 103, 55, 20);
		contentPane.add(precoD);
		
		precoT = new JTextField();
		precoT.setColumns(10);
		precoT.setBounds(81, 128, 55, 20);
		contentPane.add(precoT);
		
		precoL = new JTextField();
		precoL.setColumns(10);
		precoL.setBounds(47, 211, 89, 20);
		contentPane.add(precoL);
		
		descontoS = new JTextField();
		descontoS.setColumns(10);
		descontoS.setBounds(70, 157, 89, 20);
		contentPane.add(descontoS);
		
		quantidadeL = new JTextField();
		quantidadeL.setColumns(10);
		quantidadeL.setBounds(111, 184, 89, 20);
		contentPane.add(quantidadeL);
		
		descontoL = new JTextField();
		descontoL.setColumns(10);
		descontoL.setBounds(70, 240, 89, 20);
		contentPane.add(descontoL);
		
		JLabel lblNewLabel = new JLabel("Alterar Quartos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(111, 11, 113, 14);
		contentPane.add(lblNewLabel);
		
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
		btnNewButton_1.setBounds(160, 279, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
