package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		panel.setBounds(10, 11, 414, 321);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome completo:");
		lblNewLabel.setForeground(new Color(0, 64, 0));
		lblNewLabel.setBounds(0, 114, 122, 23);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setBounds(119, 117, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setForeground(new Color(0, 64, 0));
		lblNewLabel_1.setBounds(0, 148, 46, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_1 = new JTextField();
		textField_1.setBounds(36, 148, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("RG:");
		lblNewLabel_2.setForeground(new Color(0, 64, 0));
		lblNewLabel_2.setBounds(0, 185, 30, 14);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_2 = new JTextField();
		textField_2.setBounds(36, 184, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefone:");
		lblNewLabel_3.setForeground(new Color(0, 64, 0));
		lblNewLabel_3.setBounds(0, 224, 65, 21);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_3 = new JTextField();
		textField_3.setBounds(75, 226, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setBounds(307, 287, 97, 23);
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
