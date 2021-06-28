import java.util.ArrayList;

public class M_Loginpage {
	ArrayList<String> Credentials;
	String type, usern, passn, username, password;
	
	public M_Loginpage() {
		
	}
	public M_Loginpage(ArrayList<String> RD) {
		this.Credentials = RD;
		username = RD.get(0);
		password = RD.get(1);
		type = RD.get(6);
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
		return username;
	}
	public String getpassword() {
		return password;
	}
	public String getType() {
		return type;
	}
	public ArrayList<String> Creds() {
		return Credentials;
	}
}

