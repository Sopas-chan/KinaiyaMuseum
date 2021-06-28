import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C_Dashboards2 {
	V_Dashboards2 vd2;
	public C_Dashboards2(V_Dashboards2 vd2) {
		this.vd2 = vd2;
		vd2.frame.setVisible(true);
		vd2.logoutButton(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Loginpage vl = new V_Loginpage();
				M_Loginpage ml = new M_Loginpage();
				C_Loginpage cl = new C_Loginpage(vl, ml);	
			}
		});
	}
}
