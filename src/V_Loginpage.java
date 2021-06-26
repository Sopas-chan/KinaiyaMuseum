import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class V_Loginpage {

	public JFrame frame;
	private JTextField username;
	private JPasswordField password;
	private JLabel signupButton, loginButton;


	public V_Loginpage() {
		initialize();
	}


	public String getuser() {
		String name = username.getText();
		return name;
	}
	public String getpass() {
		String pass = password.getText();
		return pass;
	}
	void signupButton(MouseAdapter ma) {
		signupButton.addMouseListener(ma);
	}
	void loginButton(MouseAdapter ma) {
		loginButton.addMouseListener(ma);
	}
	
	public void wrongCreds() {
		JOptionPane.showMessageDialog(null, "Username/Pass is incorrect or not found");
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 840, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, -11, 824, 483);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		username =  new JTextField();
		username.addFocusListener(new FocusAdapter() {
			
			public void focusGained(FocusEvent e) {
				if(username.getText().equals("Username")) {
					username.setText("");
				}
				else {
					username.selectAll();
				}
			}

			public void focusLost(FocusEvent e) {
				if(username.getText().equals("")) {
					username.setText("Username");
				
				}
			}
		});
		
		password = new JPasswordField();
		password.setToolTipText("");
		password.addFocusListener(new FocusAdapter() {
			
			public void focusGained(FocusEvent e) {
				if(password.getText().equals("Password")) {
					password.setEchoChar('•');
					password.setText("");
				}
				else {
					password.selectAll();
				}
			}
		
			public void focusLost(FocusEvent e) {
				if(password.getText().equals("")) {
					password.setText("Password");
					password.setEchoChar((char)0);
				}
			}
		});
		password.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		password.setForeground(Color.WHITE);
		password.setBackground(Color.BLACK);
		password.setBounds(414, 285, 319, 60);
		panel.add(password);
		username.setText("Username");
		username.setForeground(Color.WHITE);
		username.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		username.setColumns(10);
		username.setBackground(Color.BLACK);
		username.setBounds(414, 197, 319, 60);
		panel.add(username);
		
		loginButton = new JLabel("LOGIN");
		loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginButton.setBounds(408, 391, 157, 46);
		panel.add(loginButton);
		loginButton.setHorizontalAlignment(SwingConstants.CENTER);
		loginButton.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		
		signupButton = new JLabel("SIGN UP");
		signupButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		signupButton.setBounds(575, 391, 147, 46);
		panel.add(signupButton);
		signupButton.setHorizontalAlignment(SwingConstants.CENTER);
		signupButton.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("\\LOGIN DESIGN Final.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 824, 472);
		panel.add(lblNewLabel);
	}
}
