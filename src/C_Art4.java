import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C_Art4 {
	V_Art4 va4;
	M_Art4 ma4;
	public C_Art4(V_Art4 va4, M_Art4 ma4) {
		this.va4 = va4;
		this.ma4 = ma4;
		va4.frame.setVisible(true);
		va4.frame.setVisible(true);
		va4.backButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				va4.frame.dispose();
			}
		});
	}
}
