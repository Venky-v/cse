package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ecommers {

	private JFrame frame;
	int i = 0, bill =0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecommers window = new Ecommers();
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
	public Ecommers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 899, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(361, 59, 223, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Screenshots\\Book2.png"));
		lblNewLabel_1.setBounds(114, 126, 136, 201);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Screenshots\\Book3.png"));
		lblNewLabel_1_1.setBounds(345, 126, 136, 201);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Screenshots\\Screenshot 2024-02-21 120335.png"));
		lblNewLabel_1_2.setBounds(578, 126, 157, 211);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("180/-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(168, 354, 61, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("150/-");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(394, 354, 61, 37);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("120/-");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(649, 354, 61, 37);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lb1 = new JLabel("CART : 0");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lb1.setBounds(696, 11, 157, 29);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("Bill     : 0");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lb2.setBounds(696, 51, 157, 29);
		frame.getContentPane().add(lb2);
		
		JButton btnNewButton = new JButton("Add To Card");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				bill=180*i;
				lb1.setText("CART :"+i);
				lb2.setText("Bill     :"+bill);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(123, 422, 127, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add To Card");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				bill=150*i;
				lb1.setText("CART :"+i);
				lb2.setText("Bill     :"+bill);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(354, 424, 127, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add To Card");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				bill=120*i;
				lb1.setText("CART :"+i);
				lb2.setText("Bill     :"+bill);
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(608, 426, 127, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
