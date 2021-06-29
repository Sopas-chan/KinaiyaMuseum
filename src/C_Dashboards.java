import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C_Dashboards {
	V_Dashboards vd;
	M_Dashboards md;
	public C_Dashboards(V_Dashboards vd, M_Dashboards md) {
		this.vd = vd;
		this.md = md;
		vd.frame.setVisible(true);
		vd.logoutB(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Loginpage vl = new V_Loginpage();
				M_Loginpage ml = new M_Loginpage(md.Creds());
				C_Loginpage cl = new C_Loginpage(vl, ml);
				vd.frame.dispose();
			}
		});
		vd.art1(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art5 va1 = new V_Art5();
				M_Art5 ma1 = new M_Art5(md.Creds());
				C_Art5 ca1 = new C_Art5(va1, ma1);
			}
		});
		vd.art2(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art7 va2 = new V_Art7();
				M_Art7 ma2 = new M_Art7(md.Creds());
				C_Art7 ca2 = new C_Art7(va2, ma2);
			}
		});
		vd.art3(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art6 va3 = new V_Art6();
				M_Art6 ma3 = new M_Art6(md.Creds());
				C_Art6 ca3 = new C_Art6(va3, ma3);
			}
		});
		vd.art4(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art1 va4 = new V_Art1();
				M_Art1 ma4 = new M_Art1(md.Creds());
				C_Art1 ca4 = new C_Art1(va4, ma4);
			}
		});
		vd.art5(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art2 va5 = new V_Art2();
				M_Art2 ma5 = new M_Art2(md.Creds());
				C_Art2 ca5 = new C_Art2(va5, ma5);
			}
		});
		vd.art6(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art3 va6 = new V_Art3();
				M_Art3 ma6 = new M_Art3(md.Creds());
				C_Art3 ca6 = new C_Art3(va6, ma6);
			}
		});
		vd.art7(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Art4 va7 = new V_Art4();
				M_Art4 ma7 = new M_Art4(md.Creds());
				C_Art4 ca7 = new C_Art4(va7, ma7);
			}
		});
	}
}
