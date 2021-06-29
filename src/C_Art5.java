import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C_Art5 {
	V_Art5 va5;
	M_Art5 ma5;
	public C_Art5(V_Art5 va5, M_Art5 ma5) {
		this.va5 = va5;
		this.ma5 = ma5;
		va5.frame.setVisible(true);
		va5.frame.setVisible(true);
		va5.backButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				va5.frame.dispose();
			}
		});
	}
}
