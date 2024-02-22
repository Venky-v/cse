package CSE;

import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FriendshipCalculator {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FriendshipCalculator window = new FriendshipCalculator();
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
	public FriendshipCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 636);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Friendship Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(212, 65, 451, 77);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(143, 153, 94, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Friend Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(143, 239, 162, 29);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		txt1 = new JTextField();
		txt1.setBounds(322, 159, 242, 32);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(322, 239, 242, 29);
		frame.getContentPane().add(txt2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int res = r.nextInt(1,1000);
				JOptionPane.showMessageDialog(btnNewButton, "Your friendship is % is:"+res);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(322, 355, 115, 39);
		frame.getContentPane().add(btnNewButton);
	}
}
