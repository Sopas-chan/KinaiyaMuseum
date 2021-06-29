import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C_Art3 {
	V_Art3 va3;
	M_Art3 ma3;
	public C_Art3(V_Art3 va3, M_Art3 ma3) {
		this.va3 = va3;
		this.ma3 = ma3;
		va3.frame.setVisible(true);
		va3.frame.setVisible(true);
		va3.backButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				va3.frame.dispose();
			}
		});
	}
}
