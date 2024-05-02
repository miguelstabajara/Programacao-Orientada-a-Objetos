package Telas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Classes.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ClienteCancelarReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cpf;
	private JTextField hotel;
	private JFrame este = this;

	public ClienteCancelarReserva(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 171);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cancelar Reserva");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(165, 11, 96, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF do Cliente:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 33, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hotel da Reserva:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 58, 96, 14);
		contentPane.add(lblNewLabel_2);
		
		cpf = new JTextField();
		cpf.setBounds(101, 31, 136, 20);
		contentPane.add(cpf);
		cpf.setColumns(10);
		
		hotel = new JTextField();
		hotel.setColumns(10);
		hotel.setBounds(111, 56, 126, 20);
		contentPane.add(hotel);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes c = dadosC.buscar(cpf.getText());
				if(c==null) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("CPF inválido");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else{
					for(int i = 0;i<c.getCompras().size();i++) {
						if(c.getCompras().get(i).getQuantidadeReserva()!=0&&c.getCompras().get(i).getReserva().getQuarto().getHotel().getNomeDivulgacao().equals(hotel.getText())) {
							if(c.getCompras().get(i).getReserva().getQuarto().isAceitaCancelamento()) {
								c.getCompras().get(i).getReserva().getQuarto().cancelamentoReserva(c.getCompras().get(i).getReserva());
								c.getCompras().remove(i);
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
							}else {
								StringBuilder mensagem = new StringBuilder();
							    mensagem.append("O hotel não permite cancelamento");
							    JOptionPane.showMessageDialog(null, mensagem);
							}
						}
					}
				}
			}
		});
		btnNewButton.setBounds(335, 98, 89, 23);
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
		btnNewButton_1.setBounds(236, 98, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
