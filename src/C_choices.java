import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class C_choices {
	V_choices vc;
	public C_choices(V_choices vc) {
		this.vc = vc;
		vc.frame.setVisible(true);
		vc.artistButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Signup page = new V_Signup();
				M_Signup ms = new M_Signup();
				C_Signup cs = new C_Signup(page, ms);
				vc.frame.dispose();
			}
		});
		vc.memberButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_signup2 page = new V_signup2();
				M_signup2 ms = new M_signup2();
				C_signup2 cs = new C_signup2(page, ms);
				vc.frame.dispose();
			}
		});
		vc.backButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<String> empty = new ArrayList<String>();
				V_Loginpage vl = new V_Loginpage();
				M_Loginpage ml = new M_Loginpage(empty);
				C_Loginpage cl = new C_Loginpage(vl, ml);
				vc.frame.dispose();
			}
		});
	}
}
