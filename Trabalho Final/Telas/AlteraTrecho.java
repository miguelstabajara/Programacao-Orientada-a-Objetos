package Telas;
import Classes.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlteraTrecho extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;
	private JTextField valor1;
	private JTextField valor2;
	private JTextField valorC;
	private JFrame este = this;

	public AlteraTrecho(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlterarTrechoDe = new JLabel("Alterar Trecho de Voo");
		lblAlterarTrechoDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAlterarTrechoDe.setBounds(122, 0, 185, 40);
		contentPane.add(lblAlterarTrechoDe);
		
		JLabel lblNewLabel_1 = new JLabel("Identificador:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 41, 85, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Novo valor para o voo 1:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 66, 157, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Novo valor para o voo 2(Opcional):");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 91, 195, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Novo valor para vaga do canil:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 116, 173, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		id = new JTextField();
		id.setBounds(87, 39, 86, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		valor1 = new JTextField();
		valor1.setColumns(10);
		valor1.setBounds(149, 64, 86, 20);
		contentPane.add(valor1);
		
		valor2 = new JTextField();
		valor2.setColumns(10);
		valor2.setBounds(205, 89, 86, 20);
		contentPane.add(valor2);
		
		valorC = new JTextField();
		valorC.setColumns(10);
		valorC.setBounds(175, 114, 86, 20);
		contentPane.add(valorC);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dadosT.buscar(id.getText())==null) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("Trecho não encontrado ou ID incorreto");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else {
					Trecho trecho = dadosT.buscar(id.getText());
					trecho.getCanil().setPrecoAnimal(Double.parseDouble(valorC.getText()));
					trecho.getVoo().get(0).setPreco(Double.parseDouble(valor1.getText()));
					trecho.getVoo().get(1).setPreco(Double.parseDouble(valor2.getText()));
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
			}
		});
		btnNewButton.setBounds(335, 136, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
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
		btnNewButton_1.setBounds(236, 136, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
