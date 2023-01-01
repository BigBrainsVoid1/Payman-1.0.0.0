package paying;

public class User_Managment {
       private String uname;
       private String pass;
       private String email;
       private Online_Wallet userwallet;
       
       
       // Normal getters and setters for sys access 
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Online_Wallet getUserwallet() {
		return userwallet;
	}
	public void setUserwallet(Online_Wallet userwallet) {
		this.userwallet = userwallet;
	}
	// Taking in user info 
	public User_Managment(String uname, String pass, String email) {
		
		this.uname = uname;
		this.pass = pass;
		this.email = email;
	}
       
	// Print the access fore the uuser 
	public void showuserdata() {
		
		System.out.println(this.uname);
		System.out.println(this.email);
		System.out.println(this.pass);
	}
	
       
       
}
