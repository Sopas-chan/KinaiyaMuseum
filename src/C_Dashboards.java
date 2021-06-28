import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C_Dashboards {
	V_Dashboards vd;
	public C_Dashboards(V_Dashboards vd) {
		this.vd = vd;
		vd.frame.setVisible(true);
		vd.logoutB(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Loginpage vl = new V_Loginpage();
				M_Loginpage ml = new M_Loginpage();
				C_Loginpage cl = new C_Loginpage(vl, ml);
				vd.frame.hide();
			}
		});
	}
}
