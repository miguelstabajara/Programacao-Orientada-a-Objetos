package Telas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Classes.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ClienteReserva1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField hotel1;
	private JTextField hotel2;
	private JTextField hotel3;
	private JFrame este = this;

	public ClienteReserva1(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP,ArrayList<Hotel> h,LocalDateTime dataChegada,LocalDateTime dataSaida,int quant,String tipo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha da Reserva");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(152, 11, 94, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hotel:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 37, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		hotel1 = new JTextField();
		hotel1.setEditable(false);
		hotel1.setBounds(46, 34, 378, 20);
		hotel1.setText(h.get(0).getNomeDivulgacao());
		contentPane.add(hotel1);
		hotel1.setColumns(10);
		
		JButton escolher1 = new JButton("Escolher");
		escolher1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PagamentoReserva frame = new PagamentoReserva(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,h.get(0),dataChegada,dataSaida,quant,tipo);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		escolher1.setBounds(335, 58, 89, 23);
		contentPane.add(escolher1);
		
		JButton detalhe1 = new JButton("Detalhes");
		detalhe1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							MostrarHotel frame = new MostrarHotel(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,h.get(0));
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		detalhe1.setBounds(236, 58, 89, 23);
		contentPane.add(detalhe1);
		
		JButton escolher2 = new JButton("Escolher");
		escolher2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PagamentoReserva frame = new PagamentoReserva(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,h.get(1),dataChegada,dataSaida,quant,tipo);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		escolher2.setBounds(335, 111, 89, 23);
		contentPane.add(escolher2);
		
		JButton detalhe2 = new JButton("Detalhes");
		detalhe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							MostrarHotel frame = new MostrarHotel(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,h.get(1));
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		detalhe2.setBounds(236, 111, 89, 23);
		contentPane.add(detalhe2);
		
		hotel2 = new JTextField();
		hotel2.setEditable(false);
		hotel2.setColumns(10);
		hotel2.setBounds(46, 87, 378, 20);
		hotel2.setText(h.get(1).getNomeDivulgacao());
		contentPane.add(hotel2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Hotel:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 90, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JButton escolher3 = new JButton("Escolher");
		escolher3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PagamentoReserva frame = new PagamentoReserva(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,h.get(2),dataChegada,dataSaida,quant,tipo);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		escolher3.setBounds(335, 169, 89, 23);
		contentPane.add(escolher3);
		
		JButton detalhe3 = new JButton("Detalhes");
		detalhe3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							MostrarHotel frame = new MostrarHotel(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,h.get(2));
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		detalhe3.setBounds(236, 169, 89, 23);
		contentPane.add(detalhe3);
		
		hotel3 = new JTextField();
		hotel3.setEditable(false);
		hotel3.setColumns(10);
		hotel3.setBounds(46, 145, 378, 20);
		hotel3.setText(h.get(2).getNomeDivulgacao());
		contentPane.add(hotel3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Hotel:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(10, 148, 46, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		JButton btnNewButton_3 = new JButton("Cancelar");
		btnNewButton_3.addActionListener(new ActionListener() {
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
		btnNewButton_3.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_3);
	}

}
