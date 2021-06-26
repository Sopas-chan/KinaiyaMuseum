import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class V_Dashboards {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V_Dashboards window = new V_Dashboards();
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
	public V_Dashboards() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 842, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel logout = new JLabel("Logout");
		logout.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 30));
		logout.setForeground(Color.WHITE);
		logout.setBounds(22, 11, 75, 32);
		frame.getContentPane().add(logout);
		
		JLabel viewbtn = new JLabel("view");
		viewbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewbtn.setHorizontalAlignment(SwingConstants.CENTER);
		viewbtn.setForeground(Color.WHITE);
		viewbtn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		viewbtn.setBounds(633, 381, 156, 53);
		frame.getContentPane().add(viewbtn);
		
		JLabel uploadbtn = new JLabel("upload");
		uploadbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		uploadbtn.setHorizontalAlignment(SwingConstants.CENTER);
		uploadbtn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		uploadbtn.setForeground(Color.WHITE);
		uploadbtn.setBounds(35, 381, 156, 53);
		frame.getContentPane().add(uploadbtn);
		
		JLabel bg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("\\dashboard.png")).getImage();
		bg.setIcon(new ImageIcon(img));
		bg.setBounds(0, 0, 826, 464);
		frame.getContentPane().add(bg);
	}

}