import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.awt.Cursor;
public class V_signup2 {

	JFrame frame;
	private JTextField fn, un, ln;
	public String firstname, lastname, username, password, cfpass;
	private JPasswordField pass, confirmpass;
	private JLabel back, signin;
	/**
	 * Launch the application.
	 */

	public V_signup2() {
		initialize();
	}
	
	public ArrayList<String> memberCreds() {
		ArrayList<String> ReceivedData = new ArrayList<String>();
		ReceivedData.add(un.getText());
		ReceivedData.add(pass.getText());
		ReceivedData.add(confirmpass.getText());
		return ReceivedData;
	}
	public void signUpButton(MouseAdapter ma) {
		signin.addMouseListener(ma);
	}
	void notMatch() {
		JOptionPane.showMessageDialog(null, "Password do not match!");
	}
	void success() {
		JOptionPane.showMessageDialog(null, "Successfully Signed up!");;
	}
	void backButton(MouseAdapter ma) {
		back.addMouseListener(ma);
	}
	void blankFields() {
		JOptionPane.showMessageDialog(null, "One or more fields cannot be empty!");
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 842, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		back = new JLabel("back");
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.setHorizontalAlignment(SwingConstants.CENTER);
		back.setForeground(Color.WHITE);
		back.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 20));
		back.setBounds(505, 52, 96, 43);
		frame.getContentPane().add(back);
		
		pass = new JPasswordField();
		pass.setToolTipText("");
		pass.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pass.getText().equals("Password")) {
					pass.setEchoChar('•');
					pass.setText("");
				}
				else {
					pass.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pass.getText().equals("")) {
					pass.setText("Password");
					pass.setEchoChar((char)0);
				}
			}
		});
		pass.setText("Password");
		pass.setEchoChar((char)0);
		pass.setForeground(Color.WHITE);
		pass.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		pass.setColumns(10);
		pass.setBorder(new LineBorder(Color.WHITE));
		pass.setBackground(Color.BLACK);
		pass.setBounds(284, 278, 119, 30);
		frame.getContentPane().add(pass);
		
		un = new JTextField();
		un.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(un.getText().equals("Username")) {
					un.setText("");
				}
				else {
					un.selectAll();
				}
			}
		});
		un.setText("Username");
		un.setForeground(Color.WHITE);
		un.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		un.setColumns(10);
		un.setBackground(Color.BLACK);
		un.setBounds(284, 208, 169, 30);
		frame.getContentPane().add(un);
		
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
			@Override
			public void focusLost(FocusEvent e) {
				
					if(fn.getText().equals("")) {
						fn.setText("FIRST NAME");
					
					}
			}
		});
		fn.setText("First Name");
		fn.setForeground(Color.WHITE);
		fn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		fn.setColumns(10);
		fn.setBackground(Color.BLACK);
		fn.setBounds(284, 143, 117, 30);
		frame.getContentPane().add(fn);
		
		signin = new JLabel("Sign up");
		signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signin.setHorizontalAlignment(SwingConstants.CENTER);
		signin.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		signin.setBounds(246, 370, 320, 61);
		frame.getContentPane().add(signin);
		
		ln = new JTextField();
		ln.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(ln.getText().equals("Last Name")) {
					ln.setText("");
				}
				else {
					ln.selectAll();
				}
			}
		});
		ln.setText("Last Name");
		ln.setForeground(Color.WHITE);
		ln.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		ln.setColumns(10);
		ln.setBackground(Color.BLACK);
		ln.setBounds(442, 143, 117, 30);
		frame.getContentPane().add(ln);
		
		confirmpass = new JPasswordField();
		confirmpass.setToolTipText("");
		confirmpass.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(confirmpass.getText().equals("Confirm Password")) {
					confirmpass.setEchoChar('•');
					confirmpass.setText("");
				}
				else {
					confirmpass.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(confirmpass.getText().equals("")) {
					confirmpass.setText("Confirm Password");
					confirmpass.setEchoChar((char)0);
				}
			}
		});
		confirmpass.setText("Confirm Password");
		confirmpass.setEchoChar((char)0);
		confirmpass.setForeground(Color.WHITE);
		confirmpass.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		confirmpass.setColumns(10);
		confirmpass.setBorder(new LineBorder(Color.WHITE));
		confirmpass.setBackground(Color.BLACK);
		confirmpass.setBounds(442, 278, 119, 30);
		frame.getContentPane().add(confirmpass);
		
		JLabel bg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("\\SIGNUP DESIGN Final Normal Member.png")).getImage();
		bg.setIcon(new ImageIcon(img));
		bg.setBounds(0, 0, 826, 464);
		frame.getContentPane().add(bg);
		
		firstname = fn.getText();
		lastname = ln.getText();
		username = un.getText();
		password = pass.getText();
		cfpass = confirmpass.getText();
		
	}
}
