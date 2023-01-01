package paying;

public class UserLogin {
	private User_Managment Currentuser;
	public String Uname;
	public String pass;
	
	private UserLogin() {
		
	}
	private static  UserLogin log =null;
	
	
	public static UserLogin getinstance() {
		
		if(log==null) {
			log=new UserLogin();
		}
		return log;
	}
	
	// Login a  uuser and check if the are in the DB
	public int loginguser(String em,String pass,ProviderDB data) {
		   User_Managment u=data.searchForUser(em);
		   if(u!=null) {
			   if (u.getPass().equals(pass)) {
				   this.Currentuser=u;
				   System.out.println("Login Successfully.");
				   return 0;
			   }
			   else {
				   System.out.println("Password is Incorrect.");
				   return 1;
			   }
		   }
		   else {   
			   System.out.println("User doesn't Exist Signup?");
			   return 2;
		   }
		   
	}
	
	// How to log someone out as admin
	public void logout() {
		log=null;
		System.gc();
		
	}

	// Who's in right now 
	public User_Managment getCurrentuser() {
		return Currentuser;
	}
}
