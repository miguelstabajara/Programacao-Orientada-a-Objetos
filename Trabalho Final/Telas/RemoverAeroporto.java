package Telas;

import java.awt.EventQueue;

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

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoverAeroporto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame este = this;
	private JTextField nome;

	public RemoverAeroporto(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton cancelar = new JButton("Remover");
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dadosA.buscar(nome.getText())!=null) {
					dadosA.excluir(nome.getText());
					Persistencia.gravar(dadosA, "C:\\Users\\migue\\OneDrive - Universidade Federal de Uberlândia\\Documentos\\POO1\\Práticas\\Trabalho pt2\\aeroporto.dat");
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("Aeroporto removido com sucesso");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("Aeroporto não encontrado");
				    JOptionPane.showMessageDialog(null, mensagem);
				}
			}
		});
		cancelar.setBounds(257, 66, 89, 23);
		contentPane.add(cancelar);
		
		JLabel lblNewLabel = new JLabel("Remover Aeroporto");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(103, 0, 154, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira o nome do aeroporto:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 37, 184, 14);
		contentPane.add(lblNewLabel_1);
		
		nome = new JTextField();
		nome.setColumns(10);
		nome.setBounds(170, 35, 176, 20);
		contentPane.add(nome);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
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
		btnVoltar.setBounds(158, 66, 89, 23);
		contentPane.add(btnVoltar);
	}

}
