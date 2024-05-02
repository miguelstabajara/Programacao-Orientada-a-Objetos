package Telas;

import java.time.LocalDateTime;
import Classes.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostraVoo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;
	private JTextField preco1;
	private JTextField horaS1;
	private JTextField horaC1;
	private JTextField diaS1;
	private JTextField diaC1;
	private JTextField aeroC1;
	private JTextField aeroS1;
	private JTextField horaS2;
	private JTextField horaC2;
	private JTextField diaS2;
	private JTextField diaC2;
	private JTextField aeroS2;
	private JTextField aeroC2;
	private JTextField preco2;
	private JTextField valorCanil;
	private JFrame este = this;
	private JTextField companhia;
	private JLabel lael;
	
	public MostraVoo(DadosAeroporto dadosA,DadosClientes dadosC,DadosFuncionarios dadosF,DadosHoteis dadosH,DadosTrechoVoo dadosT,DadosCompanhiaAerea dadosComp,DadosPesquisa dadosP,Trecho t) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDetalhesDoTrecho = new JLabel("Detalhes do Trecho");
		lblDetalhesDoTrecho.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDetalhesDoTrecho.setBounds(130, 11, 166, 49);
		contentPane.add(lblDetalhesDoTrecho);
		
		JLabel lblNewLabel_1 = new JLabel("Identificador:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 58, 85, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Dados do voo 1:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 108, 109, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Preço:");
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_2.setBounds(10, 212, 71, 14);
		contentPane.add(lblNewLabel_1_1_2_2);
		
		id = new JTextField();
		id.setEditable(false);
		id.setColumns(10);
		id.setBounds(84, 56, 86, 20);
		contentPane.add(id);
		
		preco1 = new JTextField();
		preco1.setEditable(false);
		preco1.setColumns(10);
		preco1.setBounds(48, 210, 86, 20);
		contentPane.add(preco1);
		
		JLabel lblNewLabel_1_1_2_2_1_1_1 = new JLabel("Valor do canil:");
		lblNewLabel_1_1_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_2_1_1_1.setBounds(10, 83, 85, 14);
		contentPane.add(lblNewLabel_1_1_2_2_1_1_1);
		
		JLabel lblNewLabel_1_1_2_5_2 = new JLabel("Horário Saida:");
		lblNewLabel_1_1_2_5_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_5_2.setBounds(10, 131, 85, 14);
		contentPane.add(lblNewLabel_1_1_2_5_2);
		
		horaS1 = new JTextField();
		horaS1.setEditable(false);
		horaS1.setColumns(10);
		horaS1.setBounds(90, 129, 80, 20);
		contentPane.add(horaS1);
		
		JLabel HORA = new JLabel("Horário Chegada");
		HORA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		HORA.setBounds(187, 131, 103, 14);
		contentPane.add(HORA);
		
		horaC1 = new JTextField();
		horaC1.setEditable(false);
		horaC1.setColumns(10);
		horaC1.setBounds(282, 129, 79, 20);
		contentPane.add(horaC1);
		
		JLabel lblNewLabel_1_1_2_5_1_2 = new JLabel("Data Saida");
		lblNewLabel_1_1_2_5_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_5_1_2.setBounds(10, 156, 71, 14);
		contentPane.add(lblNewLabel_1_1_2_5_1_2);
		
		diaS1 = new JTextField();
		diaS1.setEditable(false);
		diaS1.setToolTipText("");
		diaS1.setColumns(10);
		diaS1.setBounds(71, 152, 124, 20);
		contentPane.add(diaS1);
		
		JLabel lblNewLabel_1_1_2_5_1_1_1 = new JLabel("Data Chegada:");
		lblNewLabel_1_1_2_5_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_5_1_1_1.setBounds(226, 156, 100, 14);
		contentPane.add(lblNewLabel_1_1_2_5_1_1_1);
		
		diaC1 = new JTextField();
		diaC1.setEditable(false);
		diaC1.setToolTipText("");
		diaC1.setColumns(10);
		diaC1.setBounds(311, 152, 124, 20);
		contentPane.add(diaC1);
		
		aeroC1 = new JTextField();
		aeroC1.setEditable(false);
		aeroC1.setColumns(10);
		aeroC1.setBounds(349, 181, 114, 20);
		contentPane.add(aeroC1);
		
		JLabel lblNewLabel_1_1_2_1_1_1_1 = new JLabel("Aeroporto chegada:");
		lblNewLabel_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1_1_1_1.setBounds(237, 183, 124, 14);
		contentPane.add(lblNewLabel_1_1_2_1_1_1_1);
		
		aeroS1 = new JTextField();
		aeroS1.setEditable(false);
		aeroS1.setColumns(10);
		aeroS1.setBounds(109, 181, 118, 20);
		contentPane.add(aeroS1);
		
		JLabel lblNewLabel_1_1_2_1_2_1 = new JLabel("Aeroporto saída:");
		lblNewLabel_1_1_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1_2_1.setBounds(10, 183, 124, 14);
		contentPane.add(lblNewLabel_1_1_2_1_2_1);
		
		JLabel lblNewLabel_1_1_2_5_2_1 = new JLabel("Horário Saida:");
		lblNewLabel_1_1_2_5_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_5_2_1.setBounds(10, 310, 85, 14);
		contentPane.add(lblNewLabel_1_1_2_5_2_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Dados do voo 2(caso haja):");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 287, 160, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		horaS2 = new JTextField();
		horaS2.setEditable(false);
		horaS2.setColumns(10);
		horaS2.setBounds(90, 308, 80, 20);
		contentPane.add(horaS2);
		
		JLabel HORA_1 = new JLabel("Horário Chegada");
		HORA_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		HORA_1.setBounds(187, 310, 103, 14);
		contentPane.add(HORA_1);
		
		horaC2 = new JTextField();
		horaC2.setEditable(false);
		horaC2.setColumns(10);
		horaC2.setBounds(282, 308, 94, 20);
		contentPane.add(horaC2);
		
		JLabel lblNewLabel_1_1_2_5_1_2_1 = new JLabel("Data Saida");
		lblNewLabel_1_1_2_5_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_5_1_2_1.setBounds(10, 335, 71, 14);
		contentPane.add(lblNewLabel_1_1_2_5_1_2_1);
		
		diaS2 = new JTextField();
		diaS2.setEditable(false);
		diaS2.setToolTipText("");
		diaS2.setColumns(10);
		diaS2.setBounds(71, 331, 140, 20);
		contentPane.add(diaS2);
		
		JLabel lblNewLabel_1_1_2_5_1_1_1_1 = new JLabel("Data Chegada:");
		lblNewLabel_1_1_2_5_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_5_1_1_1_1.setBounds(226, 335, 100, 14);
		contentPane.add(lblNewLabel_1_1_2_5_1_1_1_1);
		
		diaC2 = new JTextField();
		diaC2.setEditable(false);
		diaC2.setToolTipText("");
		diaC2.setColumns(10);
		diaC2.setBounds(311, 331, 124, 20);
		contentPane.add(diaC2);
		
		JLabel lblNewLabel_1_1_2_1_2_1_1 = new JLabel("Aeroporto saída:");
		lblNewLabel_1_1_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1_2_1_1.setBounds(10, 362, 124, 14);
		contentPane.add(lblNewLabel_1_1_2_1_2_1_1);
		
		aeroS2 = new JTextField();
		aeroS2.setEditable(false);
		aeroS2.setColumns(10);
		aeroS2.setBounds(109, 360, 118, 20);
		contentPane.add(aeroS2);
		
		JLabel lblNewLabel_1_1_2_1_1_1_1_1 = new JLabel("Aeroporto chegada:");
		lblNewLabel_1_1_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1_1_1_1_1.setBounds(237, 362, 124, 14);
		contentPane.add(lblNewLabel_1_1_2_1_1_1_1_1);
		
		aeroC2 = new JTextField();
		aeroC2.setEditable(false);
		aeroC2.setColumns(10);
		aeroC2.setBounds(349, 360, 114, 20);
		contentPane.add(aeroC2);
		
		lael = new JLabel("Preço:");
		lael.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lael.setBounds(10, 391, 71, 14);
		contentPane.add(lael);
		
		preco2 = new JTextField();
		preco2.setEditable(false);
		preco2.setColumns(10);
		preco2.setBounds(48, 389, 86, 20);
		contentPane.add(preco2);
		
		JButton btnNewButton = new JButton("Fechar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				este.dispose();
			}
		});
		btnNewButton.setBounds(374, 419, 89, 23);
		contentPane.add(btnNewButton);
		
		valorCanil = new JTextField();
		valorCanil.setEditable(false);
		valorCanil.setBounds(94, 83, 85, 20);
		contentPane.add(valorCanil);
		valorCanil.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Companhia:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(187, 59, 71, 14);
		contentPane.add(lblNewLabel);
		
		companhia = new JTextField();
		companhia.setEditable(false);
		companhia.setBounds(250, 56, 140, 20);
		contentPane.add(companhia);
		companhia.setColumns(10);
		
		id.setText(t.getIdentificador());
		double prec = t.getVoo().get(0).getPreco();
		LocalDateTime dataS = t.getVoo().get(0).getHorarioSaida();
		LocalDateTime dataC = t.getVoo().get(0).getHorarioChegada();
		String horaS = dataS.getHour()+":"+dataS.getMinute();
		String diaS = dataS.getDayOfMonth()+"/"+dataS.getMonthValue()+"/"+dataS.getYear();
		String horaC = dataC.getHour()+":"+dataC.getMinute();
		String diaC = dataC.getDayOfMonth()+"/"+dataC.getMonthValue()+"/"+dataC.getYear();
		double canil = t.getCanil().getPrecoAnimal();
		String aeroC = t.getVoo().get(0).getLocalChegada().getNome();
		String aeroS = t.getVoo().get(0).getLocalSaida().getNome();
		String comp = t.getVoo().get(0).getCompanhia().getNomeDivulgacao();
		valorCanil.setText(canil+"");
		preco1.setText(prec+"");
		horaS1.setText(horaS);
		diaS1.setText(diaS);
		horaC1.setText(horaC);
		diaC1.setText(diaC);
		aeroC1.setText(aeroC);
		aeroS1.setText(aeroS);
		companhia.setText(comp);
		
		if(t.getVoo().size()==2) {
			prec = t.getVoo().get(1).getPreco();
			dataS = t.getVoo().get(1).getHorarioSaida();
			dataC =t.getVoo().get(1).getHorarioChegada();
			horaS = dataS.getHour()+":"+dataS.getMinute();
			diaS = dataS.getDayOfMonth()+"/"+dataS.getMonthValue()+"/"+dataS.getYear();
			horaC = dataC.getHour()+":"+dataC.getMinute();
			diaC = dataC.getDayOfMonth()+"/"+dataC.getMonthValue()+"/"+dataC.getYear();
			aeroC = t.getVoo().get(1).getLocalChegada().getNome();
			aeroS = t.getVoo().get(1).getLocalSaida().getNome();
			preco2.setText(prec+"");
			horaS2.setText(horaS);
			diaS2.setText(diaS);
			horaC2.setText(horaC);
			diaC2.setText(diaC);
			aeroC2.setText(aeroC);
			aeroS2.setText(aeroS);
		}
	}
}
