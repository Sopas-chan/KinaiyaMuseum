import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.awt.Cursor;

public class V_Signup {

	JFrame frame;
	private JTextField fn, un, ln, pn;
	private JPasswordField pass, confirmpass;
	private JLabel back, signUp;

	public V_Signup() {
		initialize();
	}

	public ArrayList<String> getcredentials() {
		ArrayList<String> RecievedData = new ArrayList<String>();
		RecievedData.add(un.getText());
		RecievedData.add(pass.getText());
		RecievedData.add(confirmpass.getText());
		RecievedData.add(pn.getText());
		RecievedData.add(ln.getText());
		RecievedData.add(pn.getText());
		RecievedData.add("Artist");
		return RecievedData;
	}
	void signUpButton(MouseAdapter ma) {
		signUp.addMouseListener(ma);
	}
	void notMatch() {
		JOptionPane.showMessageDialog(null, "Passwords do not match!");
	}
	void success() {
		JOptionPane.showMessageDialog(null, "Successfully Signed Up!");
	}
	void backButton(MouseAdapter ma) {
		back.addMouseListener(ma);
	}
	void blankFields() {
		JOptionPane.showMessageDialog(null, "One or more fields cannot be empty!");
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 842, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		back = new JLabel("back");
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.setHorizontalAlignment(SwingConstants.CENTER);
		back.setForeground(Color.WHITE);
		back.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 20));
		back.setBounds(504, 44, 96, 43);
		frame.getContentPane().add(back);
		
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
		un.setBounds(278, 207, 117, 30);
		frame.getContentPane().add(un);
		
		signUp = new JLabel("Sign up");
		signUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signUp.setHorizontalAlignment(SwingConstants.CENTER);
		signUp.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		signUp.setBounds(246, 369, 320, 61);
		frame.getContentPane().add(signUp);
		
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
		fn.setText("First Name");
		fn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		fn.setForeground(Color.WHITE);
		fn.setBackground(Color.BLACK);
		fn.setBounds(278, 140, 117, 30);
		frame.getContentPane().add(fn);
		fn.setColumns(10);
		
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
		pass.setBackground(Color.BLACK);
		pass.setBounds(278, 277, 117, 30);
		frame.getContentPane().add(pass);
		
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
		ln.setText("Last Name");
		ln.setForeground(Color.WHITE);
		ln.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		ln.setColumns(10);
		ln.setBackground(Color.BLACK);
		ln.setBounds(439, 140, 117, 30);
		frame.getContentPane().add(ln);
		
		pn = new JTextField();
		pn.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pn.getText().equals("Pen Name")) {
					pn.setText("");
				}
				else {
					pn.selectAll();
				}
			}
		});
		pn.setText("Pen Name");
		pn.setForeground(Color.WHITE);
		pn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		pn.setColumns(10);
		pn.setBackground(Color.BLACK);
		pn.setBounds(439, 207, 117, 30);
		frame.getContentPane().add(pn);
		
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
		confirmpass.setBackground(Color.BLACK);
		confirmpass.setBounds(439, 277, 117, 30);
		frame.getContentPane().add(confirmpass);
		
		JLabel bg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("\\SIGNUP DESIGN Final ARTIST.png")).getImage();
		bg.setIcon(new ImageIcon(img));
		bg.setBounds(0, 0, 832, 468);
		frame.getContentPane().add(bg);
	}

}
