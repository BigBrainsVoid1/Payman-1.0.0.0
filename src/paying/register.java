package paying;

public class register {
	
	// First time registering of a user 
	public int signup(String email,String pass,ProviderDB d) {
		String s[]=email.split("@");
		
		String uname=s[0];
		User_Managment temp =new User_Managment(uname,pass,email );
		
		return d.addUser(temp);
		
	}

}
