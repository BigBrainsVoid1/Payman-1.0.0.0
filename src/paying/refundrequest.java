package paying;

public class refundrequest {
	private User_Managment user;
	private transaction trans;
	
	// Normal getters and setters for sys access 
	
	public User_Managment getUser() {
		return user;
	}
	public void setUser(User_Managment user) {
		this.user = user;
	}
	public transaction getTrans() {
		return trans;
	}
	public void setTrans(transaction trans) {
		this.trans = trans;
	}
	public refundrequest(User_Managment user, transaction trans) {
		
		this.user = user;
		this.trans = trans;
	}
	
	
	
	
}
