import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class C_Signup {
	V_Signup vs;
	M_Signup ms;
	public C_Signup(V_Signup vs, M_Signup ms) {
		this.vs = vs;
		this.ms = ms;
		vs.frame.setVisible(true);
		vs.signUpButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ms.setData(vs.getcredentials());
				if (!ms.getPassword().equals(ms.getConfirmPass())) {
					vs.notMatch();
				}
				else {
					vs.success();
					V_Loginpage vl = new V_Loginpage();
					M_Loginpage ml = new M_Loginpage(ms.getData());
					C_Loginpage cl = new C_Loginpage(vl, ml);
				}
			}
		});
		vs.backButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_choices vc = new V_choices();
				C_choices cc = new C_choices(vc);
				vs.frame.hide();
			}
		});
	}
}
