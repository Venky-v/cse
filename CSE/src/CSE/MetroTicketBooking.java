package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetroTicketBooking {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetroTicketBooking window = new MetroTicketBooking();
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
	public MetroTicketBooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 713);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Metro Ticket Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(269, 31, 422, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(186, 134, 93, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("From");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(186, 195, 93, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("To");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(186, 272, 93, 33);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tickets");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(186, 331, 93, 33);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		tb1 = new JTextField();
		tb1.setBounds(269, 143, 179, 24);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Ameerpet", "Metuguda", "Paradegroud"}));
		c1.setBounds(269, 203, 179, 25);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Rasoolpura", "Secunderabad", "Begumpet"}));
		c2.setBounds(269, 272, 179, 25);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5"}));
		c3.setBounds(269, 339, 179, 25);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  n = tb1.getText();
				String fs = (String) c1.getSelectedItem();
				String ts = (String) c2.getSelectedItem();
				String tn = (String) c3.getSelectedItem();
				int t = Integer.parseInt(tn);
				int bill = 0;
				if (fs.equals("Ameerpet") && ts.equals("Rasoolpura"))
				{
					bill=30*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hell "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nBill:"+bill+"Click Ok to Confirm");
				}
				else if (fs.equals("Ameerpet") && ts.equals("Secunderabad"))
				{
					bill=40*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hell "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nBill:"+bill+"Click Ok to Confirm");
				}
				else if (fs.equals("Ameerpet") && ts.equals("Begumpet"))
				{
					bill=50*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hell "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nBill:"+bill+"Click Ok to Confirm");
				}
				else if (fs.equals("Metuguda") && ts.equals("Rasoolpura"))
				{
					bill=60*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hell "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nBill:"+bill+"Click Ok to Confirm");
				}
				else if (fs.equals("Metuguda") && ts.equals("Secunderabad"))
				{
					bill=70*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hell "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nBill:"+bill+"Click Ok to Confirm");
				}
				else if (fs.equals("Metuguda") && ts.equals("Begumpet"))
				{
					bill=80*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hell "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nBill:"+bill+"Click Ok to Confirm");
				}
				else if (fs.equals("Paradegroud") && ts.equals("Rasoolpura"))
				{
					bill=20*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hell "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nBill:"+bill+"Click Ok to Confirm");
				}
				else if (fs.equals("Paradegroud") && ts.equals("Secunderabad"))
				{
					bill=10*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hell "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nBill:"+bill+"Click Ok to Confirm");
				}
				else if (fs.equals("Paradegroud") && ts.equals("Begumpet"))
				{
					bill=30*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hell "+n+"\nFrom:"+fs+"\nTo:"+ts+"\nBill:"+bill+" Click Ok to Confirm");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Please select the appropiate details !");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(269, 446, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
