package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Classes.*;
import java.time.LocalDateTime;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PagamentoReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cpf;
	private JTextField preco;
	private JFrame este = this;
	private JTextField cartao;
	private JTextField validade;
	private JTextField cvv;
	private Compra cmp; 
	private Clientes cli;

	public PagamentoReserva(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP,Hotel hotel,LocalDateTime dataChegada,LocalDateTime dataSaida,int quant,String tipo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JComboBox pagamento = new JComboBox();
		pagamento.setModel(new DefaultComboBoxModel(new String[] {"Crédito", "Débito"}));
		pagamento.setBounds(122, 50, 73, 22);
		contentPane.add(pagamento);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnNewButton = new JButton("Finalizar Compra");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dadosC.buscar(cpf.getText())==null) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("CPF inválido");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else {
					cli.addCompra(cmp);
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Cliente frame = new Cliente(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
								frame.setVisible(true);
								este.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}						}
					});
				}
			}
		});
		btnNewButton.setBounds(288, 130, 136, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("CPF do Cliente:");
		lblNewLabel_3.setBounds(10, 29, 115, 14);
		contentPane.add(lblNewLabel_3);
		
		cpf = new JTextField();
		cpf.setColumns(10);
		cpf.setBounds(87, 26, 116, 20);
		contentPane.add(cpf);
		
		JLabel lblNewLabel_1 = new JLabel("Forma de pagamento:");
		lblNewLabel_1.setBounds(10, 54, 136, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("Preço Total:");
		lblNewLabel_5.setBounds(10, 82, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		preco = new JTextField();
		preco.setEditable(false);
		preco.setColumns(10);
		preco.setBounds(87, 79, 86, 20);
		contentPane.add(preco);
		
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
		btnNewButton_1.setBounds(26, 130, 89, 23);
		contentPane.add(btnNewButton_1);
		
		cartao = new JTextField();
		cartao.setText("0000000000000000");
		cartao.setForeground(Color.LIGHT_GRAY);
		cartao.setColumns(10);
		cartao.setBounds(311, 54, 113, 20);
		contentPane.add(cartao);
		
		JLabel lblNewLabel_2 = new JLabel("Número do cartão:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(204, 57, 115, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Validade:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(204, 82, 99, 14);
		contentPane.add(lblNewLabel_2_2);
		
		validade = new JTextField();
		validade.setText("MM/AAAA");
		validade.setForeground(Color.LIGHT_GRAY);
		validade.setColumns(10);
		validade.setBounds(254, 79, 86, 20);
		contentPane.add(validade);
		
		JLabel lblNewLabel_1_1 = new JLabel("CVV:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(351, 81, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		cvv = new JTextField();
		cvv.setText("000");
		cvv.setForeground(Color.LIGHT_GRAY);
		cvv.setColumns(10);
		cvv.setBounds(388, 79, 30, 20);
		contentPane.add(cvv);
		
		JButton exibir = new JButton("Procurar Cliente");
		exibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes c = dadosC.buscar(cpf.getText());
				if(c==null) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("CPF inválido");
				    JOptionPane.showMessageDialog(null, mensagem);
				}
				else{
					dataChegada.withMinute(hotel.getCheckin().getMinute());
					dataChegada.withHour(hotel.getCheckin().getHour());
					dataSaida.withMinute(hotel.getCheckout().getMinute());
					dataSaida.withHour(hotel.getCheckout().getHour());
					Quarto q = null;
					if(tipo.equals("Luxo")) q = hotel.getQuartos().get(0);
					else if(tipo.equals("Single")) q = hotel.getQuartos().get(1);
					else if(tipo.equals("Duplo")) q = hotel.getQuartos().get(2);
					else if(tipo.equals("Triplo")) q = hotel.getQuartos().get(3);
					Reserva r = new Reserva(dataChegada,dataSaida,q);
					q.addReserva(r,quant);
					Compra compra = new Compra(c,r,q,0,quant,pagamento.getSelectedItem().toString());
					compra.calculaValorHotel();
					cmp = compra;
					cli = c;
					preco.setText(compra.getValorTotal()+"");
				}
			}
		});
		exibir.setBounds(141, 130, 123, 23);
		contentPane.add(exibir);
		
	}

}
