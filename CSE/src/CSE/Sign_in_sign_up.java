package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Sign_in_sign_up {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField ps1;
	private JTextField tb2;
	private JPasswordField ps2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign_in_sign_up window = new Sign_in_sign_up();
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
	public Sign_in_sign_up() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 776, 676);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign in / Sign up ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(273, 42, 271, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUser = new JLabel("User :");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblUser.setBounds(70, 129, 123, 37);
		frame.getContentPane().add(lblUser);
		
		JLabel lblPassword = new JLabel("Pwd :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblPassword.setBounds(70, 206, 151, 37);
		frame.getContentPane().add(lblPassword);
		
		tb1 = new JTextField();
		tb1.setBounds(203, 136, 166, 37);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		ps1 = new JPasswordField();
		ps1.setBounds(203, 213, 166, 37);
		frame.getContentPane().add(ps1);
		
		JLabel lblUser_1 = new JLabel("User :");
		lblUser_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblUser_1.setBounds(432, 129, 87, 37);
		frame.getContentPane().add(lblUser_1);
		
		JLabel lblPassword_1 = new JLabel("Pwd :");
		lblPassword_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblPassword_1.setBounds(432, 206, 87, 37);
		frame.getContentPane().add(lblPassword_1);
		
		tb2 = new JTextField();
		tb2.setColumns(10);
		tb2.setBounds(541, 129, 166, 37);
		frame.getContentPane().add(tb2);
		
		ps2 = new JPasswordField();
		ps2.setBounds(541, 206, 166, 37);
		frame.getContentPane().add(ps2);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = tb1.getText();
				String pwd = ps1.getText();
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mrec");
					String q ="insert into sign_in values ('"+user+"','"+pwd+"')";
					Statement sta = con.createStatement();
					sta.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "Done !");
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(132, 327, 113, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user1 = tb2.getText();
				String pwd1 = ps2.getText();
				try {
					Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mrec");
					String q1 = "insert into sign_up values('"+user1+"', '"+pwd1+"')";
					Statement sta1 = con1.createStatement();
					sta1.executeUpdate(q1);
					con1.close();
					JOptionPane.showMessageDialog(btnSignUp, "Done !");
				}
				catch(SQLException e2)
				{
					e2.printStackTrace();
				}
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSignUp.setBounds(472, 327, 113, 37);
		frame.getContentPane().add(btnSignUp);
	}
}
