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
				if (ms2.getFName().equals("") || ms2.getFName().equals("First Name") || ms2.getLName().equals("") 
					|| ms2.getLName().equals("Last Name") || ms2.getUser().equals("") || ms2.getUser().equals("Username") || ms2.getPass().equals("")
					|| ms2.getPass().equals("Password") || ms2.getCPass().equals("") || ms2.getCPass().equals("Confirm Password")) {
					vs2.blankFields();
				}
				else if (!ms2.getPass().equals(ms2.getCPass())) {
					vs2.notMatch();
				}
				else {
					vs2.success();
					V_Loginpage vl = new V_Loginpage();
					M_Loginpage ml = new M_Loginpage(ms2.getData());
					C_Loginpage cl = new C_Loginpage(vl, ml);
					vs2.frame.dispose();
				}
			}
		});
		vs2.backButton(new MouseAdapter( ) {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_choices vc = new V_choices();
				M_choices mc = new M_choices(ms2.getData());
				C_choices cc = new C_choices(vc, mc);
				vs2.frame.dispose();
			}
		});
	}
}
	
