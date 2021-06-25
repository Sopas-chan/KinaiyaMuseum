import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class signup2 extends JFrame {

	private JPanel contentPane;
	private JTextField fn;
	private JTextField un;
	private JTextField ln;
	private JTextField pass;
	private JTextField confirmpass;
	private JLabel back;

	/**
	 * Launch the application.
	 */
	public static void signup2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup2 frame = new signup2();
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
	public signup2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 826, 464);
		contentPane.add(panel);
		panel.setLayout(null);
		
		back = new JLabel("back");
		back.setHorizontalAlignment(SwingConstants.CENTER);
		back.setForeground(Color.WHITE);
		back.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 20));
		back.setBounds(505, 52, 96, 43);
		panel.add(back);
		
		pass = new JTextField();
		pass.setText("PASSWORD");
		pass.setForeground(Color.WHITE);
		pass.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		pass.setColumns(10);
		pass.setBorder(new LineBorder(Color.WHITE));
		pass.setBackground(Color.BLACK);
		pass.setBounds(284, 278, 119, 30);
		panel.add(pass);
		
		un = new JTextField();
		un.setText("USERNAME");
		un.setForeground(Color.WHITE);
		un.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		un.setColumns(10);
		un.setBackground(Color.BLACK);
		un.setBounds(284, 208, 169, 30);
		panel.add(un);
		
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
		fn.setText("FIRST NAME");
		fn.setForeground(Color.WHITE);
		fn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		fn.setColumns(10);
		fn.setBackground(Color.BLACK);
		fn.setBounds(284, 143, 117, 30);
		panel.add(fn);
		
		JLabel signin = new JLabel("Sign up");
		signin.setHorizontalAlignment(SwingConstants.CENTER);
		signin.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		signin.setBounds(246, 370, 320, 61);
		panel.add(signin);
		
		ln = new JTextField();
		ln.setText("LAST NAME");
		ln.setForeground(Color.WHITE);
		ln.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		ln.setColumns(10);
		ln.setBackground(Color.BLACK);
		ln.setBounds(442, 143, 117, 30);
		panel.add(ln);
		
		confirmpass = new JTextField();
		confirmpass.setText("CONFIRM PASSWORD");
		confirmpass.setForeground(Color.WHITE);
		confirmpass.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 18));
		confirmpass.setColumns(10);
		confirmpass.setBorder(new LineBorder(Color.WHITE));
		confirmpass.setBackground(Color.BLACK);
		confirmpass.setBounds(442, 278, 119, 30);
		panel.add(confirmpass);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\SUBJECT FOLDERS\\OOP\\kinaiya\\SIGNUP DESIGN Final Normal Member.png"));
		lblNewLabel.setBounds(0, 0, 826, 464);
		panel.add(lblNewLabel);
	}

}
