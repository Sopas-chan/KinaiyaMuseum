import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C_Dashboards2 {
	V_Dashboards2 vd2;
	M_Dashboards2 md2;
	public C_Dashboards2(V_Dashboards2 vd2, M_Dashboards2 md2) {
		this.vd2 = vd2;
		this.md2 = md2;
		vd2.frame.setVisible(true);
		vd2.logoutButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Loginpage vl = new V_Loginpage();
				M_Loginpage ml = new M_Loginpage(md2.Creds2());
				C_Loginpage cl = new C_Loginpage(vl, ml);	
				vd2.frame.dispose();
			}
		});
		vd2.art1(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art5 va1 = new V_Art5();
				M_Art5 ma1 = new M_Art5(md2.Creds2());
				C_Art5 ca1 = new C_Art5(va1, ma1);
			}
		});
		vd2.art2(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art7 va2 = new V_Art7();
				M_Art7 ma2 = new M_Art7(md2.Creds2());
				C_Art7 ca2 = new C_Art7(va2, ma2);
			}
		});
		vd2.art3(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art6 va3 = new V_Art6();
				M_Art6 ma3 = new M_Art6(md2.Creds2());
				C_Art6 ca3 = new C_Art6(va3, ma3);
			}
		});
		vd2.art4(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art1 va4 = new V_Art1();
				M_Art1 ma4 = new M_Art1(md2.Creds2());
				C_Art1 ca4 = new C_Art1(va4, ma4);
			}
		});
		vd2.art5(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art2 va5 = new V_Art2();
				M_Art2 ma5 = new M_Art2(md2.Creds2());
				C_Art2 ca5 = new C_Art2(va5, ma5);
			}
		});
		vd2.art6(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art3 va6 = new V_Art3();
				M_Art3 ma6 = new M_Art3(md2.Creds2());
				C_Art3 ca6 = new C_Art3(va6, ma6);
			}
		});
		vd2.art7(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art4 va7 = new V_Art4();
				M_Art4 ma7 = new M_Art4(md2.Creds2());
				C_Art4 ca7 = new C_Art4(va7, ma7);
			}
		});
	}
}
