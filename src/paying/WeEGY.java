package paying;

public class WeEGY extends Company_Template {

	
	public WeEGY() {}
	
	public WeEGY(String compid, account compaccount) {
		super(compid, compaccount);
		// TODO Auto-generated constructor stub
	}

	public void payinternet(double mount) {
		// TODO Auto-generated method stub
		double currentbalance=this.getCompaccount().getBalance_Account();
		this.getCompaccount().setBalance_Account(currentbalance+mount);
		
		
	}

}
