import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Cursor;

public class V_dashboard extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public V_dashboard() {
		initialize();
	}
	public void initialize() {
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
		

		
		JLabel viewbtn = new JLabel("view");
		viewbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewbtn.setHorizontalAlignment(SwingConstants.CENTER);
		viewbtn.setForeground(Color.WHITE);
		viewbtn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		viewbtn.setBounds(633, 381, 156, 53);
		panel.add(viewbtn);
		
		JLabel uploadbtn = new JLabel("upload");
		uploadbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		uploadbtn.setHorizontalAlignment(SwingConstants.CENTER);
		uploadbtn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		uploadbtn.setForeground(Color.WHITE);
		uploadbtn.setBounds(35, 381, 156, 53);
		panel.add(uploadbtn);
		
		JLabel bg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("\\dashboard.png")).getImage();
		bg.setIcon(new ImageIcon(img));
		bg.setBounds(0, 0, 826, 464);
		panel.add(bg);
	}
}
