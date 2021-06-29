import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C_Art2 {
	V_Art2 va2;
	M_Art2 ma2;
	public C_Art2(V_Art2 va2, M_Art2 ma2) {
		this.va2 = va2;
		this.ma2 = ma2;
		va2.frame.setVisible(true);
		va2.frame.setVisible(true);
		va2.backButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				va2.frame.dispose();
			}
		});
	}
}
