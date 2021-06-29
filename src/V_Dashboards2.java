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

public class V_Dashboards2 {

	JFrame frame;
	JLabel logout;
	
	public V_Dashboards2() {
		initialize();
	}

	void logoutButton(MouseAdapter ma) {
		logout.addMouseListener(ma);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 842, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		logout = new JLabel("Logout");
		logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logout.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 30));
		logout.setForeground(Color.WHITE);
		logout.setBounds(22, 11, 75, 32);
		frame.getContentPane().add(logout);
		
		JLabel auctionbtn = new JLabel("auction");
		auctionbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		auctionbtn.setHorizontalAlignment(SwingConstants.CENTER);
		auctionbtn.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		auctionbtn.setForeground(Color.WHITE);
		auctionbtn.setBounds(35, 381, 156, 53);
		frame.getContentPane().add(auctionbtn);
		
		JLabel a1 = new JLabel("a1");
		a1.setVerticalAlignment(SwingConstants.BOTTOM);
		a1.setForeground(Color.WHITE);
		a1.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a1.setBounds(46, 45, 144, 128);
		frame.getContentPane().add(a1);
		
		JLabel a2 = new JLabel("a2");
		a2.setVerticalAlignment(SwingConstants.BOTTOM);
		a2.setForeground(Color.WHITE);
		a2.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a2.setBounds(236, 45, 144, 128);
		frame.getContentPane().add(a2);
		
		JLabel a3 = new JLabel("a3");
		a3.setVerticalAlignment(SwingConstants.BOTTOM);
		a3.setForeground(Color.WHITE);
		a3.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a3.setBounds(428, 45, 144, 128);
		frame.getContentPane().add(a3);
		
		JLabel a4 = new JLabel("a4");
		a4.setVerticalAlignment(SwingConstants.BOTTOM);
		a4.setForeground(Color.WHITE);
		a4.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a4.setBounds(615, 45, 144, 128);
		frame.getContentPane().add(a4);
		
		JLabel a7 = new JLabel("a7");
		a7.setVerticalAlignment(SwingConstants.BOTTOM);
		a7.setForeground(Color.WHITE);
		a7.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a7.setBounds(441, 197, 144, 128);
		frame.getContentPane().add(a7);
		
		JLabel a6 = new JLabel("a6");
		a6.setVerticalAlignment(SwingConstants.BOTTOM);
		a6.setForeground(Color.WHITE);
		a6.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a6.setBounds(252, 197, 144, 128);
		frame.getContentPane().add(a6);
		
		JLabel a5 = new JLabel("a5");
		a5.setVerticalAlignment(SwingConstants.BOTTOM);
		a5.setForeground(Color.WHITE);
		a5.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 11));
		a5.setBounds(67, 197, 144, 128);
		frame.getContentPane().add(a5);
		
		JLabel bg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("\\dashboard.png")).getImage();
		bg.setIcon(new ImageIcon(img));		
		bg.setBounds(0, 0, 826, 464);
		frame.getContentPane().add(bg);
	}

}
