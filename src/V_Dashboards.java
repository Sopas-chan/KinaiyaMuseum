import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class V_Dashboards {

	public JFrame frame;
	private JLabel logout;

	public V_Dashboards() {
		initialize();
	}

	void logoutB(MouseAdapter ma) {
		logout.addMouseListener(ma);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 842, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel a1 = new JLabel("a1");
		a1.setForeground(Color.WHITE);
		a1.setVerticalAlignment(SwingConstants.BOTTOM);
		a1.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a1.setBounds(47, 47, 144, 128);
		frame.getContentPane().add(a1);
		
		logout = new JLabel("Logout");
		logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logout.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 30));
		logout.setForeground(Color.WHITE);
		logout.setBounds(22, 11, 75, 32);
		frame.getContentPane().add(logout);
		
		JLabel uploadbtn = new JLabel("Upload");
		uploadbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		uploadbtn.setHorizontalAlignment(SwingConstants.CENTER);
		uploadbtn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		uploadbtn.setForeground(Color.WHITE);
		uploadbtn.setBounds(35, 381, 156, 53);
		frame.getContentPane().add(uploadbtn);
		Image img = new ImageIcon(this.getClass().getResource("\\dashboardS.png")).getImage();
		
		JLabel a2 = new JLabel("a2");
		a2.setVerticalAlignment(SwingConstants.BOTTOM);
		a2.setForeground(Color.WHITE);
		a2.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a2.setBounds(237, 47, 144, 128);
		frame.getContentPane().add(a2);
		
		JLabel a3 = new JLabel("a3");
		a3.setVerticalAlignment(SwingConstants.BOTTOM);
		a3.setForeground(Color.WHITE);
		a3.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a3.setBounds(429, 47, 144, 128);
		frame.getContentPane().add(a3);
		
		JLabel a4 = new JLabel("a4");
		a4.setVerticalAlignment(SwingConstants.BOTTOM);
		a4.setForeground(Color.WHITE);
		a4.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a4.setBounds(616, 47, 144, 128);
		frame.getContentPane().add(a4);
		
		JLabel a5 = new JLabel("a5");
		a5.setVerticalAlignment(SwingConstants.BOTTOM);
		a5.setForeground(Color.WHITE);
		a5.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a5.setBounds(68, 199, 144, 128);
		frame.getContentPane().add(a5);
		
		JLabel a6 = new JLabel("a6");
		a6.setVerticalAlignment(SwingConstants.BOTTOM);
		a6.setForeground(Color.WHITE);
		a6.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a6.setBounds(253, 199, 144, 128);
		frame.getContentPane().add(a6);
		
		JLabel a7 = new JLabel("a7");
		a7.setVerticalAlignment(SwingConstants.BOTTOM);
		a7.setForeground(Color.WHITE);
		a7.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a7.setBounds(442, 199, 144, 128);
		frame.getContentPane().add(a7);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\SUBJECT FOLDERS\\OOP\\kinaiya\\dashboard.png"));
		bg.setBounds(0, 0, 826, 464);
		frame.getContentPane().add(bg);
	}

}
