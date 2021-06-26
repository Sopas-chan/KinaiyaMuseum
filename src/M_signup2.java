import java.util.ArrayList;

public class M_signup2 {
	ArrayList<String> Credentials;
	public M_signup2() {
		
	}
	public void setData(ArrayList<String> Cred) {
		this.Credentials = Cred;
	}
	public String getUser() {
		String user = Credentials.get(0);
		return user;
	}
	public String getPass() {
		String pass = Credentials.get(1);
		return pass;
	}
	public String getCPass() {
		String cpass = Credentials.get(2);
		return cpass;
	}
	public String getFName() {
		String fname = Credentials.get(3);
		return fname;
	}
	public String getLName () {
		String lname = Credentials.get(4);
		return lname;
	}
	public ArrayList<String> getData() {
		return Credentials;
	}
}
