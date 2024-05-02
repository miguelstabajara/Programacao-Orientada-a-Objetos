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

public class ConsultaAeroporto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nome;
	private JTextField cidade;
	private JTextField rua;
	private JTextField num;
	private JTextField bairro;
	private JFrame este = this;

	public ConsultaAeroporto(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta Aeroporto");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(139, 11, 124, 37);
		contentPane.add(lblNewLabel);
		
		nome = new JTextField();
		nome.setBounds(170, 46, 176, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Insira o nome do aeroporto:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 48, 184, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel c = new JLabel("Cidade:");
		c.setFont(new Font("Tahoma", Font.PLAIN, 12));
		c.setBounds(10, 79, 71, 14);
		contentPane.add(c);
		
		cidade = new JTextField();
		cidade.setEditable(false);
		cidade.setColumns(10);
		cidade.setBounds(53, 77, 166, 20);
		contentPane.add(cidade);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Rua:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(10, 104, 71, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		rua = new JTextField();
		rua.setEditable(false);
		rua.setColumns(10);
		rua.setBounds(36, 102, 183, 20);
		contentPane.add(rua);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Número:");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(229, 107, 71, 14);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		num = new JTextField();
		num.setEditable(false);
		num.setColumns(10);
		num.setBounds(277, 104, 147, 20);
		contentPane.add(num);
		
		bairro = new JTextField();
		bairro.setEditable(false);
		bairro.setColumns(10);
		bairro.setBounds(267, 79, 157, 20);
		contentPane.add(bairro);
		
		JLabel lblNewLabel_1_2 = new JLabel("Bairro:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(229, 82, 71, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JButton pesquisar = new JButton("Pesquisar");
		pesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dadosA.buscar(nome.getText())!=null) {
					Aeroporto aero = dadosA.buscar(nome.getText());
					cidade.setText(aero.getEndereco().getCidade());
					bairro.setText(aero.getEndereco().getBairro());
					rua.setText(aero.getEndereco().getRua());
					num.setText(aero.getEndereco().getNumero());
					aero = null;
				}else {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("Aeroporto não encontrado");
				    JOptionPane.showMessageDialog(null, mensagem);
				}
			}
		});
		pesquisar.setBounds(335, 135, 89, 23);
		contentPane.add(pesquisar);
		
		JButton cancelar = new JButton("Voltar");
		cancelar.addActionListener(new ActionListener() {
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
		cancelar.setBounds(229, 135, 89, 23);
		contentPane.add(cancelar);
	}
}
