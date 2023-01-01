package paying;

public class account {
	private String ID_Account;
	private double Balance_Account;
	
	
	
	public account(String ID_Account, double Balance_Account) {
		this.ID_Account = ID_Account;
		this.Balance_Account = Balance_Account;
	}
	
	public String getID_Account() {
		return ID_Account;
	}
	
	
	public void setID_Account(String ID_Account) {
		this.ID_Account = ID_Account;
	}
	
	
	
	public double getBalance_Account() {
		return Balance_Account;
	}
	
	
	public void setBalance_Account(double Balance_Account) {
		this.Balance_Account = Balance_Account;
	}
	
	public void add(double m) {
		this.Balance_Account+=m;
	}

}
