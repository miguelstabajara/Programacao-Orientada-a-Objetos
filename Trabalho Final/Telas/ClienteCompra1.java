package Telas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import Classes.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClienteCompra1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField trecho1;
	private JTextField valor1;
	private JTextField trecho2;
	private JTextField valor2;
	private JTextField trecho3;
	private JTextField valor3;
	private JFrame este = this;

	public ClienteCompra1(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP,ArrayList<Trecho> t,int quant) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha do Voo");
		lblNewLabel.setBounds(172, 11, 103, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Trecho:");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		trecho1 = new JTextField();
		trecho1.setEditable(false);
		trecho1.setBounds(62, 33, 362, 20);
		String saida1,chegada1,saida2,chegada2;
		
			if(t.get(0).getVoo().size() == 1) {
				saida1 = t.get(0).getVoo().get(0).getLocalSaida().getEndereco().getCidade();
				chegada1 = t.get(0).getVoo().get(0).getLocalChegada().getEndereco().getCidade();
				trecho1.setText("Voo: "+saida1+"->"+chegada1);
			} else {
				saida1 = t.get(0).getVoo().get(0).getLocalSaida().getEndereco().getCidade();
				chegada1 = t.get(0).getVoo().get(0).getLocalChegada().getEndereco().getCidade();
				saida2 = t.get(0).getVoo().get(1).getLocalSaida().getEndereco().getCidade();
				chegada2 = t.get(0).getVoo().get(1).getLocalChegada().getEndereco().getCidade();
				trecho1.setText(saida1+"->"+chegada1+" || "+saida2+"->"+chegada2);
			}
		
		contentPane.add(trecho1);
		trecho1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Valor:");
		lblNewLabel_2.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		valor1 = new JTextField();
		valor1.setEditable(false);
		valor1.setBounds(52, 58, 86, 20);
			if(t.get(0).getVoo().size()==2) {
				valor1.setText((t.get(0).getVoo().get(0).getPreco()+t.get(0).getVoo().get(1).getPreco())+"");
			}else {
				valor1.setText(t.get(0).getVoo().get(0).getPreco()+"");
			}
		contentPane.add(valor1);
		valor1.setColumns(10);
		
		JButton escolher1 = new JButton("Escolher");
		escolher1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								PagamentoVoo frame = new PagamentoVoo(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,t.get(0),quant);
								frame.setVisible(true);
								este.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
			}
		});
		escolher1.setBounds(335, 57, 89, 23);
		contentPane.add(escolher1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Trecho:");
		lblNewLabel_1_1.setBounds(10, 89, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		trecho2 = new JTextField();
		trecho2.setEditable(false);
		trecho2.setColumns(10);
		trecho2.setBounds(62, 86, 362, 20);
			if(t.get(1).getVoo().size()==2) {
				saida1 = t.get(1).getVoo().get(0).getLocalSaida().getEndereco().getCidade();
				chegada1 = t.get(1).getVoo().get(0).getLocalChegada().getEndereco().getCidade();
				saida2 = t.get(1).getVoo().get(1).getLocalSaida().getEndereco().getCidade();
				chegada2 = t.get(1).getVoo().get(1).getLocalChegada().getEndereco().getCidade();
				trecho2.setText(saida1+"->"+chegada1+" || "+saida2+"->"+chegada2);
			}else {
				saida1 = t.get(1).getVoo().get(0).getLocalSaida().getEndereco().getCidade();
				chegada1 = t.get(1).getVoo().get(0).getLocalChegada().getEndereco().getCidade();
				trecho2.setText("Voo: "+saida1+"->"+chegada1);
			}
		
		contentPane.add(trecho2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Valor:");
		lblNewLabel_2_1.setBounds(10, 114, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		valor2 = new JTextField();
		valor2.setEditable(false);
		valor2.setColumns(10);
		valor2.setBounds(52, 111, 86, 20);
		
			if(t.get(1).getVoo().size()==2) {
				valor2.setText((t.get(1).getVoo().get(0).getPreco()+t.get(1).getVoo().get(1).getPreco())+"");
			}else {
				valor2.setText(t.get(1).getVoo().get(0).getPreco()+"");
			}
		
		contentPane.add(valor2);
		
		JButton escolher2 = new JButton("Escolher");
		escolher2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PagamentoVoo frame = new PagamentoVoo(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,t.get(1),quant);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		escolher2.setBounds(335, 110, 89, 23);
		contentPane.add(escolher2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Trecho:");
		lblNewLabel_1_1_1.setBounds(10, 142, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		trecho3 = new JTextField();
		trecho3.setEditable(false);
		trecho3.setColumns(10);
		trecho3.setBounds(62, 139, 362, 20);

			if(t.get(2).getVoo().size()==2) {
				saida1 = t.get(2).getVoo().get(0).getLocalSaida().getEndereco().getCidade();
				chegada1 = t.get(2).getVoo().get(0).getLocalChegada().getEndereco().getCidade();
				saida2 = t.get(2).getVoo().get(1).getLocalSaida().getEndereco().getCidade();
				chegada2 = t.get(2).getVoo().get(1).getLocalChegada().getEndereco().getCidade();
				trecho3.setText(saida1+"->"+chegada1+" || "+saida2+"->"+chegada2);
			}else {
				saida1 = t.get(2).getVoo().get(0).getLocalSaida().getEndereco().getCidade();
				chegada1 = t.get(2).getVoo().get(0).getLocalChegada().getEndereco().getCidade();
				trecho3.setText("Voo: "+saida1+"->"+chegada1);
			}
		
		contentPane.add(trecho3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Valor:");
		lblNewLabel_2_1_1.setBounds(10, 167, 46, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		valor3 = new JTextField();
		valor3.setEditable(false);
		valor3.setColumns(10);
		valor3.setBounds(52, 164, 86, 20);
		
			if(t.get(2).getVoo().size()==2) {
				valor3.setText((t.get(2).getVoo().get(0).getPreco()+t.get(2).getVoo().get(1).getPreco())+"");
			}else {
				valor3.setText(t.get(2).getVoo().get(0).getPreco()+"");
			}
		
		contentPane.add(valor3);
		
		JButton escolher3 = new JButton("Escolher");
		escolher3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PagamentoVoo frame = new PagamentoVoo(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,t.get(2),quant);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		escolher3.setBounds(335, 163, 89, 23);
		contentPane.add(escolher3);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.addActionListener(new ActionListener() {
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
		btnNewButton_2.setBounds(335, 197, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton detalhe1 = new JButton("Detalhes");
		detalhe1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							MostraVoo frame = new MostraVoo(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,t.get(0));
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		detalhe1.setBounds(233, 57, 89, 23);
		contentPane.add(detalhe1);
		
		JButton detalhe2 = new JButton("Detalhes");
		detalhe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							MostraVoo frame = new MostraVoo(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,t.get(1));
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		detalhe2.setBounds(233, 110, 89, 23);
		contentPane.add(detalhe2);
		
		JButton detalhe3 = new JButton("Detalhes");
		detalhe3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							MostraVoo frame = new MostraVoo(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,t.get(2));
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		detalhe3.setBounds(233, 163, 89, 23);
		contentPane.add(detalhe3);
	}

}
