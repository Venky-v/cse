package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class Registration1 {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration1 window = new Registration1();
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
	public Registration1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 868, 674);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setForeground(new Color(255, 128, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(329, 25, 297, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(255, 128, 64));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(180, 134, 118, 22);
		frame.getContentPane().add(lblName);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setForeground(new Color(255, 128, 64));
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBranch.setBounds(180, 196, 143, 14);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gender");
		lblNewLabel_1_1.setForeground(new Color(255, 128, 64));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(180, 261, 93, 22);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Programming");
		lblNewLabel_1_2.setForeground(new Color(255, 128, 64));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(180, 326, 143, 30);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		tb1 = new JTextField();
		tb1.setBounds(361, 138, 203, 22);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1.setBounds(361, 261, 84, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r2.setBounds(465, 261, 99, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "CSE", "ECE", "IT", "DS", "AIML", "OTHERS"}));
		cb1.setBounds(361, 195, 203, 22);
		frame.getContentPane().add(cb1);
		
		JCheckBox c1 = new JCheckBox("Java");
		c1.setBounds(361, 333, 70, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("Python");
		c2.setBounds(479, 333, 70, 23);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = tb1.getText();
				String b=(String) cb1.getSelectedItem();
				String g= null;;
				if(r1.isSelected())
				{
					g="Male";
				}
				else if(r2.isSelected())
				{
					g="Female";
				}
				else
				{
					g="Invalid";
				}
				String p1="";
				if(c1.isSelected())
				{
					p1=p1+" java";
				}
				if(c2.isSelected())
				{
					p1=p1+"Python";
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "Hello"+n+"\nPlease confirm your details :\nBranch:"+b+"\nGender :"+g+"\nProgramming : "+p1);
				if(res==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "registration Done");
					
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "registration  Not Done");	
				}
			}
		});
		btnNewButton.setForeground(new Color(128, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(329, 415, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\Friend.jpg"));
		lblNewLabel_1.setBounds(0, 0, 852, 635);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
