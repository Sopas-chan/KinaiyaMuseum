import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class V_choices {

	JFrame frame;
	JLabel signupNormal, signupArtist, back;


	public V_choices() {
		initialize();
	}
	
	void memberButton(MouseAdapter ma) {
		signupNormal.addMouseListener(ma);
	}
	void artistButton(MouseAdapter ma) {
		signupArtist.addMouseListener(ma);
	}
	void backButton(MouseAdapter ma) {
		back.addMouseListener(ma);
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 582, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		back = new JLabel("back");
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.setForeground(Color.WHITE);
		back.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 30));
		back.setHorizontalAlignment(SwingConstants.CENTER);
		back.setBounds(470, 0, 96, 43);
		frame.getContentPane().add(back);
	
		signupArtist = new JLabel("sign up");
		signupArtist.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		signupArtist.setHorizontalAlignment(SwingConstants.CENTER);
		signupArtist.setForeground(Color.WHITE);
		signupArtist.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		signupArtist.setBounds(326, 146, 177, 55);
		frame.getContentPane().add(signupArtist);
		
		signupNormal = new JLabel("sign up");
		signupNormal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		signupNormal.setHorizontalAlignment(SwingConstants.CENTER);
		signupNormal.setForeground(Color.WHITE);
		signupNormal.setFont(new Font("DK Lemon Yellow Sun", Font.PLAIN, 40));
		signupNormal.setBounds(69, 146, 177, 55);
		frame.getContentPane().add(signupNormal);
		
		JLabel bg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("\\choices.png")).getImage();
		bg.setIcon(new ImageIcon(img));
		bg.setBounds(0, 0, 566, 311);
		frame.getContentPane().add(bg);
	}

}
