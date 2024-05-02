package Telas;
import Classes.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Administrativo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame este = this;
	
	public Administrativo(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarHotel = new JButton("Cadastrar Funcionário");
		btnCadastrarHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							CadastroFuncionario frame = new CadastroFuncionario(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnCadastrarHotel.setBounds(123, 88, 183, 27);
		btnCadastrarHotel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnCadastrarHotel);
		
		JLabel lblNewLabel = new JLabel("Administração de voos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(123, 124, 205, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblAdministraoDeHoteis = new JLabel("Administração de hoteis");
		lblAdministraoDeHoteis.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdministraoDeHoteis.setBounds(129, 23, 205, 32);
		contentPane.add(lblAdministraoDeHoteis);
		
		JButton btnNewButton_5 = new JButton("Finalizar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Principal frame = new Principal(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_5.setBounds(328, 223, 96, 27);
		contentPane.add(btnNewButton_5);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(85, 55, 289, 22);
		contentPane.add(menuBar);
		
		JLabel lblNewLabel_1 = new JLabel("Menu Hotel  ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							CadastroHotel frame = new CadastroHotel(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alterar quartos");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							AlteraQuartos frame = new AlteraQuartos(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		menuBar.add(btnNewButton_1);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(10, 167, 440, 22);
		contentPane.add(menuBar_1);
		
		JLabel lblNewLabel_2 = new JLabel("Companhia Aerea  ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar_1.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Cadastrar");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							CadastroCompanhia frame = new CadastroCompanhia(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		menuBar_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cadastrar Trecho");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							CadastroTrecho frame = new CadastroTrecho(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		menuBar_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Alterar Trecho");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							AlteraTrecho frame = new AlteraTrecho(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		menuBar_1.add(btnNewButton_4);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setBounds(10, 200, 334, 22);
		contentPane.add(menuBar_2);
		
		JLabel lblNewLabel_3 = new JLabel("Aeroporto  ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar_2.add(lblNewLabel_3);
		
		JButton btnCadastrarAeroporto = new JButton("Cadastrar");
		menuBar_2.add(btnCadastrarAeroporto);
		btnCadastrarAeroporto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							CadastroAeroporto frame = new CadastroAeroporto(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnCadastrarAeroporto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton_6 = new JButton("Consultar");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ConsultaAeroporto frame = new ConsultaAeroporto(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		menuBar_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Remover");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							RemoverAeroporto frame = new RemoverAeroporto(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		menuBar_2.add(btnNewButton_7);
	}
}
