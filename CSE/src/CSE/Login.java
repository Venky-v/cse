package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField tb1;
	private JTextField ps1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 720, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(291, 60, 119, 33);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setBounds(342, 135, 186, 33);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		ps1 = new JTextField();
		ps1.setBounds(342, 199, 192, 33);
		frame.getContentPane().add(ps1);
		ps1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1.setBounds(171, 131, 133, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2.setBounds(171, 203, 113, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un = tb1.getText();
				String ps = ps1.getText();
				if(un.equals("mrec") && ps.equals("mrec"))
						{
					JOptionPane.showMessageDialog(btnNewButton, "done");
						}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Invalid user name and password");
				}
			}
				
		
	});


		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(283, 302, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
