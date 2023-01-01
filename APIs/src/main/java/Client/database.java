package Client;
import java.util.ArrayList;import companies.AccCredentials;import companies.VerifiedCompanies;import paying.transaction;

public class database {
	
	ArrayList<User> AddUsers = new ArrayList<User>();
	
	ArrayList<wallet> UserWallets = new ArrayList<wallet>();
	
	ArrayList<VerifiedCompanies> newCompanies=new ArrayList<VerifiedCompanies>();
	
	ArrayList<AccCredentials> accounts=new ArrayList<AccCredentials>();
	
	ArrayList<transaction> transactions=new ArrayList<transaction>();

	// invoke a new user 	
	public int addUser(User u) {
		
		if (searchForUser(u.getEmail())==null) {
		AddUsers.add(u);
		return 1;
		}
		
		return 0;
	}
	
	// find a user feature 
	public User searchForUser(String em) {
		
		for(User u :this.AddUsers) {
			if (u.getEmail().equals(em)) {
				return u;
			}
		}
		return null;
		
	}
	

	
	// public wallets invoke public functions 
	public wallet searchForWallet(String wid) {
		
		for(wallet w :this.UserWallets )  {
			if (w.getId().equals(wid)) {
				return w;
			}
		}
		return null;
	}
	
	//  ADD A new wallet for a new user
    public int addwallet(wallet w,User u) {
		
		if (searchForWallet(w.getId())==null) {
		UserWallets . add(w);
		
		u.setUserwallet(w);
		return 1;
		}
		
		return 0;
    }
   
   
    // Adding a new provider    
    public int addCompany(VerifiedCompanies c) {
		
		if (searchForComp(c.getCompid())==null) {
		newCompanies.add(c);
		return 1;
		}
		
		return 0;
	}
	
	public VerifiedCompanies searchForComp(String id) {
		
		for(VerifiedCompanies c :this.newCompanies) {
			if (c.getCompid().equals(id)) {
				return c;
			}
		}
		return null;
		
	}
	
	
	public AccCredentials searchForAcc(String accid) {
		
		for(AccCredentials acc :this.accounts) {
			if (acc.getAccid().equals(accid)) {
				return acc;
			}
		}
		return null;
	}
	
	// add a client with a company associated 
    public int addAcc( AccCredentials acc,VerifiedCompanies C) {
		
		if (searchForAcc(acc.getAccid())==null) {
		accounts.add(acc);
		
		C.setCompaccount(acc);
		return 1;
		}
		
		return 0;
    	}
   
	// add a new transaction to be processed 
    public void addtansaction(transaction t) {
	   
	   transactions.add(t);
    }


	public ArrayList<transaction> getTransactions() {
	return transactions;
	}


	public void setTransactions(ArrayList<transaction> transactions) {
	this.transactions = transactions;
	}
   

	public transaction getTransactionById(String Tid) {
		for (transaction t:this.transactions) {
		
			if ((t.getTransId()).equals(Tid)) {
				return t;
			}
		}
		return null;
	}



}























