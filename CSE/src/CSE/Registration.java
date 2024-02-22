package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Registration {

	private JFrame frame;
	private JTextField tp1;
	private JTextField tp2;
	private JTextField pn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 855, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(294, 59, 165, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1.setBounds(172, 121, 113, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email ID");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2.setBounds(172, 179, 113, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone No");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_3.setBounds(172, 239, 113, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		tp1 = new JTextField();
		tp1.setBounds(334, 121, 173, 30);
		frame.getContentPane().add(tp1);
		tp1.setColumns(10);
		
		tp2 = new JTextField();
		tp2.setBounds(334, 176, 173, 33);
		frame.getContentPane().add(tp2);
		tp2.setColumns(10);
		
		pn1 = new JTextField();
		pn1.setBounds(334, 243, 173, 30);
		frame.getContentPane().add(pn1);
		pn1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String tb1 = tp1.getText();
				//JOptionPane.showMessageDialog(btnNewButton, "Hello "+tb1+ "\nRegistration done !");
				Login l = new Login();
				l.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(294, 319, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(99, 31, 528, 346);
		frame.getContentPane().add(panel);
	}

}
