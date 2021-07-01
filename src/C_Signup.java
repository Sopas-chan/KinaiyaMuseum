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
				if (ms.getFName().equals("") || ms.getFName().equals("First Name") || ms.getLName().equals("") 
						|| ms.getLName().equals("Last Name") || ms.getPName().equals("") || ms.getPName().equals("Pen Name") 
						|| ms.getUser().equals("") || ms.getUser().equals("Username") || ms.getPass().equals("") 
						|| ms.getPass().equals("Password") || ms.getCPass().equals("") || ms.getCPass().equals("Confirm Password")) {
						vs.blankFields();
					}
				else if (!ms.getPass().equals(ms.getCPass())) {
					vs.notMatch();
				}
				else {
					vs.success();
					V_Loginpage vl = new V_Loginpage();
					M_Loginpage ml = new M_Loginpage(ms.getData());
					C_Loginpage cl = new C_Loginpage(vl, ml);
					vs.frame.dispose();
				}
			}
		});
		vs.backButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_choices vc = new V_choices();
				M_choices mc = new M_choices(ms.getData());
				C_choices cc = new C_choices(vc, mc);
				vs.frame.dispose();
			}
		});
	}
}
