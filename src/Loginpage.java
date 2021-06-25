import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Loginpage {

	private JFrame frame;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpage window = new Loginpage();
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
	public Loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 840, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, -11, 824, 483);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		username = new JTextField();
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
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setBounds(408, 391, 157, 46);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		
		JLabel lblNewLabel_1_1 = new JLabel("SIGN UP");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				choices Home = new choices();
				Home.choices();
				frame.hide();
			}
		});
		lblNewLabel_1_1.setBounds(575, 391, 147, 46);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\SUBJECT FOLDERS\\OOP\\kinaiya\\LOGIN DESIGN Final.png"));
		lblNewLabel.setBounds(0, 0, 824, 472);
		panel.add(lblNewLabel);
	}
}
