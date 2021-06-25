import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard frame = new dashboard();
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
	public dashboard() {
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
		
		JLabel logout = new JLabel("Logout");
		logout.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 30));
		logout.setForeground(Color.WHITE);
		logout.setBounds(22, 11, 75, 32);
		panel.add(logout);
		
		JLabel viewbtn = new JLabel("view");
		viewbtn.setHorizontalAlignment(SwingConstants.CENTER);
		viewbtn.setForeground(Color.WHITE);
		viewbtn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		viewbtn.setBounds(633, 381, 156, 53);
		panel.add(viewbtn);
		
		JLabel uploadbtn = new JLabel("upload");
		uploadbtn.setHorizontalAlignment(SwingConstants.CENTER);
		uploadbtn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		uploadbtn.setForeground(Color.WHITE);
		uploadbtn.setBounds(35, 381, 156, 53);
		panel.add(uploadbtn);
		
		JLabel bg = new JLabel("New label");
		bg.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\SUBJECT FOLDERS\\OOP\\kinaiya\\dashboard.png"));
		bg.setBounds(0, 0, 826, 464);
		panel.add(bg);
	}
}
