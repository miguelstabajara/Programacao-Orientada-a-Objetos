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

public class ClienteConsulta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tipo1;
	private JTextField descricao11;
	private JTextField descricao12;
	private JTextField valor1;
	private JTextField descricao22;
	private JTextField valor2;
	private JTextField descricao21;
	private JTextField tipo2;
	private JTextField descricao32;
	private JTextField valor3;
	private JTextField descricao31;
	private JTextField tipo3;
	private JButton btnNewButton;
	private JFrame este = this;
	private JTextField cpf;

	public ClienteConsulta(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 39, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descrição:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 64, 60, 14);
		contentPane.add(lblNewLabel_1_1);
		
		tipo1 = new JTextField();
		tipo1.setEnabled(false);
		tipo1.setBounds(46, 36, 76, 20);
		contentPane.add(tipo1);
		tipo1.setColumns(10);
		
		descricao11 = new JTextField();
		descricao11.setEnabled(false);
		descricao11.setColumns(10);
		descricao11.setBounds(71, 61, 353, 20);
		contentPane.add(descricao11);
		
		descricao12 = new JTextField();
		descricao12.setEnabled(false);
		descricao12.setColumns(10);
		descricao12.setBounds(64, 89, 360, 20);
		contentPane.add(descricao12);
		
		JLabel lblNewLabel_2 = new JLabel("Valor:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 120, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		valor1 = new JTextField();
		valor1.setEnabled(false);
		valor1.setColumns(10);
		valor1.setBounds(47, 117, 86, 20);
		contentPane.add(valor1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Valor:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(10, 232, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		descricao22 = new JTextField();
		descricao22.setEnabled(false);
		descricao22.setColumns(10);
		descricao22.setBounds(64, 201, 360, 20);
		contentPane.add(descricao22);
		
		valor2 = new JTextField();
		valor2.setEnabled(false);
		valor2.setColumns(10);
		valor2.setBounds(47, 229, 86, 20);
		contentPane.add(valor2);
		
		descricao21 = new JTextField();
		descricao21.setEnabled(false);
		descricao21.setColumns(10);
		descricao21.setBounds(71, 173, 353, 20);
		contentPane.add(descricao21);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Descrição:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 176, 60, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		tipo2 = new JTextField();
		tipo2.setEnabled(false);
		tipo2.setColumns(10);
		tipo2.setBounds(45, 148, 77, 20);
		contentPane.add(tipo2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tipo:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 151, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Valor:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(10, 341, 46, 14);
		contentPane.add(lblNewLabel_2_2);
		
		descricao32 = new JTextField();
		descricao32.setEnabled(false);
		descricao32.setColumns(10);
		descricao32.setBounds(64, 310, 360, 20);
		contentPane.add(descricao32);
		
		valor3 = new JTextField();
		valor3.setEnabled(false);
		valor3.setColumns(10);
		valor3.setBounds(47, 338, 86, 20);
		contentPane.add(valor3);
		
		descricao31 = new JTextField();
		descricao31.setEnabled(false);
		descricao31.setColumns(10);
		descricao31.setBounds(71, 282, 353, 20);
		contentPane.add(descricao31);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Descrição:");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(10, 285, 60, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		tipo3 = new JTextField();
		tipo3.setEnabled(false);
		tipo3.setColumns(10);
		tipo3.setBounds(47, 257, 86, 20);
		contentPane.add(tipo3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tipo:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 260, 33, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_3 = new JLabel("-------------------------------------------------------------------------------------------------------");
		lblNewLabel_3.setBounds(10, 134, 414, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("-------------------------------------------------------------------------------------------------------");
		lblNewLabel_3_1.setBounds(10, 245, 414, 14);
		contentPane.add(lblNewLabel_3_1);
		
		btnNewButton = new JButton("Encerrar");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(240, 372, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 14, 33, 14);
		contentPane.add(lblNewLabel);
		
		cpf = new JTextField();
		cpf.setColumns(10);
		cpf.setBounds(36, 11, 129, 20);
		contentPane.add(cpf);
		
		JButton btnNewButton_1 = new JButton("Procurar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes c = dadosC.buscar(cpf.getText());
				if(c==null) {
					StringBuilder mensagem = new StringBuilder();
				    mensagem.append("CPF inválido");
				    JOptionPane.showMessageDialog(null, mensagem);
				}else {
					if(c.getCompras().size()==0);
					else if(c.getCompras().size()==1) {
						if(c.getCompras().get(0).getQuantidadePassagens()==0) {
							tipo1.setText("Reserva");
							descricao11.setText("Hotel: "+c.getCompras().get(0).getReserva().getQuarto().getHotel().getNomeDivulgacao()+" | Cidade: "+c.getCompras().get(0).getReserva().getQuarto().getHotel().getEndereco().getCidade());
							descricao12.setText("Chegada: "+c.getCompras().get(0).getReserva().getInicio().toLocalDate().toString()+" | Saida: "+c.getCompras().get(0).getReserva().getFim().toLocalDate().toString());
							valor1.setText(c.getCompras().get(0).getValorTotal()+"");
						}else {
							tipo1.setText("Passagem");
							descricao11.setText("Saida: "+c.getCompras().get(0).getPassagemAerea().getLocalSaida().getNome()+" | Destino: "+c.getCompras().get(0).getPassagemAerea().getLocalChegada().getNome());
							descricao12.setText("Saida: "+c.getCompras().get(0).getPassagemAerea().getHorarioSaida().toLocalDate().toString()+" | Chegada: "+c.getCompras().get(0).getPassagemAerea().getHorarioChegada().toLocalDate().toString());
							valor1.setText(c.getCompras().get(0).getValorTotal()+"");
						}
					}else if(c.getCompras().size()==2) {
						if(c.getCompras().get(0).getQuantidadePassagens()==0) {
							tipo1.setText("Reserva");
							descricao11.setText("Hotel: "+c.getCompras().get(0).getReserva().getQuarto().getHotel().getNomeDivulgacao()+" | Cidade: "+c.getCompras().get(0).getReserva().getQuarto().getHotel().getEndereco().getCidade());
							descricao12.setText("Chegada: "+c.getCompras().get(0).getReserva().getInicio().toLocalDate().toString()+" | Saida: "+c.getCompras().get(0).getReserva().getFim().toLocalDate().toString());
							valor1.setText(c.getCompras().get(0).getValorTotal()+"");
						}else {
							tipo1.setText("Passagem");
							descricao11.setText("Saida: "+c.getCompras().get(0).getPassagemAerea().getLocalSaida().getNome()+" | Destino: "+c.getCompras().get(0).getPassagemAerea().getLocalChegada().getNome());
							descricao12.setText("Saida: "+c.getCompras().get(0).getPassagemAerea().getHorarioSaida().toLocalDate().toString()+" | Chegada: "+c.getCompras().get(0).getPassagemAerea().getHorarioChegada().toLocalDate().toString());
							valor1.setText(c.getCompras().get(0).getValorTotal()+"");
						}
						if(c.getCompras().get(1).getQuantidadePassagens()==0) {
							tipo2.setText("Reserva");
							descricao21.setText("Hotel: "+c.getCompras().get(1).getReserva().getQuarto().getHotel().getNomeDivulgacao()+" | Cidade: "+c.getCompras().get(1).getReserva().getQuarto().getHotel().getEndereco().getCidade());
							descricao22.setText("Chegada: "+c.getCompras().get(1).getReserva().getInicio().toLocalDate().toString()+" | Saida: "+c.getCompras().get(1).getReserva().getFim().toLocalDate().toString());
							valor2.setText(c.getCompras().get(1).getValorTotal()+"");
						}else {
							tipo2.setText("Passagem");
							descricao21.setText("Saida: "+c.getCompras().get(1).getPassagemAerea().getLocalSaida().getNome()+" | Destino: "+c.getCompras().get(1).getPassagemAerea().getLocalChegada().getNome());
							descricao22.setText("Saida: "+c.getCompras().get(1).getPassagemAerea().getHorarioSaida().toLocalDate().toString()+" | Chegada: "+c.getCompras().get(1).getPassagemAerea().getHorarioChegada().toLocalDate().toString());
							valor2.setText(c.getCompras().get(1).getValorTotal()+"");
						}
					}else {
						if(c.getCompras().get(c.getCompras().size()-1).getQuantidadePassagens()==0) {
							tipo1.setText("Reserva");
							descricao11.setText("Hotel: "+c.getCompras().get(c.getCompras().size()-1).getReserva().getQuarto().getHotel().getNomeDivulgacao()+" | Cidade: "+c.getCompras().get(c.getCompras().size()-1).getReserva().getQuarto().getHotel().getEndereco().getCidade());
							descricao12.setText("Chegada: "+c.getCompras().get(c.getCompras().size()-1).getReserva().getInicio().toLocalDate().toString()+" | Saida: "+c.getCompras().get(c.getCompras().size()-1).getReserva().getFim().toLocalDate().toString());
							valor1.setText(c.getCompras().get(c.getCompras().size()-1).getValorTotal()+"");
						}else {
							tipo1.setText("Passagem");
							descricao11.setText("Saida: "+c.getCompras().get(c.getCompras().size()-1).getPassagemAerea().getLocalSaida().getNome()+" | Destino: "+c.getCompras().get(c.getCompras().size()-1).getPassagemAerea().getLocalChegada().getNome());
							descricao12.setText("Saida: "+c.getCompras().get(c.getCompras().size()-1).getPassagemAerea().getHorarioSaida().toLocalDate().toString()+" | Chegada: "+c.getCompras().get(c.getCompras().size()-1).getPassagemAerea().getHorarioChegada().toLocalDate().toString());
							valor1.setText(c.getCompras().get(c.getCompras().size()-1).getValorTotal()+"");
						}
						if(c.getCompras().get(c.getCompras().size()-2).getQuantidadePassagens()==0) {
							tipo2.setText("Reserva");
							descricao21.setText("Hotel: "+c.getCompras().get(c.getCompras().size()-2).getReserva().getQuarto().getHotel().getNomeDivulgacao()+" | Cidade: "+c.getCompras().get(c.getCompras().size()-2).getReserva().getQuarto().getHotel().getEndereco().getCidade());
							descricao22.setText("Chegada: "+c.getCompras().get(c.getCompras().size()-2).getReserva().getInicio().toLocalDate().toString()+" | Saida: "+c.getCompras().get(c.getCompras().size()-2).getReserva().getFim().toLocalDate().toString());
							valor2.setText(c.getCompras().get(c.getCompras().size()-2).getValorTotal()+"");
						}else {
							tipo2.setText("Passagem");
							descricao21.setText("Saida: "+c.getCompras().get(c.getCompras().size()-2).getPassagemAerea().getLocalSaida().getNome()+" | Destino: "+c.getCompras().get(c.getCompras().size()-2).getPassagemAerea().getLocalChegada().getNome());
							descricao22.setText("Saida: "+c.getCompras().get(c.getCompras().size()-2).getPassagemAerea().getHorarioSaida().toLocalDate().toString()+" | Chegada: "+c.getCompras().get(c.getCompras().size()-2).getPassagemAerea().getHorarioChegada().toLocalDate().toString());
							valor2.setText(c.getCompras().get(c.getCompras().size()-2).getValorTotal()+"");
						}
						if(c.getCompras().get(c.getCompras().size()-3).getQuantidadePassagens()==0) {
							tipo2.setText("Reserva");
							descricao31.setText("Hotel: "+c.getCompras().get(c.getCompras().size()-3).getReserva().getQuarto().getHotel().getNomeDivulgacao()+" | Cidade: "+c.getCompras().get(c.getCompras().size()-3).getReserva().getQuarto().getHotel().getEndereco().getCidade());
							descricao32.setText("Chegada: "+c.getCompras().get(c.getCompras().size()-3).getReserva().getInicio().toLocalDate().toString()+" | Saida: "+c.getCompras().get(c.getCompras().size()-3).getReserva().getFim().toLocalDate().toString());
							valor2.setText(c.getCompras().get(c.getCompras().size()-3).getValorTotal()+"");
						}else {
							tipo2.setText("Passagem");
							descricao31.setText("Saida: "+c.getCompras().get(c.getCompras().size()-3).getPassagemAerea().getLocalSaida().getNome()+" | Destino: "+c.getCompras().get(c.getCompras().size()-3).getPassagemAerea().getLocalChegada().getNome());
							descricao32.setText("Saida: "+c.getCompras().get(c.getCompras().size()-3).getPassagemAerea().getHorarioSaida().toLocalDate().toString()+" | Chegada: "+c.getCompras().get(c.getCompras().size()-3).getPassagemAerea().getHorarioChegada().toLocalDate().toString());
							valor2.setText(c.getCompras().get(c.getCompras().size()-3).getValorTotal()+"");
						}
					}
				}
			}
		});
		btnNewButton_1.setBounds(339, 372, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
