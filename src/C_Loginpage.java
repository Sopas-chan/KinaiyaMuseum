import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C_Loginpage {
	V_Loginpage vl;
	M_Loginpage ml;
	public C_Loginpage(V_Loginpage vl, M_Loginpage ml) {
		this.vl = vl;
		this.ml = ml;
		vl.frame.setVisible(true);
		vl.signupButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_choices Home = new V_choices();
				C_choices choice = new C_choices(Home);
				vl.frame.dispose();
			}
		});
		vl.loginButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ml.setInputUsername(vl.getuser());
				ml.setInputPassword(vl.getpass());
				if (ml.getInputUsername().equals("") || ml.getInputUsername().equals("Username")|| ml.getInputPassword().equals(e) || ml.getInputPassword().equals("Password")) {
					vl.noInputs();
				}
				else if (!ml.getInputUsername().equals(ml.getusername()) || !ml.getInputPassword().equals(ml.getpassword())) {
					vl.wrongCreds();
				}
				else if (ml.getInputUsername().equals(ml.getusername()) && ml.getInputPassword().equals(ml.getpassword()) && ml.getType().equals("Artist")) {
					V_Dashboards dash = new V_Dashboards();
					M_Dashboards md = new M_Dashboards(ml.Creds());
					C_Dashboards cd = new C_Dashboards(dash, md);
					vl.frame.dispose();
				}
				else if (ml.getInputUsername().equals(ml.getusername()) && ml.getInputPassword().equals(ml.getpassword())) {
					V_Dashboards2 dash = new V_Dashboards2();
					M_Dashboards2 md2 = new M_Dashboards2(ml.Creds());
					C_Dashboards2 cl2 = new C_Dashboards2(dash, md2);
					vl.frame.dispose();
				}

			}
		});
	}
}
