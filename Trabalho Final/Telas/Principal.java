package Telas;

import java.awt.EventQueue;
import Classes.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame este=this;
	
	public static void main(String[] args) {
		DadosAeroporto dadosA = new DadosAeroporto();
		DadosClientes dadosC = new DadosClientes();
		DadosFuncionarios dadosF = new DadosFuncionarios();
		DadosHoteis dadosH = new DadosHoteis();
		DadosTrechoVoo dadosT = new DadosTrechoVoo();
		DadosCompanhiaAerea dadosComp = new DadosCompanhiaAerea();
		DadosPesquisa dadosP = new DadosPesquisa(); 
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Principal(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ambiente do Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Cliente cli = new Cliente(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							cli.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(121, 81, 181, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ambiente Administrativo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Administrativo adm = new Administrativo(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							adm.setVisible(true);
							este.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(121, 163, 181, 51);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Bem-vindo ao Udi-Decola!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(95, 24, 262, 46);
		contentPane.add(lblNewLabel);
		
	}
}
