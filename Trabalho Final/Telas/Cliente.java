package Telas;

import java.awt.EventQueue;
import Classes.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField BotaoMensagem;
	private JFrame este = this;

	public Cliente(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BotaoCadastrar = new JButton("Cadastrar");
		BotaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ClienteCadastro frame = new ClienteCadastro(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		BotaoCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BotaoCadastrar.setBounds(77, 78, 120, 50);
		contentPane.add(BotaoCadastrar);
		
		JButton BotaoComprar = new JButton("Comprar Voo");
		BotaoComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								ClienteCompra frame = new ClienteCompra(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
								frame.setVisible(true);
								este.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
			}
		});
		BotaoComprar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BotaoComprar.setBounds(49, 139, 148, 50);
		contentPane.add(BotaoComprar);
		
		JButton BotaoConsulta = new JButton("Consultar Compras");
		BotaoConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ClienteConsulta frame = new ClienteConsulta(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		BotaoConsulta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		BotaoConsulta.setBounds(207, 78, 170, 50);
		contentPane.add(BotaoConsulta);
		
		BotaoMensagem = new JTextField();
		BotaoMensagem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BotaoMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		BotaoMensagem.setText("Seu bem-estar é nosso principal objetivo!");
		BotaoMensagem.setEditable(false);
		BotaoMensagem.setBounds(93, 11, 250, 50);
		contentPane.add(BotaoMensagem);
		BotaoMensagem.setColumns(10);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnFazerReserva = new JButton("Reserva de Hotel");
		btnFazerReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ClienteReserva frame = new ClienteReserva(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnFazerReserva.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFazerReserva.setBounds(207, 139, 170, 50);
		contentPane.add(btnFazerReserva);
		
		JButton btnCancelarReserva = new JButton("Cancelar Reserva");
		btnCancelarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ClienteCancelarReserva frame = new ClienteCancelarReserva(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnCancelarReserva.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancelarReserva.setBounds(133, 200, 170, 50);
		contentPane.add(btnCancelarReserva);
	}
}
