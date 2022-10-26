package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controller.AgendaController;

public class Agenda extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldID;
	private JTextField textFieldValor;
	private JTextField textFieldData;
	private JTextField textFieldHora;
	private JTable table;
	private AgendaController controller;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Agenda() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1338, 797);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		controller = new AgendaController(this);
		
		iniciar();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(58, 368, 1153, 356);
		contentPane.add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Cliente", "Servico", "Valor", "Data", "Hora", "Observacao"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Float.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		panel.add(table);
		
		JTextArea textAreaObservacao = new JTextArea();
		textAreaObservacao.setBounds(623, 39, 588, 249);
		contentPane.add(textAreaObservacao);
		
		JLabel LabelId = new JLabel("Id");
		LabelId.setForeground(Color.WHITE);
		LabelId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelId.setBounds(58, 39, 121, 26);
		contentPane.add(LabelId);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(179, 39, 177, 26);
		contentPane.add(textFieldID);
		textFieldID.setColumns(10);
		
		JLabel LabelCliente = new JLabel("Cliente");
		LabelCliente.setForeground(Color.WHITE);
		LabelCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelCliente.setBounds(58, 89, 121, 26);
		contentPane.add(LabelCliente);
		
		JLabel LabelServico = new JLabel("Serviço");
		LabelServico.setForeground(Color.WHITE);
		LabelServico.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelServico.setBounds(58, 140, 121, 26);
		contentPane.add(LabelServico);
		
		JComboBox ComboBoxCliente = new JComboBox();
		ComboBoxCliente.setBounds(179, 91, 177, 26);
		contentPane.add(ComboBoxCliente);
		
		JComboBox ComboBoxServico = new JComboBox();
		ComboBoxServico.setBounds(179, 145, 177, 26);
		contentPane.add(ComboBoxServico);
		
		JLabel LabelValor = new JLabel("Valor R$");
		LabelValor.setForeground(Color.WHITE);
		LabelValor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelValor.setBounds(58, 195, 121, 26);
		contentPane.add(LabelValor);
		
		textFieldValor = new JTextField();
		textFieldValor.setColumns(10);
		textFieldValor.setBounds(179, 195, 177, 26);
		contentPane.add(textFieldValor);
		
		JLabel LabelData = new JLabel("Data");
		LabelData.setForeground(Color.WHITE);
		LabelData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelData.setBounds(58, 251, 121, 26);
		contentPane.add(LabelData);
		
		textFieldData = new JTextField();
		textFieldData.setColumns(10);
		textFieldData.setBounds(179, 251, 177, 26);
		contentPane.add(textFieldData);
		
		JLabel LabelHora = new JLabel("Hora");
		LabelHora.setForeground(Color.WHITE);
		LabelHora.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelHora.setBounds(58, 296, 121, 26);
		contentPane.add(LabelHora);
		
		textFieldHora = new JTextField();
		textFieldHora.setColumns(10);
		textFieldHora.setBounds(179, 296, 177, 26);
		contentPane.add(textFieldHora);
		
		JLabel LabelObservacao = new JLabel("Observação");
		LabelObservacao.setForeground(Color.YELLOW);
		LabelObservacao.setFont(new Font("Tahoma", Font.PLAIN, 22));
		LabelObservacao.setBounds(468, 39, 145, 26);
		contentPane.add(LabelObservacao);
		
		JButton BotaoAgendar = new JButton("Agendar");
		BotaoAgendar.setBackground(new Color(0, 153, 51));
		BotaoAgendar.setForeground(Color.WHITE);
		BotaoAgendar.setFont(new Font("Tahoma", Font.BOLD, 28));
		BotaoAgendar.setBounds(613, 311, 598, 49);
		contentPane.add(BotaoAgendar);
		
		JLabel Fundo = new JLabel("");
		Fundo.setForeground(Color.WHITE);
		Fundo.setHorizontalAlignment(SwingConstants.CENTER);
		Fundo.setIcon(new ImageIcon("D:\\projetoPLP\\img\\image.png"));
		Fundo.setBounds(0, 0, 1345, 781);
		contentPane.add(Fundo);
	}
	private void iniciar() {
		controller.updateTable();
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
	
}
