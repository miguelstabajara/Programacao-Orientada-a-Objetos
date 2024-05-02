package Telas;

import java.awt.EventQueue;
import Classes.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.DadosAeroporto;
import Classes.DadosClientes;
import Classes.DadosCompanhiaAerea;
import Classes.DadosFuncionarios;
import Classes.DadosHoteis;
import Classes.DadosPesquisa;
import Classes.DadosTrechoVoo;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PagamentoFinalVoo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cvv;
	private JTextField validade;
	private JTextField valor;
	private JTextField num;
	private JFrame este = this;

	public PagamentoFinalVoo(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP,Compra compra) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cvv = new JTextField();
		cvv.setForeground(Color.LIGHT_GRAY);
		cvv.setColumns(10);
		cvv.setBounds(194, 91, 30, 20);
		contentPane.add(cvv);
		
		validade = new JTextField();
		validade.setForeground(Color.LIGHT_GRAY);
		validade.setColumns(10);
		validade.setBounds(60, 91, 86, 20);
		contentPane.add(validade);
		
		JLabel lblNewLabel_2_2 = new JLabel("Validade:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(10, 94, 99, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2 = new JLabel("Número do cartão:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 69, 115, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("Preço Total:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 41, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		valor = new JTextField();
		valor.setEditable(false);
		valor.setColumns(10);
		valor.setBounds(80, 38, 86, 20);
		valor.setText(compra.getValorTotal()+"");
		contentPane.add(valor);
		
		num = new JTextField();
		num.setForeground(Color.LIGHT_GRAY);
		num.setColumns(10);
		num.setBounds(117, 66, 113, 20);
		contentPane.add(num);
		
		JLabel lblNewLabel = new JLabel("Pagamento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(90, 11, 113, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cvv.getText().length()!=3) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("CVV inválido");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else if(num.getText().length()!=16) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("Numero do cartão inválido");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else if(validade.getText().length()!=7) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("Validade inválida");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else{
					compra.decrementaVagaVoo();//Ultimo ajuste
					compra.getCliente().addCompra(compra);
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
			}
		});
		btnNewButton.setBounds(141, 134, 89, 23);
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
		btnNewButton_1.setBounds(44, 134, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("CVV:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(157, 93, 46, 14);
		contentPane.add(lblNewLabel_1);
	}

}
