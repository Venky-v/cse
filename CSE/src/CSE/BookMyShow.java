package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookMyShow {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookMyShow window = new BookMyShow();
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
	public BookMyShow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 844, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BookMyShow");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(306, 50, 407, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(181, 139, 125, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMovie = new JLabel("Movie");
		lblMovie.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMovie.setBounds(181, 207, 125, 27);
		frame.getContentPane().add(lblMovie);
		
		JLabel lblTickets = new JLabel("Tickets");
		lblTickets.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTickets.setBounds(181, 269, 125, 27);
		frame.getContentPane().add(lblTickets);
		
		tb1 = new JTextField();
		tb1.setBackground(Color.WHITE);
		tb1.setBounds(342, 145, 180, 27);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBackground(Color.WHITE);
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "RRR", "KGF", "JOE", "LOVE TODAY", "SALAR", "KRISHNA GADI VEERA PREMA GADHA !"}));
		cb1.setBounds(342, 207, 180, 27);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setBackground(Color.WHITE);
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4"}));
		cb2.setBounds(342, 272, 180, 24);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = tb1.getText();
				String sm = (String) cb1.getSelectedItem();
				String tn = (String) cb2.getSelectedItem();
				int t = Integer.parseInt(tn);
				int bill= 0;
				if(t=='\0')
				{
					JOptionPane.showMessageDialog(btnNewButton, "Please select the tickets !");
				}
				if(sm.isEmpty())
				{
					JOptionPane.showMessageDialog(btnNewButton, "Please select the mover !");
				}
				 else if(sm.equals("RRR"))
				{
					bill=200*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							                                    "\nSelected Movie:"+sm+
							                                    "\nNo.fo ticket:"+t+
							                                    "\nBill:"+bill);
					
				}
				else if(sm.equals("KGF"))
				{
					bill=150*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							                                    "\nSelected Movie:"+sm+
							                                    "\nNo.fo ticket:"+t+
							                                    "\nBill:"+bill);
					
				}
				else if(sm.equals("JOE"))
				{
					bill=200*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							                                    "\nSelected Movie:"+sm+
							                                    "\nNo.fo ticket:"+t+
							                                    "\nBill:"+bill);
					
				}
				else if(sm.equals("LOVE TODAY"))
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							                                    "\nSelected Movie:"+sm+
							                                    "\nNo.fo ticket:"+t+
							                                    "\nBill:"+bill);
					
				}
				else if(sm.equals("SALAR"))
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							                                    "\nSelected Movie:"+sm+
							                                    "\nNo.fo ticket:"+t+
							                                    "\nBill:"+bill);
					
				}
				else if(sm.equals("KRISHNA GADI VEERA PREMA GADHA !"))
				{
					bill=200*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							                                    "\nSelected Movie:"+sm+
							                                    "\nNo.fo ticket:"+t+
							                                    "\nBill:"+bill);
					
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"Please select the MOvie !"  );
				}
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(306, 347, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
