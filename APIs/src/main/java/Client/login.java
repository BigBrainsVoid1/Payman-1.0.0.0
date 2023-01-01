package Client;

public class login {
	private User Currentuser;
	public String Uname;
	public String pass;
	
	private login() {
		
	}
	private static  login log =null; // if the log status doesn't == to null then we are active
	// as a user 
	
	public static login getinstance() { // login function
		
		if(log==null) {
			log=new login();
		}
		return log;
	}
	
	
	public int LoginAUser (String em,String pass,database data) {
		   User u=data.searchForUser(em);
		   if(u!=null) {
			   if (u.getPass().equals(pass)) {
				   this.Currentuser=u;
				   //System.out.println("Logged Successfully");
				   return 0;
			   }
			   else {
				  // System.out.println("Incorrect Password Or Email");
				   return 1;
			   }
		   }
		   else {   
			  // System.out.println("No Account with this information. Try to Signup?");
			   return 2;
		   }
		   
	}
	// make log a null 
	public void logout() {
		log=null;
		System.gc();
		
	}


	public User getCurrentuser() {
		return Currentuser;
	}


	


}
