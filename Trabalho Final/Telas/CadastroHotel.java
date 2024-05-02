package Telas;

import java.awt.EventQueue;
import java.time.LocalTime;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Classes.*;
public class CadastroHotel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomeOficial;
	private JTextField mensagem;
	private JTextField nomeDivulgacao;
	private JTextField cnpj;
	private JTextField anoCriacao;
	private JTextField checkinHora;
	private JTextField checkoutHora;
	private JTextField numParceiro;
	private JTextField cidades;
	private JTextField bairro;
	private JTextField rua;
	private JTextField numero;
	private JFrame este = this;
	private JTextField checkinMin;
	private JTextField checkoutMin;

	public CadastroHotel(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro do Hotel");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(102, 0, 227, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Oficial:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 54, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome de Divulgação:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 79, 120, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CNPJ:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 104, 120, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Ano de criação:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 129, 120, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Checkin:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(10, 154, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Checkout:");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_2.setBounds(146, 155, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Aceita pets?");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(10, 204, 82, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JComboBox pets = new JComboBox();
		pets.setModel(new DefaultComboBoxModel(new String[] {"Sim ", "Não"}));
		pets.setBounds(102, 201, 55, 22);
		contentPane.add(pets);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Estrelas:");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(10, 229, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JComboBox estrelas = new JComboBox();
		estrelas.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		estrelas.setBounds(63, 226, 48, 22);
		contentPane.add(estrelas);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("Cidade:");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(10, 254, 48, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("Bairro:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setBounds(170, 254, 48, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_2 = new JLabel("Rua:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1_2.setBounds(10, 279, 48, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_2_1 = new JLabel("Número:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1_2_1.setBounds(196, 279, 48, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_2_1);
		
		nomeOficial = new JTextField();
		nomeOficial.setBounds(94, 52, 227, 20);
		contentPane.add(nomeOficial);
		nomeOficial.setColumns(10);
		
		mensagem = new JTextField();
		mensagem.setColumns(10);
		mensagem.setBounds(10, 318, 358, 63);
		contentPane.add(mensagem);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_2_2_1 = new JLabel("Mensagem");
		lblNewLabel_1_1_1_1_1_1_1_1_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1_2_2_1.setBounds(10, 304, 218, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_2_2_1);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(10, 392, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnFinalizar = new JButton("Próxima etapa");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dadosF.buscarParceiro(numParceiro.getText())==null){
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("O funcionário com este número de carteira não existe ou não é funcionário parceiro");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else {
					FuncionarioParceiro func = dadosF.buscarParceiro(numParceiro.getText());
					Endereco end = new Endereco(rua.getText(),bairro.getText(),cidades.getText(),numero.getText());
					LocalTime checko = LocalTime.of(Integer.parseInt(checkoutHora.getText()),Integer.parseInt(checkoutMin.getText()));
					LocalTime checki = LocalTime.of(Integer.parseInt(checkinHora.getText()),Integer.parseInt(checkinMin.getText()));
					boolean pet;
					if(pets.getSelectedItem().toString().equals("Sim")) pet = true;
					else pet = false;
					int est = Integer.parseInt(estrelas.getSelectedItem().toString());
					Hotel hotel = new Hotel(cnpj.getText(),nomeOficial.getText(),nomeDivulgacao.getText(),mensagem.getText(),Integer.parseInt(anoCriacao.getText()),checki,checko,est,pet,end,func);
					func.addHotel(hotel);
					hotel.setFuncionarioParceiro(func);
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								CadastroQuartosHotel frame = new CadastroQuartosHotel(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,hotel);
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
		btnFinalizar.setBounds(204, 392, 161, 23);
		contentPane.add(btnFinalizar);
		
		nomeDivulgacao = new JTextField();
		nomeDivulgacao.setColumns(10);
		nomeDivulgacao.setBounds(127, 77, 227, 20);
		contentPane.add(nomeDivulgacao);
		
		cnpj = new JTextField();
		cnpj.setColumns(10);
		cnpj.setBounds(42, 102, 227, 20);
		contentPane.add(cnpj);
		
		anoCriacao = new JTextField();
		anoCriacao.setColumns(10);
		anoCriacao.setBounds(102, 127, 227, 20);
		contentPane.add(anoCriacao);
		
		checkinHora = new JTextField();
		checkinHora.setColumns(10);
		checkinHora.setBounds(63, 152, 29, 20);
		contentPane.add(checkinHora);
		
		checkoutHora = new JTextField();
		checkoutHora.setColumns(10);
		checkoutHora.setBounds(204, 152, 29, 20);
		contentPane.add(checkoutHora);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_2_2_2 = new JLabel("Num da carteira do funcionário parceiro:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1_2_2_2.setBounds(10, 179, 218, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_2_2_2);
		
		numParceiro = new JTextField();
		numParceiro.setColumns(10);
		numParceiro.setBounds(238, 177, 116, 20);
		contentPane.add(numParceiro);
		
		cidades = new JTextField();
		cidades.setColumns(10);
		cidades.setBounds(54, 252, 116, 20);
		contentPane.add(cidades);
		
		bairro = new JTextField();
		bairro.setColumns(10);
		bairro.setBounds(204, 252, 116, 20);
		contentPane.add(bairro);
		
		rua = new JTextField();
		rua.setColumns(10);
		rua.setBounds(42, 277, 151, 20);
		contentPane.add(rua);
		
		numero = new JTextField();
		numero.setColumns(10);
		numero.setBounds(243, 277, 111, 20);
		contentPane.add(numero);
		
		checkinMin = new JTextField();
		checkinMin.setColumns(10);
		checkinMin.setBounds(102, 152, 29, 20);
		contentPane.add(checkinMin);
		
		checkoutMin = new JTextField();
		checkoutMin.setColumns(10);
		checkoutMin.setBounds(243, 152, 29, 20);
		contentPane.add(checkoutMin);
	}
}
