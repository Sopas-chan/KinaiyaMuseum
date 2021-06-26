import java.util.ArrayList;

public class M_Signup {
	ArrayList<String> Credentials;
	public M_Signup() {
		
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
		String cfpass = Credentials.get(2);
		return cfpass;
	}
	public String getPName() {
		String pname = Credentials.get(3);
		return pname;
	}
	public String getFName() {
		String fname = Credentials.get(4);
		return fname;
	}
	public String getLName() {
		String lname = Credentials.get(5);
		return lname;
	}
	public ArrayList<String> getData() {
		return Credentials;
	}
}
