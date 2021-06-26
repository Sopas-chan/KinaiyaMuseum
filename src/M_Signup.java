import java.util.ArrayList;

public class M_Signup {
	ArrayList<String> Credentials;
	public M_Signup() {
		
	}
	public void setData(ArrayList<String> Cred) {
		this.Credentials = Cred;
	}
	public String getUsername() {
		String user = Credentials.get(0);
		return user;
	}
	public String getPassword() {
		String pass = Credentials.get(1);
		return pass;
	}
	public String getConfirmPass() {
		String cfpass = Credentials.get(2);
		return cfpass;
	}
	public ArrayList<String> getData() {
		return Credentials;
	}
}
