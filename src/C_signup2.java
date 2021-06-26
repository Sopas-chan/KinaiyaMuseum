import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C_signup2 {
	V_signup2 vs2;
	M_signup2 ms2;
	public C_signup2(V_signup2 vs2, M_signup2 ms2) {
		this.vs2 = vs2;
		this.ms2 = ms2;
		vs2.frame.setVisible(true);
		vs2.signUpButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ms2.setData(vs2.memberCreds());
				if (!ms2.getPass().equals(ms2.getCPass())) {
					vs2.notMatch();
				}
				else {
					vs2.success();
					V_Loginpage vl = new V_Loginpage();
					M_Loginpage ml = new M_Loginpage(ms2.getData());
					C_Loginpage cl = new C_Loginpage(vl, ml);
				}
			}
		});
		vs2.backButton(new MouseAdapter( ) {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_choices vc = new V_choices();
				C_choices cc = new C_choices(vc);
				vs2.frame.hide();
			}
		});
	}
}
	
