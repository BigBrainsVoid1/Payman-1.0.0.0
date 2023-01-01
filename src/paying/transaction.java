package paying;

public class transaction {
	private Company_Template comp;
	private User_Managment user;
	private double fee;
	private String transId;
	
	
	public transaction(Company_Template comp, User_Managment user, double fee) {
		
		this.comp = comp;
		this.user = user;
		this.fee = fee;
		this.transId = comp.getCompid() + user.getEmail();
	}
	// Normal getters and setters for sys access 
	public Company_Template getComp() {
		return comp;
	}
	public void setComp(Company_Template comp) {
		this.comp = comp;
	}
	public User_Managment getUser() {
		return user;
	}
	public void setUser(User_Managment user) {
		this.user = user;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getTransId() {
		return transId;
	}
	
	
	
	public void transactions() { // Should help us provide recptis to the Clients UI
		double current_user_balance=user.getUserwallet().getBalance();
		user.getUserwallet().editBalance( current_user_balance- this.fee);
		comp.getCompaccount().add(this.fee);
		
		
		
	}
	

}