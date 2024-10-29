package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class TelaEntrou extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEntrou frame = new TelaEntrou();
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
	public TelaEntrou() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\pagamento-em-dinheiro.png"));
		setTitle("Finacontábil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnvoltarentrou = new JButton("Voltar");
		btnvoltarentrou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin telalogin = new TelaLogin();
				telalogin.setLocationRelativeTo(null);
				telalogin.setVisible(true);
				dispose();
				
			}
		});
		btnvoltarentrou.setForeground(new Color(192, 192, 192));
		btnvoltarentrou.setBackground(new Color(0, 64, 0));
		btnvoltarentrou.setBounds(321, 227, 89, 23);
		contentPane.add(btnvoltarentrou);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\WhatsApp Image 2024-10-25 at 16.53.56.jpeg"));
		lblNewLabel_1.setBounds(69, 0, 304, 87);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email: albericocosta@finacont.com.br");
		lblNewLabel_2.setForeground(new Color(0, 64, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(20, 172, 265, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fone: (81) 3223.0471");
		lblNewLabel_3.setForeground(new Color(0, 64, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(20, 197, 178, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Entre em contato para mais informações sobre nossos serviços");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(0, 64, 0));
		lblNewLabel.setBounds(20, 98, 404, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Contatos:\r\n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setForeground(new Color(0, 64, 0));
		lblNewLabel_4.setBounds(20, 146, 89, 14);
		contentPane.add(lblNewLabel_4);
	}
}
