package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import javax.swing.JInternalFrame;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

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

		setContentPane(contentPane);
		
		JMenu mnNewMenu = new JMenu("Cadastro");
		contentPane.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Serviço");
		mntmNewMenuItem_1.setIcon(new ImageIcon("D:\\projetoPLP\\img\\iconTesoura.png"));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cliente");
		mntmNewMenuItem.setIcon(new ImageIcon("D:\\projetoPLP\\img\\iconCliente.png"));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Operação");
		contentPane.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Relatório");
		contentPane.add(mnNewMenu_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\projetoPLP\\img\\fundoMenu.png"));
		contentPane.add(lblNewLabel);
	}

}
