package CSE;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Registration3 {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;
	/**
	 * @wbp.nonvisual location=861,9
	 */
	private final JLabel label = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration3 window = new Registration3();
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
	public Registration3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 893, 756);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(369, 44, 222, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblId.setBounds(137, 139, 116, 41);
		frame.getContentPane().add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblName.setBounds(137, 210, 116, 41);
		frame.getContentPane().add(lblName);
		
		JLabel lblMarks = new JLabel("Marks");
		lblMarks.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMarks.setBounds(137, 276, 106, 41);
		frame.getContentPane().add(lblMarks);
		
		tb1 = new JTextField();
		tb1.setBounds(369, 139, 227, 32);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setColumns(10);
		tb2.setBounds(369, 210, 227, 32);
		frame.getContentPane().add(tb2);
		
		tb3 = new JTextField();
		tb3.setColumns(10);
		tb3.setBounds(369, 286, 227, 32);
		frame.getContentPane().add(tb3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=tb1.getText();
				int id=Integer.parseInt(i);
				String n=tb2.getText();
				String marks=tb3.getText();
				int m=Integer.parseInt(marks);
				try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mrec");
				String q="insert into Registration values('"+id+"','"+n+"','"+m+"')";
				Statement sta=con.createStatement();
				sta.executeUpdate(q);
				con.close();
				JOptionPane.showMessageDialog(btnNewButton, "Done");
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(273, 371, 116, 41);
		frame.getContentPane().add(btnNewButton);
	}
}
