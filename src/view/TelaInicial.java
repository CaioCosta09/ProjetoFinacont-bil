package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setLocationRelativeTo(null);
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
	public TelaInicial() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\pagamento-em-dinheiro.png"));
		setTitle("Finacontábil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 382);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(37, 11, 463, 321);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnCadastro = new JButton("Cadastre-se");
		btnCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaCadastro telacadastro = new TelaCadastro();
				telacadastro.setLocationRelativeTo(null);
				telacadastro.setVisible(true);
				dispose();
				
			}
		});
		btnCadastro.setEnabled(false);
		btnCadastro.setBackground(new Color(0, 64, 0));
		btnCadastro.setForeground(new Color(0, 0, 0));
		btnCadastro.setBounds(50, 241, 129, 36);
		panel.add(btnCadastro);
		btnCadastro.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setEnabled(false);
		btnLogin.setBackground(new Color(0, 64, 0));
		btnLogin.setBounds(248, 241, 104, 36);
		panel.add(btnLogin);
		
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JTextArea txtrOlaBemVindo = new JTextArea();
		txtrOlaBemVindo.setForeground(new Color(0, 64, 0));
		txtrOlaBemVindo.setEditable(false);
		txtrOlaBemVindo.setFont(new Font("Monospaced", Font.BOLD, 15));
		txtrOlaBemVindo.setBackground(new Color(192, 192, 192));
		txtrOlaBemVindo.setText("Ola! Bem vindo a nossa\r\nplataforma,se ainda não\r\nestiver cadastrado clique\r\nem cadastrar-se e faça parte \r\nda nossa comunidade, se ja tiver \r\ncadastro clique em login\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
		txtrOlaBemVindo.setBounds(101, 90, 300, 140);
		panel.add(txtrOlaBemVindo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 8));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\WhatsApp Image 2024-09-04 at 09.34.01.jpeg"));
		lblNewLabel.setBounds(49, 0, 300, 83);
		panel.add(lblNewLabel);
		btnLogin.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				TelaLogin telalogin = new TelaLogin();
				telalogin.setLocationRelativeTo(null);
				telalogin.setVisible(true);
				dispose();
				
						
						
				
			}
		});
	}
}
