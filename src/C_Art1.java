import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C_Art1 {
	V_Art1 va1;
	M_Art1 ma1;
	public C_Art1(V_Art1 va1, M_Art1 ma1) {
		this.va1 = va1;
		this.ma1 = ma1;
		va1.frame.setVisible(true);
		va1.backButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				va1.frame.dispose();
			}
		});
	}
}
