package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controller.LoginController;
import model.DAO.Banco;
import javax.swing.JPasswordField;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField campoUusuario;
	private final LoginController controller;
	private JPasswordField campoSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public login() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Banco.inicia();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		controller = new LoginController(this);
		
		JButton botaoLogin = new JButton("Entrar");
		botaoLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.loginSys();
			}
		});
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(208, 353, 190, 34);
		contentPane.add(campoSenha);
		botaoLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		botaoLogin.setBounds(206, 407, 192, 34);
		contentPane.add(botaoLogin);
		
		campoUusuario = new JTextField();
		campoUusuario.setBounds(206, 249, 192, 34);
		contentPane.add(campoUusuario);
		campoUusuario.setColumns(10);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setForeground(Color.WHITE);
		labelSenha.setFont(new Font("Monospaced", Font.BOLD, 38));
		labelSenha.setBounds(226, 271, 202, 97);
		contentPane.add(labelSenha);
		
		JLabel labelLogin = new JLabel("Login");
		labelLogin.setForeground(Color.WHITE);
		labelLogin.setFont(new Font("Monospaced", Font.BOLD, 38));
		labelLogin.setBounds(244, 102, 143, 97);
		contentPane.add(labelLogin);
		
		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setForeground(Color.WHITE);
		labelUsuario.setFont(new Font("Monospaced", Font.BOLD, 38));
		labelUsuario.setBounds(216, 163, 202, 97);
		contentPane.add(labelUsuario);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\projetoPLP\\img\\panel.png"));
		lblNewLabel_1.setBounds(111, 127, 379, 343);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(-64, 0, 720, 636);
		lblNewLabel.setIcon(new ImageIcon("D:\\projetoPLP\\img\\logo.jpg"));
		contentPane.add(lblNewLabel);
	}
	
	public void showMessage(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	public JTextField getCampoUusuario() {
		return campoUusuario;
	}
	
	public JTextField getCampoSenha() {
		return campoSenha;
	}
}
