import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class choices extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void choices() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					choices frame = new choices();
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
	public choices() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 623, 322);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel back = new JLabel("back");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Loginpage Home = new Loginpage();
				Home.main(null);
				
			}
		});
		back.setForeground(Color.WHITE);
		back.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 30));
		back.setHorizontalAlignment(SwingConstants.CENTER);
		back.setBounds(470, 0, 96, 43);
		panel.add(back);
		
		JLabel signup1_1 = new JLabel("sign up");
		signup1_1.setHorizontalAlignment(SwingConstants.CENTER);
		signup1_1.setForeground(Color.WHITE);
		signup1_1.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		signup1_1.setBounds(326, 146, 177, 55);
		panel.add(signup1_1);
		
		JLabel signup1 = new JLabel("sign up");
		signup1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Signup page = new Signup();
				page.signup();
				frame.hide();
			}
		});
		signup1.setHorizontalAlignment(SwingConstants.CENTER);
		signup1.setForeground(Color.WHITE);
		signup1.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		signup1.setBounds(69, 146, 177, 55);
		panel.add(signup1);
		
		JLabel bg = new JLabel("New label");
		bg.setBounds(0, 0, 566, 311);
		bg.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\SUBJECT FOLDERS\\OOP\\kinaiya\\choices.png"));
		panel.add(bg);
	}
}
