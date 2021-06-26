import java.util.ArrayList;

public class M_Loginpage {
	ArrayList<String> username = new ArrayList<String>();
	ArrayList<String> password = new ArrayList<String>();
	String usern, passn;
	public M_Loginpage() {
		username.add("Ram");
		password.add("pass");
	}
	public M_Loginpage(ArrayList<String> RD) {
		username.add(RD.get(0));
		password.add(RD.get(1));
	}
	public void setInputUsername(String usern) {
		this.usern = usern;
	}
	public void setInputPassword(String passn) {
		this.passn = passn;
	}
	public String getInputUsername() {
		return usern;
	}
	public String getInputPassword() {
		return passn;
	}
	public String getusername() {
		String user = username.get(0);
		return user;
	}
	public String getpassword() {
		String pass = password.get(0);
		return pass;
	}
}

