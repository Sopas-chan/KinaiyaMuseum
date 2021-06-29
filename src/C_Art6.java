import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C_Art6 {
	V_Art6 va6;
	M_Art6 ma6;
	public C_Art6(V_Art6 va6, M_Art6 ma6) {
		this.va6 = va6;
		this.ma6 = ma6;
		va6.frame.setVisible(true);
		va6.frame.setVisible(true);
		va6.backButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				va6.frame.dispose();
			}
		});
	}
}
