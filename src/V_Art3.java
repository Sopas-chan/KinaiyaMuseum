import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class V_Art3 {

	JFrame frame;
	JLabel back, bg;


	public V_Art3() {
		initialize();
	}
	void backButton(MouseAdapter ma) {
		back.addMouseListener(ma);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 837, 496);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		back = new JLabel("back");
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.setForeground(Color.WHITE);
		back.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		back.setBounds(10, 11, 84, 41);
		frame.getContentPane().add(back);
		
		bg = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("\\artwork3.png")).getImage();
		bg.setIcon(new ImageIcon(img));	
		bg.setBounds(0, 0, 828, 464);
		frame.getContentPane().add(bg);
	}

}
