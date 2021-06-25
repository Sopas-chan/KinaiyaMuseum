import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField fn;
	private JTextField un;
	private JTextField pass;
	private JTextField ln;
	private JTextField pn;
	private JTextField confirmpass;
	private JLabel back;

	/**
	 * Launch the application.
	 */
	public static void signup() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 826, 467);
		contentPane.add(panel);
		panel.setLayout(null);
		
		back = new JLabel("back");
		back.setHorizontalAlignment(SwingConstants.CENTER);
		back.setForeground(Color.WHITE);
		back.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 20));
		back.setBounds(504, 44, 96, 43);
		panel.add(back);
		
		un = new JTextField();
		un.setText("username");
		un.setForeground(Color.WHITE);
		un.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		un.setColumns(10);
		un.setBackground(Color.BLACK);
		un.setBounds(278, 207, 117, 30);
		panel.add(un);
		
		JLabel lblNewLabel = new JLabel("Sign up");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		lblNewLabel.setBounds(246, 369, 320, 61);
		panel.add(lblNewLabel);
		
		fn = new JTextField();
		fn.addFocusListener(new FocusAdapter() {
			
			public void focusGained(FocusEvent e) {
				if(fn.getText().equals("FIRST NAME")) {
					fn.setText("");
				}
				else {
					fn.selectAll();
				}
			}
			
			public void focusLost(FocusEvent e) {
				if(fn.getText().equals("")) {
					fn.setText("FIRST NAME");
				
				}
				}
		});
		fn.setText("first name");
		fn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		fn.setForeground(Color.WHITE);
		fn.setBackground(Color.BLACK);
		fn.setBounds(278, 140, 117, 30);
		panel.add(fn);
		fn.setColumns(10);
		
		pass = new JTextField();
		pass.setText("password");
		pass.setForeground(Color.WHITE);
		pass.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		pass.setColumns(10);
		pass.setBackground(Color.BLACK);
		pass.setBounds(278, 277, 117, 30);
		panel.add(pass);
		
		ln = new JTextField();
		ln.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(ln.getText().equals("LAST NAME")) {
					ln.setText("");
				}
				else {
					ln.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(fn.getText().equals("")) {
					fn.setText("LAST NAME");
				
				}
			}
		});
		ln.setText("last name");
		ln.setForeground(Color.WHITE);
		ln.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		ln.setColumns(10);
		ln.setBackground(Color.BLACK);
		ln.setBounds(439, 140, 117, 30);
		panel.add(ln);
		
		pn = new JTextField();
		pn.setText("pen name");
		pn.setForeground(Color.WHITE);
		pn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		pn.setColumns(10);
		pn.setBackground(Color.BLACK);
		pn.setBounds(439, 207, 117, 30);
		panel.add(pn);
		
		confirmpass = new JTextField();
		confirmpass.setText("confirm password");
		confirmpass.setForeground(Color.WHITE);
		confirmpass.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		confirmpass.setColumns(10);
		confirmpass.setBackground(Color.BLACK);
		confirmpass.setBounds(439, 277, 117, 30);
		panel.add(confirmpass);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\SUBJECT FOLDERS\\OOP\\kinaiya\\SIGNUP DESIGN Final ARTIST.png"));
		bg.setBounds(0, 0, 832, 468);
		panel.add(bg);
	}
}
