package paying;

import java.util.ArrayList;

public class ProviderDB {
	
	ArrayList<User_Managment> Users = new ArrayList<User_Managment>();
	
	ArrayList<Online_Wallet> wallets=new ArrayList<Online_Wallet>();
	
	ArrayList<Company_Template> New_Providers =new ArrayList<Company_Template>();
	
	ArrayList<account> accounts=new ArrayList<account>();
	
	ArrayList<transaction> transactions=new ArrayList<transaction>();

	
	public int addUser(User_Managment u) {
		
		if (searchForUser(u.getEmail())==null) {
		Users.add(u);
		return 1;
		}
		
		return 0;
	}
	
	
	public User_Managment searchForUser(String em) {
		
		for(User_Managment u :this.Users) {
			if (u.getEmail().equals(em)) {
				return u;
			}
		}
		return null;
		
	}
	
	public void showusersdata() {
		for(User_Managment u:this.Users) {
			u.showuserdata();
		}
	}
	
	
	public void showuserdataByEmail(String email) {
		for(User_Managment u:this.Users) {
			if(u.getEmail().equals(email)) {
				u.showuserdata();
				//u.getUserwallet().show();
			}
			
		}
		
	}
	
	
	public Online_Wallet searchForWallet(String wid) {
		
		for(Online_Wallet w :this.wallets) {
			if (w.getId().equals(wid)) {
				return w;
			}
		}
		return null;
	}
	
	
   public int addwallet(Online_Wallet w,User_Managment u) {
		
		if (searchForWallet(w.getId())==null) {
		wallets.add(w);
		
		u.setUserwallet(w);
		return 1;
		}
		
		return 0;
    	}
   
   
       
   public int addCompany(Company_Template c) {
		
		if (searchForComp(c.getCompid())==null) {
			New_Providers.add(c);
		return 1;
		}
		
		return 0;
	}
	
	public Company_Template searchForComp(String id) {
		
		for(Company_Template c :this.New_Providers) {
			if (c.getCompid().equals(id)) {
				return c;
			}
		}
		return null;
		
	}
	
	
public account searchForAcc(String accid) {
		
		for(account acc :this.accounts) {
			if (acc.getID_Account().equals(accid)) {
				return acc;
			}
		}
		return null;
	}
	
	
   public int addAcc( account acc,Company_Template C) {
		
		if (searchForAcc(acc.getID_Account())==null) {
		accounts.add(acc);
		
		C.setCompaccount(acc);
		return 1;
		}
		
		return 0;
    	}
   
   
   public void addtansaction(transaction t) {
	   
	   transactions.add(t);
   }
	
	
	

}
