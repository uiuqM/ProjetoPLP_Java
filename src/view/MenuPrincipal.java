package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.menuPrincipalController;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private final menuPrincipalController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1104, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.controller = new menuPrincipalController(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu relatorioMenu = new JMenu("Relatório");
		menuBar.add(relatorioMenu);
		
		JMenu cadastroMenu = new JMenu("Cadastro");
		menuBar.add(cadastroMenu);
		
		JMenuItem servicoItem = new JMenuItem("Serviço");
		servicoItem.setIcon(new ImageIcon("D:\\projetoPLP\\img\\iconTesoura.png"));
		cadastroMenu.add(servicoItem);
		
		JMenuItem clienteItem = new JMenuItem("Cliente");
		clienteItem.setIcon(new ImageIcon("D:\\projetoPLP\\img\\iconCliente.png"));
		cadastroMenu.add(clienteItem);
		
		JMenu operacaoMenu = new JMenu("Operação");
		menuBar.add(operacaoMenu);
		
		JMenuItem agendaItem = new JMenuItem("Agenda");
		agendaItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.navigateSchedule();
			}
		});
		agendaItem.setIcon(new ImageIcon("D:\\projetoPLP\\img\\agenda.png"));
		operacaoMenu.add(agendaItem);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-15, 10, 1120, 701);
		lblNewLabel.setIcon(new ImageIcon("D:\\projetoPLP\\img\\fundoMenu.png"));
		contentPane.add(lblNewLabel);
	}
}
