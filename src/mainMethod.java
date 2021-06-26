
public class mainMethod {
	public static void main(String[] args) {
		V_Loginpage vl = new V_Loginpage();
		M_Loginpage ml = new M_Loginpage();
		C_Loginpage cl = new C_Loginpage(vl, ml);
	}
}
