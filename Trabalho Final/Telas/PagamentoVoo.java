package Telas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Classes.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PagamentoVoo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cpf;
	private JTextField animal;
	private JFrame este = this;

	public PagamentoVoo(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP,Trecho trecho,int quant) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados Finais");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(96, 11, 115, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Forma de pagamento:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 72, 136, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Incluir vaga para seu animal:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(10, 97, 170, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("CPF do Cliente:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 47, 115, 14);
		contentPane.add(lblNewLabel_3);
		
		cpf = new JTextField();
		cpf.setBounds(95, 45, 116, 20);
		contentPane.add(cpf);
		cpf.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nome do Animal:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 122, 115, 14);
		contentPane.add(lblNewLabel_4);
		
		animal = new JTextField();
		animal.setBounds(106, 122, 137, 20);
		contentPane.add(animal);
		animal.setColumns(10);
		double valorTotal = 0;

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sim", "Não"}));
		comboBox.setBounds(165, 94, 65, 22);
		contentPane.add(comboBox);
		
		JComboBox pagamento = new JComboBox();
		pagamento.setModel(new DefaultComboBoxModel(new String[] {"Crédito", "Débito"}));
		pagamento.setBounds(135, 69, 95, 22);
		contentPane.add(pagamento);
		
		JButton btnNewButton = new JButton("Ir para pagamento");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dadosC.buscar(cpf.getText())==null) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("CPF inválido");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else {
					Clientes c = dadosC.buscar(cpf.getText());
					if(comboBox.getSelectedItem().toString()=="Sim") if(trecho.getCanil().addClienteEAnimal(c,animal.getText())==false) {
						StringBuilder mensagem = new StringBuilder();
					    mensagem.append("Vagas insuficientes para o canil");
					    JOptionPane.showMessageDialog(null, mensagem);
					}
					Compra compra = new Compra(c,trecho,quant,0,pagamento.getSelectedItem().toString());
					compra.calculaValorPassagem();
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									PagamentoFinalVoo frame = new PagamentoFinalVoo(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP,compra);
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
		btnNewButton.setBounds(113, 155, 136, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
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
		btnCancelar.setBounds(10, 156, 93, 23);
		contentPane.add(btnCancelar);
	
	}
}
