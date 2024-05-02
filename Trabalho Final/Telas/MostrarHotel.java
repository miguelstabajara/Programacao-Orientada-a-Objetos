package Telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.*;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostrarHotel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nome;
	private JTextField checkinHora;
	private JTextField checkoutHora;
	private JTextField cidade;
	private JTextField bairro;
	private JTextField rua;
	private JTextField numero;
	private JTextField mensagem;
	private JTextField pets;
	private JTextField estrelas;
	private JFrame este = this;
	private JTextField limiteS;
	private JTextField limiteD;
	private JTextField limiteT;
	private JTextField limiteL;
	private JTextField precoL;
	private JTextField precoS;
	private JTextField precoD;
	private JTextField precoT;
	private JTextField cancelamentoS;
	private JTextField cancelamentoL;

	public MostrarHotel(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP,Hotel hotel) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome de Divulgação:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 58, 120, 14);
		contentPane.add(lblNewLabel_1_1);
		
		nome = new JTextField();
		nome.setEditable(false);
		nome.setColumns(10);
		nome.setBounds(127, 56, 227, 20);
		nome.setText(hotel.getNomeDivulgacao());
		contentPane.add(nome);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Checkin:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(10, 85, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		checkinHora = new JTextField();
		checkinHora.setEditable(false);
		checkinHora.setColumns(10);
		checkinHora.setBounds(63, 83, 67, 20);
		checkinHora.setText(""+hotel.getCheckin().getHour()+":"+hotel.getCheckin().getMinute());
		contentPane.add(checkinHora);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Checkout:");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_2.setBounds(146, 86, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		checkoutHora = new JTextField();
		checkoutHora.setEditable(false);
		checkoutHora.setColumns(10);
		checkoutHora.setBounds(204, 83, 67, 20);
		checkoutHora.setText(""+hotel.getCheckout().getHour()+":"+hotel.getCheckout().getMinute());
		contentPane.add(checkoutHora);
		
		JLabel lblNewLabel = new JLabel("Detalhes Hotel");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(127, 11, 170, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Aceita pets?");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(10, 113, 74, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Estrelas:");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(10, 138, 62, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("Cidade:");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(10, 163, 48, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		cidade = new JTextField();
		cidade.setEditable(false);
		cidade.setColumns(10);
		cidade.setBounds(54, 161, 116, 20);
		cidade.setText(hotel.getEndereco().getCidade());
		contentPane.add(cidade);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("Bairro:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setBounds(170, 163, 48, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1);
		
		bairro = new JTextField();
		bairro.setEditable(false);
		bairro.setColumns(10);
		bairro.setBounds(204, 161, 116, 20);
		bairro.setText(hotel.getEndereco().getBairro());
		contentPane.add(bairro);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_2 = new JLabel("Rua:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1_2.setBounds(10, 188, 48, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_2);
		
		rua = new JTextField();
		rua.setEditable(false);
		rua.setColumns(10);
		rua.setBounds(42, 186, 151, 20);
		rua.setText(hotel.getEndereco().getRua());
		contentPane.add(rua);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_2_1 = new JLabel("Número:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1_2_1.setBounds(196, 188, 48, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_2_1);
		
		numero = new JTextField();
		numero.setEditable(false);
		numero.setColumns(10);
		numero.setBounds(243, 186, 111, 20);
		numero.setText(hotel.getEndereco().getNumero());
		contentPane.add(numero);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_2_2_1 = new JLabel("Mensagem");
		lblNewLabel_1_1_1_1_1_1_1_1_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1_2_2_1.setBounds(10, 213, 218, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_2_2_1);
		
		mensagem = new JTextField();
		mensagem.setEditable(false);
		mensagem.setColumns(10);
		mensagem.setBounds(10, 227, 358, 63);
		mensagem.setText(hotel.getMensagem());
		contentPane.add(mensagem);
		
		JButton btnNewButton = new JButton("Fechar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				este.dispose();
			}
		});
		btnNewButton.setBounds(314, 305, 89, 23);
		contentPane.add(btnNewButton);
		
		pets = new JTextField();
		pets.setEditable(false);
		pets.setBounds(83, 111, 47, 20);
		if(hotel.isPets()==true) pets.setText("Sim");
		else pets.setText("Não");
		contentPane.add(pets);
		pets.setColumns(10);
		
		estrelas = new JTextField();
		estrelas.setEditable(false);
		estrelas.setColumns(10);
		estrelas.setBounds(63, 136, 29, 20);
		estrelas.setText(""+hotel.getNumeroEstrelas());
		contentPane.add(estrelas);
		
		JLabel lblDetalhesQuartos = new JLabel("Detalhes Quartos");
		lblDetalhesQuartos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDetalhesQuartos.setBounds(445, 11, 170, 49);
		contentPane.add(lblDetalhesQuartos);
		
		JLabel lblPreoSingle_2 = new JLabel("Preço single:");
		lblPreoSingle_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2.setBounds(395, 136, 76, 14);
		contentPane.add(lblPreoSingle_2);
		
		JLabel lblPreoSingle_2_1 = new JLabel("Preço duplo:");
		lblPreoSingle_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1.setBounds(395, 161, 76, 14);
		contentPane.add(lblPreoSingle_2_1);
		
		JLabel lblPreoSingle_2_1_1 = new JLabel("Preço triplo:");
		lblPreoSingle_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1_1.setBounds(395, 186, 76, 14);
		contentPane.add(lblPreoSingle_2_1_1);
		
		JLabel lblPreoSingle_2_1_3 = new JLabel("Cancelamento:");
		lblPreoSingle_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1_3.setBounds(395, 214, 87, 14);
		contentPane.add(lblPreoSingle_2_1_3);
		
		JLabel lblPreoSingle_2_1_3_1_1 = new JLabel("Limite de pessoas luxo:");
		lblPreoSingle_2_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1_3_1_1.setBounds(395, 243, 137, 14);
		contentPane.add(lblPreoSingle_2_1_3_1_1);
		
		JLabel lblPreoSingle = new JLabel("Limite de pessoas single:");
		lblPreoSingle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle.setBounds(395, 61, 137, 14);
		contentPane.add(lblPreoSingle);
		
		limiteS = new JTextField();
		limiteS.setEditable(false);
		limiteS.setColumns(10);
		limiteS.setBounds(529, 56, 86, 20);
		limiteS.setText(hotel.getQuartos().get(1).getLimitePessoas()+"");
		contentPane.add(limiteS);
		
		JLabel lblPreoDuplo = new JLabel("Limite de pessoas duplo:");
		lblPreoDuplo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoDuplo.setBounds(395, 86, 137, 14);
		contentPane.add(lblPreoDuplo);
		
		limiteD = new JTextField();
		limiteD.setEditable(false);
		limiteD.setColumns(10);
		limiteD.setBounds(529, 83, 86, 20);
		limiteD.setText(hotel.getQuartos().get(2).getLimitePessoas()+"");
		contentPane.add(limiteD);
		
		JLabel lblPreoTriplo = new JLabel("Limite de pessoas triplo:");
		lblPreoTriplo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoTriplo.setBounds(395, 111, 137, 14);
		contentPane.add(lblPreoTriplo);
		
		limiteT = new JTextField();
		limiteT.setEditable(false);
		limiteT.setColumns(10);
		limiteT.setBounds(529, 111, 86, 20);
		limiteT.setText(hotel.getQuartos().get(3).getLimitePessoas()+"");
		contentPane.add(limiteT);
		
		limiteL = new JTextField();
		limiteL.setEditable(false);
		limiteL.setColumns(10);
		limiteL.setBounds(529, 241, 86, 20);
		limiteL.setText(hotel.getQuartos().get(0).getLimitePessoas()+"");
		contentPane.add(limiteL);
		
		JLabel lblPreoSingle_2_1_3_1_1_1 = new JLabel("Preço:");
		lblPreoSingle_2_1_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1_3_1_1_1.setBounds(395, 273, 37, 14);
		contentPane.add(lblPreoSingle_2_1_3_1_1_1);
		
		precoL = new JTextField();
		precoL.setEditable(false);
		precoL.setColumns(10);
		precoL.setBounds(434, 270, 74, 20);
		precoL.setText(hotel.getQuartos().get(0).getPreco()+"");
		contentPane.add(precoL);
		
		JLabel lblPreoSingle_2_1_3_2 = new JLabel("Cancelamento:");
		lblPreoSingle_2_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoSingle_2_1_3_2.setBounds(518, 272, 87, 14);
		contentPane.add(lblPreoSingle_2_1_3_2);
		
		precoS = new JTextField();
		precoS.setEditable(false);
		precoS.setColumns(10);
		precoS.setBounds(469, 136, 86, 20);
		precoS.setText(hotel.getQuartos().get(1).getPreco()+"");
		contentPane.add(precoS);
		
		precoD = new JTextField();
		precoD.setEditable(false);
		precoD.setColumns(10);
		precoD.setBounds(469, 161, 86, 20);
		precoD.setText(hotel.getQuartos().get(2).getPreco()+"");
		contentPane.add(precoD);
		
		precoT = new JTextField();
		precoT.setEditable(false);
		precoT.setColumns(10);
		precoT.setBounds(469, 186, 86, 20);
		precoT.setText(hotel.getQuartos().get(3).getPreco()+"");
		contentPane.add(precoT);
		
		cancelamentoS = new JTextField();
		cancelamentoS.setEditable(false);
		cancelamentoS.setColumns(10);
		cancelamentoS.setBounds(479, 211, 86, 20);
		if(hotel.getQuartos().get(1).isAceitaCancelamento()) cancelamentoS.setText("Sim");
		else cancelamentoS.setText("Não");
		contentPane.add(cancelamentoS);
		
		cancelamentoL = new JTextField();
		cancelamentoL.setEditable(false);
		cancelamentoL.setColumns(10);
		cancelamentoL.setBounds(601, 270, 48, 20);
		if(hotel.getQuartos().get(0).isAceitaCancelamento()) cancelamentoL.setText("Sim");
		else cancelamentoL.setText("Não");
		contentPane.add(cancelamentoL);
	}
}
