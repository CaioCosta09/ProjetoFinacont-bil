package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToggleButton;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textulogin;
	private JPasswordField lsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\pagamento-em-dinheiro.png"));
		setTitle("Finacont");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 382);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(34, 29, 368, 303);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setBounds(124, 11, 82, 53);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 64, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		
		JButton btnvoltar = new JButton("Voltar");
		btnvoltar.setBounds(256, 269, 102, 23);
		panel.add(btnvoltar);
		btnvoltar.setForeground(new Color(192, 192, 192));
		btnvoltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnvoltar.setBackground(new Color(0, 64, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Usuário:");
		lblNewLabel_1.setForeground(new Color(0, 64, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(28, 131, 69, 14);
		panel.add(lblNewLabel_1);
		
		textulogin = new JTextField();
		textulogin.setBounds(91, 130, 175, 20);
		panel.add(textulogin);
		textulogin.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(0, 64, 0));
		lblNewLabel_2.setBounds(33, 198, 54, 14);
		panel.add(lblNewLabel_2);
		
		lsenha = new JPasswordField();
		lsenha.setEchoChar('*');
		lsenha.setBounds(91, 197, 175, 20);
		panel.add(lsenha);
		
		JButton btnentrar = new JButton("Entrar");
		btnentrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				
				
				if(textulogin.getText() == null || textulogin.getText().isEmpty() || lsenha.getText() == null || lsenha.getText().isEmpty()) {
					JOptionPane.showMessageDialog(btnentrar,"Todos campos obrigatorios","Aviso", JOptionPane.ERROR_MESSAGE);
				    
				}else {
					JOptionPane.showMessageDialog(btnentrar,"Logado com sucesso","Aviso", JOptionPane.INFORMATION_MESSAGE);
					dispose();
				
				
				TelaEntrou telaentrou = new TelaEntrou();
				telaentrou.setLocationRelativeTo(null);
				telaentrou.setVisible(true);
				dispose();
				}
			}
			});
		btnentrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnentrar.setForeground(new Color(192, 192, 192));
		btnentrar.setBackground(new Color(0, 64, 0));
		btnentrar.setBounds(140, 269, 102, 23);
		panel.add(btnentrar);
		
		JToggleButton btnver2 = new JToggleButton("ver");
		btnver2.setBackground(new Color(0, 64, 0));
		btnver2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnver2.setForeground(new Color(192, 192, 192));
		btnver2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnver2.isSelected()) {
					lsenha.setEchoChar((char)0);
					btnver2.setText("Esconder");
				}else {
					lsenha.setEchoChar('*');
					btnver2.setText("Ver");
				}
			}
		});
		btnver2.setBounds(272, 196, 96, 23);
		panel.add(btnver2);
		btnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial telainicial = new TelaInicial();
				telainicial.setLocationRelativeTo(null);
				telainicial.setVisible(true);
				dispose();
			}
		});
	}
}

