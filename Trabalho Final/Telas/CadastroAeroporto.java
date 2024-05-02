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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class CadastroAeroporto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomeOficial;
	private JTextField cidade;
	private JTextField rua;
	private JTextField bairro;
	private JTextField numero;
	private JFrame este = this;

	public CadastroAeroporto(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 206);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeAeroporto = new JLabel("Cadastro de Aeroporto");
		lblCadastroDeAeroporto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastroDeAeroporto.setBounds(119, 0, 195, 49);
		contentPane.add(lblCadastroDeAeroporto);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Oficial:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 51, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cidade:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 76, 71, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Bairro:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(229, 79, 71, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Rua:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(10, 101, 71, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Número:");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(229, 104, 71, 14);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		nomeOficial = new JTextField();
		nomeOficial.setBounds(83, 49, 341, 20);
		contentPane.add(nomeOficial);
		nomeOficial.setColumns(10);
		
		cidade = new JTextField();
		cidade.setColumns(10);
		cidade.setBounds(53, 74, 166, 20);
		contentPane.add(cidade);
		
		rua = new JTextField();
		rua.setColumns(10);
		rua.setBounds(36, 99, 183, 20);
		contentPane.add(rua);
		
		bairro = new JTextField();
		bairro.setColumns(10);
		bairro.setBounds(267, 76, 157, 20);
		contentPane.add(bairro);
		
		numero = new JTextField();
		numero.setColumns(10);
		numero.setBounds(277, 101, 147, 20);
		contentPane.add(numero);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(dadosA.buscar(nomeOficial.getText())!=null) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("Este aeroporto já existe");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else {
					Endereco end = new Endereco(rua.getText(),bairro.getText(),cidade.getText(),numero.getText());
					Aeroporto aer = new Aeroporto(nomeOficial.getText(),end);
					dadosA.cadastrar(aer);
					Persistencia.gravar(dadosA, "C:\\Users\\migue\\OneDrive - Universidade Federal de Uberlândia\\Documentos\\POO1\\Práticas\\Trabalho pt2\\aeroporto.dat");
					Connection conexao;
					try {
						conexao = new ConexaoBanco().conexao();
						String sql = "insert into UdiDecola (nome,cidade,bairro,rua,num) values ('"+nomeOficial.getText()+"','"+cidade.getText()+"','"+bairro.getText()+"','"+rua.getText()+"',"+numero.getText()+"); ";
						PreparedStatement statement = conexao.prepareStatement(sql);
						statement.execute();
						conexao.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Administrativo frame = new Administrativo(dadosA,dadosC,dadosF,dadosH,dadosT,dadosComp,dadosP);
							frame.setVisible(true);
							este.dispose();
						} catch (Exception e2) {
							e2.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setBounds(335, 133, 89, 23);
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
		btnNewButton_1.setBounds(239, 133, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
