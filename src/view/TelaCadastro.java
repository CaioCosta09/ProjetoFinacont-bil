package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DadosDoUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnome;
	private JTextField textcpf;
	private JTextField texttelefone;
	private JTextField textusuario;
	private JPasswordField passwordsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
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
		panel.setBounds(0, 11, 414, 321);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome completo:");
		lblNewLabel.setForeground(new Color(0, 64, 0));
		lblNewLabel.setBounds(0, 114, 122, 23);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textnome = new JTextField();
		textnome.setBounds(119, 117, 127, 20);
		panel.add(textnome);
		textnome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setForeground(new Color(0, 64, 0));
		lblNewLabel_1.setBounds(0, 148, 46, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textcpf = new JTextField();
		textcpf.setBounds(36, 148, 86, 20);
		panel.add(textcpf);
		textcpf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setForeground(new Color(0, 64, 0));
		lblNewLabel_2.setBounds(0, 251, 65, 14);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3 = new JLabel("Telefone:");
		lblNewLabel_3.setForeground(new Color(0, 64, 0));
		lblNewLabel_3.setBounds(0, 178, 65, 21);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		texttelefone = new JTextField();
		texttelefone.setBounds(75, 179, 86, 20);
		panel.add(texttelefone);
		texttelefone.setColumns(10);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setBounds(188, 287, 97, 23);
		panel.add(btnNewButton);
		btnNewButton.setForeground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(0, 64, 0));
		
		JTextArea txtrParaConcluirO = new JTextArea();
		txtrParaConcluirO.setEditable(false);
		txtrParaConcluirO.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtrParaConcluirO.setForeground(new Color(0, 64, 0));
		txtrParaConcluirO.setBackground(new Color(192, 192, 192));
		txtrParaConcluirO.setText("Para concluir o cadastro\r\npreencha os campos abaixo\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
		txtrParaConcluirO.setBounds(0, 43, 322, 56);
		panel.add(txtrParaConcluirO);
		
		JLabel lblNewLabel_4 = new JLabel("Cadastre-se");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setForeground(new Color(0, 64, 0));
		lblNewLabel_4.setBounds(124, 0, 122, 32);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(10, 210, 36, -2);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Nome de Usuário:");
		lblNewLabel_6.setForeground(new Color(0, 64, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(0, 215, 137, 14);
		panel.add(lblNewLabel_6);
		
		textusuario = new JTextField();
		textusuario.setBounds(135, 214, 86, 20);
		panel.add(textusuario);
		textusuario.setColumns(10);
		
		passwordsenha = new JPasswordField();
		passwordsenha.setEchoChar('*');
		passwordsenha.setBounds(51, 250, 73, 20);
		panel.add(passwordsenha);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textnome.getText() == null || textnome.getText().isEmpty() || textcpf.getText() == null || textcpf.getText().isEmpty()
						|| texttelefone.getText() == null && texttelefone.getText().isEmpty() || passwordsenha.getText() == null || passwordsenha.getText().isEmpty() 
						) {
						JOptionPane.showMessageDialog(btnCadastrar,"Todos campos obrigatorios","Aviso", JOptionPane.ERROR_MESSAGE);
					    
					}else {
						JOptionPane.showMessageDialog(btnCadastrar,"Cadastrado com sucesso","Aviso", JOptionPane.INFORMATION_MESSAGE);
						dispose();
						TelaLogin telalogin= new TelaLogin();
						telalogin.setLocationRelativeTo(null);
						telalogin.setVisible(true);
					}
				
				
				DadosDoUsuario dados = new DadosDoUsuario(textnome.getText(),textcpf.getText(),texttelefone.getText(),textusuario.getText(),passwordsenha.getText()); 
				
				System.out.println("Nome Completo: " + dados.getNomeCompleto());
				System.out.println("CPF: " + dados.getCpf());
				System.out.println("Telefone: : " + dados.getTelefone());
				System.out.println("Nome de Usuario: " + dados.getNomeDeUsuario());
				System.out.println("Senha:: " + dados.getSenha());
			}
		});
		btnCadastrar.setForeground(Color.LIGHT_GRAY);
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCadastrar.setBackground(new Color(0, 64, 0));
		btnCadastrar.setBounds(295, 288, 109, 23);
		panel.add(btnCadastrar);
		
		JToggleButton btnVer = new JToggleButton("Ver");
		btnVer.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVer.setForeground(new Color(192, 192, 192));
		btnVer.setBackground(new Color(0, 64, 0));
		btnVer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(btnVer.isSelected()) {
					passwordsenha.setEchoChar((char)0);
					
					btnVer.setText("Esconder");
				}else {
					passwordsenha.setEchoChar('*');
					
					btnVer.setText("Ver");
				}
			}
		});
		btnVer.setBounds(145, 249, 101, 23);
		panel.add(btnVer);
		
		JButton btnlimpar = new JButton("Limpar");
		btnlimpar.setBackground(new Color(0, 64, 0));
		btnlimpar.setForeground(new Color(192, 192, 192));
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textnome.setText("");
				textcpf.setText("");
				texttelefone.setText("");
				textusuario.setText("");
				passwordsenha.setText("");
			}
		});
		btnlimpar.setBounds(273, 249, 113, 23);
		panel.add(btnlimpar);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial telainicial = new TelaInicial();
				telainicial.setLocationRelativeTo(null);
				telainicial.setVisible(true);
				dispose();
			}
		});
	}
}
