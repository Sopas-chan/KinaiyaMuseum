import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C_Art7 {
	V_Art7 va7;
	M_Art7 ma7;
	public C_Art7(V_Art7 va7, M_Art7 ma7) {
		this.va7 = va7;
		this.ma7 = ma7;
		va7.frame.setVisible(true);
		va7.frame.setVisible(true);
		va7.backButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				va7.frame.dispose();
			}
		});
	}
}
